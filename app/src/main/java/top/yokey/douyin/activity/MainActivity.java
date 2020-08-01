package top.yokey.douyin.activity;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.graphics.Color;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;

import java.util.ArrayList;
import java.util.List;

import top.yokey.douyin.R;
import top.yokey.douyin.adapter.AwemeCommentAdapter;
import top.yokey.douyin.adapter.AwemeNearbyAdapter;
import top.yokey.douyin.adapter.FragmentPagerAdapter;
import top.yokey.douyin.adapter.FragmentTitleAdapter;
import top.yokey.douyin.douyin.DouYinHttp;
import top.yokey.douyin.douyin.bean.AwemeCommentBean;
import top.yokey.douyin.douyin.bean.AwemePlayBean;
import top.yokey.douyin.fragment.AwemePlayFragment;
import top.yokey.douyin.fragment.MineAwemeFragment;
import top.yokey.douyin.fragment.MineFavoriteFragment;
import top.yokey.douyin.fragment.MineForwardFragment;
import top.yokey.douyin.other.AnimUtil;
import top.yokey.douyin.other.BaseActivity;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.CountDown;
import top.yokey.douyin.other.GridDecoration;
import top.yokey.douyin.other.ImageHelp;
import top.yokey.douyin.other.JsonUtil;
import top.yokey.douyin.other.SharedHelp;
import top.yokey.douyin.view.FullViewPager;
import top.yokey.douyin.view.LoadingView;
import top.yokey.douyin.view.ScaleScrollView;

@SuppressWarnings("ALL")
public class MainActivity extends BaseActivity {

    private final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private final AppCompatTextView[] navigationTextView = new AppCompatTextView[4];
    private final AwemeNearbyAdapter nearbyAdapter = new AwemeNearbyAdapter(BaseApplication.get().getNearbyArrayList());
    //导航
    private AppCompatImageView addImageView = null;
    private AppCompatTextView messageDotTextView = null;
    private DrawerLayout mainDrawerLayout = null;
    private AppCompatTextView menuOrderTextView = null;
    private AppCompatTextView menuSettingTextView = null;
    //首页
    private List<Fragment> homeFragmentList = new ArrayList<>();
    private FragmentPagerAdapter homeAdapter = new FragmentPagerAdapter(this, homeFragmentList);
    private RelativeLayout homeRelativeLayout = null;
    private View homeTopView = null;
    private AppCompatImageView homeDotImageView = null;
    private AppCompatTextView homeDotTextView = null;
    private ViewPager2 homeRecommendViewPager = null;
    private LoadingView homeLoadView = null;
    private int homePosition = 0;
    //附近
    private RelativeLayout nearbyRelativeLayout = null;
    private View nearbyTopView = null;
    private AppCompatTextView nearbyTitleTextView = null;
    private RecyclerView nearbyRecyclerView = null;
    private LoadingView nearbyLoadView = null;
    //消息
    private RelativeLayout messageRelativeLayout = null;
    private View messageTopView = null;
    private LoadingView messageLoadView = null;
    //我的
    private FrameLayout mineFrameLayout = null;
    private ScaleScrollView mineScaleScrollView = null;
    private AppCompatImageView mineBannerImageView = null;
    private AppCompatImageView mineAvatarImageView = null;
    private AppCompatTextView mineEditTextView = null;
    private AppCompatTextView mineNicknameTextView = null;
    private AppCompatTextView mineIdTextView = null;
    private AppCompatTextView mineVerifyTextView = null;
    private AppCompatTextView mineShopTextView = null;
    private View mineLine2View = null;
    private AppCompatTextView mineSignTextView = null;
    private AppCompatTextView mineCallTextView = null;
    private LinearLayoutCompat mineInfoLinearLayout = null;
    private AppCompatTextView mineGenderTextView = null;
    private AppCompatTextView mineAreaTextView = null;
    private AppCompatTextView mineSchoolTextView = null;
    private AppCompatTextView mineTipsTextView = null;
    private AppCompatTextView mineLikeTextView = null;
    private AppCompatTextView mineFollowTextView = null;
    private AppCompatTextView mineFansTextView = null;
    private AppCompatTextView mineFriendTextView = null;
    private AppCompatTextView mineFriend1TextView = null;
    private LinearLayoutCompat mineStartLinearLayout = null;
    private AppCompatTextView mineDouTextView = null;
    private AppCompatImageView mineDou1ImageView = null;
    private AppCompatImageView mineDou2ImageView = null;
    private AppCompatImageView mineDou3ImageView = null;
    private AppCompatTextView mineBangTextView = null;
    private TabLayout mineOneTabLayout = null;
    private TabLayout mineTwoTabLayout = null;
    private FullViewPager mineViewPager = null;
    private View mineTopView = null;
    private AppCompatTextView mineNameTextView = null;
    private AppCompatImageView mineMoreImageView = null;
    private RelativeLayout mineTopRelativeLayout = null;
    //评论
    private AppCompatTextView commentTextView = null;
    private RelativeLayout commentRelativeLayout = null;
    private AppCompatTextView commentNumberTextView = null;
    private RecyclerView commentRecyclerView = null;
    private ArrayList<AwemeCommentBean.CommentsBean> commentArrayList = null;
    private AwemeCommentAdapter commentAdapter = null;
    private boolean commentAnim = false;
    private String commentCursor = "0";
    private String commentAwemeId = "";

    @Override
    public void initView() {

        setContentView(R.layout.activity_main);
        //导航
        navigationTextView[0] = findViewById(R.id.homeTextView);
        navigationTextView[1] = findViewById(R.id.nearbyTextView);
        navigationTextView[2] = findViewById(R.id.messageTextView);
        navigationTextView[3] = findViewById(R.id.mineTextView);
        addImageView = findViewById(R.id.addImageView);
        messageDotTextView = findViewById(R.id.messageDotTextView);
        mainDrawerLayout = findViewById(R.id.mainDrawerLayout);
        menuOrderTextView = findViewById(R.id.menuOrderTextView);
        menuSettingTextView = findViewById(R.id.menuSettingTextView);
        //首页
        homeRelativeLayout = findViewById(R.id.homeRelativeLayout);
        homeTopView = findViewById(R.id.homeTopView);
        homeDotImageView = findViewById(R.id.homeDotImageView);
        homeDotTextView = findViewById(R.id.homeDotTextView);
        homeRecommendViewPager = findViewById(R.id.homeRecommendViewPager);
        homeLoadView = findViewById(R.id.homeLoadView);
        //首页
        nearbyRelativeLayout = findViewById(R.id.nearbyRelativeLayout);
        nearbyTopView = findViewById(R.id.nearbyTopView);
        nearbyTitleTextView = findViewById(R.id.nearbyTitleTextView);
        nearbyRecyclerView = findViewById(R.id.nearbyRecyclerView);
        nearbyLoadView = findViewById(R.id.nearbyLoadView);
        //消息
        messageRelativeLayout = findViewById(R.id.messageRelativeLayout);
        messageTopView = findViewById(R.id.messageTopView);
        messageLoadView = findViewById(R.id.messageLoadView);
        //我的
        mineFrameLayout = findViewById(R.id.mineFrameLayout);
        mineScaleScrollView = findViewById(R.id.mineScaleScrollView);
        mineBannerImageView = findViewById(R.id.mineBannerImageView);
        mineAvatarImageView = findViewById(R.id.mineAvatarImageView);
        mineEditTextView = findViewById(R.id.mineEditTextView);
        mineNicknameTextView = findViewById(R.id.mineNicknameTextView);
        mineIdTextView = findViewById(R.id.mineIdTextView);
        mineVerifyTextView = findViewById(R.id.mineVerifyTextView);
        mineShopTextView = findViewById(R.id.mineShopTextView);
        mineLine2View = findViewById(R.id.mineLine2View);
        mineSignTextView = findViewById(R.id.mineSignTextView);
        mineCallTextView = findViewById(R.id.mineCallTextView);
        mineInfoLinearLayout = findViewById(R.id.mineInfoLinearLayout);
        mineGenderTextView = findViewById(R.id.mineGenderTextView);
        mineAreaTextView = findViewById(R.id.mineAreaTextView);
        mineSchoolTextView = findViewById(R.id.mineSchoolTextView);
        mineTipsTextView = findViewById(R.id.mineTipsTextView);
        mineLikeTextView = findViewById(R.id.mineLikeTextView);
        mineFollowTextView = findViewById(R.id.mineFollowTextView);
        mineFansTextView = findViewById(R.id.mineFansTextView);
        mineFriendTextView = findViewById(R.id.mineFriendTextView);
        mineFriend1TextView = findViewById(R.id.mineFriend1TextView);
        mineStartLinearLayout = findViewById(R.id.mineStartLinearLayout);
        mineDouTextView = findViewById(R.id.mineDouTextView);
        mineDou1ImageView = findViewById(R.id.mineDou1ImageView);
        mineDou2ImageView = findViewById(R.id.mineDou2ImageView);
        mineDou3ImageView = findViewById(R.id.mineDou3ImageView);
        mineBangTextView = findViewById(R.id.mineBangTextView);
        mineOneTabLayout = findViewById(R.id.mineOneTabLayout);
        mineTwoTabLayout = findViewById(R.id.mineTwoTabLayout);
        mineViewPager = findViewById(R.id.mineViewPager);
        mineTopView = findViewById(R.id.mineTopView);
        mineNameTextView = findViewById(R.id.mineNameTextView);
        mineMoreImageView = findViewById(R.id.mineMoreImageView);
        mineTopRelativeLayout = findViewById(R.id.mineTopRelativeLayout);
        //评论
        commentTextView = findViewById(R.id.commentTextView);
        commentRelativeLayout = findViewById(R.id.commentRelativeLayout);
        commentNumberTextView = findViewById(R.id.commentNumberTextView);
        commentRecyclerView = findViewById(R.id.commentRecyclerView);

    }

    @Override
    public void initData() {

        //导航
        setNavi();
        //首页
        setHome();
        //附近
        setNearby();
        //消息
        setMessage();
        //我的
        setMine();

    }

    public void initEvent() {

        //导航
        for (int i = 0; i < navigationTextView.length; i++) {
            int p = i;
            navigationTextView[i].setOnClickListener(view -> navigation(p));
        }

        mainDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                View content = mainDrawerLayout.getChildAt(0);
                int offset = (int) (drawerView.getWidth() * slideOffset);
                content.setTranslationX(-offset);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        menuSettingTextView.setOnClickListener(view -> {
            startActivity(new Intent(get(), SettingActivity.class));
            onReturn();
        });

        //首页

        homeRecommendViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                BaseApplication.get().setAwemePosition(position);
                LiveEventBus.get(Constant.DATA_STATE).post("");
                if ((position + 3) == homeFragmentList.size()) {
                    DouYinHttp.get().getAwemeRecommend("0", (result, arrayList) -> {
                        for (int i = 0; i < arrayList.size(); i++) {
                            homeFragmentList.add(new AwemePlayFragment(arrayList.get(i), "main", homePosition));
                            homePosition++;
                        }
                        homeAdapter.notifyDataSetChanged();
                    });
                }
            }
        });

        //我的

        mineScaleScrollView.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) (v, x, y, ox, oy) -> {
            if (mineOneTabLayout != null && mineTwoTabLayout != null && mineTopRelativeLayout != null && mineTopView != null) {
                int distance = mineOneTabLayout.getTop() - mineTopRelativeLayout.getHeight() + mineTopView.getHeight() - 50;
                float ratio = v.getScaleY() * 1f / distance;
                if (distance <= v.getScrollY()) {
                    ratio = 1;
                    if (mineTwoTabLayout.getVisibility() != View.VISIBLE) {
                        mineNameTextView.setVisibility(View.VISIBLE);
                        mineTwoTabLayout.setVisibility(View.VISIBLE);
                        mineTopView.setBackgroundColor(BaseApplication.get().getColors(R.color.primary));
                        mineTopRelativeLayout.setBackgroundColor(BaseApplication.get().getColors(R.color.primary));
                    }
                } else {
                    if (mineTwoTabLayout.getVisibility() == View.VISIBLE) {
                        mineNameTextView.setVisibility(View.INVISIBLE);
                        mineTwoTabLayout.setVisibility(View.INVISIBLE);
                        mineTopView.setBackgroundColor(Color.TRANSPARENT);
                        mineTopRelativeLayout.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
                mineTopRelativeLayout.setBackgroundColor((int) argbEvaluator.evaluate(ratio, Color.TRANSPARENT, BaseApplication.get().getColors(R.color.primary)));
            }
        });

        mineMoreImageView.setOnClickListener(view -> mainDrawerLayout.openDrawer(Gravity.END));

        //评论信息

        commentTextView.setOnClickListener(view -> {
            if (commentAnim) return;
            if (commentTextView.getVisibility() == View.VISIBLE) {
                commentAnim = true;
                AnimUtil.objectAnimator(commentTextView, AnimUtil.ALPHA, () -> {
                    commentAnim = false;
                    commentTextView.setVisibility(View.GONE);
                }, 1.0f, 0);
            }
            if (commentRelativeLayout.getVisibility() == View.VISIBLE) {
                commentAnim = true;
                AnimUtil.objectAnimator(commentRelativeLayout, AnimUtil.TRABSLATION_Y, () -> {
                    commentAnim = false;
                    commentRelativeLayout.setVisibility(View.GONE);
                }, 0, commentRelativeLayout.getHeight());
            }
        });

        commentRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && recyclerView.canScrollVertically(1) == false) {
                    DouYinHttp.get().getAwemeComment(commentAwemeId, commentCursor, (result, comment) -> {
                        commentArrayList.addAll(comment.getComments());
                        commentAdapter.notifyDataSetChanged();
                        commentCursor = comment.getCursor() + "";
                    });
                }
            }
        });

        LiveEventBus.get(Constant.MAIN_COMMENT, String.class).observe(this, string -> {
            AwemePlayBean bean = JsonUtil.json2Object(string, AwemePlayBean.class);
            commentCursor = "0";
            commentAwemeId = bean.getAwemeId();
            commentNumberTextView.setText(bean.getCommentCount());
            commentNumberTextView.append(" 条评论");
            commentArrayList = new ArrayList<>();
            DouYinHttp.get().getAwemeComment(commentAwemeId, commentCursor, (result, comment) -> {
                commentArrayList.addAll(comment.getComments());
                commentAdapter = new AwemeCommentAdapter(commentArrayList);
                BaseApplication.get().setRecyclerView(commentRecyclerView, commentAdapter);
                commentAdapter.notifyDataSetChanged();
                commentCursor = comment.getCursor() + "";
            });
            if (commentAnim) return;
            if (commentTextView.getVisibility() == View.GONE) {
                commentAnim = true;
                commentTextView.setVisibility(View.VISIBLE);
                AnimUtil.objectAnimator(commentTextView, AnimUtil.ALPHA, () -> commentAnim = false, 0, 1.0f);
            }
            if (commentRelativeLayout.getVisibility() == View.GONE) {
                commentAnim = true;
                commentRelativeLayout.setVisibility(View.VISIBLE);
                AnimUtil.objectAnimator(commentRelativeLayout, AnimUtil.TRABSLATION_Y, () -> commentAnim = false, commentRelativeLayout.getHeight(), 0);
            }
        });

    }

    //自定义方法

    private void setNavi() {

        if (!SharedHelp.get().getString(Constant.SHARED_NAV_MSG).isEmpty()) {
            messageDotTextView.setText(SharedHelp.get().getString(Constant.SHARED_NAV_MSG));
        }
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, BaseApplication.get().dp2Px(64));
        layoutParams.topMargin = BaseApplication.get().getStatusBarHeight();
        menuOrderTextView.setLayoutParams(layoutParams);
        mainDrawerLayout.setScrimColor(Color.parseColor("#66000000"));
        navigation(0);

    }

    private void setHome() {

        homeLoadView.start();
        homeRelativeLayout.setVisibility(View.VISIBLE);
        homeTopView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, BaseApplication.get().getStatusBarHeight()));
        homeTopView.setBackgroundColor(Color.BLACK);
        homeTopView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        String temp = SharedHelp.get().getString(Constant.SHARED_HOME_FOLLOW);
        if (!temp.isEmpty()) {
            if (temp.equals("0")) homeDotImageView.setVisibility(View.VISIBLE);
            if (temp.equals("1")) homeDotTextView.setVisibility(View.VISIBLE);
        }
        DouYinHttp.get().getAwemeRecommend("0", (result, arrayList) -> {
            homePosition = 0;
            BaseApplication.get().setAwemePosition(homePosition);
            for (int i = 0; i < arrayList.size(); i++) {
                homeFragmentList.add(new AwemePlayFragment(arrayList.get(i), "main", homePosition));
                homePosition++;
            }
            homeRecommendViewPager.setAdapter(homeAdapter);
            homeRecommendViewPager.setOffscreenPageLimit(homeFragmentList.size());
            homeLoadView.setVisibility(View.GONE);
        });

    }

    private void setNearby() {

        nearbyLoadView.start();
        nearbyRelativeLayout.setVisibility(View.GONE);
        nearbyTopView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, BaseApplication.get().getStatusBarHeight()));
        nearbyTopView.setBackgroundColor(Color.TRANSPARENT);
        nearbyTopView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        navigationTextView[1].setText(SharedHelp.get().getString(Constant.SHARED_NAV_NEARBY));
        nearbyTitleTextView.setText(SharedHelp.get().getString(Constant.SHARED_NAV_NEARBY));
        BaseApplication.get().setRecyclerView(nearbyRecyclerView, new GridLayoutManager(get(), 2), nearbyAdapter);
        nearbyRecyclerView.addItemDecoration(new GridDecoration(2, BaseApplication.get().dp2Px(3), false));
        DouYinHttp.get().getAwemeNearby("0", (result, arrayList) -> {
            BaseApplication.get().get().getNearbyArrayList().addAll(arrayList);
            nearbyAdapter.notifyDataSetChanged();
            nearbyLoadView.setVisibility(View.GONE);
            nearbyAdapter.setOnItemClickListener((position, bean) -> BaseApplication.get().startPlay(get(), position, "nearby"));
            if (SharedHelp.get().getString(Constant.SHARED_NAV_NEARBY).isEmpty()) {
                navigationTextView[1].setText(arrayList.get(0).getNearbyName());
                nearbyTitleTextView.setText(arrayList.get(0).getNearbyName());
            }
        });

    }

    private void setMessage() {

        messageRelativeLayout.setVisibility(View.GONE);
        messageTopView.setLayoutParams(new RelativeLayout.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, BaseApplication.get().getStatusBarHeight()));
        messageTopView.setBackgroundColor(Color.TRANSPARENT);
        messageTopView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

    }

    private void setMine() {

        mineFrameLayout.setVisibility(View.GONE);
        mineTopView.setLayoutParams(new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, BaseApplication.get().getStatusBarHeight()));
        mineTopView.setBackgroundColor(Color.TRANSPARENT);
        mineTopView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        mineScaleScrollView.setTargetView(mineBannerImageView);
        DouYinHttp.get().getUserProfile(BaseApplication.get().getSuid(), (result, bean) -> {
            try {
                BaseApplication.get().setUid(bean.getUid());
                ImageHelp.get().display(bean.getWhiteCoverUrl().get(0).getUrlList().get(0), mineBannerImageView);
                ImageHelp.get().displayCircle(bean.getAvatarLarger().getUrlList().get(0), mineAvatarImageView);
                String temp = SharedHelp.get().getString(Constant.SHARED_USER_RATE);
                if (!temp.equals("0")) mineEditTextView.append(Html.fromHtml("<font color='#AAAAAA' size='12px'>&nbsp;&nbsp;" + temp + "</font>"));
                mineNicknameTextView.setText(bean.getNickname());
                mineNameTextView.setText(bean.getNickname());
                mineIdTextView.setText("抖音号：");
                mineIdTextView.append(bean.getUniqueId().isEmpty() ? bean.getShortId() : bean.getUniqueId());
                mineVerifyTextView.setVisibility(View.GONE);
                if (bean.getVerificationType() == 1 || bean.getVerificationType() == 2) {
                    mineVerifyTextView.setCompoundDrawablesWithIntrinsicBounds(getDrawable(R.mipmap.ic_mine_star), null, null, null);
                    mineVerifyTextView.setText(bean.getCustomVerify());
                    mineVerifyTextView.setVisibility(View.VISIBLE);
                }
                if (!bean.getEnterpriseVerifyReason().isEmpty()) {
                    mineVerifyTextView.setCompoundDrawablesWithIntrinsicBounds(getDrawable(R.mipmap.ic_mine_enterprise), null, null, null);
                    mineVerifyTextView.setText(bean.getEnterpriseVerifyReason());
                    mineVerifyTextView.setVisibility(View.VISIBLE);
                }
                if (mineVerifyTextView.getText().toString().isEmpty()) mineVerifyTextView.setVisibility(View.GONE);
                mineShopTextView.setVisibility(View.GONE);
                mineLine2View.setVisibility(View.GONE);
                if (bean.isWithFusionShopEntry()) {
                    mineShopTextView.setVisibility(View.VISIBLE);
                    mineLine2View.setVisibility(View.VISIBLE);
                }
                mineSignTextView.setText(bean.getSignature());
                if (mineSignTextView.getText().toString().isEmpty()) mineSignTextView.setVisibility(View.GONE);
                mineCallTextView.setVisibility((bean.getCommerceInfo() != null && result.contains("官方电话")) ? View.VISIBLE : View.GONE);
                mineInfoLinearLayout.setVisibility(View.GONE);
                if (!bean.isIsGovMediaVip() && !bean.isIsStar() && !result.contains("官方电话")) {
                    mineInfoLinearLayout.setVisibility(View.VISIBLE);
                    if (bean.getGender() == 1) {
                        mineGenderTextView.setText("男");
                        mineGenderTextView.setCompoundDrawablesWithIntrinsicBounds(BaseApplication.get().getDrawable(R.mipmap.ic_mine_boy), null, null, null);
                    } else {
                        mineGenderTextView.setText("女");
                        mineGenderTextView.setCompoundDrawablesWithIntrinsicBounds(BaseApplication.get().getDrawable(R.mipmap.ic_mine_girl), null, null, null);
                    }
                    mineAreaTextView.setVisibility(View.GONE);
                    mineSchoolTextView.setVisibility(View.GONE);
                    mineTipsTextView.setVisibility(View.GONE);
                    mineAreaTextView.setText(bean.getLocation());
                    mineSchoolTextView.setText(bean.getSchoolName());
                    if (!mineAreaTextView.getText().toString().isEmpty()) mineAreaTextView.setVisibility(View.VISIBLE);
                    if (!mineSchoolTextView.getText().toString().isEmpty()) mineSchoolTextView.setVisibility(View.VISIBLE);
                    if (mineAreaTextView.getText().toString().isEmpty() && !mineSchoolTextView.getText().toString().isEmpty()) {
                        mineTipsTextView.setVisibility(View.VISIBLE);
                        mineTipsTextView.setText("添加地区等标签");
                    }
                    if (!mineAreaTextView.getText().toString().isEmpty() && mineSchoolTextView.getText().toString().isEmpty()) {
                        mineTipsTextView.setVisibility(View.VISIBLE);
                        mineTipsTextView.setText("添加学校等标签");
                    }
                    if (mineAreaTextView.getText().toString().isEmpty() && mineSchoolTextView.getText().toString().isEmpty()) {
                        mineTipsTextView.setVisibility(View.VISIBLE);
                        mineTipsTextView.setText("添加地区、学校等标签");
                    }
                }
                mineLikeTextView.setText(BaseApplication.get().handlerNumber(bean.getTotalFavorited() + ""));
                mineFollowTextView.setText(BaseApplication.get().handlerNumber(bean.getFollowingCount() + ""));
                mineFansTextView.setText(BaseApplication.get().handlerNumber(bean.getFollowerCount() + ""));
                temp = SharedHelp.get().getString(Constant.SHARED_USER_FRIEND);
                mineFriend1TextView.setVisibility(temp.isEmpty() ? View.GONE : View.VISIBLE);
                mineFriendTextView.setVisibility(temp.isEmpty() ? View.GONE : View.VISIBLE);
                mineFriendTextView.setText(temp);
                mineStartLinearLayout.setVisibility(View.GONE);
                if (bean.isIsStar()) {
                    if (bean.getStarBillboardRank() != 0 && bean.getSprintSupportUserInfo() != null) {
                        mineStartLinearLayout.setVisibility(View.VISIBLE);
                        mineDouTextView.setText("爱DOU榜第");
                        mineDouTextView.append(bean.getStarBillboardRank() + "名");
                        mineDouTextView.setCompoundDrawablesWithIntrinsicBounds(BaseApplication.get().getDouDrawable(bean.getStarBillboardRank()), null, getDrawable(R.mipmap.ic_mine_star_arrow), null);
                        ImageHelp.get().displayCircle(bean.getSprintSupportUserInfo().getFollowers().get(2).getAvatarLarger().getUrlList().get(0), mineDou1ImageView);
                        ImageHelp.get().displayCircle(bean.getSprintSupportUserInfo().getFollowers().get(1).getAvatarLarger().getUrlList().get(0), mineDou2ImageView);
                        ImageHelp.get().displayCircle(bean.getSprintSupportUserInfo().getFollowers().get(0).getAvatarLarger().getUrlList().get(0), mineDou3ImageView);
                        temp = BaseApplication.get().handlerNumber(bean.getSprintSupportUserInfo().getSprint() + "") + "人打榜";
                        mineBangTextView.setText(temp);
                    }
                }
                List<String> stringList = new ArrayList<>();
                stringList.add("作品 " + bean.getAwemeCount());
                stringList.add("动态 " + bean.getForwardCount());
                stringList.add("喜欢 " + bean.getFavoritingCount());
                List<Fragment> fragmentList = new ArrayList<>();
                fragmentList.add(new MineAwemeFragment());
                fragmentList.add(new MineForwardFragment());
                fragmentList.add(new MineFavoriteFragment());
                mineOneTabLayout.addTab(mineOneTabLayout.newTab().setText(stringList.get(0)));
                mineOneTabLayout.addTab(mineOneTabLayout.newTab().setText(stringList.get(1)));
                mineOneTabLayout.addTab(mineOneTabLayout.newTab().setText(stringList.get(2)));
                mineOneTabLayout.setSelectedTabIndicatorColor(BaseApplication.get().getColors(R.color.accent));
                mineOneTabLayout.setTabTextColors(BaseApplication.get().getColors(R.color.textThr), BaseApplication.get().getColors(R.color.text));
                mineTwoTabLayout.addTab(mineTwoTabLayout.newTab().setText(stringList.get(0)));
                mineTwoTabLayout.addTab(mineTwoTabLayout.newTab().setText(stringList.get(1)));
                mineTwoTabLayout.addTab(mineTwoTabLayout.newTab().setText(stringList.get(2)));
                mineTwoTabLayout.setSelectedTabIndicatorColor(BaseApplication.get().getColors(R.color.accent));
                mineTwoTabLayout.setTabTextColors(BaseApplication.get().getColors(R.color.textThr), BaseApplication.get().getColors(R.color.text));
                mineViewPager.setAdapter(new FragmentTitleAdapter(getSupportFragmentManager(), fragmentList, stringList));
                mineViewPager.setOffscreenPageLimit(fragmentList.size());
                mineOneTabLayout.setupWithViewPager(mineViewPager);
                mineOneTabLayout.setTabMode(TabLayout.MODE_FIXED);
                mineTwoTabLayout.setupWithViewPager(mineViewPager);
                mineTwoTabLayout.setTabMode(TabLayout.MODE_FIXED);
                mineViewPager.setOffscreenPageLimit(stringList.size());
                mineViewPager.setCurrentItem(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

    private void navigation(int i) {

        BaseApplication.get().setNaviPosition(i);
        homeRelativeLayout.setVisibility(View.GONE);
        nearbyRelativeLayout.setVisibility(View.GONE);
        messageRelativeLayout.setVisibility(View.GONE);
        mineFrameLayout.setVisibility(View.GONE);
        for (AppCompatTextView appCompatTextView : navigationTextView) {
            appCompatTextView.setTextColor(BaseApplication.get().getColors(R.color.textThr));
        }
        navigationTextView[i].setTextColor(BaseApplication.get().getColors(R.color.text));
        addImageView.setImageResource(R.mipmap.ic_navigation_add1);
        if (i == 0) {
            homeRelativeLayout.setVisibility(View.VISIBLE);
            addImageView.setImageResource(R.mipmap.ic_navigation_add);
        }
        if (i == 1) nearbyRelativeLayout.setVisibility(View.VISIBLE);
        if (i == 2) messageRelativeLayout.setVisibility(View.VISIBLE);
        if (i == 3) mineFrameLayout.setVisibility(View.VISIBLE);
        new CountDown(200, 50) {
            @Override
            public void onTick(long millis) {
                super.onTick(millis);
                LiveEventBus.get(Constant.DATA_STATE).post("");
            }

            @Override
            public void onFinish() {
                super.onFinish();
                LiveEventBus.get(Constant.DATA_STATE).post("");
            }
        }.start();

    }

}
