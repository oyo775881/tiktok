package top.yokey.douyin.other;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dueeeke.videoplayer.ijk.IjkPlayerFactory;
import com.dueeeke.videoplayer.player.VideoViewConfig;
import com.dueeeke.videoplayer.player.VideoViewManager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.lzy.okgo.model.HttpHeaders;
import com.tencent.bugly.crashreport.CrashReport;

import java.io.File;
import java.io.RandomAccessFile;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import top.yokey.douyin.R;
import top.yokey.douyin.activity.PlayActivity;
import top.yokey.douyin.douyin.bean.AwemePlayBean;

@SuppressWarnings("ALL")
public class BaseApplication extends Application {

    private static BaseApplication instance = null;

    private int naviPosition = 0;
    private int awemePosition = 0;
    private int playPosition = 0;

    private String uid = "";
    private String suid = "";

    private ArrayList<AwemePlayBean> nearbyArrayList = new ArrayList<>();
    private ArrayList<AwemePlayBean> mineAwemeArrayList = new ArrayList<>();
    private ArrayList<AwemePlayBean> mineFavoriteArrayList = new ArrayList<>();
    private ArrayList<AwemePlayBean> mineForwardArrayList = new ArrayList<>();

    public static BaseApplication get() {

        return instance;

    }

    @Override
    public void onCreate() {

        super.onCreate();
        instance = this;

        ImageHelp.get().init(get());
        SharedHelp.get().init(getSharedPreferences(Constant.SHARED_NAME, MODE_PRIVATE));
        VideoViewManager.setConfig(VideoViewConfig.newBuilder().setPlayerFactory(IjkPlayerFactory.create()).build());
        LiveEventBus.config().lifecycleObserverAlwaysActive(true).autoClear(false);
        CrashReport.initCrashReport(getApplicationContext(), "9146b69d96", false);
        suid = SharedHelp.get().getString(Constant.SHARED_USER_SUID);

    }

    //应用方法

    public String getUid() {

        return uid;

    }

    public void setUid(String uid) {

        this.uid = uid;

    }

    public String getSuid() {

        return suid;

    }

    public void setSuid(String suid) {

        this.suid = suid;

    }

    public int getNaviPosition() {

        return naviPosition;

    }

    public void setNaviPosition(int naviPosition) {

        this.naviPosition = naviPosition;

    }

    public int getAwemePosition() {

        return awemePosition;

    }

    public void setAwemePosition(int awemePosition) {

        this.awemePosition = awemePosition;

    }

    public int getPlayPosition() {

        return playPosition;

    }

    public void setPlayPosition(int playPosition) {

        this.playPosition = playPosition;

    }

    public ArrayList<AwemePlayBean> getNearbyArrayList() {

        return nearbyArrayList;

    }

    public ArrayList<AwemePlayBean> getMineAwemeArrayList() {

        return mineAwemeArrayList;

    }

    public ArrayList<AwemePlayBean> getMineFavoriteArrayList() {

        return mineFavoriteArrayList;

    }

    public ArrayList<AwemePlayBean> getMineForwardArrayList() {

        return mineForwardArrayList;

    }

    public HttpHeaders getHttpHeaders() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("User-Agent", "Mozilla/5.0 (Android 10; Mobile; rv:78.0) Gecko/78.0 Firefox/78.0");
        return httpHeaders;

    }

    public String handlerNumber(String number) {

        long temp = Long.parseLong(number);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        if (temp < 10000) {
            return temp + "";
        }
        if (temp < 99999999) {
            return decimalFormat.format(((double) (temp) / (double) (10000))) + "w";
        }
        return decimalFormat.format(((double) (temp) / (double) (100000000))) + "亿";

    }

    public Drawable getDouDrawable(int number) {

        if (number == 1) return getDrawable(R.mipmap.ic_mine_dou1);
        if (number == 2) return getDrawable(R.mipmap.ic_mine_dou2);
        if (number == 3) return getDrawable(R.mipmap.ic_mine_dou3);
        if (number == 4) return getDrawable(R.mipmap.ic_mine_dou4);
        if (number == 5) return getDrawable(R.mipmap.ic_mine_dou5);
        if (number == 6) return getDrawable(R.mipmap.ic_mine_dou6);
        if (number == 7) return getDrawable(R.mipmap.ic_mine_dou7);
        if (number == 8) return getDrawable(R.mipmap.ic_mine_dou8);
        if (number == 9) return getDrawable(R.mipmap.ic_mine_dou9);
        if (number == 10) return getDrawable(R.mipmap.ic_mine_dou10);
        if (number == 11) return getDrawable(R.mipmap.ic_mine_dou11);
        if (number == 12) return getDrawable(R.mipmap.ic_mine_dou12);
        if (number == 13) return getDrawable(R.mipmap.ic_mine_dou13);
        if (number == 14) return getDrawable(R.mipmap.ic_mine_dou14);
        if (number == 15) return getDrawable(R.mipmap.ic_mine_dou15);
        if (number == 16) return getDrawable(R.mipmap.ic_mine_dou16);
        if (number == 17) return getDrawable(R.mipmap.ic_mine_dou17);
        if (number == 18) return getDrawable(R.mipmap.ic_mine_dou18);
        if (number == 19) return getDrawable(R.mipmap.ic_mine_dou19);
        if (number == 20) return getDrawable(R.mipmap.ic_mine_dou20);
        if (number == 21) return getDrawable(R.mipmap.ic_mine_dou21);
        if (number == 22) return getDrawable(R.mipmap.ic_mine_dou22);
        if (number == 23) return getDrawable(R.mipmap.ic_mine_dou23);
        if (number == 24) return getDrawable(R.mipmap.ic_mine_dou24);
        if (number == 25) return getDrawable(R.mipmap.ic_mine_dou25);
        if (number == 26) return getDrawable(R.mipmap.ic_mine_dou26);
        if (number == 27) return getDrawable(R.mipmap.ic_mine_dou27);
        if (number == 28) return getDrawable(R.mipmap.ic_mine_dou28);
        if (number == 29) return getDrawable(R.mipmap.ic_mine_dou29);
        if (number == 30) return getDrawable(R.mipmap.ic_mine_dou30);
        return getDrawable(R.mipmap.ic_mine_dou1);

    }

    //系统跳转

    public void start(Activity activity, Class cls) {

        ActivityOptions compat = ActivityOptions.makeSceneTransitionAnimation(activity);
        activity.startActivity(new Intent(activity, cls), compat.toBundle());

    }

    public void startPlay(Activity activity, int position, String type) {

        Intent intent = new Intent(activity, PlayActivity.class);
        intent.putExtra("position", position);
        intent.putExtra("type", type);
        ActivityOptions compat = ActivityOptions.makeSceneTransitionAnimation(activity);
        activity.startActivity(intent, compat.toBundle());

    }

    //自定义方法

    public int getWidth() {

        return getResources().getDisplayMetrics().widthPixels;

    }

    public int getHeight() {

        return getResources().getDisplayMetrics().heightPixels;

    }

    public int dp2Sp(int dp) {

        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, dp, getResources().getDisplayMetrics());

    }

    public int dp2Px(int dp) {

        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());

    }

    public int getColors(int id) {

        return getResources().getColor(id);

    }

    public int getStatusBarHeight() {

        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;

    }

    public void logcat(String message) {

        int length = 2001 - "dytags".length();
        while (message.length() > length) {
            Log.i("dytags", message.substring(0, length));
            message = message.substring(length);
        }
        Log.d("dytags", message);

    }

    public String stamp2Date(String longTime) {

        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(longTime);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;

    }

    public String time2State(String longTime) {

        String longBy13 = "1000000000000";
        String longby10 = "1000000000";
        if (Long.valueOf(longTime) / Long.valueOf(longBy13) < 1) {
            if (Long.valueOf(longTime) / Long.valueOf(longby10) >= 1) {
                longTime = longTime + "000";
            }
        }
        Timestamp time = new Timestamp(Long.valueOf(longTime));
        Timestamp now = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long dayConver = 1000 * 60 * 60 * 24;
        long hourConver = 1000 * 60 * 60;
        long minConver = 1000 * 60;
        long timeConver = now.getTime() - time.getTime();
        long tempConver = timeConver / dayConver;
        if (tempConver >= 1) {
            if (tempConver == 1) return "昨天";
            if (tempConver == 2) return "前天";
            return tempConver + "天前";
        } else {
            tempConver = (timeConver / hourConver);
            if (tempConver >= 1) {
                return tempConver + "小时前";
            } else {
                tempConver = (timeConver / minConver);
                if (tempConver >= 1) {
                    return tempConver + "分钟前";
                } else {
                    return "刚刚";
                }
            }
        }

    }

    public void text2File(String content, String path) {

        content = content + "\n";
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
            }
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek(file.length());
            raf.write(content.getBytes());
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void rotateImageView(AppCompatImageView imageView) {

        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(8000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        imageView.startAnimation(rotateAnimation);

    }

    public void showPlayImageView(AppCompatImageView imageView) {

        imageView.setVisibility(View.VISIBLE);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(AnimUtil.scale(imageView, "scaleX", 2f, 0.9f, 100, 0))
                .with(AnimUtil.scale(imageView, "scaleY", 2f, 0.9f, 100, 0));
        animatorSet.start();

    }

    public void setRecyclerView(RecyclerView recyclerView, RecyclerView.Adapter adapter) {

        recyclerView.setFocusableInTouchMode(false);
        recyclerView.requestFocus();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    public void setRecyclerView(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter adapter) {

        recyclerView.setFocusableInTouchMode(false);
        recyclerView.requestFocus();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

}
