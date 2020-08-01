package top.yokey.douyin.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;

import top.yokey.douyin.R;

@SuppressWarnings("ALL")
public class LoadingView extends View {

    private static final float RTL_SCALE = 0.7f;
    private static final float LTR_SCALR = 1.3f;
    private static final int LEFT_COLOR = 0XFFFF4040;
    private static final int RIGHT_COLOR = 0XFF00EEEE;
    private static final int MIX_COLOR = Color.BLACK;
    private static final int DURATION = 350;
    private static final int PAUSE_DUARTION = 80;
    private static final float SCALE_START_FRACTION = 0.2f;
    private static final float SCALE_END_FRACTION = 0.8f;
    private final float RADIUS = dp2px(6);
    private final float GAP = dp2px(0.8f);
    boolean isAnimCanceled = false;
    boolean isLtr = true;
    private float radius1;
    private float radius2;
    private float gap;
    private float rtlScale;
    private float ltrScale;
    private int color1;
    private int color2;
    private int mixColor;
    private int duration;
    private int pauseDuration;
    private float scaleStartFraction;
    private float scaleEndFraction;
    private Paint paint1, paint2, mixPaint;
    private Path ltrPath, rtlPath, mixPath;
    private float distance;
    private ValueAnimator anim;
    private float fraction;

    public LoadingView(Context context) {

        this(context, null);

    }

    public LoadingView(Context context, AttributeSet attrs) {

        this(context, attrs, 0);

    }

    public LoadingView(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        @SuppressLint("CustomViewStyleable")
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.LoadingView);
        radius1 = ta.getDimension(R.styleable.LoadingView_radius1, RADIUS);
        radius2 = ta.getDimension(R.styleable.LoadingView_radius2, RADIUS);
        gap = ta.getDimension(R.styleable.LoadingView_gap, GAP);
        rtlScale = ta.getFloat(R.styleable.LoadingView_rtlScale, RTL_SCALE);
        ltrScale = ta.getFloat(R.styleable.LoadingView_ltrScale, LTR_SCALR);
        color1 = ta.getColor(R.styleable.LoadingView_color1, LEFT_COLOR);
        color2 = ta.getColor(R.styleable.LoadingView_color2, RIGHT_COLOR);
        mixColor = ta.getColor(R.styleable.LoadingView_mixColor, MIX_COLOR);
        duration = ta.getInt(R.styleable.LoadingView_duration, DURATION);
        pauseDuration = ta.getInt(R.styleable.LoadingView_pauseDuration, PAUSE_DUARTION);
        scaleStartFraction = ta.getFloat(R.styleable.LoadingView_scaleStartFraction, SCALE_START_FRACTION);
        scaleEndFraction = ta.getFloat(R.styleable.LoadingView_scaleEndFraction, SCALE_END_FRACTION);
        ta.recycle();
        checkAttr();
        distance = gap + radius1 + radius2;
        initDraw();
        initAnim();

    }

    private void checkAttr() {

        radius1 = radius1 > 0 ? radius1 : RADIUS;
        radius2 = radius2 > 0 ? radius2 : RADIUS;
        gap = gap >= 0 ? gap : GAP;
        rtlScale = rtlScale >= 0 ? rtlScale : RTL_SCALE;
        ltrScale = ltrScale >= 0 ? ltrScale : LTR_SCALR;
        duration = duration > 0 ? duration : DURATION;
        pauseDuration = pauseDuration >= 0 ? pauseDuration : PAUSE_DUARTION;
        if (scaleStartFraction < 0 || scaleStartFraction > 0.5f) {
            scaleStartFraction = SCALE_START_FRACTION;
        }
        if (scaleEndFraction < 0.5 || scaleEndFraction > 1) {
            scaleEndFraction = SCALE_END_FRACTION;
        }

    }

    private void initDraw() {

        paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        mixPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setColor(color1);
        paint2.setColor(color2);
        mixPaint.setColor(mixColor);
        ltrPath = new Path();
        rtlPath = new Path();
        mixPath = new Path();

    }

    private void initAnim() {

        fraction = 0.0f;
        stop();
        anim = ValueAnimator.ofFloat(0.0f, 1.0f);
        anim.setDuration(duration);
        if (pauseDuration > 0) {
            anim.setStartDelay(pauseDuration);
            anim.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            anim.setRepeatCount(ValueAnimator.INFINITE);
            anim.setRepeatMode(ValueAnimator.RESTART);
            anim.setInterpolator(new LinearInterpolator());
        }
        anim.addUpdateListener(animation -> {
            fraction = animation.getAnimatedFraction();
            invalidate();
        });
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                isLtr = !isLtr;
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                isLtr = !isLtr;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                isAnimCanceled = true;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (!isAnimCanceled) {
                    anim.start();
                }
            }
        });

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int wSize = MeasureSpec.getSize(widthMeasureSpec);
        int wMode = MeasureSpec.getMode(widthMeasureSpec);
        int hSize = MeasureSpec.getSize(heightMeasureSpec);
        int hMode = MeasureSpec.getMode(heightMeasureSpec);
        float maxScale = Math.max(rtlScale, ltrScale);
        maxScale = Math.max(maxScale, 1);
        if (wMode != MeasureSpec.EXACTLY) {
            wSize = (int) (gap + (2 * radius1 + 2 * radius2) * maxScale + dp2px(1));
        }
        if (hMode != MeasureSpec.EXACTLY) {
            hSize = (int) (2 * Math.max(radius1, radius2) * maxScale + dp2px(1));
        }
        setMeasuredDimension(wSize, hSize);

    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        float centerY = getMeasuredHeight() / 2.0f;
        float ltrInitRadius, rtlInitRadius;
        Paint ltrPaint, rtlPaint;
        if (isLtr) {
            ltrInitRadius = radius1;
            rtlInitRadius = radius2;
            ltrPaint = paint1;
            rtlPaint = paint2;
        } else {
            ltrInitRadius = radius2;
            rtlInitRadius = radius1;
            ltrPaint = paint2;
            rtlPaint = paint1;
        }
        float ltrX = getMeasuredWidth() / 2.0f - distance / 2.0f;
        ltrX = ltrX + (distance * fraction);
        float rtlX = getMeasuredWidth() / 2.0f + distance / 2.0f;
        rtlX = rtlX - (distance * fraction);
        float ltrBallRadius, rtlBallRadius;
        if (fraction <= scaleStartFraction) {
            float scaleFraction = 1.0f / scaleStartFraction * fraction;
            ltrBallRadius = ltrInitRadius * (1 + (ltrScale - 1) * scaleFraction);
            rtlBallRadius = rtlInitRadius * (1 + (rtlScale - 1) * scaleFraction);
        } else if (fraction >= scaleEndFraction) {
            float scaleFraction = (fraction - 1) / (scaleEndFraction - 1);
            ltrBallRadius = ltrInitRadius * (1 + (ltrScale - 1) * scaleFraction);
            rtlBallRadius = rtlInitRadius * (1 + (rtlScale - 1) * scaleFraction);
        } else {
            ltrBallRadius = ltrInitRadius * ltrScale;
            rtlBallRadius = rtlInitRadius * rtlScale;
        }
        ltrPath.reset();
        ltrPath.addCircle(ltrX, centerY, ltrBallRadius, Path.Direction.CW);
        rtlPath.reset();
        rtlPath.addCircle(rtlX, centerY, rtlBallRadius, Path.Direction.CW);
        mixPath.op(ltrPath, rtlPath, Path.Op.INTERSECT);
        canvas.drawPath(ltrPath, ltrPaint);
        canvas.drawPath(rtlPath, rtlPaint);
        canvas.drawPath(mixPath, mixPaint);

    }

    @Override
    protected void onDetachedFromWindow() {

        stop();
        super.onDetachedFromWindow();

    }

    private float dp2px(float dp) {

        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());

    }

    public void stop() {

        if (anim != null) {
            anim.cancel();
            anim = null;
        }

    }

    public void start() {

        if (anim == null) {
            initAnim();
        }
        if (anim.isRunning()) {
            anim.cancel();
        }
        post(() -> {
            isAnimCanceled = false;
            isLtr = false;
            anim.start();
        });

    }

    public void setRadius(float radius1, float radius2, float gap) {

        stop();
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.gap = gap;
        checkAttr();
        distance = gap + radius1 + radius2;
        requestLayout();

    }

    public void setColors(int color1, int color2, int mixColor) {

        this.color1 = color1;
        this.color2 = color2;
        this.mixColor = color2;
        checkAttr();
        paint1.setColor(color1);
        paint2.setColor(color2);
        mixPaint.setColor(mixColor);
        invalidate();

    }

    public void setDuration(int duration, int pauseDuration) {

        this.duration = duration;
        this.pauseDuration = pauseDuration;
        checkAttr();
        initAnim();

    }

    public void setScales(float ltrScale, float rtlScale) {

        stop();
        this.ltrScale = ltrScale;
        this.rtlScale = rtlScale;
        checkAttr();
        requestLayout();

    }

    public void setStartEndFraction(float scaleStartFraction, float scaleEndFraction) {

        this.scaleStartFraction = scaleStartFraction;
        this.scaleEndFraction = scaleEndFraction;
        checkAttr();
        invalidate();

    }

    public float getRadius1() {

        return radius1;

    }

    public float getRadius2() {

        return radius2;

    }

    public float getGap() {

        return gap;

    }

    public float getRtlScale() {

        return rtlScale;

    }

    public float getLtrScale() {

        return ltrScale;

    }

    public int getColor1() {

        return color1;

    }

    public int getColor2() {

        return color2;

    }

    public int getMixColor() {

        return mixColor;

    }

    public int getDuration() {

        return duration;

    }

    public int getPauseDuration() {

        return pauseDuration;

    }

    public float getScaleStartFraction() {

        return scaleStartFraction;

    }

    public float getScaleEndFraction() {

        return scaleEndFraction;

    }

}
