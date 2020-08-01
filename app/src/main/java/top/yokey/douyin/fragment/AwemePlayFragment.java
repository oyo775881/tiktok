package top.yokey.douyin.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.dueeeke.videoplayer.player.VideoView;
import com.jeremyliao.liveeventbus.LiveEventBus;

import cc.ibooker.ztextviewlib.MarqueeTextView;
import top.yokey.douyin.R;
import top.yokey.douyin.douyin.bean.AwemePlayBean;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.BaseFragment;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.ImageHelp;
import top.yokey.douyin.other.JsonUtil;
import top.yokey.douyin.view.LikeLayout;
import top.yokey.douyin.view.LoadingView;

public class AwemePlayFragment extends BaseFragment {

    private VideoView mainVideoView = null;
    private LoadingView mainLoadView = null;
    private LikeLayout mainMyLikeLayout = null;
    private AppCompatImageView avatarImageView = null;
    private AppCompatImageView addImageView = null;
    private AppCompatTextView likeTextView = null;
    private AppCompatTextView commentTextView = null;
    private AppCompatTextView forwardTextView = null;
    private AppCompatImageView musicImageView = null;
    private MarqueeTextView musicMarqueeTextView = null;
    private AppCompatTextView descTextView = null;
    private AppCompatTextView authorTextView = null;
    private AppCompatTextView timeTextView = null;
    private AppCompatImageView playImageView = null;
    private AppCompatTextView mixTextView = null;
    private RelativeLayout locationRelativeLayout = null;
    private AppCompatImageView locationImageView = null;
    private AppCompatTextView locationTextView = null;
    private AppCompatTextView locationDTextView = null;
    private RelativeLayout jyRelativeLayout = null;
    private AppCompatTextView jyTextView = null;
    private AwemePlayBean bean;
    private String type;
    private int position;

    public AwemePlayFragment(AwemePlayBean bean, String type, int position) {

        this.bean = bean;
        this.type = type;
        this.position = position;

    }

    @Override
    public View initView() {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_play_aweme, null);
        mainVideoView = view.findViewById(R.id.mainVideoView);
        mainLoadView = view.findViewById(R.id.mainLoadView);
        mainMyLikeLayout = view.findViewById(R.id.mainMyLikeLayout);
        mixTextView = view.findViewById(R.id.mixTextView);
        avatarImageView = view.findViewById(R.id.avatarImageView);
        addImageView = view.findViewById(R.id.addImageView);
        likeTextView = view.findViewById(R.id.likeTextView);
        commentTextView = view.findViewById(R.id.commentTextView);
        forwardTextView = view.findViewById(R.id.forwardTextView);
        musicImageView = view.findViewById(R.id.musicImageView);
        musicMarqueeTextView = view.findViewById(R.id.musicMarqueeTextView);
        descTextView = view.findViewById(R.id.descTextView);
        authorTextView = view.findViewById(R.id.authorTextView);
        timeTextView = view.findViewById(R.id.timeTextView);
        playImageView = view.findViewById(R.id.playImageView);
        locationRelativeLayout = view.findViewById(R.id.locationRelativeLayout);
        locationImageView = view.findViewById(R.id.locationImageView);
        locationTextView = view.findViewById(R.id.locationTextView);
        locationDTextView = view.findViewById(R.id.locationDTextView);
        jyRelativeLayout = view.findViewById(R.id.jyRelativeLayout);
        jyTextView = view.findViewById(R.id.jyTextView);
        return view;

    }

    @Override
    public void initData() {

        //加载进度
        mainLoadView.start();
        mainLoadView.setVisibility(View.VISIBLE);
        //视频播放
        mainVideoView.setScreenScaleType(VideoView.SCREEN_SCALE_MATCH_PARENT);
        mainVideoView.setUrl(bean.getVideoUrl());
        mainVideoView.setLooping(true);
        mainVideoView.start();
        //统计信息
        commentTextView.setText(BaseApplication.get().handlerNumber(bean.getCommentCount()));
        likeTextView.setText(BaseApplication.get().handlerNumber(bean.getDiggCount()));
        forwardTextView.setText(BaseApplication.get().handlerNumber(bean.getForwardCount()));
        ImageHelp.get().displayCircle(bean.getAuthorAvatar(), avatarImageView);
        ImageHelp.get().displayCircle(bean.getMusicCover(), musicImageView);
        musicMarqueeTextView.setText(bean.getMusicTitle());
        musicMarqueeTextView.append(" — " + bean.getMusicAuthor());
        descTextView.setText(bean.getVideoDesc());
        authorTextView.setText("@");
        authorTextView.append(bean.getAuthorNickname());
        //其他信息
        mixTextView.setVisibility(View.GONE);
        playImageView.setVisibility(View.GONE);
        jyRelativeLayout.setVisibility(View.GONE);
        if (!bean.getMixName().isEmpty()) {
            mixTextView.setVisibility(View.VISIBLE);
            mixTextView.setText("合集 · ");
            mixTextView.append(bean.getMixName());
        }
        if (!bean.getJyName().isEmpty()) {
            jyRelativeLayout.setVisibility(View.VISIBLE);
            jyTextView.setText(bean.getJyName());
        }
        //差异化信息
        if (type.equals("mine")) {
            forwardTextView.setCompoundDrawablesWithIntrinsicBounds(null, BaseApplication.get().getDrawable(R.mipmap.ic_aweme_more), null, null);
            forwardTextView.setText("");
            addImageView.setVisibility(View.GONE);
        }

    }

    @Override
    public void initEvent() {

        mainVideoView.setOnClickListener(view -> {
            if (mainVideoView.isPlaying()) {
                mainVideoView.pause();
                BaseApplication.get().showPlayImageView(playImageView);
            } else {
                mainVideoView.start();
                goneView();
            }
        });

        mainVideoView.addOnStateChangeListener(new VideoView.OnStateChangeListener() {
            @Override
            public void onPlayerStateChanged(int playerState) {

            }

            @Override
            public void onPlayStateChanged(int playState) {
                if (playState == VideoView.STATE_PREPARED || playState == VideoView.STATE_PLAYING) goneView();
            }
        });

        mainMyLikeLayout.setOnClickListener(view ->
                likeTextView.setCompoundDrawablesWithIntrinsicBounds(
                        null,
                        BaseApplication.get().getDrawable(R.mipmap.ic_home_like_press),
                        null,
                        null)
        );

        commentTextView.setOnClickListener(view -> LiveEventBus.get(type.equals("main") ? Constant.MAIN_COMMENT : Constant.PLAY_COMMENT).post(JsonUtil.toJson(bean)));

        LiveEventBus.get(Constant.DATA_STATE, String.class).observe(this, string -> {
            mainVideoView.pause();
            if (type.equals("main")) {
                if (BaseApplication.get().getNaviPosition() == 0 && BaseApplication.get().getAwemePosition() == position) {
                    mainVideoView.start();
                }
            } else {
                if (BaseApplication.get().getPlayPosition() == position) {
                    mainVideoView.start();
                }
            }
        });

    }

    @Override
    public void onResume() {

        super.onResume();
        BaseApplication.get().rotateImageView(musicImageView);
        if (type.equals("main")) {
            if (BaseApplication.get().getNaviPosition() == 0) {
                if (BaseApplication.get().getAwemePosition() == position) {
                    mainVideoView.start();
                } else {
                    mainVideoView.pause();
                }
            }
        } else {
            if (BaseApplication.get().getPlayPosition() == position) {
                mainVideoView.start();
            } else {
                mainVideoView.pause();
            }
        }

    }

    @Override
    public void onPause() {

        super.onPause();
        mainVideoView.pause();

    }

    @Override
    public void onStop() {

        super.onStop();
        mainVideoView.pause();

    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        mainVideoView.pause();

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        mainVideoView.release();

    }

    //自定义方法

    private void goneView() {

        mainLoadView.setVisibility(View.GONE);
        playImageView.setVisibility(View.GONE);

    }

}
