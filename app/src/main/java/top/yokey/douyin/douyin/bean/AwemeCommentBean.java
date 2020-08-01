package top.yokey.douyin.douyin.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class AwemeCommentBean implements Serializable {

    @SerializedName("status_code")
    private int statusCode;
    @SerializedName("cursor")
    private int cursor;
    @SerializedName("has_more")
    private int hasMore;
    @SerializedName("reply_style")
    private int replyStyle;
    @SerializedName("total")
    private int total;
    @SerializedName("extra")
    private ExtraBean extra;
    @SerializedName("log_pb")
    private LogPbBean logPb;
    @SerializedName("hotsoon_filtered_count")
    private int hotsoonFilteredCount;
    @SerializedName("comments")
    private ArrayList<CommentsBean> comments;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public int getHasMore() {
        return hasMore;
    }

    public void setHasMore(int hasMore) {
        this.hasMore = hasMore;
    }

    public int getReplyStyle() {
        return replyStyle;
    }

    public void setReplyStyle(int replyStyle) {
        this.replyStyle = replyStyle;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public LogPbBean getLogPb() {
        return logPb;
    }

    public void setLogPb(LogPbBean logPb) {
        this.logPb = logPb;
    }

    public int getHotsoonFilteredCount() {
        return hotsoonFilteredCount;
    }

    public void setHotsoonFilteredCount(int hotsoonFilteredCount) {
        this.hotsoonFilteredCount = hotsoonFilteredCount;
    }

    public ArrayList<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(ArrayList<CommentsBean> comments) {
        this.comments = comments;
    }

    public static class ExtraBean {

        @SerializedName("now")
        private long now;
        @SerializedName("fatal_item_ids")
        private Object fatalItemIds;

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public Object getFatalItemIds() {
            return fatalItemIds;
        }

        public void setFatalItemIds(Object fatalItemIds) {
            this.fatalItemIds = fatalItemIds;
        }

    }

    public static class LogPbBean {

        @SerializedName("impr_id")
        private String imprId;

        public String getImprId() {
            return imprId;
        }

        public void setImprId(String imprId) {
            this.imprId = imprId;
        }

    }

    public static class CommentsBean {

        @SerializedName("cid")
        private String cid;
        @SerializedName("text")
        private String text;
        @SerializedName("aweme_id")
        private String awemeId;
        @SerializedName("create_time")
        private int createTime;
        @SerializedName("digg_count")
        private int diggCount;
        @SerializedName("status")
        private int status;
        @SerializedName("user")
        private UserBean user;
        @SerializedName("reply_id")
        private String replyId;
        @SerializedName("user_digged")
        private int userDigged;
        @SerializedName("reply_comment_total")
        private int replyCommentTotal;
        @SerializedName("reply_to_reply_id")
        private String replyToReplyId;
        @SerializedName("is_author_digged")
        private boolean isAuthorDigged;
        @SerializedName("stick_position")
        private int stickPosition;
        @SerializedName("user_buried")
        private boolean userBuried;
        @SerializedName("label_list")
        private Object labelList;
        @SerializedName("reply_comment")
        private List<ReplyCommentBean> replyComment;
        @SerializedName("text_extra")
        private List<?> textExtra;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAwemeId() {
            return awemeId;
        }

        public void setAwemeId(String awemeId) {
            this.awemeId = awemeId;
        }

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
            this.createTime = createTime;
        }

        public int getDiggCount() {
            return diggCount;
        }

        public void setDiggCount(int diggCount) {
            this.diggCount = diggCount;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getReplyId() {
            return replyId;
        }

        public void setReplyId(String replyId) {
            this.replyId = replyId;
        }

        public int getUserDigged() {
            return userDigged;
        }

        public void setUserDigged(int userDigged) {
            this.userDigged = userDigged;
        }

        public int getReplyCommentTotal() {
            return replyCommentTotal;
        }

        public void setReplyCommentTotal(int replyCommentTotal) {
            this.replyCommentTotal = replyCommentTotal;
        }

        public String getReplyToReplyId() {
            return replyToReplyId;
        }

        public void setReplyToReplyId(String replyToReplyId) {
            this.replyToReplyId = replyToReplyId;
        }

        public boolean isIsAuthorDigged() {
            return isAuthorDigged;
        }

        public void setIsAuthorDigged(boolean isAuthorDigged) {
            this.isAuthorDigged = isAuthorDigged;
        }

        public int getStickPosition() {
            return stickPosition;
        }

        public void setStickPosition(int stickPosition) {
            this.stickPosition = stickPosition;
        }

        public boolean isUserBuried() {
            return userBuried;
        }

        public void setUserBuried(boolean userBuried) {
            this.userBuried = userBuried;
        }

        public Object getLabelList() {
            return labelList;
        }

        public void setLabelList(Object labelList) {
            this.labelList = labelList;
        }

        public List<ReplyCommentBean> getReplyComment() {
            return replyComment;
        }

        public void setReplyComment(List<ReplyCommentBean> replyComment) {
            this.replyComment = replyComment;
        }

        public List<?> getTextExtra() {
            return textExtra;
        }

        public void setTextExtra(List<?> textExtra) {
            this.textExtra = textExtra;
        }

        public static class UserBean {

            @SerializedName("uid")
            private String uid;
            @SerializedName("short_id")
            private String shortId;
            @SerializedName("nickname")
            private String nickname;
            @SerializedName("gender")
            private int gender;
            @SerializedName("signature")
            private String signature;
            @SerializedName("avatar_larger")
            private AvatarLargerBean avatarLarger;
            @SerializedName("avatar_thumb")
            private AvatarThumbBean avatarThumb;
            @SerializedName("avatar_medium")
            private AvatarMediumBean avatarMedium;
            @SerializedName("birthday")
            private String birthday;
            @SerializedName("is_verified")
            private boolean isVerified;
            @SerializedName("follow_status")
            private int followStatus;
            @SerializedName("aweme_count")
            private int awemeCount;
            @SerializedName("following_count")
            private int followingCount;
            @SerializedName("follower_count")
            private int followerCount;
            @SerializedName("favoriting_count")
            private int favoritingCount;
            @SerializedName("total_favorited")
            private int totalFavorited;
            @SerializedName("is_block")
            private boolean isBlock;
            @SerializedName("hide_search")
            private boolean hideSearch;
            @SerializedName("constellation")
            private int constellation;
            @SerializedName("location")
            private String location;
            @SerializedName("hide_location")
            private boolean hideLocation;
            @SerializedName("weibo_verify")
            private String weiboVerify;
            @SerializedName("custom_verify")
            private String customVerify;
            @SerializedName("unique_id")
            private String uniqueId;
            @SerializedName("bind_phone")
            private String bindPhone;
            @SerializedName("special_lock")
            private int specialLock;
            @SerializedName("need_recommend")
            private int needRecommend;
            @SerializedName("is_binded_weibo")
            private boolean isBindedWeibo;
            @SerializedName("weibo_name")
            private String weiboName;
            @SerializedName("weibo_schema")
            private String weiboSchema;
            @SerializedName("weibo_url")
            private String weiboUrl;
            @SerializedName("story_open")
            private boolean storyOpen;
            @SerializedName("story_count")
            private int storyCount;
            @SerializedName("has_facebook_token")
            private boolean hasFacebookToken;
            @SerializedName("has_twitter_token")
            private boolean hasTwitterToken;
            @SerializedName("fb_expire_time")
            private int fbExpireTime;
            @SerializedName("tw_expire_time")
            private int twExpireTime;
            @SerializedName("has_youtube_token")
            private boolean hasYoutubeToken;
            @SerializedName("youtube_expire_time")
            private int youtubeExpireTime;
            @SerializedName("live_verify")
            private int liveVerify;
            @SerializedName("authority_status")
            private int authorityStatus;
            @SerializedName("verify_info")
            private String verifyInfo;
            @SerializedName("shield_follow_notice")
            private int shieldFollowNotice;
            @SerializedName("shield_digg_notice")
            private int shieldDiggNotice;
            @SerializedName("shield_comment_notice")
            private int shieldCommentNotice;
            @SerializedName("school_name")
            private String schoolName;
            @SerializedName("school_poi_id")
            private String schoolPoiId;
            @SerializedName("school_type")
            private int schoolType;
            @SerializedName("with_commerce_entry")
            private boolean withCommerceEntry;
            @SerializedName("verification_type")
            private int verificationType;
            @SerializedName("enterprise_verify_reason")
            private String enterpriseVerifyReason;
            @SerializedName("is_ad_fake")
            private boolean isAdFake;
            @SerializedName("followers_detail")
            private Object followersDetail;
            @SerializedName("region")
            private String region;
            @SerializedName("account_region")
            private String accountRegion;
            @SerializedName("sync_to_toutiao")
            private int syncToToutiao;
            @SerializedName("commerce_user_level")
            private int commerceUserLevel;
            @SerializedName("live_agreement")
            private int liveAgreement;
            @SerializedName("platform_sync_info")
            private Object platformSyncInfo;
            @SerializedName("with_shop_entry")
            private boolean withShopEntry;
            @SerializedName("is_discipline_member")
            private boolean isDisciplineMember;
            @SerializedName("secret")
            private int secret;
            @SerializedName("has_orders")
            private boolean hasOrders;
            @SerializedName("prevent_download")
            private boolean preventDownload;
            @SerializedName("show_image_bubble")
            private boolean showImageBubble;
            @SerializedName("unique_id_modify_time")
            private int uniqueIdModifyTime;
            @SerializedName("video_icon")
            private VideoIconBean videoIcon;
            @SerializedName("ins_id")
            private String insId;
            @SerializedName("google_account")
            private String googleAccount;
            @SerializedName("youtube_channel_id")
            private String youtubeChannelId;
            @SerializedName("youtube_channel_title")
            private String youtubeChannelTitle;
            @SerializedName("apple_account")
            private int appleAccount;
            @SerializedName("with_dou_entry")
            private boolean withDouEntry;
            @SerializedName("with_fusion_shop_entry")
            private boolean withFusionShopEntry;
            @SerializedName("is_phone_binded")
            private boolean isPhoneBinded;
            @SerializedName("accept_private_policy")
            private boolean acceptPrivatePolicy;
            @SerializedName("twitter_id")
            private String twitterId;
            @SerializedName("twitter_name")
            private String twitterName;
            @SerializedName("user_canceled")
            private boolean userCanceled;
            @SerializedName("has_email")
            private boolean hasEmail;
            @SerializedName("is_gov_media_vip")
            private boolean isGovMediaVip;
            @SerializedName("live_agreement_time")
            private int liveAgreementTime;
            @SerializedName("status")
            private int status;
            @SerializedName("create_time")
            private int createTime;
            @SerializedName("avatar_uri")
            private String avatarUri;
            @SerializedName("follower_status")
            private int followerStatus;
            @SerializedName("neiguang_shield")
            private int neiguangShield;
            @SerializedName("comment_setting")
            private int commentSetting;
            @SerializedName("duet_setting")
            private int duetSetting;
            @SerializedName("reflow_page_gid")
            private int reflowPageGid;
            @SerializedName("reflow_page_uid")
            private int reflowPageUid;
            @SerializedName("user_rate")
            private int userRate;
            @SerializedName("download_setting")
            private int downloadSetting;
            @SerializedName("download_prompt_ts")
            private int downloadPromptTs;
            @SerializedName("react_setting")
            private int reactSetting;
            @SerializedName("live_commerce")
            private boolean liveCommerce;
            @SerializedName("language")
            private String language;
            @SerializedName("has_insights")
            private boolean hasInsights;
            @SerializedName("item_list")
            private Object itemList;
            @SerializedName("user_mode")
            private int userMode;
            @SerializedName("user_period")
            private int userPeriod;
            @SerializedName("has_unread_story")
            private boolean hasUnreadStory;
            @SerializedName("new_story_cover")
            private Object newStoryCover;
            @SerializedName("is_star")
            private boolean isStar;
            @SerializedName("cv_level")
            private String cvLevel;
            @SerializedName("type_label")
            private Object typeLabel;
            @SerializedName("ad_cover_url")
            private Object adCoverUrl;
            @SerializedName("comment_filter_status")
            private int commentFilterStatus;
            @SerializedName("avatar_168x168")
            private Avatar168x168Bean avatar168x168;
            @SerializedName("avatar_300x300")
            private Avatar300x300Bean avatar300x300;
            @SerializedName("relative_users")
            private Object relativeUsers;
            @SerializedName("cha_list")
            private Object chaList;
            @SerializedName("sec_uid")
            private String secUid;
            @SerializedName("need_points")
            private Object needPoints;
            @SerializedName("homepage_bottom_toast")
            private Object homepageBottomToast;
            @SerializedName("can_set_geofencing")
            private Object canSetGeofencing;
            @SerializedName("white_cover_url")
            private Object whiteCoverUrl;
            @SerializedName("user_tags")
            private Object userTags;
            @SerializedName("geofencing")
            private List<?> geofencing;
            @SerializedName("cover_url")
            private List<CoverUrlBean> coverUrl;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getShortId() {
                return shortId;
            }

            public void setShortId(String shortId) {
                this.shortId = shortId;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public AvatarLargerBean getAvatarLarger() {
                return avatarLarger;
            }

            public void setAvatarLarger(AvatarLargerBean avatarLarger) {
                this.avatarLarger = avatarLarger;
            }

            public AvatarThumbBean getAvatarThumb() {
                return avatarThumb;
            }

            public void setAvatarThumb(AvatarThumbBean avatarThumb) {
                this.avatarThumb = avatarThumb;
            }

            public AvatarMediumBean getAvatarMedium() {
                return avatarMedium;
            }

            public void setAvatarMedium(AvatarMediumBean avatarMedium) {
                this.avatarMedium = avatarMedium;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public boolean isIsVerified() {
                return isVerified;
            }

            public void setIsVerified(boolean isVerified) {
                this.isVerified = isVerified;
            }

            public int getFollowStatus() {
                return followStatus;
            }

            public void setFollowStatus(int followStatus) {
                this.followStatus = followStatus;
            }

            public int getAwemeCount() {
                return awemeCount;
            }

            public void setAwemeCount(int awemeCount) {
                this.awemeCount = awemeCount;
            }

            public int getFollowingCount() {
                return followingCount;
            }

            public void setFollowingCount(int followingCount) {
                this.followingCount = followingCount;
            }

            public int getFollowerCount() {
                return followerCount;
            }

            public void setFollowerCount(int followerCount) {
                this.followerCount = followerCount;
            }

            public int getFavoritingCount() {
                return favoritingCount;
            }

            public void setFavoritingCount(int favoritingCount) {
                this.favoritingCount = favoritingCount;
            }

            public int getTotalFavorited() {
                return totalFavorited;
            }

            public void setTotalFavorited(int totalFavorited) {
                this.totalFavorited = totalFavorited;
            }

            public boolean isIsBlock() {
                return isBlock;
            }

            public void setIsBlock(boolean isBlock) {
                this.isBlock = isBlock;
            }

            public boolean isHideSearch() {
                return hideSearch;
            }

            public void setHideSearch(boolean hideSearch) {
                this.hideSearch = hideSearch;
            }

            public int getConstellation() {
                return constellation;
            }

            public void setConstellation(int constellation) {
                this.constellation = constellation;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public boolean isHideLocation() {
                return hideLocation;
            }

            public void setHideLocation(boolean hideLocation) {
                this.hideLocation = hideLocation;
            }

            public String getWeiboVerify() {
                return weiboVerify;
            }

            public void setWeiboVerify(String weiboVerify) {
                this.weiboVerify = weiboVerify;
            }

            public String getCustomVerify() {
                return customVerify;
            }

            public void setCustomVerify(String customVerify) {
                this.customVerify = customVerify;
            }

            public String getUniqueId() {
                return uniqueId;
            }

            public void setUniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
            }

            public String getBindPhone() {
                return bindPhone;
            }

            public void setBindPhone(String bindPhone) {
                this.bindPhone = bindPhone;
            }

            public int getSpecialLock() {
                return specialLock;
            }

            public void setSpecialLock(int specialLock) {
                this.specialLock = specialLock;
            }

            public int getNeedRecommend() {
                return needRecommend;
            }

            public void setNeedRecommend(int needRecommend) {
                this.needRecommend = needRecommend;
            }

            public boolean isIsBindedWeibo() {
                return isBindedWeibo;
            }

            public void setIsBindedWeibo(boolean isBindedWeibo) {
                this.isBindedWeibo = isBindedWeibo;
            }

            public String getWeiboName() {
                return weiboName;
            }

            public void setWeiboName(String weiboName) {
                this.weiboName = weiboName;
            }

            public String getWeiboSchema() {
                return weiboSchema;
            }

            public void setWeiboSchema(String weiboSchema) {
                this.weiboSchema = weiboSchema;
            }

            public String getWeiboUrl() {
                return weiboUrl;
            }

            public void setWeiboUrl(String weiboUrl) {
                this.weiboUrl = weiboUrl;
            }

            public boolean isStoryOpen() {
                return storyOpen;
            }

            public void setStoryOpen(boolean storyOpen) {
                this.storyOpen = storyOpen;
            }

            public int getStoryCount() {
                return storyCount;
            }

            public void setStoryCount(int storyCount) {
                this.storyCount = storyCount;
            }

            public boolean isHasFacebookToken() {
                return hasFacebookToken;
            }

            public void setHasFacebookToken(boolean hasFacebookToken) {
                this.hasFacebookToken = hasFacebookToken;
            }

            public boolean isHasTwitterToken() {
                return hasTwitterToken;
            }

            public void setHasTwitterToken(boolean hasTwitterToken) {
                this.hasTwitterToken = hasTwitterToken;
            }

            public int getFbExpireTime() {
                return fbExpireTime;
            }

            public void setFbExpireTime(int fbExpireTime) {
                this.fbExpireTime = fbExpireTime;
            }

            public int getTwExpireTime() {
                return twExpireTime;
            }

            public void setTwExpireTime(int twExpireTime) {
                this.twExpireTime = twExpireTime;
            }

            public boolean isHasYoutubeToken() {
                return hasYoutubeToken;
            }

            public void setHasYoutubeToken(boolean hasYoutubeToken) {
                this.hasYoutubeToken = hasYoutubeToken;
            }

            public int getYoutubeExpireTime() {
                return youtubeExpireTime;
            }

            public void setYoutubeExpireTime(int youtubeExpireTime) {
                this.youtubeExpireTime = youtubeExpireTime;
            }

            public int getLiveVerify() {
                return liveVerify;
            }

            public void setLiveVerify(int liveVerify) {
                this.liveVerify = liveVerify;
            }

            public int getAuthorityStatus() {
                return authorityStatus;
            }

            public void setAuthorityStatus(int authorityStatus) {
                this.authorityStatus = authorityStatus;
            }

            public String getVerifyInfo() {
                return verifyInfo;
            }

            public void setVerifyInfo(String verifyInfo) {
                this.verifyInfo = verifyInfo;
            }

            public int getShieldFollowNotice() {
                return shieldFollowNotice;
            }

            public void setShieldFollowNotice(int shieldFollowNotice) {
                this.shieldFollowNotice = shieldFollowNotice;
            }

            public int getShieldDiggNotice() {
                return shieldDiggNotice;
            }

            public void setShieldDiggNotice(int shieldDiggNotice) {
                this.shieldDiggNotice = shieldDiggNotice;
            }

            public int getShieldCommentNotice() {
                return shieldCommentNotice;
            }

            public void setShieldCommentNotice(int shieldCommentNotice) {
                this.shieldCommentNotice = shieldCommentNotice;
            }

            public String getSchoolName() {
                return schoolName;
            }

            public void setSchoolName(String schoolName) {
                this.schoolName = schoolName;
            }

            public String getSchoolPoiId() {
                return schoolPoiId;
            }

            public void setSchoolPoiId(String schoolPoiId) {
                this.schoolPoiId = schoolPoiId;
            }

            public int getSchoolType() {
                return schoolType;
            }

            public void setSchoolType(int schoolType) {
                this.schoolType = schoolType;
            }

            public boolean isWithCommerceEntry() {
                return withCommerceEntry;
            }

            public void setWithCommerceEntry(boolean withCommerceEntry) {
                this.withCommerceEntry = withCommerceEntry;
            }

            public int getVerificationType() {
                return verificationType;
            }

            public void setVerificationType(int verificationType) {
                this.verificationType = verificationType;
            }

            public String getEnterpriseVerifyReason() {
                return enterpriseVerifyReason;
            }

            public void setEnterpriseVerifyReason(String enterpriseVerifyReason) {
                this.enterpriseVerifyReason = enterpriseVerifyReason;
            }

            public boolean isIsAdFake() {
                return isAdFake;
            }

            public void setIsAdFake(boolean isAdFake) {
                this.isAdFake = isAdFake;
            }

            public Object getFollowersDetail() {
                return followersDetail;
            }

            public void setFollowersDetail(Object followersDetail) {
                this.followersDetail = followersDetail;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public String getAccountRegion() {
                return accountRegion;
            }

            public void setAccountRegion(String accountRegion) {
                this.accountRegion = accountRegion;
            }

            public int getSyncToToutiao() {
                return syncToToutiao;
            }

            public void setSyncToToutiao(int syncToToutiao) {
                this.syncToToutiao = syncToToutiao;
            }

            public int getCommerceUserLevel() {
                return commerceUserLevel;
            }

            public void setCommerceUserLevel(int commerceUserLevel) {
                this.commerceUserLevel = commerceUserLevel;
            }

            public int getLiveAgreement() {
                return liveAgreement;
            }

            public void setLiveAgreement(int liveAgreement) {
                this.liveAgreement = liveAgreement;
            }

            public Object getPlatformSyncInfo() {
                return platformSyncInfo;
            }

            public void setPlatformSyncInfo(Object platformSyncInfo) {
                this.platformSyncInfo = platformSyncInfo;
            }

            public boolean isWithShopEntry() {
                return withShopEntry;
            }

            public void setWithShopEntry(boolean withShopEntry) {
                this.withShopEntry = withShopEntry;
            }

            public boolean isIsDisciplineMember() {
                return isDisciplineMember;
            }

            public void setIsDisciplineMember(boolean isDisciplineMember) {
                this.isDisciplineMember = isDisciplineMember;
            }

            public int getSecret() {
                return secret;
            }

            public void setSecret(int secret) {
                this.secret = secret;
            }

            public boolean isHasOrders() {
                return hasOrders;
            }

            public void setHasOrders(boolean hasOrders) {
                this.hasOrders = hasOrders;
            }

            public boolean isPreventDownload() {
                return preventDownload;
            }

            public void setPreventDownload(boolean preventDownload) {
                this.preventDownload = preventDownload;
            }

            public boolean isShowImageBubble() {
                return showImageBubble;
            }

            public void setShowImageBubble(boolean showImageBubble) {
                this.showImageBubble = showImageBubble;
            }

            public int getUniqueIdModifyTime() {
                return uniqueIdModifyTime;
            }

            public void setUniqueIdModifyTime(int uniqueIdModifyTime) {
                this.uniqueIdModifyTime = uniqueIdModifyTime;
            }

            public VideoIconBean getVideoIcon() {
                return videoIcon;
            }

            public void setVideoIcon(VideoIconBean videoIcon) {
                this.videoIcon = videoIcon;
            }

            public String getInsId() {
                return insId;
            }

            public void setInsId(String insId) {
                this.insId = insId;
            }

            public String getGoogleAccount() {
                return googleAccount;
            }

            public void setGoogleAccount(String googleAccount) {
                this.googleAccount = googleAccount;
            }

            public String getYoutubeChannelId() {
                return youtubeChannelId;
            }

            public void setYoutubeChannelId(String youtubeChannelId) {
                this.youtubeChannelId = youtubeChannelId;
            }

            public String getYoutubeChannelTitle() {
                return youtubeChannelTitle;
            }

            public void setYoutubeChannelTitle(String youtubeChannelTitle) {
                this.youtubeChannelTitle = youtubeChannelTitle;
            }

            public int getAppleAccount() {
                return appleAccount;
            }

            public void setAppleAccount(int appleAccount) {
                this.appleAccount = appleAccount;
            }

            public boolean isWithDouEntry() {
                return withDouEntry;
            }

            public void setWithDouEntry(boolean withDouEntry) {
                this.withDouEntry = withDouEntry;
            }

            public boolean isWithFusionShopEntry() {
                return withFusionShopEntry;
            }

            public void setWithFusionShopEntry(boolean withFusionShopEntry) {
                this.withFusionShopEntry = withFusionShopEntry;
            }

            public boolean isIsPhoneBinded() {
                return isPhoneBinded;
            }

            public void setIsPhoneBinded(boolean isPhoneBinded) {
                this.isPhoneBinded = isPhoneBinded;
            }

            public boolean isAcceptPrivatePolicy() {
                return acceptPrivatePolicy;
            }

            public void setAcceptPrivatePolicy(boolean acceptPrivatePolicy) {
                this.acceptPrivatePolicy = acceptPrivatePolicy;
            }

            public String getTwitterId() {
                return twitterId;
            }

            public void setTwitterId(String twitterId) {
                this.twitterId = twitterId;
            }

            public String getTwitterName() {
                return twitterName;
            }

            public void setTwitterName(String twitterName) {
                this.twitterName = twitterName;
            }

            public boolean isUserCanceled() {
                return userCanceled;
            }

            public void setUserCanceled(boolean userCanceled) {
                this.userCanceled = userCanceled;
            }

            public boolean isHasEmail() {
                return hasEmail;
            }

            public void setHasEmail(boolean hasEmail) {
                this.hasEmail = hasEmail;
            }

            public boolean isIsGovMediaVip() {
                return isGovMediaVip;
            }

            public void setIsGovMediaVip(boolean isGovMediaVip) {
                this.isGovMediaVip = isGovMediaVip;
            }

            public int getLiveAgreementTime() {
                return liveAgreementTime;
            }

            public void setLiveAgreementTime(int liveAgreementTime) {
                this.liveAgreementTime = liveAgreementTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public String getAvatarUri() {
                return avatarUri;
            }

            public void setAvatarUri(String avatarUri) {
                this.avatarUri = avatarUri;
            }

            public int getFollowerStatus() {
                return followerStatus;
            }

            public void setFollowerStatus(int followerStatus) {
                this.followerStatus = followerStatus;
            }

            public int getNeiguangShield() {
                return neiguangShield;
            }

            public void setNeiguangShield(int neiguangShield) {
                this.neiguangShield = neiguangShield;
            }

            public int getCommentSetting() {
                return commentSetting;
            }

            public void setCommentSetting(int commentSetting) {
                this.commentSetting = commentSetting;
            }

            public int getDuetSetting() {
                return duetSetting;
            }

            public void setDuetSetting(int duetSetting) {
                this.duetSetting = duetSetting;
            }

            public int getReflowPageGid() {
                return reflowPageGid;
            }

            public void setReflowPageGid(int reflowPageGid) {
                this.reflowPageGid = reflowPageGid;
            }

            public int getReflowPageUid() {
                return reflowPageUid;
            }

            public void setReflowPageUid(int reflowPageUid) {
                this.reflowPageUid = reflowPageUid;
            }

            public int getUserRate() {
                return userRate;
            }

            public void setUserRate(int userRate) {
                this.userRate = userRate;
            }

            public int getDownloadSetting() {
                return downloadSetting;
            }

            public void setDownloadSetting(int downloadSetting) {
                this.downloadSetting = downloadSetting;
            }

            public int getDownloadPromptTs() {
                return downloadPromptTs;
            }

            public void setDownloadPromptTs(int downloadPromptTs) {
                this.downloadPromptTs = downloadPromptTs;
            }

            public int getReactSetting() {
                return reactSetting;
            }

            public void setReactSetting(int reactSetting) {
                this.reactSetting = reactSetting;
            }

            public boolean isLiveCommerce() {
                return liveCommerce;
            }

            public void setLiveCommerce(boolean liveCommerce) {
                this.liveCommerce = liveCommerce;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public boolean isHasInsights() {
                return hasInsights;
            }

            public void setHasInsights(boolean hasInsights) {
                this.hasInsights = hasInsights;
            }

            public Object getItemList() {
                return itemList;
            }

            public void setItemList(Object itemList) {
                this.itemList = itemList;
            }

            public int getUserMode() {
                return userMode;
            }

            public void setUserMode(int userMode) {
                this.userMode = userMode;
            }

            public int getUserPeriod() {
                return userPeriod;
            }

            public void setUserPeriod(int userPeriod) {
                this.userPeriod = userPeriod;
            }

            public boolean isHasUnreadStory() {
                return hasUnreadStory;
            }

            public void setHasUnreadStory(boolean hasUnreadStory) {
                this.hasUnreadStory = hasUnreadStory;
            }

            public Object getNewStoryCover() {
                return newStoryCover;
            }

            public void setNewStoryCover(Object newStoryCover) {
                this.newStoryCover = newStoryCover;
            }

            public boolean isIsStar() {
                return isStar;
            }

            public void setIsStar(boolean isStar) {
                this.isStar = isStar;
            }

            public String getCvLevel() {
                return cvLevel;
            }

            public void setCvLevel(String cvLevel) {
                this.cvLevel = cvLevel;
            }

            public Object getTypeLabel() {
                return typeLabel;
            }

            public void setTypeLabel(Object typeLabel) {
                this.typeLabel = typeLabel;
            }

            public Object getAdCoverUrl() {
                return adCoverUrl;
            }

            public void setAdCoverUrl(Object adCoverUrl) {
                this.adCoverUrl = adCoverUrl;
            }

            public int getCommentFilterStatus() {
                return commentFilterStatus;
            }

            public void setCommentFilterStatus(int commentFilterStatus) {
                this.commentFilterStatus = commentFilterStatus;
            }

            public Avatar168x168Bean getAvatar168x168() {
                return avatar168x168;
            }

            public void setAvatar168x168(Avatar168x168Bean avatar168x168) {
                this.avatar168x168 = avatar168x168;
            }

            public Avatar300x300Bean getAvatar300x300() {
                return avatar300x300;
            }

            public void setAvatar300x300(Avatar300x300Bean avatar300x300) {
                this.avatar300x300 = avatar300x300;
            }

            public Object getRelativeUsers() {
                return relativeUsers;
            }

            public void setRelativeUsers(Object relativeUsers) {
                this.relativeUsers = relativeUsers;
            }

            public Object getChaList() {
                return chaList;
            }

            public void setChaList(Object chaList) {
                this.chaList = chaList;
            }

            public String getSecUid() {
                return secUid;
            }

            public void setSecUid(String secUid) {
                this.secUid = secUid;
            }

            public Object getNeedPoints() {
                return needPoints;
            }

            public void setNeedPoints(Object needPoints) {
                this.needPoints = needPoints;
            }

            public Object getHomepageBottomToast() {
                return homepageBottomToast;
            }

            public void setHomepageBottomToast(Object homepageBottomToast) {
                this.homepageBottomToast = homepageBottomToast;
            }

            public Object getCanSetGeofencing() {
                return canSetGeofencing;
            }

            public void setCanSetGeofencing(Object canSetGeofencing) {
                this.canSetGeofencing = canSetGeofencing;
            }

            public Object getWhiteCoverUrl() {
                return whiteCoverUrl;
            }

            public void setWhiteCoverUrl(Object whiteCoverUrl) {
                this.whiteCoverUrl = whiteCoverUrl;
            }

            public Object getUserTags() {
                return userTags;
            }

            public void setUserTags(Object userTags) {
                this.userTags = userTags;
            }

            public List<?> getGeofencing() {
                return geofencing;
            }

            public void setGeofencing(List<?> geofencing) {
                this.geofencing = geofencing;
            }

            public List<CoverUrlBean> getCoverUrl() {
                return coverUrl;
            }

            public void setCoverUrl(List<CoverUrlBean> coverUrl) {
                this.coverUrl = coverUrl;
            }

            public static class AvatarLargerBean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<String> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

            }

            public static class AvatarThumbBean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<String> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

            }

            public static class AvatarMediumBean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<String> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

            }

            public static class VideoIconBean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<?> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<?> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<?> urlList) {
                    this.urlList = urlList;
                }

            }

            public static class Avatar168x168Bean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<String> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

            }

            public static class Avatar300x300Bean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<String> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

            }

            public static class CoverUrlBean {

                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("url_list")
                private List<String> urlList;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

            }

        }

        public static class ReplyCommentBean {

            @SerializedName("cid")
            private String cid;
            @SerializedName("text")
            private String text;
            @SerializedName("aweme_id")
            private String awemeId;
            @SerializedName("create_time")
            private int createTime;
            @SerializedName("digg_count")
            private int diggCount;
            @SerializedName("status")
            private int status;
            @SerializedName("user")
            private UserBeanX user;
            @SerializedName("reply_id")
            private String replyId;
            @SerializedName("user_digged")
            private int userDigged;
            @SerializedName("reply_comment")
            private Object replyComment;
            @SerializedName("label_text")
            private String labelText;
            @SerializedName("label_type")
            private int labelType;
            @SerializedName("reply_to_reply_id")
            private String replyToReplyId;
            @SerializedName("is_author_digged")
            private boolean isAuthorDigged;
            @SerializedName("user_buried")
            private boolean userBuried;
            @SerializedName("label_list")
            private Object labelList;
            @SerializedName("text_extra")
            private List<?> textExtra;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getAwemeId() {
                return awemeId;
            }

            public void setAwemeId(String awemeId) {
                this.awemeId = awemeId;
            }

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public int getDiggCount() {
                return diggCount;
            }

            public void setDiggCount(int diggCount) {
                this.diggCount = diggCount;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public UserBeanX getUser() {
                return user;
            }

            public void setUser(UserBeanX user) {
                this.user = user;
            }

            public String getReplyId() {
                return replyId;
            }

            public void setReplyId(String replyId) {
                this.replyId = replyId;
            }

            public int getUserDigged() {
                return userDigged;
            }

            public void setUserDigged(int userDigged) {
                this.userDigged = userDigged;
            }

            public Object getReplyComment() {
                return replyComment;
            }

            public void setReplyComment(Object replyComment) {
                this.replyComment = replyComment;
            }

            public String getLabelText() {
                return labelText;
            }

            public void setLabelText(String labelText) {
                this.labelText = labelText;
            }

            public int getLabelType() {
                return labelType;
            }

            public void setLabelType(int labelType) {
                this.labelType = labelType;
            }

            public String getReplyToReplyId() {
                return replyToReplyId;
            }

            public void setReplyToReplyId(String replyToReplyId) {
                this.replyToReplyId = replyToReplyId;
            }

            public boolean isIsAuthorDigged() {
                return isAuthorDigged;
            }

            public void setIsAuthorDigged(boolean isAuthorDigged) {
                this.isAuthorDigged = isAuthorDigged;
            }

            public boolean isUserBuried() {
                return userBuried;
            }

            public void setUserBuried(boolean userBuried) {
                this.userBuried = userBuried;
            }

            public Object getLabelList() {
                return labelList;
            }

            public void setLabelList(Object labelList) {
                this.labelList = labelList;
            }

            public List<?> getTextExtra() {
                return textExtra;
            }

            public void setTextExtra(List<?> textExtra) {
                this.textExtra = textExtra;
            }

            public static class UserBeanX {

                @SerializedName("uid")
                private String uid;
                @SerializedName("short_id")
                private String shortId;
                @SerializedName("nickname")
                private String nickname;
                @SerializedName("gender")
                private int gender;
                @SerializedName("signature")
                private String signature;
                @SerializedName("avatar_larger")
                private AvatarLargerBeanX avatarLarger;
                @SerializedName("avatar_thumb")
                private AvatarThumbBeanX avatarThumb;
                @SerializedName("avatar_medium")
                private AvatarMediumBeanX avatarMedium;
                @SerializedName("birthday")
                private String birthday;
                @SerializedName("is_verified")
                private boolean isVerified;
                @SerializedName("follow_status")
                private int followStatus;
                @SerializedName("aweme_count")
                private int awemeCount;
                @SerializedName("following_count")
                private int followingCount;
                @SerializedName("follower_count")
                private int followerCount;
                @SerializedName("favoriting_count")
                private int favoritingCount;
                @SerializedName("total_favorited")
                private int totalFavorited;
                @SerializedName("is_block")
                private boolean isBlock;
                @SerializedName("hide_search")
                private boolean hideSearch;
                @SerializedName("constellation")
                private int constellation;
                @SerializedName("location")
                private String location;
                @SerializedName("hide_location")
                private boolean hideLocation;
                @SerializedName("weibo_verify")
                private String weiboVerify;
                @SerializedName("custom_verify")
                private String customVerify;
                @SerializedName("unique_id")
                private String uniqueId;
                @SerializedName("bind_phone")
                private String bindPhone;
                @SerializedName("special_lock")
                private int specialLock;
                @SerializedName("need_recommend")
                private int needRecommend;
                @SerializedName("is_binded_weibo")
                private boolean isBindedWeibo;
                @SerializedName("weibo_name")
                private String weiboName;
                @SerializedName("weibo_schema")
                private String weiboSchema;
                @SerializedName("weibo_url")
                private String weiboUrl;
                @SerializedName("story_open")
                private boolean storyOpen;
                @SerializedName("story_count")
                private int storyCount;
                @SerializedName("has_facebook_token")
                private boolean hasFacebookToken;
                @SerializedName("has_twitter_token")
                private boolean hasTwitterToken;
                @SerializedName("fb_expire_time")
                private int fbExpireTime;
                @SerializedName("tw_expire_time")
                private int twExpireTime;
                @SerializedName("has_youtube_token")
                private boolean hasYoutubeToken;
                @SerializedName("youtube_expire_time")
                private int youtubeExpireTime;
                @SerializedName("room_id")
                private int roomId;
                @SerializedName("live_verify")
                private int liveVerify;
                @SerializedName("authority_status")
                private int authorityStatus;
                @SerializedName("verify_info")
                private String verifyInfo;
                @SerializedName("shield_follow_notice")
                private int shieldFollowNotice;
                @SerializedName("shield_digg_notice")
                private int shieldDiggNotice;
                @SerializedName("shield_comment_notice")
                private int shieldCommentNotice;
                @SerializedName("school_name")
                private String schoolName;
                @SerializedName("school_poi_id")
                private String schoolPoiId;
                @SerializedName("school_type")
                private int schoolType;
                @SerializedName("with_commerce_entry")
                private boolean withCommerceEntry;
                @SerializedName("verification_type")
                private int verificationType;
                @SerializedName("enterprise_verify_reason")
                private String enterpriseVerifyReason;
                @SerializedName("is_ad_fake")
                private boolean isAdFake;
                @SerializedName("followers_detail")
                private Object followersDetail;
                @SerializedName("region")
                private String region;
                @SerializedName("account_region")
                private String accountRegion;
                @SerializedName("sync_to_toutiao")
                private int syncToToutiao;
                @SerializedName("commerce_user_level")
                private int commerceUserLevel;
                @SerializedName("live_agreement")
                private int liveAgreement;
                @SerializedName("platform_sync_info")
                private Object platformSyncInfo;
                @SerializedName("with_shop_entry")
                private boolean withShopEntry;
                @SerializedName("is_discipline_member")
                private boolean isDisciplineMember;
                @SerializedName("secret")
                private int secret;
                @SerializedName("has_orders")
                private boolean hasOrders;
                @SerializedName("prevent_download")
                private boolean preventDownload;
                @SerializedName("show_image_bubble")
                private boolean showImageBubble;
                @SerializedName("unique_id_modify_time")
                private int uniqueIdModifyTime;
                @SerializedName("video_icon")
                private VideoIconBeanX videoIcon;
                @SerializedName("ins_id")
                private String insId;
                @SerializedName("google_account")
                private String googleAccount;
                @SerializedName("youtube_channel_id")
                private String youtubeChannelId;
                @SerializedName("youtube_channel_title")
                private String youtubeChannelTitle;
                @SerializedName("apple_account")
                private int appleAccount;
                @SerializedName("with_dou_entry")
                private boolean withDouEntry;
                @SerializedName("with_fusion_shop_entry")
                private boolean withFusionShopEntry;
                @SerializedName("is_phone_binded")
                private boolean isPhoneBinded;
                @SerializedName("accept_private_policy")
                private boolean acceptPrivatePolicy;
                @SerializedName("twitter_id")
                private String twitterId;
                @SerializedName("twitter_name")
                private String twitterName;
                @SerializedName("user_canceled")
                private boolean userCanceled;
                @SerializedName("has_email")
                private boolean hasEmail;
                @SerializedName("is_gov_media_vip")
                private boolean isGovMediaVip;
                @SerializedName("live_agreement_time")
                private int liveAgreementTime;
                @SerializedName("status")
                private int status;
                @SerializedName("create_time")
                private int createTime;
                @SerializedName("avatar_uri")
                private String avatarUri;
                @SerializedName("follower_status")
                private int followerStatus;
                @SerializedName("neiguang_shield")
                private int neiguangShield;
                @SerializedName("comment_setting")
                private int commentSetting;
                @SerializedName("duet_setting")
                private int duetSetting;
                @SerializedName("reflow_page_gid")
                private int reflowPageGid;
                @SerializedName("reflow_page_uid")
                private int reflowPageUid;
                @SerializedName("user_rate")
                private int userRate;
                @SerializedName("download_setting")
                private int downloadSetting;
                @SerializedName("download_prompt_ts")
                private int downloadPromptTs;
                @SerializedName("react_setting")
                private int reactSetting;
                @SerializedName("live_commerce")
                private boolean liveCommerce;
                @SerializedName("language")
                private String language;
                @SerializedName("has_insights")
                private boolean hasInsights;
                @SerializedName("item_list")
                private Object itemList;
                @SerializedName("user_mode")
                private int userMode;
                @SerializedName("user_period")
                private int userPeriod;
                @SerializedName("has_unread_story")
                private boolean hasUnreadStory;
                @SerializedName("new_story_cover")
                private Object newStoryCover;
                @SerializedName("is_star")
                private boolean isStar;
                @SerializedName("cv_level")
                private String cvLevel;
                @SerializedName("type_label")
                private Object typeLabel;
                @SerializedName("ad_cover_url")
                private Object adCoverUrl;
                @SerializedName("comment_filter_status")
                private int commentFilterStatus;
                @SerializedName("avatar_168x168")
                private Avatar168x168BeanX avatar168x168;
                @SerializedName("avatar_300x300")
                private Avatar300x300BeanX avatar300x300;
                @SerializedName("relative_users")
                private Object relativeUsers;
                @SerializedName("cha_list")
                private Object chaList;
                @SerializedName("sec_uid")
                private String secUid;
                @SerializedName("need_points")
                private Object needPoints;
                @SerializedName("homepage_bottom_toast")
                private Object homepageBottomToast;
                @SerializedName("can_set_geofencing")
                private Object canSetGeofencing;
                @SerializedName("white_cover_url")
                private Object whiteCoverUrl;
                @SerializedName("user_tags")
                private Object userTags;
                @SerializedName("geofencing")
                private List<?> geofencing;
                @SerializedName("cover_url")
                private List<CoverUrlBeanX> coverUrl;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getShortId() {
                    return shortId;
                }

                public void setShortId(String shortId) {
                    this.shortId = shortId;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public int getGender() {
                    return gender;
                }

                public void setGender(int gender) {
                    this.gender = gender;
                }

                public String getSignature() {
                    return signature;
                }

                public void setSignature(String signature) {
                    this.signature = signature;
                }

                public AvatarLargerBeanX getAvatarLarger() {
                    return avatarLarger;
                }

                public void setAvatarLarger(AvatarLargerBeanX avatarLarger) {
                    this.avatarLarger = avatarLarger;
                }

                public AvatarThumbBeanX getAvatarThumb() {
                    return avatarThumb;
                }

                public void setAvatarThumb(AvatarThumbBeanX avatarThumb) {
                    this.avatarThumb = avatarThumb;
                }

                public AvatarMediumBeanX getAvatarMedium() {
                    return avatarMedium;
                }

                public void setAvatarMedium(AvatarMediumBeanX avatarMedium) {
                    this.avatarMedium = avatarMedium;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public boolean isIsVerified() {
                    return isVerified;
                }

                public void setIsVerified(boolean isVerified) {
                    this.isVerified = isVerified;
                }

                public int getFollowStatus() {
                    return followStatus;
                }

                public void setFollowStatus(int followStatus) {
                    this.followStatus = followStatus;
                }

                public int getAwemeCount() {
                    return awemeCount;
                }

                public void setAwemeCount(int awemeCount) {
                    this.awemeCount = awemeCount;
                }

                public int getFollowingCount() {
                    return followingCount;
                }

                public void setFollowingCount(int followingCount) {
                    this.followingCount = followingCount;
                }

                public int getFollowerCount() {
                    return followerCount;
                }

                public void setFollowerCount(int followerCount) {
                    this.followerCount = followerCount;
                }

                public int getFavoritingCount() {
                    return favoritingCount;
                }

                public void setFavoritingCount(int favoritingCount) {
                    this.favoritingCount = favoritingCount;
                }

                public int getTotalFavorited() {
                    return totalFavorited;
                }

                public void setTotalFavorited(int totalFavorited) {
                    this.totalFavorited = totalFavorited;
                }

                public boolean isIsBlock() {
                    return isBlock;
                }

                public void setIsBlock(boolean isBlock) {
                    this.isBlock = isBlock;
                }

                public boolean isHideSearch() {
                    return hideSearch;
                }

                public void setHideSearch(boolean hideSearch) {
                    this.hideSearch = hideSearch;
                }

                public int getConstellation() {
                    return constellation;
                }

                public void setConstellation(int constellation) {
                    this.constellation = constellation;
                }

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public boolean isHideLocation() {
                    return hideLocation;
                }

                public void setHideLocation(boolean hideLocation) {
                    this.hideLocation = hideLocation;
                }

                public String getWeiboVerify() {
                    return weiboVerify;
                }

                public void setWeiboVerify(String weiboVerify) {
                    this.weiboVerify = weiboVerify;
                }

                public String getCustomVerify() {
                    return customVerify;
                }

                public void setCustomVerify(String customVerify) {
                    this.customVerify = customVerify;
                }

                public String getUniqueId() {
                    return uniqueId;
                }

                public void setUniqueId(String uniqueId) {
                    this.uniqueId = uniqueId;
                }

                public String getBindPhone() {
                    return bindPhone;
                }

                public void setBindPhone(String bindPhone) {
                    this.bindPhone = bindPhone;
                }

                public int getSpecialLock() {
                    return specialLock;
                }

                public void setSpecialLock(int specialLock) {
                    this.specialLock = specialLock;
                }

                public int getNeedRecommend() {
                    return needRecommend;
                }

                public void setNeedRecommend(int needRecommend) {
                    this.needRecommend = needRecommend;
                }

                public boolean isIsBindedWeibo() {
                    return isBindedWeibo;
                }

                public void setIsBindedWeibo(boolean isBindedWeibo) {
                    this.isBindedWeibo = isBindedWeibo;
                }

                public String getWeiboName() {
                    return weiboName;
                }

                public void setWeiboName(String weiboName) {
                    this.weiboName = weiboName;
                }

                public String getWeiboSchema() {
                    return weiboSchema;
                }

                public void setWeiboSchema(String weiboSchema) {
                    this.weiboSchema = weiboSchema;
                }

                public String getWeiboUrl() {
                    return weiboUrl;
                }

                public void setWeiboUrl(String weiboUrl) {
                    this.weiboUrl = weiboUrl;
                }

                public boolean isStoryOpen() {
                    return storyOpen;
                }

                public void setStoryOpen(boolean storyOpen) {
                    this.storyOpen = storyOpen;
                }

                public int getStoryCount() {
                    return storyCount;
                }

                public void setStoryCount(int storyCount) {
                    this.storyCount = storyCount;
                }

                public boolean isHasFacebookToken() {
                    return hasFacebookToken;
                }

                public void setHasFacebookToken(boolean hasFacebookToken) {
                    this.hasFacebookToken = hasFacebookToken;
                }

                public boolean isHasTwitterToken() {
                    return hasTwitterToken;
                }

                public void setHasTwitterToken(boolean hasTwitterToken) {
                    this.hasTwitterToken = hasTwitterToken;
                }

                public int getFbExpireTime() {
                    return fbExpireTime;
                }

                public void setFbExpireTime(int fbExpireTime) {
                    this.fbExpireTime = fbExpireTime;
                }

                public int getTwExpireTime() {
                    return twExpireTime;
                }

                public void setTwExpireTime(int twExpireTime) {
                    this.twExpireTime = twExpireTime;
                }

                public boolean isHasYoutubeToken() {
                    return hasYoutubeToken;
                }

                public void setHasYoutubeToken(boolean hasYoutubeToken) {
                    this.hasYoutubeToken = hasYoutubeToken;
                }

                public int getYoutubeExpireTime() {
                    return youtubeExpireTime;
                }

                public void setYoutubeExpireTime(int youtubeExpireTime) {
                    this.youtubeExpireTime = youtubeExpireTime;
                }

                public int getRoomId() {
                    return roomId;
                }

                public void setRoomId(int roomId) {
                    this.roomId = roomId;
                }

                public int getLiveVerify() {
                    return liveVerify;
                }

                public void setLiveVerify(int liveVerify) {
                    this.liveVerify = liveVerify;
                }

                public int getAuthorityStatus() {
                    return authorityStatus;
                }

                public void setAuthorityStatus(int authorityStatus) {
                    this.authorityStatus = authorityStatus;
                }

                public String getVerifyInfo() {
                    return verifyInfo;
                }

                public void setVerifyInfo(String verifyInfo) {
                    this.verifyInfo = verifyInfo;
                }

                public int getShieldFollowNotice() {
                    return shieldFollowNotice;
                }

                public void setShieldFollowNotice(int shieldFollowNotice) {
                    this.shieldFollowNotice = shieldFollowNotice;
                }

                public int getShieldDiggNotice() {
                    return shieldDiggNotice;
                }

                public void setShieldDiggNotice(int shieldDiggNotice) {
                    this.shieldDiggNotice = shieldDiggNotice;
                }

                public int getShieldCommentNotice() {
                    return shieldCommentNotice;
                }

                public void setShieldCommentNotice(int shieldCommentNotice) {
                    this.shieldCommentNotice = shieldCommentNotice;
                }

                public String getSchoolName() {
                    return schoolName;
                }

                public void setSchoolName(String schoolName) {
                    this.schoolName = schoolName;
                }

                public String getSchoolPoiId() {
                    return schoolPoiId;
                }

                public void setSchoolPoiId(String schoolPoiId) {
                    this.schoolPoiId = schoolPoiId;
                }

                public int getSchoolType() {
                    return schoolType;
                }

                public void setSchoolType(int schoolType) {
                    this.schoolType = schoolType;
                }

                public boolean isWithCommerceEntry() {
                    return withCommerceEntry;
                }

                public void setWithCommerceEntry(boolean withCommerceEntry) {
                    this.withCommerceEntry = withCommerceEntry;
                }

                public int getVerificationType() {
                    return verificationType;
                }

                public void setVerificationType(int verificationType) {
                    this.verificationType = verificationType;
                }

                public String getEnterpriseVerifyReason() {
                    return enterpriseVerifyReason;
                }

                public void setEnterpriseVerifyReason(String enterpriseVerifyReason) {
                    this.enterpriseVerifyReason = enterpriseVerifyReason;
                }

                public boolean isIsAdFake() {
                    return isAdFake;
                }

                public void setIsAdFake(boolean isAdFake) {
                    this.isAdFake = isAdFake;
                }

                public Object getFollowersDetail() {
                    return followersDetail;
                }

                public void setFollowersDetail(Object followersDetail) {
                    this.followersDetail = followersDetail;
                }

                public String getRegion() {
                    return region;
                }

                public void setRegion(String region) {
                    this.region = region;
                }

                public String getAccountRegion() {
                    return accountRegion;
                }

                public void setAccountRegion(String accountRegion) {
                    this.accountRegion = accountRegion;
                }

                public int getSyncToToutiao() {
                    return syncToToutiao;
                }

                public void setSyncToToutiao(int syncToToutiao) {
                    this.syncToToutiao = syncToToutiao;
                }

                public int getCommerceUserLevel() {
                    return commerceUserLevel;
                }

                public void setCommerceUserLevel(int commerceUserLevel) {
                    this.commerceUserLevel = commerceUserLevel;
                }

                public int getLiveAgreement() {
                    return liveAgreement;
                }

                public void setLiveAgreement(int liveAgreement) {
                    this.liveAgreement = liveAgreement;
                }

                public Object getPlatformSyncInfo() {
                    return platformSyncInfo;
                }

                public void setPlatformSyncInfo(Object platformSyncInfo) {
                    this.platformSyncInfo = platformSyncInfo;
                }

                public boolean isWithShopEntry() {
                    return withShopEntry;
                }

                public void setWithShopEntry(boolean withShopEntry) {
                    this.withShopEntry = withShopEntry;
                }

                public boolean isIsDisciplineMember() {
                    return isDisciplineMember;
                }

                public void setIsDisciplineMember(boolean isDisciplineMember) {
                    this.isDisciplineMember = isDisciplineMember;
                }

                public int getSecret() {
                    return secret;
                }

                public void setSecret(int secret) {
                    this.secret = secret;
                }

                public boolean isHasOrders() {
                    return hasOrders;
                }

                public void setHasOrders(boolean hasOrders) {
                    this.hasOrders = hasOrders;
                }

                public boolean isPreventDownload() {
                    return preventDownload;
                }

                public void setPreventDownload(boolean preventDownload) {
                    this.preventDownload = preventDownload;
                }

                public boolean isShowImageBubble() {
                    return showImageBubble;
                }

                public void setShowImageBubble(boolean showImageBubble) {
                    this.showImageBubble = showImageBubble;
                }

                public int getUniqueIdModifyTime() {
                    return uniqueIdModifyTime;
                }

                public void setUniqueIdModifyTime(int uniqueIdModifyTime) {
                    this.uniqueIdModifyTime = uniqueIdModifyTime;
                }

                public VideoIconBeanX getVideoIcon() {
                    return videoIcon;
                }

                public void setVideoIcon(VideoIconBeanX videoIcon) {
                    this.videoIcon = videoIcon;
                }

                public String getInsId() {
                    return insId;
                }

                public void setInsId(String insId) {
                    this.insId = insId;
                }

                public String getGoogleAccount() {
                    return googleAccount;
                }

                public void setGoogleAccount(String googleAccount) {
                    this.googleAccount = googleAccount;
                }

                public String getYoutubeChannelId() {
                    return youtubeChannelId;
                }

                public void setYoutubeChannelId(String youtubeChannelId) {
                    this.youtubeChannelId = youtubeChannelId;
                }

                public String getYoutubeChannelTitle() {
                    return youtubeChannelTitle;
                }

                public void setYoutubeChannelTitle(String youtubeChannelTitle) {
                    this.youtubeChannelTitle = youtubeChannelTitle;
                }

                public int getAppleAccount() {
                    return appleAccount;
                }

                public void setAppleAccount(int appleAccount) {
                    this.appleAccount = appleAccount;
                }

                public boolean isWithDouEntry() {
                    return withDouEntry;
                }

                public void setWithDouEntry(boolean withDouEntry) {
                    this.withDouEntry = withDouEntry;
                }

                public boolean isWithFusionShopEntry() {
                    return withFusionShopEntry;
                }

                public void setWithFusionShopEntry(boolean withFusionShopEntry) {
                    this.withFusionShopEntry = withFusionShopEntry;
                }

                public boolean isIsPhoneBinded() {
                    return isPhoneBinded;
                }

                public void setIsPhoneBinded(boolean isPhoneBinded) {
                    this.isPhoneBinded = isPhoneBinded;
                }

                public boolean isAcceptPrivatePolicy() {
                    return acceptPrivatePolicy;
                }

                public void setAcceptPrivatePolicy(boolean acceptPrivatePolicy) {
                    this.acceptPrivatePolicy = acceptPrivatePolicy;
                }

                public String getTwitterId() {
                    return twitterId;
                }

                public void setTwitterId(String twitterId) {
                    this.twitterId = twitterId;
                }

                public String getTwitterName() {
                    return twitterName;
                }

                public void setTwitterName(String twitterName) {
                    this.twitterName = twitterName;
                }

                public boolean isUserCanceled() {
                    return userCanceled;
                }

                public void setUserCanceled(boolean userCanceled) {
                    this.userCanceled = userCanceled;
                }

                public boolean isHasEmail() {
                    return hasEmail;
                }

                public void setHasEmail(boolean hasEmail) {
                    this.hasEmail = hasEmail;
                }

                public boolean isIsGovMediaVip() {
                    return isGovMediaVip;
                }

                public void setIsGovMediaVip(boolean isGovMediaVip) {
                    this.isGovMediaVip = isGovMediaVip;
                }

                public int getLiveAgreementTime() {
                    return liveAgreementTime;
                }

                public void setLiveAgreementTime(int liveAgreementTime) {
                    this.liveAgreementTime = liveAgreementTime;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(int createTime) {
                    this.createTime = createTime;
                }

                public String getAvatarUri() {
                    return avatarUri;
                }

                public void setAvatarUri(String avatarUri) {
                    this.avatarUri = avatarUri;
                }

                public int getFollowerStatus() {
                    return followerStatus;
                }

                public void setFollowerStatus(int followerStatus) {
                    this.followerStatus = followerStatus;
                }

                public int getNeiguangShield() {
                    return neiguangShield;
                }

                public void setNeiguangShield(int neiguangShield) {
                    this.neiguangShield = neiguangShield;
                }

                public int getCommentSetting() {
                    return commentSetting;
                }

                public void setCommentSetting(int commentSetting) {
                    this.commentSetting = commentSetting;
                }

                public int getDuetSetting() {
                    return duetSetting;
                }

                public void setDuetSetting(int duetSetting) {
                    this.duetSetting = duetSetting;
                }

                public int getReflowPageGid() {
                    return reflowPageGid;
                }

                public void setReflowPageGid(int reflowPageGid) {
                    this.reflowPageGid = reflowPageGid;
                }

                public int getReflowPageUid() {
                    return reflowPageUid;
                }

                public void setReflowPageUid(int reflowPageUid) {
                    this.reflowPageUid = reflowPageUid;
                }

                public int getUserRate() {
                    return userRate;
                }

                public void setUserRate(int userRate) {
                    this.userRate = userRate;
                }

                public int getDownloadSetting() {
                    return downloadSetting;
                }

                public void setDownloadSetting(int downloadSetting) {
                    this.downloadSetting = downloadSetting;
                }

                public int getDownloadPromptTs() {
                    return downloadPromptTs;
                }

                public void setDownloadPromptTs(int downloadPromptTs) {
                    this.downloadPromptTs = downloadPromptTs;
                }

                public int getReactSetting() {
                    return reactSetting;
                }

                public void setReactSetting(int reactSetting) {
                    this.reactSetting = reactSetting;
                }

                public boolean isLiveCommerce() {
                    return liveCommerce;
                }

                public void setLiveCommerce(boolean liveCommerce) {
                    this.liveCommerce = liveCommerce;
                }

                public String getLanguage() {
                    return language;
                }

                public void setLanguage(String language) {
                    this.language = language;
                }

                public boolean isHasInsights() {
                    return hasInsights;
                }

                public void setHasInsights(boolean hasInsights) {
                    this.hasInsights = hasInsights;
                }

                public Object getItemList() {
                    return itemList;
                }

                public void setItemList(Object itemList) {
                    this.itemList = itemList;
                }

                public int getUserMode() {
                    return userMode;
                }

                public void setUserMode(int userMode) {
                    this.userMode = userMode;
                }

                public int getUserPeriod() {
                    return userPeriod;
                }

                public void setUserPeriod(int userPeriod) {
                    this.userPeriod = userPeriod;
                }

                public boolean isHasUnreadStory() {
                    return hasUnreadStory;
                }

                public void setHasUnreadStory(boolean hasUnreadStory) {
                    this.hasUnreadStory = hasUnreadStory;
                }

                public Object getNewStoryCover() {
                    return newStoryCover;
                }

                public void setNewStoryCover(Object newStoryCover) {
                    this.newStoryCover = newStoryCover;
                }

                public boolean isIsStar() {
                    return isStar;
                }

                public void setIsStar(boolean isStar) {
                    this.isStar = isStar;
                }

                public String getCvLevel() {
                    return cvLevel;
                }

                public void setCvLevel(String cvLevel) {
                    this.cvLevel = cvLevel;
                }

                public Object getTypeLabel() {
                    return typeLabel;
                }

                public void setTypeLabel(Object typeLabel) {
                    this.typeLabel = typeLabel;
                }

                public Object getAdCoverUrl() {
                    return adCoverUrl;
                }

                public void setAdCoverUrl(Object adCoverUrl) {
                    this.adCoverUrl = adCoverUrl;
                }

                public int getCommentFilterStatus() {
                    return commentFilterStatus;
                }

                public void setCommentFilterStatus(int commentFilterStatus) {
                    this.commentFilterStatus = commentFilterStatus;
                }

                public Avatar168x168BeanX getAvatar168x168() {
                    return avatar168x168;
                }

                public void setAvatar168x168(Avatar168x168BeanX avatar168x168) {
                    this.avatar168x168 = avatar168x168;
                }

                public Avatar300x300BeanX getAvatar300x300() {
                    return avatar300x300;
                }

                public void setAvatar300x300(Avatar300x300BeanX avatar300x300) {
                    this.avatar300x300 = avatar300x300;
                }

                public Object getRelativeUsers() {
                    return relativeUsers;
                }

                public void setRelativeUsers(Object relativeUsers) {
                    this.relativeUsers = relativeUsers;
                }

                public Object getChaList() {
                    return chaList;
                }

                public void setChaList(Object chaList) {
                    this.chaList = chaList;
                }

                public String getSecUid() {
                    return secUid;
                }

                public void setSecUid(String secUid) {
                    this.secUid = secUid;
                }

                public Object getNeedPoints() {
                    return needPoints;
                }

                public void setNeedPoints(Object needPoints) {
                    this.needPoints = needPoints;
                }

                public Object getHomepageBottomToast() {
                    return homepageBottomToast;
                }

                public void setHomepageBottomToast(Object homepageBottomToast) {
                    this.homepageBottomToast = homepageBottomToast;
                }

                public Object getCanSetGeofencing() {
                    return canSetGeofencing;
                }

                public void setCanSetGeofencing(Object canSetGeofencing) {
                    this.canSetGeofencing = canSetGeofencing;
                }

                public Object getWhiteCoverUrl() {
                    return whiteCoverUrl;
                }

                public void setWhiteCoverUrl(Object whiteCoverUrl) {
                    this.whiteCoverUrl = whiteCoverUrl;
                }

                public Object getUserTags() {
                    return userTags;
                }

                public void setUserTags(Object userTags) {
                    this.userTags = userTags;
                }

                public List<?> getGeofencing() {
                    return geofencing;
                }

                public void setGeofencing(List<?> geofencing) {
                    this.geofencing = geofencing;
                }

                public List<CoverUrlBeanX> getCoverUrl() {
                    return coverUrl;
                }

                public void setCoverUrl(List<CoverUrlBeanX> coverUrl) {
                    this.coverUrl = coverUrl;
                }

                public static class AvatarLargerBeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<String> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<String> urlList) {
                        this.urlList = urlList;
                    }

                }

                public static class AvatarThumbBeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<String> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<String> urlList) {
                        this.urlList = urlList;
                    }

                }

                public static class AvatarMediumBeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<String> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<String> urlList) {
                        this.urlList = urlList;
                    }

                }

                public static class VideoIconBeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<?> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<?> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<?> urlList) {
                        this.urlList = urlList;
                    }
                }

                public static class Avatar168x168BeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<String> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<String> urlList) {
                        this.urlList = urlList;
                    }

                }

                public static class Avatar300x300BeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<String> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<String> urlList) {
                        this.urlList = urlList;
                    }

                }

                public static class CoverUrlBeanX {

                    @SerializedName("uri")
                    private String uri;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;
                    @SerializedName("url_list")
                    private List<String> urlList;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<String> urlList) {
                        this.urlList = urlList;
                    }

                }

            }

        }

    }

}
