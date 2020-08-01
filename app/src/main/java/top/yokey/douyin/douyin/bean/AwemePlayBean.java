package top.yokey.douyin.douyin.bean;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class AwemePlayBean implements Serializable {

    //音频视频
    private String awemeId = "";
    private String videoUrl = "";
    private String videoDesc = "";
    private String videoCover = "";
    private String musicCover = "";
    private String musicTitle = "";
    private String musicAuthor = "";
    //用户信息
    private String authorAvatar = "";
    private String authorNickname = "";
    //统计信息
    private String commentCount = "";
    private String diggCount = "";
    private String forwardCount = "";
    private String isTop = "";
    //合集信息
    private String mixName = "";
    //剪映信息
    private String jyName = "";
    //地区信息
    private String nearbyCity = "";
    private String nearbyName = "";
    private String nearbyCode = "";
    //其他信息
    private String maxCursor = "";
    private String createTime = "";
    private String hasMore = "";

    public String getAwemeId() {
        return awemeId;
    }

    public void setAwemeId(String awemeId) {
        this.awemeId = awemeId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }

    public String getVideoCover() {
        return videoCover;
    }

    public void setVideoCover(String videoCover) {
        this.videoCover = videoCover;
    }

    public String getMusicCover() {
        return musicCover;
    }

    public void setMusicCover(String musicCover) {
        this.musicCover = musicCover;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getAuthorAvatar() {
        return authorAvatar;
    }

    public void setAuthorAvatar(String authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    public String getAuthorNickname() {
        return authorNickname;
    }

    public void setAuthorNickname(String authorNickname) {
        this.authorNickname = authorNickname;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getDiggCount() {
        return diggCount;
    }

    public void setDiggCount(String diggCount) {
        this.diggCount = diggCount;
    }

    public String getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(String forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getMixName() {
        return mixName;
    }

    public void setMixName(String mixName) {
        this.mixName = mixName;
    }

    public String getJyName() {
        return jyName;
    }

    public void setJyName(String jyName) {
        this.jyName = jyName;
    }

    public String getNearbyCity() {
        return nearbyCity;
    }

    public void setNearbyCity(String nearbyCity) {
        this.nearbyCity = nearbyCity;
    }

    public String getNearbyName() {
        return nearbyName;
    }

    public void setNearbyName(String nearbyName) {
        this.nearbyName = nearbyName;
    }

    public String getNearbyCode() {
        return nearbyCode;
    }

    public void setNearbyCode(String nearbyCode) {
        this.nearbyCode = nearbyCode;
    }

    public String getMaxCursor() {
        return maxCursor;
    }

    public void setMaxCursor(String maxCursor) {
        this.maxCursor = maxCursor;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getHasMore() {
        return hasMore;
    }

    public void setHasMore(String hasMore) {
        this.hasMore = hasMore;
    }

}
