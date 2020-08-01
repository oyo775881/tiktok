package top.yokey.douyin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import top.yokey.douyin.R;
import top.yokey.douyin.douyin.bean.AwemePlayBean;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.ImageHelp;

public class MineFavoriteAdapter extends RecyclerView.Adapter<MineFavoriteAdapter.ViewHolder> {

    private final ArrayList<AwemePlayBean> arrayList;
    private OnItemClickListener onItemClickListener = null;

    public MineFavoriteAdapter(ArrayList<AwemePlayBean> arrayList) {

        this.arrayList = arrayList;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        AwemePlayBean bean = arrayList.get(position);
        ImageHelp.get().display(bean.getVideoCover(), holder.mainImageView);
        holder.mainTextView.setText(BaseApplication.get().handlerNumber(bean.getDiggCount() + ""));

        holder.mainRelativeLayout.setOnClickListener(view -> {
            if (onItemClickListener != null) {
                onItemClickListener.onClick(position, bean);
            }
        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup group, int viewType) {

        View view = LayoutInflater.from(group.getContext()).inflate(R.layout.item_mine_favorite, group, false);
        return new ViewHolder(view);

    }

    @Override
    public int getItemCount() {

        return arrayList.size();

    }

    @SuppressWarnings("unused")
    public void setOnItemClickListener(OnItemClickListener listener) {

        this.onItemClickListener = listener;

    }

    @SuppressWarnings("unused")
    public interface OnItemClickListener {

        @SuppressWarnings({"unused", "EmptyMethod"})
        void onClick(int position, AwemePlayBean bean);

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final RelativeLayout mainRelativeLayout;
        private final AppCompatImageView mainImageView;
        private final AppCompatTextView mainTextView;

        private ViewHolder(View view) {

            super(view);
            mainRelativeLayout = view.findViewById(R.id.mainRelativeLayout);
            mainImageView = view.findViewById(R.id.mainImageView);
            mainTextView = view.findViewById(R.id.mainTextView);

        }

    }

}
