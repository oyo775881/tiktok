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
import top.yokey.douyin.douyin.bean.AwemeCommentBean;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.ImageHelp;

public class AwemeCommentAdapter extends RecyclerView.Adapter<AwemeCommentAdapter.ViewHolder> {

    private final ArrayList<AwemeCommentBean.CommentsBean> arrayList;
    private OnItemClickListener onItemClickListener = null;

    public AwemeCommentAdapter(ArrayList<AwemeCommentBean.CommentsBean> arrayList) {

        this.arrayList = arrayList;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        AwemeCommentBean.CommentsBean bean = arrayList.get(position);
        ImageHelp.get().displayCircle(bean.getUser().getAvatarLarger().getUrlList().get(0), holder.mainImageView);
        holder.nicknameTextView.setText(bean.getUser().getNickname());
        holder.contentTextView.setText(bean.getText());
        String temp = BaseApplication.get().handlerNumber(bean.getDiggCount() + "");
        holder.likeTextView.setText(temp);
        holder.moreRelativeLayout.setVisibility(View.GONE);
        if (bean.getReplyCommentTotal() != 0) {
            holder.moreRelativeLayout.setVisibility(View.VISIBLE);
            temp = "展开" + bean.getReplyCommentTotal() + "条回复";
            holder.moreTextView.setText(temp);
        }

        holder.mainRelativeLayout.setOnClickListener(view -> {
            if (onItemClickListener != null) {
                onItemClickListener.onClick(position, bean);
            }
        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup group, int viewType) {

        View view = LayoutInflater.from(group.getContext()).inflate(R.layout.item_aweme_comment, group, false);
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
        void onClick(int position, AwemeCommentBean.CommentsBean bean);

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final RelativeLayout mainRelativeLayout;
        private final AppCompatImageView mainImageView;
        private final AppCompatTextView nicknameTextView;
        private final AppCompatTextView contentTextView;
        private final AppCompatTextView likeTextView;
        private final RelativeLayout moreRelativeLayout;
        private final AppCompatTextView moreTextView;

        private ViewHolder(View view) {

            super(view);
            mainRelativeLayout = view.findViewById(R.id.mainRelativeLayout);
            mainImageView = view.findViewById(R.id.mainImageView);
            nicknameTextView = view.findViewById(R.id.nicknameTextView);
            contentTextView = view.findViewById(R.id.contentTextView);
            likeTextView = view.findViewById(R.id.likeTextView);
            moreRelativeLayout = view.findViewById(R.id.moreRelativeLayout);
            moreTextView = view.findViewById(R.id.moreTextView);

        }

    }

}
