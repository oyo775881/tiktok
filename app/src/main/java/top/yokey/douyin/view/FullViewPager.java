package top.yokey.douyin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

@SuppressWarnings("ALL")
public class FullViewPager extends ViewPager {

    public FullViewPager(@NonNull Context context) {

        super(context);

    }

    public FullViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (null != child) {
                child.measure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
                int measuredHeight = child.getMeasuredHeight();
                if (measuredHeight > height) {
                    height = measuredHeight;
                }
            }
        }
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

}
