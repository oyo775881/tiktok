package top.yokey.douyin.douyin.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("ALL")
public class UserProfileBean implements Serializable {

    @SerializedName("nickname")
    private String nickname;
    @SerializedName("with_new_goods")
    private boolean withNewGoods;
    @SerializedName("country")
    private String country;
    @SerializedName("tab_settings")
    private TabSettingsBean tabSettings;
    @SerializedName("forward_count")
    private int forwardCount;
    @SerializedName("iso_country_code")
    private String isoCountryCode;
    @SerializedName("avatar_300x300")
    private Avatar300x300Bean avatar300x300;
    @SerializedName("signature_language")
    private String signatureLanguage;
    @SerializedName("avatar_thumb")
    private AvatarThumbBean avatarThumb;
    @SerializedName("follow_status")
    private int followStatus;
    @SerializedName("verification_type")
    private int verificationType;
    @SerializedName("dongtai_count")
    private int dongtaiCount;
    @SerializedName("recommend_reason_relation")
    private String recommendReasonRelation;
    @SerializedName("following_count")
    private int followingCount;
    @SerializedName("follower_count")
    private int followerCount;
    @SerializedName("mplatform_followers_count")
    private int mplatformFollowersCount;
    @SerializedName("with_fusion_shop_entry")
    private boolean withFusionShopEntry;
    @SerializedName("commerce_user_level")
    private int commerceUserLevel;
    @SerializedName("twitter_id")
    private String twitterId;
    @SerializedName("star_billboard_rank")
    private int starBillboardRank;
    @SerializedName("favoriting_count")
    private int favoritingCount;
    @SerializedName("is_block")
    private boolean isBlock;
    @SerializedName("share_info")
    private ShareInfoBean shareInfo;
    @SerializedName("with_commerce_entry")
    private boolean withCommerceEntry;
    @SerializedName("sync_to_toutiao")
    private int syncToToutiao;
    @SerializedName("school_name")
    private String schoolName;
    @SerializedName("original_musician")
    private OriginalMusicianBean originalMusician;
    @SerializedName("live_commerce")
    private boolean liveCommerce;
    @SerializedName("commerce_user_info")
    private CommerceUserInfoBean commerceUserInfo;
    @SerializedName("is_activity_user")
    private boolean isActivityUser;
    @SerializedName("short_id")
    private String shortId;
    @SerializedName("enterprise_verify_reason")
    private String enterpriseVerifyReason;
    @SerializedName("video_icon")
    private VideoIconBean videoIcon;
    @SerializedName("follower_status")
    private int followerStatus;
    @SerializedName("avatar_168x168")
    private Avatar168x168Bean avatar168x168;
    @SerializedName("sec_uid")
    private String secUid;
    @SerializedName("location")
    private String location;
    @SerializedName("uid")
    private String uid;
    @SerializedName("commerce_info")
    private CommerceInfoBean commerceInfo;
    @SerializedName("youtube_channel_id")
    private String youtubeChannelId;
    @SerializedName("is_effect_artist")
    private boolean isEffectArtist;
    @SerializedName("anchor_info")
    private AnchorInfoBean anchorInfo;
    @SerializedName("show_favorite_list")
    private boolean showFavoriteList;
    @SerializedName("message_chat_entry")
    private boolean messageChatEntry;
    @SerializedName("unique_id")
    private String uniqueId;
    @SerializedName("secret")
    private int secret;
    @SerializedName("with_commerce_enterprise_tab_entry")
    private boolean withCommerceEnterpriseTabEntry;
    @SerializedName("sprint_support_user_info")
    private SprintSupportUserInfoBean sprintSupportUserInfo;
    @SerializedName("shop_micro_app")
    private String shopMicroApp;
    @SerializedName("gender")
    private int gender;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("total_favorited")
    private long totalFavorited;
    @SerializedName("ins_id")
    private String insId;
    @SerializedName("district")
    private String district;
    @SerializedName("birthday_hide_level")
    private int birthdayHideLevel;
    @SerializedName("signature")
    private String signature;
    @SerializedName("apple_account")
    private int appleAccount;
    @SerializedName("twitter_name")
    private String twitterName;
    @SerializedName("is_gov_media_vip")
    private boolean isGovMediaVip;
    @SerializedName("city")
    private String city;
    @SerializedName("urge_detail")
    private UrgeDetailBean urgeDetail;
    @SerializedName("room_id")
    private int roomId;
    @SerializedName("province")
    private String province;
    @SerializedName("watch_status")
    private boolean watchStatus;
    @SerializedName("life_story_block")
    private LifeStoryBlockBean lifeStoryBlock;
    @SerializedName("is_blocked")
    private boolean isBlocked;
    @SerializedName("aweme_count")
    private long awemeCount;
    @SerializedName("display_wvalantine_activity_entry")
    private boolean displayWvalantineActivityEntry;
    @SerializedName("video_cover")
    private VideoCoverBean videoCover;
    @SerializedName("avatar_larger")
    private AvatarLargerBeanX avatarLarger;
    @SerializedName("youtube_channel_title")
    private String youtubeChannelTitle;
    @SerializedName("profile_tab_type")
    private int profileTabType;
    @SerializedName("enterprise_user_info")
    private String enterpriseUserInfo;
    @SerializedName("avatar_medium")
    private AvatarMediumBean avatarMedium;
    @SerializedName("custom_verify")
    private String customVerify;
    @SerializedName("is_star")
    private boolean isStar;
    @SerializedName("r_fans_group_info")
    private RFansGroupInfoBean rFansGroupInfo;
    @SerializedName("recommend_user_reason_source")
    private int recommendUserReasonSource;
    @SerializedName("cover_url")
    private List<CoverUrlBean> coverUrl;
    @SerializedName("followers_detail")
    private List<FollowersDetailBean> followersDetail;
    @SerializedName("white_cover_url")
    private List<WhiteCoverUrlBean> whiteCoverUrl;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isWithNewGoods() {
        return withNewGoods;
    }

    public void setWithNewGoods(boolean withNewGoods) {
        this.withNewGoods = withNewGoods;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TabSettingsBean getTabSettings() {
        return tabSettings;
    }

    public void setTabSettings(TabSettingsBean tabSettings) {
        this.tabSettings = tabSettings;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    public Avatar300x300Bean getAvatar300x300() {
        return avatar300x300;
    }

    public void setAvatar300x300(Avatar300x300Bean avatar300x300) {
        this.avatar300x300 = avatar300x300;
    }

    public String getSignatureLanguage() {
        return signatureLanguage;
    }

    public void setSignatureLanguage(String signatureLanguage) {
        this.signatureLanguage = signatureLanguage;
    }

    public AvatarThumbBean getAvatarThumb() {
        return avatarThumb;
    }

    public void setAvatarThumb(AvatarThumbBean avatarThumb) {
        this.avatarThumb = avatarThumb;
    }

    public int getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(int followStatus) {
        this.followStatus = followStatus;
    }

    public int getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(int verificationType) {
        this.verificationType = verificationType;
    }

    public int getDongtaiCount() {
        return dongtaiCount;
    }

    public void setDongtaiCount(int dongtaiCount) {
        this.dongtaiCount = dongtaiCount;
    }

    public String getRecommendReasonRelation() {
        return recommendReasonRelation;
    }

    public void setRecommendReasonRelation(String recommendReasonRelation) {
        this.recommendReasonRelation = recommendReasonRelation;
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

    public int getMplatformFollowersCount() {
        return mplatformFollowersCount;
    }

    public void setMplatformFollowersCount(int mplatformFollowersCount) {
        this.mplatformFollowersCount = mplatformFollowersCount;
    }

    public boolean isWithFusionShopEntry() {
        return withFusionShopEntry;
    }

    public void setWithFusionShopEntry(boolean withFusionShopEntry) {
        this.withFusionShopEntry = withFusionShopEntry;
    }

    public int getCommerceUserLevel() {
        return commerceUserLevel;
    }

    public void setCommerceUserLevel(int commerceUserLevel) {
        this.commerceUserLevel = commerceUserLevel;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public int getStarBillboardRank() {
        return starBillboardRank;
    }

    public void setStarBillboardRank(int starBillboardRank) {
        this.starBillboardRank = starBillboardRank;
    }

    public int getFavoritingCount() {
        return favoritingCount;
    }

    public void setFavoritingCount(int favoritingCount) {
        this.favoritingCount = favoritingCount;
    }

    public boolean isIsBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public ShareInfoBean getShareInfo() {
        return shareInfo;
    }

    public void setShareInfo(ShareInfoBean shareInfo) {
        this.shareInfo = shareInfo;
    }

    public boolean isWithCommerceEntry() {
        return withCommerceEntry;
    }

    public void setWithCommerceEntry(boolean withCommerceEntry) {
        this.withCommerceEntry = withCommerceEntry;
    }

    public int getSyncToToutiao() {
        return syncToToutiao;
    }

    public void setSyncToToutiao(int syncToToutiao) {
        this.syncToToutiao = syncToToutiao;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public OriginalMusicianBean getOriginalMusician() {
        return originalMusician;
    }

    public void setOriginalMusician(OriginalMusicianBean originalMusician) {
        this.originalMusician = originalMusician;
    }

    public boolean isLiveCommerce() {
        return liveCommerce;
    }

    public void setLiveCommerce(boolean liveCommerce) {
        this.liveCommerce = liveCommerce;
    }

    public CommerceUserInfoBean getCommerceUserInfo() {
        return commerceUserInfo;
    }

    public void setCommerceUserInfo(CommerceUserInfoBean commerceUserInfo) {
        this.commerceUserInfo = commerceUserInfo;
    }

    public boolean isIsActivityUser() {
        return isActivityUser;
    }

    public void setIsActivityUser(boolean isActivityUser) {
        this.isActivityUser = isActivityUser;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public String getEnterpriseVerifyReason() {
        return enterpriseVerifyReason;
    }

    public void setEnterpriseVerifyReason(String enterpriseVerifyReason) {
        this.enterpriseVerifyReason = enterpriseVerifyReason;
    }

    public VideoIconBean getVideoIcon() {
        return videoIcon;
    }

    public void setVideoIcon(VideoIconBean videoIcon) {
        this.videoIcon = videoIcon;
    }

    public int getFollowerStatus() {
        return followerStatus;
    }

    public void setFollowerStatus(int followerStatus) {
        this.followerStatus = followerStatus;
    }

    public Avatar168x168Bean getAvatar168x168() {
        return avatar168x168;
    }

    public void setAvatar168x168(Avatar168x168Bean avatar168x168) {
        this.avatar168x168 = avatar168x168;
    }

    public String getSecUid() {
        return secUid;
    }

    public void setSecUid(String secUid) {
        this.secUid = secUid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public CommerceInfoBean getCommerceInfo() {
        return commerceInfo;
    }

    public void setCommerceInfo(CommerceInfoBean commerceInfo) {
        this.commerceInfo = commerceInfo;
    }

    public String getYoutubeChannelId() {
        return youtubeChannelId;
    }

    public void setYoutubeChannelId(String youtubeChannelId) {
        this.youtubeChannelId = youtubeChannelId;
    }

    public boolean isIsEffectArtist() {
        return isEffectArtist;
    }

    public void setIsEffectArtist(boolean isEffectArtist) {
        this.isEffectArtist = isEffectArtist;
    }

    public AnchorInfoBean getAnchorInfo() {
        return anchorInfo;
    }

    public void setAnchorInfo(AnchorInfoBean anchorInfo) {
        this.anchorInfo = anchorInfo;
    }

    public boolean isShowFavoriteList() {
        return showFavoriteList;
    }

    public void setShowFavoriteList(boolean showFavoriteList) {
        this.showFavoriteList = showFavoriteList;
    }

    public boolean isMessageChatEntry() {
        return messageChatEntry;
    }

    public void setMessageChatEntry(boolean messageChatEntry) {
        this.messageChatEntry = messageChatEntry;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public int getSecret() {
        return secret;
    }

    public void setSecret(int secret) {
        this.secret = secret;
    }

    public boolean isWithCommerceEnterpriseTabEntry() {
        return withCommerceEnterpriseTabEntry;
    }

    public void setWithCommerceEnterpriseTabEntry(boolean withCommerceEnterpriseTabEntry) {
        this.withCommerceEnterpriseTabEntry = withCommerceEnterpriseTabEntry;
    }

    public SprintSupportUserInfoBean getSprintSupportUserInfo() {
        return sprintSupportUserInfo;
    }

    public void setSprintSupportUserInfo(SprintSupportUserInfoBean sprintSupportUserInfo) {
        this.sprintSupportUserInfo = sprintSupportUserInfo;
    }

    public String getShopMicroApp() {
        return shopMicroApp;
    }

    public void setShopMicroApp(String shopMicroApp) {
        this.shopMicroApp = shopMicroApp;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getTotalFavorited() {
        return totalFavorited;
    }

    public void setTotalFavorited(long totalFavorited) {
        this.totalFavorited = totalFavorited;
    }

    public String getInsId() {
        return insId;
    }

    public void setInsId(String insId) {
        this.insId = insId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getBirthdayHideLevel() {
        return birthdayHideLevel;
    }

    public void setBirthdayHideLevel(int birthdayHideLevel) {
        this.birthdayHideLevel = birthdayHideLevel;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getAppleAccount() {
        return appleAccount;
    }

    public void setAppleAccount(int appleAccount) {
        this.appleAccount = appleAccount;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
    }

    public boolean isIsGovMediaVip() {
        return isGovMediaVip;
    }

    public void setIsGovMediaVip(boolean isGovMediaVip) {
        this.isGovMediaVip = isGovMediaVip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UrgeDetailBean getUrgeDetail() {
        return urgeDetail;
    }

    public void setUrgeDetail(UrgeDetailBean urgeDetail) {
        this.urgeDetail = urgeDetail;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public boolean isWatchStatus() {
        return watchStatus;
    }

    public void setWatchStatus(boolean watchStatus) {
        this.watchStatus = watchStatus;
    }

    public LifeStoryBlockBean getLifeStoryBlock() {
        return lifeStoryBlock;
    }

    public void setLifeStoryBlock(LifeStoryBlockBean lifeStoryBlock) {
        this.lifeStoryBlock = lifeStoryBlock;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public long getAwemeCount() {
        return awemeCount;
    }

    public void setAwemeCount(long awemeCount) {
        this.awemeCount = awemeCount;
    }

    public boolean isDisplayWvalantineActivityEntry() {
        return displayWvalantineActivityEntry;
    }

    public void setDisplayWvalantineActivityEntry(boolean displayWvalantineActivityEntry) {
        this.displayWvalantineActivityEntry = displayWvalantineActivityEntry;
    }

    public VideoCoverBean getVideoCover() {
        return videoCover;
    }

    public void setVideoCover(VideoCoverBean videoCover) {
        this.videoCover = videoCover;
    }

    public AvatarLargerBeanX getAvatarLarger() {
        return avatarLarger;
    }

    public void setAvatarLarger(AvatarLargerBeanX avatarLarger) {
        this.avatarLarger = avatarLarger;
    }

    public String getYoutubeChannelTitle() {
        return youtubeChannelTitle;
    }

    public void setYoutubeChannelTitle(String youtubeChannelTitle) {
        this.youtubeChannelTitle = youtubeChannelTitle;
    }

    public int getProfileTabType() {
        return profileTabType;
    }

    public void setProfileTabType(int profileTabType) {
        this.profileTabType = profileTabType;
    }

    public String getEnterpriseUserInfo() {
        return enterpriseUserInfo;
    }

    public void setEnterpriseUserInfo(String enterpriseUserInfo) {
        this.enterpriseUserInfo = enterpriseUserInfo;
    }

    public AvatarMediumBean getAvatarMedium() {
        return avatarMedium;
    }

    public void setAvatarMedium(AvatarMediumBean avatarMedium) {
        this.avatarMedium = avatarMedium;
    }

    public String getCustomVerify() {
        return customVerify;
    }

    public void setCustomVerify(String customVerify) {
        this.customVerify = customVerify;
    }

    public boolean isIsStar() {
        return isStar;
    }

    public void setIsStar(boolean isStar) {
        this.isStar = isStar;
    }

    public RFansGroupInfoBean getRFansGroupInfo() {
        return rFansGroupInfo;
    }

    public void setRFansGroupInfo(RFansGroupInfoBean rFansGroupInfo) {
        this.rFansGroupInfo = rFansGroupInfo;
    }

    public int getRecommendUserReasonSource() {
        return recommendUserReasonSource;
    }

    public void setRecommendUserReasonSource(int recommendUserReasonSource) {
        this.recommendUserReasonSource = recommendUserReasonSource;
    }

    public List<CoverUrlBean> getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(List<CoverUrlBean> coverUrl) {
        this.coverUrl = coverUrl;
    }

    public List<FollowersDetailBean> getFollowersDetail() {
        return followersDetail;
    }

    public void setFollowersDetail(List<FollowersDetailBean> followersDetail) {
        this.followersDetail = followersDetail;
    }

    public List<WhiteCoverUrlBean> getWhiteCoverUrl() {
        return whiteCoverUrl;
    }

    public void setWhiteCoverUrl(List<WhiteCoverUrlBean> whiteCoverUrl) {
        this.whiteCoverUrl = whiteCoverUrl;
    }

    public static class TabSettingsBean {

        @SerializedName("private_tab")
        private PrivateTabBean privateTab;

        public PrivateTabBean getPrivateTab() {
            return privateTab;
        }

        public void setPrivateTab(PrivateTabBean privateTab) {
            this.privateTab = privateTab;
        }

        public static class PrivateTabBean {

            @SerializedName("show_private_tab")
            private boolean showPrivateTab;
            @SerializedName("private_tab_style")
            private int privateTabStyle;

            public boolean isShowPrivateTab() {
                return showPrivateTab;
            }

            public void setShowPrivateTab(boolean showPrivateTab) {
                this.showPrivateTab = showPrivateTab;
            }

            public int getPrivateTabStyle() {
                return privateTabStyle;
            }

            public void setPrivateTabStyle(int privateTabStyle) {
                this.privateTabStyle = privateTabStyle;
            }

        }

    }

    public static class Avatar300x300Bean {

        @SerializedName("uri")
        private String uri;
        @SerializedName("url_list")
        private List<String> urlList;

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

    public static class AvatarThumbBean {

        @SerializedName("uri")
        private String uri;
        @SerializedName("url_list")
        private List<String> urlList;

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

    public static class ShareInfoBean {

        @SerializedName("share_url")
        private String shareUrl;
        @SerializedName("share_weibo_desc")
        private String shareWeiboDesc;
        @SerializedName("share_desc")
        private String shareDesc;
        @SerializedName("share_title")
        private String shareTitle;
        @SerializedName("share_qrcode_url")
        private ShareQrcodeUrlBean shareQrcodeUrl;
        @SerializedName("share_image_url")
        private ShareImageUrlBean shareImageUrl;
        @SerializedName("bool_persist")
        private int boolPersist;

        public String getShareUrl() {
            return shareUrl;
        }

        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

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

        public ShareQrcodeUrlBean getShareQrcodeUrl() {
            return shareQrcodeUrl;
        }

        public void setShareQrcodeUrl(ShareQrcodeUrlBean shareQrcodeUrl) {
            this.shareQrcodeUrl = shareQrcodeUrl;
        }

        public ShareImageUrlBean getShareImageUrl() {
            return shareImageUrl;
        }

        public void setShareImageUrl(ShareImageUrlBean shareImageUrl) {
            this.shareImageUrl = shareImageUrl;
        }

        public int getBoolPersist() {
            return boolPersist;
        }

        public void setBoolPersist(int boolPersist) {
            this.boolPersist = boolPersist;
        }

        public static class ShareQrcodeUrlBean {

            @SerializedName("uri")
            private String uri;
            @SerializedName("url_list")
            private List<String> urlList;

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

        public static class ShareImageUrlBean {

            @SerializedName("url_list")
            private Object urlList;

            public Object getUrlList() {
                return urlList;
            }

            public void setUrlList(Object urlList) {
                this.urlList = urlList;
            }

        }

    }

    public static class OriginalMusicianBean {

        @SerializedName("music_count")
        private int musicCount;
        @SerializedName("music_used_count")
        private int musicUsedCount;
        @SerializedName("digg_count")
        private long diggCount;

        public int getMusicCount() {
            return musicCount;
        }

        public void setMusicCount(int musicCount) {
            this.musicCount = musicCount;
        }

        public int getMusicUsedCount() {
            return musicUsedCount;
        }

        public void setMusicUsedCount(int musicUsedCount) {
            this.musicUsedCount = musicUsedCount;
        }

        public long getDiggCount() {
            return diggCount;
        }

        public void setDiggCount(long diggCount) {
            this.diggCount = diggCount;
        }

    }

    public static class CommerceUserInfoBean {

        @SerializedName("has_ads_entry")
        private boolean hasAdsEntry;
        @SerializedName("ad_revenue_rits")
        private Object adRevenueRits;

        public boolean isHasAdsEntry() {
            return hasAdsEntry;
        }

        public void setHasAdsEntry(boolean hasAdsEntry) {
            this.hasAdsEntry = hasAdsEntry;
        }

        public Object getAdRevenueRits() {
            return adRevenueRits;
        }

        public void setAdRevenueRits(Object adRevenueRits) {
            this.adRevenueRits = adRevenueRits;
        }

    }

    public static class VideoIconBean {

        @SerializedName("uri")
        private String uri;
        @SerializedName("url_list")
        private List<?> urlList;

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
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
        @SerializedName("url_list")
        private List<String> urlList;

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

    public static class CommerceInfoBean {

        @SerializedName("challenge_list")
        private List<?> challengeList;
        @SerializedName("offline_info_list")
        private List<?> offlineInfoList;

        public List<?> getChallengeList() {
            return challengeList;
        }

        public void setChallengeList(List<?> challengeList) {
            this.challengeList = challengeList;
        }

        public List<?> getOfflineInfoList() {
            return offlineInfoList;
        }

        public void setOfflineInfoList(List<?> offlineInfoList) {
            this.offlineInfoList = offlineInfoList;
        }

    }

    public static class AnchorInfoBean {

        @SerializedName("scheduled_time_text")
        private String scheduledTimeText;
        @SerializedName("scheduled_master_switch")
        private boolean scheduledMasterSwitch;
        @SerializedName("scheduled_profile_switch")
        private boolean scheduledProfileSwitch;

        public String getScheduledTimeText() {
            return scheduledTimeText;
        }

        public void setScheduledTimeText(String scheduledTimeText) {
            this.scheduledTimeText = scheduledTimeText;
        }

        public boolean isScheduledMasterSwitch() {
            return scheduledMasterSwitch;
        }

        public void setScheduledMasterSwitch(boolean scheduledMasterSwitch) {
            this.scheduledMasterSwitch = scheduledMasterSwitch;
        }

        public boolean isScheduledProfileSwitch() {
            return scheduledProfileSwitch;
        }

        public void setScheduledProfileSwitch(boolean scheduledProfileSwitch) {
            this.scheduledProfileSwitch = scheduledProfileSwitch;
        }

    }

    public static class SprintSupportUserInfoBean {

        @SerializedName("sprint")
        private int sprint;
        @SerializedName("followers")
        private List<FollowersBean> followers;

        public int getSprint() {
            return sprint;
        }

        public void setSprint(int sprint) {
            this.sprint = sprint;
        }

        public List<FollowersBean> getFollowers() {
            return followers;
        }

        public void setFollowers(List<FollowersBean> followers) {
            this.followers = followers;
        }

        public static class FollowersBean {

            @SerializedName("sec_uid")
            private String secUid;
            @SerializedName("uid")
            private String uid;
            @SerializedName("nickname")
            private String nickname;
            @SerializedName("signature")
            private String signature;
            @SerializedName("avatar_thumb")
            private AvatarThumbBeanX avatarThumb;
            @SerializedName("status")
            private int status;
            @SerializedName("avatar_larger")
            private AvatarLargerBean avatarLarger;

            public String getSecUid() {
                return secUid;
            }

            public void setSecUid(String secUid) {
                this.secUid = secUid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public AvatarThumbBeanX getAvatarThumb() {
                return avatarThumb;
            }

            public void setAvatarThumb(AvatarThumbBeanX avatarThumb) {
                this.avatarThumb = avatarThumb;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public AvatarLargerBean getAvatarLarger() {
                return avatarLarger;
            }

            public void setAvatarLarger(AvatarLargerBean avatarLarger) {
                this.avatarLarger = avatarLarger;
            }

            public static class AvatarThumbBeanX {

                @SerializedName("uri")
                private String uri;
                @SerializedName("url_list")
                private List<String> urlList;

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
                @SerializedName("url_list")
                private List<String> urlList;

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

        }

    }

    public static class UrgeDetailBean {

        @SerializedName("user_urged")
        private int userUrged;

        public int getUserUrged() {
            return userUrged;
        }

        public void setUserUrged(int userUrged) {
            this.userUrged = userUrged;
        }

    }

    public static class LifeStoryBlockBean {

    }

    public static class VideoCoverBean {

    }

    public static class AvatarLargerBeanX {

        @SerializedName("uri")
        private String uri;
        @SerializedName("url_list")
        private List<String> urlList;

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

    public static class AvatarMediumBean {
    }

    public static class RFansGroupInfoBean {
    }

    public static class CoverUrlBean {

        @SerializedName("uri")
        private String uri;
        @SerializedName("url_list")
        private List<String> urlList;

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

    public static class FollowersDetailBean {

        @SerializedName("name")
        private String name;
        @SerializedName("icon")
        private String icon;
        @SerializedName("fans_count")
        private long fansCount;
        @SerializedName("open_url")
        private String openUrl;
        @SerializedName("apple_id")
        private String appleId;
        @SerializedName("download_url")
        private String downloadUrl;
        @SerializedName("package_name")
        private String packageName;
        @SerializedName("app_name")
        private String appName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public long getFansCount() {
            return fansCount;
        }

        public void setFansCount(long fansCount) {
            this.fansCount = fansCount;
        }

        public String getOpenUrl() {
            return openUrl;
        }

        public void setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
        }

        public String getAppleId() {
            return appleId;
        }

        public void setAppleId(String appleId) {
            this.appleId = appleId;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

    }

    public static class WhiteCoverUrlBean {

        @SerializedName("uri")
        private String uri;
        @SerializedName("url_list")
        private List<String> urlList;

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

}
