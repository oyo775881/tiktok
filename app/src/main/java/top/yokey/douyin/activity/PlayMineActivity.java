package top.yokey.douyin.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

import top.yokey.douyin.R;
import top.yokey.douyin.douyin.bean.AwemePlayBean;
import top.yokey.douyin.other.BaseActivity;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.JsonUtil;

public class PlayMineActivity extends BaseActivity {

    private final ArrayList<AwemePlayBean> arrayList = new ArrayList<>();
    private ViewPager2 mainViewPager = null;
    private AppCompatImageView backImageView = null;
    private View topView = null;

    @Override
    public void initView() {

        setContentView(R.layout.activity_play_mine);
        mainViewPager = findViewById(R.id.mainViewPager);
        backImageView = findViewById(R.id.backImageView);
        topView = findViewById(R.id.topView);

    }

    @Override
    public void initData() {

        int position = getIntent().getIntExtra("position", 0);
        String json = getIntent().getStringExtra("json");
        arrayList.addAll(JsonUtil.json2ArrayList(json, AwemePlayBean.class));
        /*
        mainRecyclerView.setAdapter(adapter);
        mainRecyclerView.scrollToPosition(position);
        */
        topView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, BaseApplication.get().getStatusBarHeight()));
        topView.setBackgroundColor(Color.BLACK);
        topView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

    }

    @Override
    public void initEvent() {

        backImageView.setOnClickListener(view -> onReturn());

    }

}
