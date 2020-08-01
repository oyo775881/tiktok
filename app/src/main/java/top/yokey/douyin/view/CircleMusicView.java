package top.yokey.douyin.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

import top.yokey.douyin.R;

@SuppressWarnings("ALL")
public class CircleMusicView extends AppCompatImageView {

    private static final int DEFAULT_BORDER_WIDTH = 2;
    private static final int DEFAULT_DEFAULT_SIZE = 45;
    private int mDefaultSize;
    private int mProgressWidth;
    private int mProgressSlotColor;
    private int mProgressBufferColor;
    private int mProgressColor;
    private int mSize;
    private float mBufferProgress;
    private float mProgress;
    private float mDegree;
    private Bitmap mShadeBitmap;
    private Paint mPaint;
    private Paint mProgressPaint;
    private RectF mProgressRect;

    public CircleMusicView(Context context) {

        this(context, null);

    }

    public CircleMusicView(Context context, AttributeSet attrs) {

        this(context, attrs, 0);

    }

    public CircleMusicView(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        init(context, attrs);

    }

    private void init(Context context, AttributeSet attrs) {

        mDefaultSize = dip2px(getContext(), DEFAULT_DEFAULT_SIZE);
        int defaultBorderWidth = dip2px(getContext(), DEFAULT_BORDER_WIDTH);
        final TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CircleMusicView, 0, 0);
        try {
            mProgressWidth = ta.getDimensionPixelOffset(R.styleable.CircleMusicView_circle_music_view_progress_width, defaultBorderWidth);
            mProgressBufferColor = ta.getColor(R.styleable.CircleMusicView_circle_music_view_progress_slot_color, Color.LTGRAY);
            mProgressSlotColor = ta.getColor(R.styleable.CircleMusicView_circle_music_view_progress_buffer_color, Color.GRAY);
            mProgressColor = ta.getColor(R.styleable.CircleMusicView_circle_music_view_progress_color, Color.YELLOW);
        } finally {
            ta.recycle();
        }
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        mPaint.setFilterBitmap(true);
        mProgressPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mProgressPaint.setStrokeWidth(mProgressWidth);
        mProgressPaint.setStyle(Paint.Style.STROKE);

    }

    @Override
    protected void onDraw(Canvas canvas) {

        final Drawable drawable = getDrawable();
        if (drawable == null || drawable instanceof NinePatchDrawable) {
            return;
        }
        int layer = canvas.saveLayer(0F, 0F, mSize, mSize, null, Canvas.ALL_SAVE_FLAG);
        canvas.rotate(mDegree, mSize / 2, mSize / 2);
        drawable.setBounds(0, 0, mSize, mSize);
        drawable.draw(canvas);
        if (mShadeBitmap == null || mShadeBitmap.isRecycled()) {
            mShadeBitmap = createShadeBitmap();
        }
        canvas.drawBitmap(mShadeBitmap, 0F, 0F, mPaint);
        canvas.restoreToCount(layer);
        mProgressPaint.setColor(mProgressSlotColor);
        canvas.drawArc(mProgressRect, 0F, 360F, false, mProgressPaint);
        mProgressPaint.setColor(mProgressBufferColor);
        canvas.drawArc(mProgressRect, -90F, mBufferProgress, false, mProgressPaint);
        mProgressPaint.setColor(mProgressColor);
        canvas.drawArc(mProgressRect, -90F, mProgress, false, mProgressPaint);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int measureWidth = measureDimension(mDefaultSize, widthMeasureSpec);
        int measureHeight = measureDimension(mDefaultSize, heightMeasureSpec);
        setMeasuredDimension(measureWidth, measureHeight);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        super.onSizeChanged(w, h, oldw, oldh);
        mSize = Math.min(w, h);
        int halfBoardWidth = mProgressWidth / 2;
        mProgressRect = new RectF(halfBoardWidth, halfBoardWidth, mSize - halfBoardWidth, mSize - halfBoardWidth);

    }

    public void setProgress(float progress) {

        this.mProgress = progress;
        invalidate();

    }

    public void setBufferProgress(float progress) {

        this.mBufferProgress = progress;
        invalidate();

    }

    @Override
    public void setImageResource(int resId) {

        super.setImageResource(resId);
        mDegree = 0;

    }

    @Override
    public void setImageBitmap(Bitmap bm) {

        super.setImageBitmap(bm);
        mDegree = 0;

    }

    private int measureDimension(int defaultSize, int measureSpec) {

        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == MeasureSpec.AT_MOST) {
            result = Math.min(defaultSize, specSize);
        } else {
            result = defaultSize;
        }
        return result;

    }

    private void setDegree(float degree) {

        this.mDegree = degree;
        invalidate();

    }

    public void startRotate() {

        mDegree++;
        if (mDegree > 360) {
            mDegree = 0;
        }
        setDegree(mDegree);

    }

    private Bitmap createShadeBitmap() {

        Bitmap bitmap = Bitmap.createBitmap(mSize, mSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setFilterBitmap(true);
        RectF f = new RectF(mProgressWidth, mProgressWidth, mSize - mProgressWidth, mSize - mProgressWidth);
        canvas.drawOval(f, paint);
        return bitmap;

    }

    private int px2dip(Context context, float pxValue) {

        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);

    }

    private int dip2px(Context context, float dipValue) {

        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);

    }

}
