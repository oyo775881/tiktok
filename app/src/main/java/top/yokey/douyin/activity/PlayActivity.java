package top.yokey.douyin.activity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.jeremyliao.liveeventbus.LiveEventBus;

import java.util.ArrayList;
import java.util.List;

import top.yokey.douyin.R;
import top.yokey.douyin.adapter.AwemeCommentAdapter;
import top.yokey.douyin.adapter.FragmentPagerAdapter;
import top.yokey.douyin.douyin.DouYinHttp;
import top.yokey.douyin.douyin.bean.AwemePlayBean;
import top.yokey.douyin.fragment.AwemePlayFragment;
import top.yokey.douyin.other.AnimUtil;
import top.yokey.douyin.other.BaseActivity;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.JsonUtil;

public class PlayActivity extends BaseActivity {

    private final List<Fragment> fragments = new ArrayList<>();
    private final FragmentPagerAdapter adapter = new FragmentPagerAdapter(this, fragments);

    private View topView = null;
    private AppCompatImageView backImageView = null;
    private ViewPager2 mainViewPager = null;
    private AppCompatTextView commentTextView = null;
    private RelativeLayout commentRelativeLayout = null;
    private AppCompatTextView commentNumberTextView = null;
    private RecyclerView commentRecyclerView = null;

    private boolean anim = false;
    private int playPosition = 0;
    private int position;
    private String type;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                switch (type) {
                    case "nearby":
                        for (int i = 0; i < BaseApplication.get().getNearbyArrayList().size(); i++) {
                            if (i > position) {
                                fragments.add(new AwemePlayFragment(BaseApplication.get().getNearbyArrayList().get(i), type, playPosition));
                                playPosition++;
                            }
                        }
                        break;
                    case "mine":
                        for (int i = 0; i < BaseApplication.get().getMineAwemeArrayList().size(); i++) {
                            if (i > position) {
                                fragments.add(new AwemePlayFragment(BaseApplication.get().getMineAwemeArrayList().get(i), type, playPosition));
                                playPosition++;
                            }
                        }
                        break;
                    case "favorite":
                        for (int i = 0; i < BaseApplication.get().getMineFavoriteArrayList().size(); i++) {
                            if (i > position) {
                                fragments.add(new AwemePlayFragment(BaseApplication.get().getMineFavoriteArrayList().get(i), type, playPosition));
                                playPosition++;
                            }
                        }
                        break;
                    case "forward":
                        for (int i = 0; i < BaseApplication.get().getMineForwardArrayList().size(); i++) {
                            if (i > position) {
                                fragments.add(new AwemePlayFragment(BaseApplication.get().getMineForwardArrayList().get(i), type, playPosition));
                                playPosition++;
                            }
                        }
                        break;
                }
                adapter.notifyDataSetChanged();
            }
        }
    };

    @Override
    public void initView() {

        setContentView(R.layout.activity_play);
        topView = findViewById(R.id.topView);
        backImageView = findViewById(R.id.backImageView);
        mainViewPager = findViewById(R.id.mainViewPager);
        commentTextView = findViewById(R.id.commentTextView);
        commentRelativeLayout = findViewById(R.id.commentRelativeLayout);
        commentNumberTextView = findViewById(R.id.commentNumberTextView);
        commentRecyclerView = findViewById(R.id.commentRecyclerView);

    }

    @Override
    public void initData() {

        position = getIntent().getIntExtra("position", 0);
        type = getIntent().getStringExtra("type");
        topView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, BaseApplication.get().getStatusBarHeight()));
        topView.setBackgroundColor(Color.BLACK);
        topView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        switch (type) {
            case "nearby":
                fragments.add(new AwemePlayFragment(BaseApplication.get().getNearbyArrayList().get(position), type, 0));
                break;
            case "mine":
                fragments.add(new AwemePlayFragment(BaseApplication.get().getMineAwemeArrayList().get(position), type, 0));
                break;
            case "favorite":
                fragments.add(new AwemePlayFragment(BaseApplication.get().getMineFavoriteArrayList().get(position), type, 0));
                break;
            case "forward":
                fragments.add(new AwemePlayFragment(BaseApplication.get().getMineForwardArrayList().get(position), type, 0));
                break;
        }
        playPosition = 0;
        BaseApplication.get().setPlayPosition(playPosition);
        playPosition++;
        mainViewPager.setAdapter(adapter);
        mainViewPager.setCurrentItem(position, false);
        mainViewPager.setOffscreenPageLimit(fragments.size());
        Message msg = new Message();
        msg.what = 1;
        handler.sendMessage(msg);

    }

    @Override
    public void initEvent() {

        backImageView.setOnClickListener(view -> onReturn());

        commentTextView.setOnClickListener(view -> {
            if (anim) return;
            if (commentTextView.getVisibility() == View.VISIBLE) {
                anim = true;
                AnimUtil.objectAnimator(commentTextView, AnimUtil.ALPHA, () -> {
                    anim = false;
                    commentTextView.setVisibility(View.GONE);
                }, 1.0f, 0);
            }
            if (commentRelativeLayout.getVisibility() == View.VISIBLE) {
                anim = true;
                AnimUtil.objectAnimator(commentRelativeLayout, AnimUtil.TRABSLATION_Y, () -> {
                    anim = false;
                    commentRelativeLayout.setVisibility(View.GONE);
                }, 0, commentRelativeLayout.getHeight());
            }
        });

        mainViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                BaseApplication.get().setPlayPosition(position);
                LiveEventBus.get(Constant.DATA_STATE).post("");
            }
        });

        LiveEventBus.get(Constant.PLAY_COMMENT, String.class).observe(this, string -> {
            AwemePlayBean bean = JsonUtil.json2Object(string, AwemePlayBean.class);
            if (bean.getCommentCount().equals("0")) return;
            commentTextView.setVisibility(View.GONE);
            commentRelativeLayout.setVisibility(View.GONE);
            commentNumberTextView.setText(bean.getCommentCount());
            commentNumberTextView.append(" 条评论");
            DouYinHttp.get().getAwemeComment(bean.getAwemeId(), "60", (result, comment) -> {
                AwemeCommentAdapter awemeCommentAdapter = new AwemeCommentAdapter(comment.getComments());
                BaseApplication.get().setRecyclerView(commentRecyclerView, awemeCommentAdapter);
                awemeCommentAdapter.notifyDataSetChanged();
            });
            if (anim) return;
            if (commentTextView.getVisibility() == View.GONE) {
                anim = true;
                commentTextView.setVisibility(View.VISIBLE);
                AnimUtil.objectAnimator(commentTextView, AnimUtil.ALPHA, () -> anim = false, 0, 1.0f);
            }
            if (commentRelativeLayout.getVisibility() == View.GONE) {
                anim = true;
                commentRelativeLayout.setVisibility(View.VISIBLE);
                AnimUtil.objectAnimator(commentRelativeLayout, AnimUtil.TRABSLATION_Y, () -> anim = false, commentRelativeLayout.getHeight(), 0);
            }
        });

    }

}
