package top.yokey.douyin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import top.yokey.douyin.R;
import top.yokey.douyin.douyin.bean.AwemeMixListBean;
import top.yokey.douyin.other.BaseApplication;

public class MineAwemeMixAdapter extends RecyclerView.Adapter<MineAwemeMixAdapter.ViewHolder> {

    private final ArrayList<AwemeMixListBean.MixInfosBean> arrayList;
    private OnItemClickListener onItemClickListener = null;

    public MineAwemeMixAdapter(ArrayList<AwemeMixListBean.MixInfosBean> arrayList) {

        this.arrayList = arrayList;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        AwemeMixListBean.MixInfosBean bean = arrayList.get(position);
        holder.mainTextView.setText(bean.getMixName());
        holder.mainTextView.append(" ");
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.mainTextView.getLayoutParams();
        layoutParams.leftMargin = BaseApplication.get().dp2Px(position == 0 ? 12 : 0);
        layoutParams.rightMargin = BaseApplication.get().dp2Px(position == arrayList.size() - 1 ? 12 : 4);
        holder.mainTextView.setLayoutParams(layoutParams);

        holder.mainRelativeLayout.setOnClickListener(view -> {
            if (onItemClickListener != null) {
                onItemClickListener.onClick(position, bean);
            }
        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup group, int viewType) {

        View view = LayoutInflater.from(group.getContext()).inflate(R.layout.item_mine_aweme_mix, group, false);
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
        void onClick(int position, AwemeMixListBean.MixInfosBean bean);

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final RelativeLayout mainRelativeLayout;
        private final AppCompatTextView mainTextView;

        private ViewHolder(View view) {

            super(view);
            mainRelativeLayout = view.findViewById(R.id.mainRelativeLayout);
            mainTextView = view.findViewById(R.id.mainTextView);

        }

    }

}
