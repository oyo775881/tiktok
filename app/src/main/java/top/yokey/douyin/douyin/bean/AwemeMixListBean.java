package top.yokey.douyin.douyin.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("ALL")
public class AwemeMixListBean implements Serializable {

    @SerializedName("status_code")
    private int statusCode;
    @SerializedName("cursor")
    private int cursor;
    @SerializedName("has_more")
    private int hasMore;
    @SerializedName("extra")
    private ExtraBean extra;
    @SerializedName("log_pb")
    private LogPbBean logPb;
    @SerializedName("mix_infos")
    private List<MixInfosBean> mixInfos;

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

    public List<MixInfosBean> getMixInfos() {
        return mixInfos;
    }

    public void setMixInfos(List<MixInfosBean> mixInfos) {
        this.mixInfos = mixInfos;
    }

    public static class ExtraBean {

        @SerializedName("now")
        private long now;
        @SerializedName("logid")
        private String logid;
        @SerializedName("fatal_item_ids")
        private List<?> fatalItemIds;

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public String getLogid() {
            return logid;
        }

        public void setLogid(String logid) {
            this.logid = logid;
        }

        public List<?> getFatalItemIds() {
            return fatalItemIds;
        }

        public void setFatalItemIds(List<?> fatalItemIds) {
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

    public static class MixInfosBean {

        @SerializedName("update_time")
        private int updateTime;
        @SerializedName("mix_id")
        private String mixId;
        @SerializedName("cover_url")
        private CoverUrlBean coverUrl;
        @SerializedName("status")
        private StatusBean status;
        @SerializedName("desc")
        private String desc;
        @SerializedName("author")
        private AuthorBean author;
        @SerializedName("extra")
        private String extra;
        @SerializedName("create_time")
        private int createTime;
        @SerializedName("mix_name")
        private String mixName;
        @SerializedName("statis")
        private StatisBean statis;
        @SerializedName("share_info")
        private ShareInfoBean shareInfo;
        @SerializedName("mix_type")
        private int mixType;

        public int getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(int updateTime) {
            this.updateTime = updateTime;
        }

        public String getMixId() {
            return mixId;
        }

        public void setMixId(String mixId) {
            this.mixId = mixId;
        }

        public CoverUrlBean getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(CoverUrlBean coverUrl) {
            this.coverUrl = coverUrl;
        }

        public StatusBean getStatus() {
            return status;
        }

        public void setStatus(StatusBean status) {
            this.status = status;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getExtra() {
            return extra;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
            this.createTime = createTime;
        }

        public String getMixName() {
            return mixName;
        }

        public void setMixName(String mixName) {
            this.mixName = mixName;
        }

        public StatisBean getStatis() {
            return statis;
        }

        public void setStatis(StatisBean statis) {
            this.statis = statis;
        }

        public ShareInfoBean getShareInfo() {
            return shareInfo;
        }

        public void setShareInfo(ShareInfoBean shareInfo) {
            this.shareInfo = shareInfo;
        }

        public int getMixType() {
            return mixType;
        }

        public void setMixType(int mixType) {
            this.mixType = mixType;
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

        public static class StatusBean {

            @SerializedName("status")
            private int status;
            @SerializedName("is_collected")
            private int isCollected;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getIsCollected() {
                return isCollected;
            }

            public void setIsCollected(int isCollected) {
                this.isCollected = isCollected;
            }

        }

        public static class AuthorBean {

            @SerializedName("relative_users")
            private Object relativeUsers;
            @SerializedName("signature")
            private String signature;
            @SerializedName("avatar_medium")
            private AvatarMediumBean avatarMedium;
            @SerializedName("shield_follow_notice")
            private int shieldFollowNotice;
            @SerializedName("cv_level")
            private String cvLevel;
            @SerializedName("language")
            private String language;
            @SerializedName("total_favorited")
            private int totalFavorited;
            @SerializedName("weibo_schema")
            private String weiboSchema;
            @SerializedName("shield_digg_notice")
            private int shieldDiggNotice;
            @SerializedName("has_orders")
            private boolean hasOrders;
            @SerializedName("comment_filter_status")
            private int commentFilterStatus;
            @SerializedName("uid")
            private String uid;
            @SerializedName("youtube_expire_time")
            private int youtubeExpireTime;
            @SerializedName("twitter_name")
            private String twitterName;
            @SerializedName("live_agreement_time")
            private int liveAgreementTime;
            @SerializedName("has_email")
            private boolean hasEmail;
            @SerializedName("new_story_cover")
            private Object newStoryCover;
            @SerializedName("constellation")
            private int constellation;
            @SerializedName("unique_id_modify_time")
            private int uniqueIdModifyTime;
            @SerializedName("youtube_channel_id")
            private String youtubeChannelId;
            @SerializedName("with_dou_entry")
            private boolean withDouEntry;
            @SerializedName("is_gov_media_vip")
            private boolean isGovMediaVip;
            @SerializedName("weibo_name")
            private String weiboName;
            @SerializedName("enterprise_verify_reason")
            private String enterpriseVerifyReason;
            @SerializedName("is_ad_fake")
            private boolean isAdFake;
            @SerializedName("live_agreement")
            private int liveAgreement;
            @SerializedName("hide_search")
            private boolean hideSearch;
            @SerializedName("ins_id")
            private String insId;
            @SerializedName("is_star")
            private boolean isStar;
            @SerializedName("can_set_geofencing")
            private Object canSetGeofencing;
            @SerializedName("live_commerce")
            private boolean liveCommerce;
            @SerializedName("birthday")
            private String birthday;
            @SerializedName("is_binded_weibo")
            private boolean isBindedWeibo;
            @SerializedName("status")
            private int status;
            @SerializedName("react_setting")
            private int reactSetting;
            @SerializedName("reflow_page_uid")
            private int reflowPageUid;
            @SerializedName("favoriting_count")
            private int favoritingCount;
            @SerializedName("has_twitter_token")
            private boolean hasTwitterToken;
            @SerializedName("verification_type")
            private int verificationType;
            @SerializedName("with_fusion_shop_entry")
            private boolean withFusionShopEntry;
            @SerializedName("white_cover_url")
            private Object whiteCoverUrl;
            @SerializedName("weibo_url")
            private String weiboUrl;
            @SerializedName("accept_private_policy")
            private boolean acceptPrivatePolicy;
            @SerializedName("user_mode")
            private int userMode;
            @SerializedName("sec_uid")
            private String secUid;
            @SerializedName("school_type")
            private int schoolType;
            @SerializedName("with_commerce_entry")
            private boolean withCommerceEntry;
            @SerializedName("cha_list")
            private Object chaList;
            @SerializedName("sync_to_toutiao")
            private int syncToToutiao;
            @SerializedName("video_icon")
            private VideoIconBean videoIcon;
            @SerializedName("create_time")
            private int createTime;
            @SerializedName("follower_count")
            private int followerCount;
            @SerializedName("region")
            private String region;
            @SerializedName("download_setting")
            private int downloadSetting;
            @SerializedName("commerce_user_level")
            private int commerceUserLevel;
            @SerializedName("with_shop_entry")
            private boolean withShopEntry;
            @SerializedName("gender")
            private int gender;
            @SerializedName("following_count")
            private int followingCount;
            @SerializedName("bind_phone")
            private String bindPhone;
            @SerializedName("followers_detail")
            private Object followersDetail;
            @SerializedName("google_account")
            private String googleAccount;
            @SerializedName("avatar_uri")
            private String avatarUri;
            @SerializedName("weibo_verify")
            private String weiboVerify;
            @SerializedName("has_youtube_token")
            private boolean hasYoutubeToken;
            @SerializedName("school_name")
            private String schoolName;
            @SerializedName("item_list")
            private Object itemList;
            @SerializedName("user_period")
            private int userPeriod;
            @SerializedName("live_verify")
            private int liveVerify;
            @SerializedName("prevent_download")
            private boolean preventDownload;
            @SerializedName("youtube_channel_title")
            private String youtubeChannelTitle;
            @SerializedName("duet_setting")
            private int duetSetting;
            @SerializedName("follow_status")
            private int followStatus;
            @SerializedName("type_label")
            private Object typeLabel;
            @SerializedName("need_points")
            private Object needPoints;
            @SerializedName("custom_verify")
            private String customVerify;
            @SerializedName("user_canceled")
            private boolean userCanceled;
            @SerializedName("comment_setting")
            private int commentSetting;
            @SerializedName("download_prompt_ts")
            private int downloadPromptTs;
            @SerializedName("twitter_id")
            private String twitterId;
            @SerializedName("fb_expire_time")
            private int fbExpireTime;
            @SerializedName("room_id")
            private int roomId;
            @SerializedName("authority_status")
            private int authorityStatus;
            @SerializedName("verify_info")
            private String verifyInfo;
            @SerializedName("secret")
            private int secret;
            @SerializedName("is_block")
            private boolean isBlock;
            @SerializedName("tw_expire_time")
            private int twExpireTime;
            @SerializedName("account_region")
            private String accountRegion;
            @SerializedName("platform_sync_info")
            private Object platformSyncInfo;
            @SerializedName("has_facebook_token")
            private boolean hasFacebookToken;
            @SerializedName("need_recommend")
            private int needRecommend;
            @SerializedName("show_image_bubble")
            private boolean showImageBubble;
            @SerializedName("reflow_page_gid")
            private int reflowPageGid;
            @SerializedName("avatar_300x300")
            private Avatar300x300Bean avatar300x300;
            @SerializedName("user_tags")
            private Object userTags;
            @SerializedName("avatar_thumb")
            private AvatarThumbBean avatarThumb;
            @SerializedName("ad_cover_url")
            private Object adCoverUrl;
            @SerializedName("avatar_168x168")
            private Avatar168x168Bean avatar168x168;
            @SerializedName("school_poi_id")
            private String schoolPoiId;
            @SerializedName("is_phone_binded")
            private boolean isPhoneBinded;
            @SerializedName("short_id")
            private String shortId;
            @SerializedName("location")
            private String location;
            @SerializedName("unique_id")
            private String uniqueId;
            @SerializedName("special_lock")
            private int specialLock;
            @SerializedName("hide_location")
            private boolean hideLocation;
            @SerializedName("story_open")
            private boolean storyOpen;
            @SerializedName("is_discipline_member")
            private boolean isDisciplineMember;
            @SerializedName("has_insights")
            private boolean hasInsights;
            @SerializedName("avatar_larger")
            private AvatarLargerBean avatarLarger;
            @SerializedName("neiguang_shield")
            private int neiguangShield;
            @SerializedName("homepage_bottom_toast")
            private Object homepageBottomToast;
            @SerializedName("is_verified")
            private boolean isVerified;
            @SerializedName("apple_account")
            private int appleAccount;
            @SerializedName("user_rate")
            private int userRate;
            @SerializedName("has_unread_story")
            private boolean hasUnreadStory;
            @SerializedName("story_count")
            private int storyCount;
            @SerializedName("aweme_count")
            private int awemeCount;
            @SerializedName("follower_status")
            private int followerStatus;
            @SerializedName("nickname")
            private String nickname;
            @SerializedName("shield_comment_notice")
            private int shieldCommentNotice;
            @SerializedName("cover_url")
            private List<CoverUrlBeanX> coverUrl;
            @SerializedName("geofencing")
            private List<?> geofencing;

            public Object getRelativeUsers() {
                return relativeUsers;
            }

            public void setRelativeUsers(Object relativeUsers) {
                this.relativeUsers = relativeUsers;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public AvatarMediumBean getAvatarMedium() {
                return avatarMedium;
            }

            public void setAvatarMedium(AvatarMediumBean avatarMedium) {
                this.avatarMedium = avatarMedium;
            }

            public int getShieldFollowNotice() {
                return shieldFollowNotice;
            }

            public void setShieldFollowNotice(int shieldFollowNotice) {
                this.shieldFollowNotice = shieldFollowNotice;
            }

            public String getCvLevel() {
                return cvLevel;
            }

            public void setCvLevel(String cvLevel) {
                this.cvLevel = cvLevel;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public int getTotalFavorited() {
                return totalFavorited;
            }

            public void setTotalFavorited(int totalFavorited) {
                this.totalFavorited = totalFavorited;
            }

            public String getWeiboSchema() {
                return weiboSchema;
            }

            public void setWeiboSchema(String weiboSchema) {
                this.weiboSchema = weiboSchema;
            }

            public int getShieldDiggNotice() {
                return shieldDiggNotice;
            }

            public void setShieldDiggNotice(int shieldDiggNotice) {
                this.shieldDiggNotice = shieldDiggNotice;
            }

            public boolean isHasOrders() {
                return hasOrders;
            }

            public void setHasOrders(boolean hasOrders) {
                this.hasOrders = hasOrders;
            }

            public int getCommentFilterStatus() {
                return commentFilterStatus;
            }

            public void setCommentFilterStatus(int commentFilterStatus) {
                this.commentFilterStatus = commentFilterStatus;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public int getYoutubeExpireTime() {
                return youtubeExpireTime;
            }

            public void setYoutubeExpireTime(int youtubeExpireTime) {
                this.youtubeExpireTime = youtubeExpireTime;
            }

            public String getTwitterName() {
                return twitterName;
            }

            public void setTwitterName(String twitterName) {
                this.twitterName = twitterName;
            }

            public int getLiveAgreementTime() {
                return liveAgreementTime;
            }

            public void setLiveAgreementTime(int liveAgreementTime) {
                this.liveAgreementTime = liveAgreementTime;
            }

            public boolean isHasEmail() {
                return hasEmail;
            }

            public void setHasEmail(boolean hasEmail) {
                this.hasEmail = hasEmail;
            }

            public Object getNewStoryCover() {
                return newStoryCover;
            }

            public void setNewStoryCover(Object newStoryCover) {
                this.newStoryCover = newStoryCover;
            }

            public int getConstellation() {
                return constellation;
            }

            public void setConstellation(int constellation) {
                this.constellation = constellation;
            }

            public int getUniqueIdModifyTime() {
                return uniqueIdModifyTime;
            }

            public void setUniqueIdModifyTime(int uniqueIdModifyTime) {
                this.uniqueIdModifyTime = uniqueIdModifyTime;
            }

            public String getYoutubeChannelId() {
                return youtubeChannelId;
            }

            public void setYoutubeChannelId(String youtubeChannelId) {
                this.youtubeChannelId = youtubeChannelId;
            }

            public boolean isWithDouEntry() {
                return withDouEntry;
            }

            public void setWithDouEntry(boolean withDouEntry) {
                this.withDouEntry = withDouEntry;
            }

            public boolean isIsGovMediaVip() {
                return isGovMediaVip;
            }

            public void setIsGovMediaVip(boolean isGovMediaVip) {
                this.isGovMediaVip = isGovMediaVip;
            }

            public String getWeiboName() {
                return weiboName;
            }

            public void setWeiboName(String weiboName) {
                this.weiboName = weiboName;
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

            public int getLiveAgreement() {
                return liveAgreement;
            }

            public void setLiveAgreement(int liveAgreement) {
                this.liveAgreement = liveAgreement;
            }

            public boolean isHideSearch() {
                return hideSearch;
            }

            public void setHideSearch(boolean hideSearch) {
                this.hideSearch = hideSearch;
            }

            public String getInsId() {
                return insId;
            }

            public void setInsId(String insId) {
                this.insId = insId;
            }

            public boolean isIsStar() {
                return isStar;
            }

            public void setIsStar(boolean isStar) {
                this.isStar = isStar;
            }

            public Object getCanSetGeofencing() {
                return canSetGeofencing;
            }

            public void setCanSetGeofencing(Object canSetGeofencing) {
                this.canSetGeofencing = canSetGeofencing;
            }

            public boolean isLiveCommerce() {
                return liveCommerce;
            }

            public void setLiveCommerce(boolean liveCommerce) {
                this.liveCommerce = liveCommerce;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public boolean isIsBindedWeibo() {
                return isBindedWeibo;
            }

            public void setIsBindedWeibo(boolean isBindedWeibo) {
                this.isBindedWeibo = isBindedWeibo;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getReactSetting() {
                return reactSetting;
            }

            public void setReactSetting(int reactSetting) {
                this.reactSetting = reactSetting;
            }

            public int getReflowPageUid() {
                return reflowPageUid;
            }

            public void setReflowPageUid(int reflowPageUid) {
                this.reflowPageUid = reflowPageUid;
            }

            public int getFavoritingCount() {
                return favoritingCount;
            }

            public void setFavoritingCount(int favoritingCount) {
                this.favoritingCount = favoritingCount;
            }

            public boolean isHasTwitterToken() {
                return hasTwitterToken;
            }

            public void setHasTwitterToken(boolean hasTwitterToken) {
                this.hasTwitterToken = hasTwitterToken;
            }

            public int getVerificationType() {
                return verificationType;
            }

            public void setVerificationType(int verificationType) {
                this.verificationType = verificationType;
            }

            public boolean isWithFusionShopEntry() {
                return withFusionShopEntry;
            }

            public void setWithFusionShopEntry(boolean withFusionShopEntry) {
                this.withFusionShopEntry = withFusionShopEntry;
            }

            public Object getWhiteCoverUrl() {
                return whiteCoverUrl;
            }

            public void setWhiteCoverUrl(Object whiteCoverUrl) {
                this.whiteCoverUrl = whiteCoverUrl;
            }

            public String getWeiboUrl() {
                return weiboUrl;
            }

            public void setWeiboUrl(String weiboUrl) {
                this.weiboUrl = weiboUrl;
            }

            public boolean isAcceptPrivatePolicy() {
                return acceptPrivatePolicy;
            }

            public void setAcceptPrivatePolicy(boolean acceptPrivatePolicy) {
                this.acceptPrivatePolicy = acceptPrivatePolicy;
            }

            public int getUserMode() {
                return userMode;
            }

            public void setUserMode(int userMode) {
                this.userMode = userMode;
            }

            public String getSecUid() {
                return secUid;
            }

            public void setSecUid(String secUid) {
                this.secUid = secUid;
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

            public Object getChaList() {
                return chaList;
            }

            public void setChaList(Object chaList) {
                this.chaList = chaList;
            }

            public int getSyncToToutiao() {
                return syncToToutiao;
            }

            public void setSyncToToutiao(int syncToToutiao) {
                this.syncToToutiao = syncToToutiao;
            }

            public VideoIconBean getVideoIcon() {
                return videoIcon;
            }

            public void setVideoIcon(VideoIconBean videoIcon) {
                this.videoIcon = videoIcon;
            }

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public int getFollowerCount() {
                return followerCount;
            }

            public void setFollowerCount(int followerCount) {
                this.followerCount = followerCount;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public int getDownloadSetting() {
                return downloadSetting;
            }

            public void setDownloadSetting(int downloadSetting) {
                this.downloadSetting = downloadSetting;
            }

            public int getCommerceUserLevel() {
                return commerceUserLevel;
            }

            public void setCommerceUserLevel(int commerceUserLevel) {
                this.commerceUserLevel = commerceUserLevel;
            }

            public boolean isWithShopEntry() {
                return withShopEntry;
            }

            public void setWithShopEntry(boolean withShopEntry) {
                this.withShopEntry = withShopEntry;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getFollowingCount() {
                return followingCount;
            }

            public void setFollowingCount(int followingCount) {
                this.followingCount = followingCount;
            }

            public String getBindPhone() {
                return bindPhone;
            }

            public void setBindPhone(String bindPhone) {
                this.bindPhone = bindPhone;
            }

            public Object getFollowersDetail() {
                return followersDetail;
            }

            public void setFollowersDetail(Object followersDetail) {
                this.followersDetail = followersDetail;
            }

            public String getGoogleAccount() {
                return googleAccount;
            }

            public void setGoogleAccount(String googleAccount) {
                this.googleAccount = googleAccount;
            }

            public String getAvatarUri() {
                return avatarUri;
            }

            public void setAvatarUri(String avatarUri) {
                this.avatarUri = avatarUri;
            }

            public String getWeiboVerify() {
                return weiboVerify;
            }

            public void setWeiboVerify(String weiboVerify) {
                this.weiboVerify = weiboVerify;
            }

            public boolean isHasYoutubeToken() {
                return hasYoutubeToken;
            }

            public void setHasYoutubeToken(boolean hasYoutubeToken) {
                this.hasYoutubeToken = hasYoutubeToken;
            }

            public String getSchoolName() {
                return schoolName;
            }

            public void setSchoolName(String schoolName) {
                this.schoolName = schoolName;
            }

            public Object getItemList() {
                return itemList;
            }

            public void setItemList(Object itemList) {
                this.itemList = itemList;
            }

            public int getUserPeriod() {
                return userPeriod;
            }

            public void setUserPeriod(int userPeriod) {
                this.userPeriod = userPeriod;
            }

            public int getLiveVerify() {
                return liveVerify;
            }

            public void setLiveVerify(int liveVerify) {
                this.liveVerify = liveVerify;
            }

            public boolean isPreventDownload() {
                return preventDownload;
            }

            public void setPreventDownload(boolean preventDownload) {
                this.preventDownload = preventDownload;
            }

            public String getYoutubeChannelTitle() {
                return youtubeChannelTitle;
            }

            public void setYoutubeChannelTitle(String youtubeChannelTitle) {
                this.youtubeChannelTitle = youtubeChannelTitle;
            }

            public int getDuetSetting() {
                return duetSetting;
            }

            public void setDuetSetting(int duetSetting) {
                this.duetSetting = duetSetting;
            }

            public int getFollowStatus() {
                return followStatus;
            }

            public void setFollowStatus(int followStatus) {
                this.followStatus = followStatus;
            }

            public Object getTypeLabel() {
                return typeLabel;
            }

            public void setTypeLabel(Object typeLabel) {
                this.typeLabel = typeLabel;
            }

            public Object getNeedPoints() {
                return needPoints;
            }

            public void setNeedPoints(Object needPoints) {
                this.needPoints = needPoints;
            }

            public String getCustomVerify() {
                return customVerify;
            }

            public void setCustomVerify(String customVerify) {
                this.customVerify = customVerify;
            }

            public boolean isUserCanceled() {
                return userCanceled;
            }

            public void setUserCanceled(boolean userCanceled) {
                this.userCanceled = userCanceled;
            }

            public int getCommentSetting() {
                return commentSetting;
            }

            public void setCommentSetting(int commentSetting) {
                this.commentSetting = commentSetting;
            }

            public int getDownloadPromptTs() {
                return downloadPromptTs;
            }

            public void setDownloadPromptTs(int downloadPromptTs) {
                this.downloadPromptTs = downloadPromptTs;
            }

            public String getTwitterId() {
                return twitterId;
            }

            public void setTwitterId(String twitterId) {
                this.twitterId = twitterId;
            }

            public int getFbExpireTime() {
                return fbExpireTime;
            }

            public void setFbExpireTime(int fbExpireTime) {
                this.fbExpireTime = fbExpireTime;
            }

            public int getRoomId() {
                return roomId;
            }

            public void setRoomId(int roomId) {
                this.roomId = roomId;
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

            public int getSecret() {
                return secret;
            }

            public void setSecret(int secret) {
                this.secret = secret;
            }

            public boolean isIsBlock() {
                return isBlock;
            }

            public void setIsBlock(boolean isBlock) {
                this.isBlock = isBlock;
            }

            public int getTwExpireTime() {
                return twExpireTime;
            }

            public void setTwExpireTime(int twExpireTime) {
                this.twExpireTime = twExpireTime;
            }

            public String getAccountRegion() {
                return accountRegion;
            }

            public void setAccountRegion(String accountRegion) {
                this.accountRegion = accountRegion;
            }

            public Object getPlatformSyncInfo() {
                return platformSyncInfo;
            }

            public void setPlatformSyncInfo(Object platformSyncInfo) {
                this.platformSyncInfo = platformSyncInfo;
            }

            public boolean isHasFacebookToken() {
                return hasFacebookToken;
            }

            public void setHasFacebookToken(boolean hasFacebookToken) {
                this.hasFacebookToken = hasFacebookToken;
            }

            public int getNeedRecommend() {
                return needRecommend;
            }

            public void setNeedRecommend(int needRecommend) {
                this.needRecommend = needRecommend;
            }

            public boolean isShowImageBubble() {
                return showImageBubble;
            }

            public void setShowImageBubble(boolean showImageBubble) {
                this.showImageBubble = showImageBubble;
            }

            public int getReflowPageGid() {
                return reflowPageGid;
            }

            public void setReflowPageGid(int reflowPageGid) {
                this.reflowPageGid = reflowPageGid;
            }

            public Avatar300x300Bean getAvatar300x300() {
                return avatar300x300;
            }

            public void setAvatar300x300(Avatar300x300Bean avatar300x300) {
                this.avatar300x300 = avatar300x300;
            }

            public Object getUserTags() {
                return userTags;
            }

            public void setUserTags(Object userTags) {
                this.userTags = userTags;
            }

            public AvatarThumbBean getAvatarThumb() {
                return avatarThumb;
            }

            public void setAvatarThumb(AvatarThumbBean avatarThumb) {
                this.avatarThumb = avatarThumb;
            }

            public Object getAdCoverUrl() {
                return adCoverUrl;
            }

            public void setAdCoverUrl(Object adCoverUrl) {
                this.adCoverUrl = adCoverUrl;
            }

            public Avatar168x168Bean getAvatar168x168() {
                return avatar168x168;
            }

            public void setAvatar168x168(Avatar168x168Bean avatar168x168) {
                this.avatar168x168 = avatar168x168;
            }

            public String getSchoolPoiId() {
                return schoolPoiId;
            }

            public void setSchoolPoiId(String schoolPoiId) {
                this.schoolPoiId = schoolPoiId;
            }

            public boolean isIsPhoneBinded() {
                return isPhoneBinded;
            }

            public void setIsPhoneBinded(boolean isPhoneBinded) {
                this.isPhoneBinded = isPhoneBinded;
            }

            public String getShortId() {
                return shortId;
            }

            public void setShortId(String shortId) {
                this.shortId = shortId;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getUniqueId() {
                return uniqueId;
            }

            public void setUniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
            }

            public int getSpecialLock() {
                return specialLock;
            }

            public void setSpecialLock(int specialLock) {
                this.specialLock = specialLock;
            }

            public boolean isHideLocation() {
                return hideLocation;
            }

            public void setHideLocation(boolean hideLocation) {
                this.hideLocation = hideLocation;
            }

            public boolean isStoryOpen() {
                return storyOpen;
            }

            public void setStoryOpen(boolean storyOpen) {
                this.storyOpen = storyOpen;
            }

            public boolean isIsDisciplineMember() {
                return isDisciplineMember;
            }

            public void setIsDisciplineMember(boolean isDisciplineMember) {
                this.isDisciplineMember = isDisciplineMember;
            }

            public boolean isHasInsights() {
                return hasInsights;
            }

            public void setHasInsights(boolean hasInsights) {
                this.hasInsights = hasInsights;
            }

            public AvatarLargerBean getAvatarLarger() {
                return avatarLarger;
            }

            public void setAvatarLarger(AvatarLargerBean avatarLarger) {
                this.avatarLarger = avatarLarger;
            }

            public int getNeiguangShield() {
                return neiguangShield;
            }

            public void setNeiguangShield(int neiguangShield) {
                this.neiguangShield = neiguangShield;
            }

            public Object getHomepageBottomToast() {
                return homepageBottomToast;
            }

            public void setHomepageBottomToast(Object homepageBottomToast) {
                this.homepageBottomToast = homepageBottomToast;
            }

            public boolean isIsVerified() {
                return isVerified;
            }

            public void setIsVerified(boolean isVerified) {
                this.isVerified = isVerified;
            }

            public int getAppleAccount() {
                return appleAccount;
            }

            public void setAppleAccount(int appleAccount) {
                this.appleAccount = appleAccount;
            }

            public int getUserRate() {
                return userRate;
            }

            public void setUserRate(int userRate) {
                this.userRate = userRate;
            }

            public boolean isHasUnreadStory() {
                return hasUnreadStory;
            }

            public void setHasUnreadStory(boolean hasUnreadStory) {
                this.hasUnreadStory = hasUnreadStory;
            }

            public int getStoryCount() {
                return storyCount;
            }

            public void setStoryCount(int storyCount) {
                this.storyCount = storyCount;
            }

            public int getAwemeCount() {
                return awemeCount;
            }

            public void setAwemeCount(int awemeCount) {
                this.awemeCount = awemeCount;
            }

            public int getFollowerStatus() {
                return followerStatus;
            }

            public void setFollowerStatus(int followerStatus) {
                this.followerStatus = followerStatus;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getShieldCommentNotice() {
                return shieldCommentNotice;
            }

            public void setShieldCommentNotice(int shieldCommentNotice) {
                this.shieldCommentNotice = shieldCommentNotice;
            }

            public List<CoverUrlBeanX> getCoverUrl() {
                return coverUrl;
            }

            public void setCoverUrl(List<CoverUrlBeanX> coverUrl) {
                this.coverUrl = coverUrl;
            }

            public List<?> getGeofencing() {
                return geofencing;
            }

            public void setGeofencing(List<?> geofencing) {
                this.geofencing = geofencing;
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

            public static class Avatar300x300Bean {

                @SerializedName("height")
                private int height;
                @SerializedName("uri")
                private String uri;
                @SerializedName("width")
                private int width;
                @SerializedName("url_list")
                private List<String> urlList;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

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

            public static class Avatar168x168Bean {

                @SerializedName("width")
                private int width;
                @SerializedName("height")
                private int height;
                @SerializedName("uri")
                private String uri;
                @SerializedName("url_list")
                private List<String> urlList;

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

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<String> urlList) {
                    this.urlList = urlList;
                }

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

        public static class StatisBean {

            @SerializedName("collect_vv")
            private int collectVv;
            @SerializedName("current_episode")
            private int currentEpisode;
            @SerializedName("updated_to_episode")
            private int updatedToEpisode;
            @SerializedName("play_vv")
            private long playVv;

            public int getCollectVv() {
                return collectVv;
            }

            public void setCollectVv(int collectVv) {
                this.collectVv = collectVv;
            }

            public int getCurrentEpisode() {
                return currentEpisode;
            }

            public void setCurrentEpisode(int currentEpisode) {
                this.currentEpisode = currentEpisode;
            }

            public int getUpdatedToEpisode() {
                return updatedToEpisode;
            }

            public void setUpdatedToEpisode(int updatedToEpisode) {
                this.updatedToEpisode = updatedToEpisode;
            }

            public long getPlayVv() {
                return playVv;
            }

            public void setPlayVv(long playVv) {
                this.playVv = playVv;
            }

        }

        public static class ShareInfoBean {

            @SerializedName("share_weibo_desc")
            private String shareWeiboDesc;
            @SerializedName("share_desc")
            private String shareDesc;
            @SerializedName("share_title")
            private String shareTitle;
            @SerializedName("share_title_myself")
            private String shareTitleMyself;
            @SerializedName("share_title_other")
            private String shareTitleOther;
            @SerializedName("share_desc_info")
            private String shareDescInfo;
            @SerializedName("share_url")
            private String shareUrl;

            public String getShareWeiboDesc() {
                return shareWeiboDesc;
            }

            public void setShareWeiboDesc(String shareWeiboDesc) {
                this.shareWeiboDesc = shareWeiboDesc;
            }

            public String getShareDesc() {
                return shareDesc;
            }

            public void setShareDesc(String shareDesc) {
                this.shareDesc = shareDesc;
            }

            public String getShareTitle() {
                return shareTitle;
            }

            public void setShareTitle(String shareTitle) {
                this.shareTitle = shareTitle;
            }

            public String getShareTitleMyself() {
                return shareTitleMyself;
            }

            public void setShareTitleMyself(String shareTitleMyself) {
                this.shareTitleMyself = shareTitleMyself;
            }

            public String getShareTitleOther() {
                return shareTitleOther;
            }

            public void setShareTitleOther(String shareTitleOther) {
                this.shareTitleOther = shareTitleOther;
            }

            public String getShareDescInfo() {
                return shareDescInfo;
            }

            public void setShareDescInfo(String shareDescInfo) {
                this.shareDescInfo = shareDescInfo;
            }

            public String getShareUrl() {
                return shareUrl;
            }

            public void setShareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
            }

        }

    }

}
