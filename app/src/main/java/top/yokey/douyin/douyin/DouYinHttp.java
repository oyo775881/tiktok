package top.yokey.douyin.douyin;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import top.yokey.douyin.douyin.bean.AwemeCommentBean;
import top.yokey.douyin.douyin.bean.AwemeMixListBean;
import top.yokey.douyin.douyin.bean.AwemePlayBean;
import top.yokey.douyin.douyin.bean.UserProfileBean;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.JsonUtil;

@SuppressWarnings("ALL")
public class DouYinHttp {

    private static volatile DouYinHttp instance = null;

    private final String API_URL = "https://svapi.yokey.top/douyin/";
    //此APPID APPKEY 一天限制 100 次请求，请合理使用，如需APP接口请联系QQ1002285057
    private final String API_KEY = "?appid=1596126966&appkey=e77102e086f17d6246165fe8df0372a5";

    public static DouYinHttp get() {

        if (instance == null) {
            synchronized (DouYinHttp.class) {
                if (instance == null) {
                    instance = new DouYinHttp();
                }
            }
        }
        return instance;

    }

    public void getAwemeNearby(String cursor, DouYinCall<ArrayList<AwemePlayBean>> douYinCall) {

        String url = API_URL + "aweme/nearby/" + API_KEY + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getAwemeNearby.txt");
                try {
                    JSONObject jsonObject;
                    AwemePlayBean bean;
                    JSONObject temp = new JSONObject(response.body());
                    ArrayList<AwemePlayBean> arrayList = new ArrayList<>();
                    JSONArray jsonArray = new JSONArray(JsonUtil.getString(response.body(), "aweme_list"));
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject = jsonArray.getJSONObject(i);
                        if (jsonObject.has("video")) {
                            bean = new AwemePlayBean();
                            bean.setAwemeId(jsonObject.getString("aweme_id"));
                            bean.setVideoUrl(jsonObject.getJSONObject("video").getJSONObject("play_addr").getJSONArray("url_list").getString(0));
                            bean.setVideoDesc(jsonObject.getString("desc"));
                            bean.setVideoCover(jsonObject.getJSONObject("video").getJSONObject("cover").getJSONArray("url_list").getString(0));
                            bean.setMusicCover(jsonObject.getJSONObject("music").getJSONObject("cover_thumb").getJSONArray("url_list").getString(0));
                            bean.setMusicTitle(jsonObject.getJSONObject("music").getString("title"));
                            bean.setMusicAuthor(jsonObject.getJSONObject("music").getString("author"));
                            bean.setAuthorAvatar(jsonObject.getJSONObject("author").getJSONObject("avatar_thumb").getJSONArray("url_list").getString(0));
                            bean.setAuthorNickname(jsonObject.getJSONObject("author").getString("nickname"));
                            bean.setCommentCount(jsonObject.getJSONObject("statistics").getString("comment_count"));
                            bean.setDiggCount(jsonObject.getJSONObject("statistics").getString("digg_count"));
                            bean.setForwardCount(jsonObject.getJSONObject("statistics").getString("forward_count"));
                            if (jsonObject.has("mix_info")) {
                                bean.setMixName(jsonObject.getJSONObject("mix_info").getString("mix_name"));
                            }
                            if (jsonObject.has("anchor_info")) {
                                if (jsonObject.getJSONObject("anchor_info").getInt("type") == 15) {
                                    bean.setJyName("剪映-视频制作");
                                }
                            }
                            bean.setNearbyCode(temp.getJSONObject("current_city").getString("code"));
                            bean.setNearbyCity(temp.getJSONObject("current_city").getString("name"));
                            bean.setNearbyName(temp.getJSONObject("current_city").getString("nearby_label_name"));
                            arrayList.add(bean);
                        }
                    }
                    douYinCall.onSuccess(jsonArray.toString(), arrayList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void getAwemeRecommend(String cursor, DouYinCall<ArrayList<AwemePlayBean>> douYinCall) {

        String url = API_URL + "aweme/recommend/" + API_KEY + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getHomeRecommend.txt");
                try {
                    JSONObject jsonObject;
                    AwemePlayBean bean;
                    ArrayList<AwemePlayBean> arrayList = new ArrayList<>();
                    JSONArray jsonArray = new JSONArray(JsonUtil.getString(response.body(), "aweme_list"));
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject = jsonArray.getJSONObject(i);
                        bean = new AwemePlayBean();
                        bean.setAwemeId(jsonObject.getString("aweme_id"));
                        bean.setVideoUrl(jsonObject.getJSONObject("video").getJSONObject("play_addr").getJSONArray("url_list").getString(0));
                        bean.setVideoDesc(jsonObject.getString("desc"));
                        bean.setVideoCover(jsonObject.getJSONObject("video").getJSONObject("cover").getJSONArray("url_list").getString(0));
                        bean.setMusicCover(jsonObject.getJSONObject("music").getJSONObject("cover_thumb").getJSONArray("url_list").getString(0));
                        bean.setMusicTitle(jsonObject.getJSONObject("music").getString("title"));
                        bean.setMusicAuthor(jsonObject.getJSONObject("music").getString("author"));
                        bean.setAuthorAvatar(jsonObject.getJSONObject("author").getJSONObject("avatar_thumb").getJSONArray("url_list").getString(0));
                        bean.setAuthorNickname(jsonObject.getJSONObject("author").getString("nickname"));
                        bean.setCommentCount(jsonObject.getJSONObject("statistics").getString("comment_count"));
                        bean.setDiggCount(jsonObject.getJSONObject("statistics").getString("digg_count"));
                        bean.setForwardCount(jsonObject.getJSONObject("statistics").getString("forward_count"));
                        if (jsonObject.has("mix_info")) {
                            bean.setMixName(jsonObject.getJSONObject("mix_info").getString("mix_name"));
                        }
                        if (jsonObject.has("anchor_info")) {
                            if (jsonObject.getJSONObject("anchor_info").getInt("type") == 15) {
                                bean.setJyName("剪映-视频制作");
                            }
                        }
                        arrayList.add(bean);
                    }
                    douYinCall.onSuccess(jsonArray.toString(), arrayList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void getAwemeComment(String awemeId, String cursor, DouYinCall<AwemeCommentBean> douYinCall) {

        String url = API_URL + "aweme/comment/" + API_KEY + "&aweme_id=" + awemeId + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getAwemeComment.txt");
                douYinCall.onSuccess(response.body(), JsonUtil.json2Object(response.body(), AwemeCommentBean.class));
            }
        });

    }

    public void getAwemeMixList(String uid, String suid, String cursor, DouYinCall<AwemeMixListBean> douYinCall) {

        String url = API_URL + "aweme/mix/list/" + API_KEY + "&uid=" + uid + "&suid=" + suid + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getAwemeMixList.txt");
                douYinCall.onSuccess(response.body(), JsonUtil.json2Object(response.body(), AwemeMixListBean.class));
            }
        });

    }

    public void getUserProfile(String suid, DouYinCall<UserProfileBean> douYinCall) {

        String url = API_URL + "user/profile/" + API_KEY + "&suid=" + suid;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getUserProfie.txt");
                String json = JsonUtil.getString(response.body(), "user");
                if (json.equals("{}")) {
                    getUserProfile(suid, douYinCall);
                    return;
                }
                douYinCall.onSuccess(json, JsonUtil.json2Object(json, UserProfileBean.class));
            }
        });

    }

    public void getUserAweme(String suid, String cursor, DouYinCall<ArrayList<AwemePlayBean>> douYinCall) {

        String url = API_URL + "user/aweme/" + API_KEY + "&suid=" + suid + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getUserAweme.txt");
                try {
                    JSONObject jsonObject;
                    AwemePlayBean bean;
                    JSONObject temp = new JSONObject(response.body());
                    ArrayList<AwemePlayBean> arrayList = new ArrayList<>();
                    JSONArray jsonArray = new JSONArray(JsonUtil.getString(response.body(), "aweme_list"));
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject = jsonArray.getJSONObject(i);
                        bean = new AwemePlayBean();
                        bean.setAwemeId(jsonObject.getString("aweme_id"));
                        bean.setVideoUrl(jsonObject.getJSONObject("video").getJSONObject("play_addr").getJSONArray("url_list").getString(0));
                        bean.setVideoDesc(jsonObject.getString("desc"));
                        bean.setVideoCover(jsonObject.getJSONObject("video").getJSONObject("cover").getJSONArray("url_list").getString(0));
                        bean.setMusicCover(jsonObject.getJSONObject("music").getJSONObject("cover_thumb").getJSONArray("url_list").getString(0));
                        bean.setMusicTitle(jsonObject.getJSONObject("music").getString("title"));
                        bean.setMusicAuthor(jsonObject.getJSONObject("music").getString("author"));
                        bean.setAuthorAvatar(jsonObject.getJSONObject("author").getJSONObject("avatar_thumb").getJSONArray("url_list").getString(0));
                        bean.setAuthorNickname(jsonObject.getJSONObject("author").getString("nickname"));
                        bean.setCommentCount(jsonObject.getJSONObject("statistics").getString("comment_count"));
                        bean.setDiggCount(jsonObject.getJSONObject("statistics").getString("digg_count"));
                        bean.setForwardCount(jsonObject.getJSONObject("statistics").getString("forward_count"));
                        bean.setIsTop(jsonObject.getString("is_top"));
                        if (jsonObject.has("mix_info")) {
                            bean.setMixName(jsonObject.getJSONObject("mix_info").getString("mix_name"));
                        }
                        if (jsonObject.has("anchor_info")) {
                            if (jsonObject.getJSONObject("anchor_info").getInt("type") == 15) {
                                bean.setJyName("剪映-视频制作");
                            }
                        }
                        bean.setCreateTime(jsonObject.getString("create_time"));
                        bean.setMaxCursor(temp.getString("max_cursor"));
                        bean.setHasMore(temp.getString("has_more"));
                        arrayList.add(bean);
                    }
                    douYinCall.onSuccess(jsonArray.toString(), arrayList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void getUserFavorite(String suid, String cursor, DouYinCall<ArrayList<AwemePlayBean>> douYinCall) {

        String url = API_URL + "user/favorite/" + API_KEY + "&suid=" + suid + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getUserFavorite.txt");
                try {
                    JSONObject jsonObject;
                    AwemePlayBean bean;
                    JSONObject temp = new JSONObject(response.body());
                    ArrayList<AwemePlayBean> arrayList = new ArrayList<>();
                    JSONArray jsonArray = new JSONArray(JsonUtil.getString(response.body(), "aweme_list"));
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject = jsonArray.getJSONObject(i);
                        bean = new AwemePlayBean();
                        bean.setAwemeId(jsonObject.getString("aweme_id"));
                        bean.setVideoUrl(jsonObject.getJSONObject("video").getJSONObject("play_addr").getJSONArray("url_list").getString(0));
                        bean.setVideoDesc(jsonObject.getString("desc"));
                        bean.setVideoCover(jsonObject.getJSONObject("video").getJSONObject("cover").getJSONArray("url_list").getString(0));
                        bean.setMusicCover(jsonObject.getJSONObject("music").getJSONObject("cover_thumb").getJSONArray("url_list").getString(0));
                        bean.setMusicTitle(jsonObject.getJSONObject("music").getString("title"));
                        bean.setMusicAuthor(jsonObject.getJSONObject("music").getString("author"));
                        bean.setAuthorAvatar(jsonObject.getJSONObject("author").getJSONObject("avatar_thumb").getJSONArray("url_list").getString(0));
                        bean.setAuthorNickname(jsonObject.getJSONObject("author").getString("nickname"));
                        bean.setCommentCount(jsonObject.getJSONObject("statistics").getString("comment_count"));
                        bean.setDiggCount(jsonObject.getJSONObject("statistics").getString("digg_count"));
                        bean.setForwardCount(jsonObject.getJSONObject("statistics").getString("forward_count"));
                        bean.setIsTop(jsonObject.getString("is_top"));
                        if (jsonObject.has("mix_info")) {
                            bean.setMixName(jsonObject.getJSONObject("mix_info").getString("mix_name"));
                        }
                        if (jsonObject.has("anchor_info")) {
                            if (jsonObject.getJSONObject("anchor_info").getInt("type") == 15) {
                                bean.setJyName("剪映-视频制作");
                            }
                        }
                        bean.setCreateTime(jsonObject.getString("create_time"));
                        bean.setMaxCursor(temp.getString("max_cursor"));
                        bean.setHasMore(temp.getString("has_more"));
                        arrayList.add(bean);
                    }
                    douYinCall.onSuccess(jsonArray.toString(), arrayList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void getUserForward(String uid, String suid, String cursor, DouYinCall<ArrayList<AwemePlayBean>> douYinCall) {

        String url = API_URL + "user/forward/" + API_KEY + "&uid=" + uid + "&suid=" + suid + "&cursor=" + cursor;
        OkGo.<String>get(url).headers(BaseApplication.get().getHttpHeaders()).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                BaseApplication.get().text2File(response.body(), "/storage/emulated/0/logger/getUserForward.txt");
                try {
                    JSONObject jsonObject;
                    AwemePlayBean bean;
                    JSONObject temp = new JSONObject(response.body());
                    ArrayList<AwemePlayBean> arrayList = new ArrayList<>();
                    JSONArray jsonArray = new JSONArray(JsonUtil.getString(response.body(), "forward_list"));
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject = jsonArray.getJSONObject(i);
                        bean = new AwemePlayBean();
                        if (jsonObject.getJSONObject("forward_item").has("aweme_id")) {
                            bean.setAwemeId(jsonObject.getJSONObject("forward_item").getString("aweme_id"));
                            bean.setVideoUrl(jsonObject.getJSONObject("forward_item").getJSONObject("video").getJSONObject("play_addr").getJSONArray("url_list").getString(0));
                            bean.setVideoDesc(jsonObject.getJSONObject("forward_item").getString("desc"));
                            bean.setVideoCover(jsonObject.getJSONObject("forward_item").getJSONObject("video").getJSONObject("cover").getJSONArray("url_list").getString(0));
                            bean.setMusicCover(jsonObject.getJSONObject("forward_item").getJSONObject("music").getJSONObject("cover_thumb").getJSONArray("url_list").getString(0));
                            bean.setMusicTitle(jsonObject.getJSONObject("forward_item").getJSONObject("music").getString("title"));
                            bean.setMusicAuthor(jsonObject.getJSONObject("forward_item").getJSONObject("music").getString("author"));
                            bean.setAuthorAvatar(jsonObject.getJSONObject("forward_item").getJSONObject("author").getJSONObject("avatar_thumb").getJSONArray("url_list").getString(0));
                            bean.setAuthorNickname(jsonObject.getJSONObject("forward_item").getJSONObject("author").getString("nickname"));
                            bean.setCommentCount(jsonObject.getJSONObject("forward_item").getJSONObject("statistics").getString("comment_count"));
                            bean.setDiggCount(jsonObject.getJSONObject("forward_item").getJSONObject("statistics").getString("digg_count"));
                            bean.setForwardCount(jsonObject.getJSONObject("forward_item").getJSONObject("statistics").getString("forward_count"));
                            bean.setIsTop(jsonObject.getString("is_top"));
                            if (jsonObject.getJSONObject("forward_item").has("mix_info")) {
                                bean.setMixName(jsonObject.getJSONObject("forward_item").getJSONObject("mix_info").getString("mix_name"));
                            }
                            if (jsonObject.getJSONObject("forward_item").has("anchor_info")) {
                                if (jsonObject.getJSONObject("forward_item").getJSONObject("anchor_info").getInt("type") == 15) {
                                    bean.setJyName("剪映-视频制作");
                                }
                            }
                            bean.setCreateTime(jsonObject.getString("create_time"));
                            bean.setMaxCursor(temp.getString("max_cursor"));
                            bean.setHasMore(temp.getString("has_more"));
                            arrayList.add(bean);
                        }
                    }
                    douYinCall.onSuccess(jsonArray.toString(), arrayList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
