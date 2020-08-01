package top.yokey.douyin.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;

@SuppressWarnings("ALL")
public class ScaleScrollView extends NestedScrollView {

    private View mTargetView;
    private int mTargetViewWidth;
    private int mTargetViewHeight;
    private float mLastPosition;
    private boolean isScrolling;
    private boolean isCanOverScroll;
    private float mScaleRatio = 1.2f;
    private float mCallbackSpeed = 0.2f;

    public ScaleScrollView(@NonNull Context context) {

        super(context);

    }

    public ScaleScrollView(@NonNull Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);

    }

    public ScaleScrollView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);

    }

    public void setTargetView(View targetView) {

        this.mTargetView = targetView;

    }

    public void setScaleRatio(float ratio) {

        this.mScaleRatio = ratio;

    }

    public void setCallbackSpeed(float speed) {

        this.mCallbackSpeed = speed;

    }

    @Override
    protected void onFinishInflate() {

        super.onFinishInflate();
        setOverScrollMode(OVER_SCROLL_ALWAYS);

    }

    @Override
    public void fling(int y) {

        this.isCanOverScroll = y <= -6000;
        super.fling(y);

    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        if (null != mTargetView) {
            if (mTargetViewWidth <= 0 || mTargetViewHeight <= 0) {
                mTargetViewWidth = mTargetView.getMeasuredWidth();
                mTargetViewHeight = mTargetView.getMeasuredHeight();
            }
            switch (ev.getAction()) {
                case MotionEvent.ACTION_UP:
                    isScrolling = false;
                    callbackView();
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (!isScrolling) {
                        if (getScrollY() == 0) {
                            mLastPosition = ev.getY();
                        } else {
                            break;
                        }
                    }
                    float value = (ev.getY() - mLastPosition) * mScaleRatio;
                    if (value < 0) {
                        break;
                    }
                    isScrolling = true;
                    updateTargetViewValue(value);
                    return true;
                default:
                    break;
            }
        }
        return super.onTouchEvent(ev);

    }

    private void callbackView() {

        float value = mTargetView.getMeasuredWidth() - mTargetViewWidth;
        ValueAnimator animator = ValueAnimator.ofFloat(value, 0f);
        animator.setDuration((long) (value * mCallbackSpeed));
        animator.setInterpolator(new DecelerateInterpolator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                updateTargetViewValue((float) animation.getAnimatedValue());
            }
        });
        animator.start();

    }

    private void updateTargetViewValue(float value) {

        if (null == mTargetView) {
            return;
        }
        if (mTargetViewWidth <= 0 || mTargetViewHeight <= 0) {
            return;
        }
        ViewGroup.LayoutParams lp = mTargetView.getLayoutParams();
        if (null != lp) {
            lp.width = (int) (mTargetViewWidth + value);
            lp.height = (int) (mTargetViewHeight * ((mTargetViewWidth + value) / mTargetViewWidth));
            if (lp instanceof MarginLayoutParams) {
                ((MarginLayoutParams) lp).setMargins(-(lp.width - mTargetViewWidth) / 2, 0, 0, 0);
            }
            mTargetView.setLayoutParams(lp);
        }

    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {

        if (t == 0 && isCanOverScroll) {
            zoomAnimator();
        }
        super.onScrollChanged(l, t, oldl, oldt);

    }

    private void zoomAnimator() {

        float value = mTargetViewWidth * mScaleRatio;
        ValueAnimator enlarge = ValueAnimator.ofFloat(0f, value);
        enlarge.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                updateTargetViewValue((float) animation.getAnimatedValue());
            }
        });
        ValueAnimator narrow = ValueAnimator.ofFloat(value, 0f);
        narrow.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                updateTargetViewValue((float) animation.getAnimatedValue());
            }
        });
        AnimatorSet animationSet = new AnimatorSet();
        animationSet.setDuration((long) (value * mCallbackSpeed));
        animationSet.playSequentially(enlarge, narrow);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.start();

    }

}
