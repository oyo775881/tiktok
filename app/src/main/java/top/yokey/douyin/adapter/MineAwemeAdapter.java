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
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.ImageHelp;
import top.yokey.douyin.other.SharedHelp;

public class MineAwemeAdapter extends RecyclerView.Adapter<MineAwemeAdapter.ViewHolder> {

    private final ArrayList<AwemePlayBean> arrayList;
    private OnItemClickListener onItemClickListener = null;

    public MineAwemeAdapter(ArrayList<AwemePlayBean> arrayList) {

        this.arrayList = arrayList;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        AwemePlayBean bean = arrayList.get(position);
        holder.topImageView.setVisibility(View.GONE);
        if (bean.getIsTop().equals("1")) holder.topImageView.setVisibility(View.VISIBLE);
        ImageHelp.get().display(bean.getVideoCover(), holder.mainImageView);
        Double base = Double.parseDouble(SharedHelp.get().getString(Constant.SHARED_USER_BASE));
        Double number = Double.parseDouble(bean.getDiggCount());
        int play = (int) (base * number);
        holder.mainTextView.setText(BaseApplication.get().handlerNumber(play + ""));

        holder.mainRelativeLayout.setOnClickListener(view -> {
            if (onItemClickListener != null) {
                onItemClickListener.onClick(position, bean);
            }
        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup group, int viewType) {

        View view = LayoutInflater.from(group.getContext()).inflate(R.layout.item_mine_aweme, group, false);
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
        private final AppCompatImageView topImageView;
        private final AppCompatTextView mainTextView;

        private ViewHolder(View view) {

            super(view);
            mainRelativeLayout = view.findViewById(R.id.mainRelativeLayout);
            mainImageView = view.findViewById(R.id.mainImageView);
            topImageView = view.findViewById(R.id.topImageView);
            mainTextView = view.findViewById(R.id.mainTextView);

        }

    }

}
