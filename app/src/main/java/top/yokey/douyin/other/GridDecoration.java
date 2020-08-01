package top.yokey.douyin.other;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

@SuppressWarnings("ALL")
public class GridDecoration extends RecyclerView.ItemDecoration {

    private int span = 0;
    private int space = 0;
    private Paint paint = null;
    private boolean edge = false;

    public GridDecoration(int span, int space, boolean edge) {

        this.span = span;
        this.space = space;
        this.edge = edge;
        this.paint = new Paint();
        paint.setColor(Color.TRANSPARENT);

    }

    public GridDecoration(int span, int space, int color, boolean edge) {

        this.span = span;
        this.space = space;
        this.edge = edge;
        this.paint = new Paint();
        paint.setColor(color);

    }

    @Override
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {

        if (paint != null) {
            int childCount = !edge ? parent.getChildCount() : parent.getChildCount() - 2;
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();
            for (int i = 0; i < childCount - span; i++) {
                View view = parent.getChildAt(i);
                float top = view.getBottom();
                float bottom = view.getBottom() + space;
                canvas.drawRect(left, top, right, bottom, paint);
            }
        }

    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {

        int position = recyclerView.getChildAdapterPosition(view);
        int column = position % span;
        if (edge) {
            rect.left = space - column * space / span;
            rect.right = (column + 1) * space / span;
            if (position < span) {
                rect.top = space;
            }
            rect.bottom = space;
        } else {
            rect.left = column * space / span;
            rect.right = space - (column + 1) * space / span;
            if (position >= span) {
                rect.top = space;
            }
        }

    }

}
