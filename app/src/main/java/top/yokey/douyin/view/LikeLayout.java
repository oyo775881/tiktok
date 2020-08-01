package top.yokey.douyin.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

import java.util.Random;

import top.yokey.douyin.R;
import top.yokey.douyin.other.AnimUtil;

@SuppressWarnings("ALL")
public class LikeLayout extends RelativeLayout {

    float[] num = {-30, -20, 0, 20, 30};
    private Context mContext;
    private long lastClickTime = 0;
    private long INTERVAL = 200;

    public LikeLayout(Context context) {

        super(context);
        initView(context);

    }

    public LikeLayout(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        initView(context);

    }

    public LikeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        initView(context);

    }

    private void initView(Context context) {

        mContext = context;

    }

    @Override
    protected void dispatchDraw(Canvas canvas) {

        super.dispatchDraw(canvas);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                long currTime = System.currentTimeMillis();
                long interval = currTime - lastClickTime;
                lastClickTime = currTime;
                if (interval < INTERVAL) {
                    final ImageView imageView = new ImageView(mContext);
                    LayoutParams params = new LayoutParams(300, 300);
                    params.leftMargin = (int) event.getX() - 150;
                    params.topMargin = (int) event.getY() - 300;
                    imageView.setImageDrawable(getResources().getDrawable(R.mipmap.ic_video_like));
                    imageView.setLayoutParams(params);
                    addView(imageView);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(AnimUtil.scale(imageView, "scaleX", 2f, 0.9f, 100, 0))
                            .with(AnimUtil.scale(imageView, "scaleY", 2f, 0.9f, 100, 0))
                            .with(AnimUtil.rotation(imageView, 0, 0, num[new Random().nextInt(4)]))
                            .with(AnimUtil.alpha(imageView, 0, 1, 100, 0))
                            .with(AnimUtil.scale(imageView, "scaleX", 0.9f, 1, 50, 150))
                            .with(AnimUtil.scale(imageView, "scaleY", 0.9f, 1, 50, 150))
                            .with(AnimUtil.translationY(imageView, 0, -600, 800, 400))
                            .with(AnimUtil.alpha(imageView, 1, 0, 300, 400))
                            .with(AnimUtil.scale(imageView, "scaleX", 1, 3f, 700, 400))
                            .with(AnimUtil.scale(imageView, "scaleY", 1, 3f, 700, 400));
                    animatorSet.start();
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            removeViewInLayout(imageView);
                        }
                    });
                }
                break;
        }
        return super.dispatchTouchEvent(event);

    }

}
