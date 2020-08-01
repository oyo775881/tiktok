package top.yokey.douyin.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.Objects;

import top.yokey.douyin.R;
import top.yokey.douyin.other.BaseActivity;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.SharedHelp;

public class SettingActivity extends BaseActivity {

    private AppCompatEditText navNearbyEditText = null;
    private AppCompatEditText navMsgEditText = null;
    private AppCompatEditText homeFollowEditText = null;
    private AppCompatEditText userLinkEditText = null;
    private AppCompatEditText userRateEditText = null;
    private AppCompatEditText userFriendEditText = null;
    private AppCompatEditText userBaseEditText = null;
    private AppCompatTextView confirmTextView = null;
    private WebView mainWebView = null;

    @Override
    public void initView() {

        setContentView(R.layout.activity_setting);
        navNearbyEditText = findViewById(R.id.navNearbyEditText);
        navMsgEditText = findViewById(R.id.navMsgEditText);
        homeFollowEditText = findViewById(R.id.homeFollowEditText);
        userLinkEditText = findViewById(R.id.userLinkEditText);
        userRateEditText = findViewById(R.id.userRateEditText);
        userFriendEditText = findViewById(R.id.userFriendEditText);
        userBaseEditText = findViewById(R.id.userBaseEditText);
        confirmTextView = findViewById(R.id.confirmTextView);
        mainWebView = findViewById(R.id.mainWebView);

    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void initData() {

        String temp = SharedHelp.get().getString(Constant.SHARED_NAV_NEARBY);
        navNearbyEditText.setText(temp.isEmpty() ? navNearbyEditText.getText() : temp);
        temp = SharedHelp.get().getString(Constant.SHARED_NAV_MSG);
        navMsgEditText.setText(temp.isEmpty() ? navMsgEditText.getText() : temp);
        temp = SharedHelp.get().getString(Constant.SHARED_HOME_FOLLOW);
        homeFollowEditText.setText(temp.isEmpty() ? homeFollowEditText.getText() : temp);
        temp = SharedHelp.get().getString(Constant.SHARED_USER_LINK);
        userLinkEditText.setText(temp.isEmpty() ? userLinkEditText.getText() : temp);
        temp = SharedHelp.get().getString(Constant.SHARED_USER_RATE);
        userRateEditText.setText(temp.isEmpty() ? userRateEditText.getText() : temp);
        temp = SharedHelp.get().getString(Constant.SHARED_USER_FRIEND);
        userFriendEditText.setText(temp.isEmpty() ? userFriendEditText.getText() : temp);
        temp = SharedHelp.get().getString(Constant.SHARED_USER_BASE);
        userBaseEditText.setText(temp.isEmpty() ? userBaseEditText.getText() : temp);
        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setSupportZoom(false);

    }

    @Override
    public void initEvent() {

        confirmTextView.setOnClickListener(view -> {
            SharedHelp.get().putString(Constant.SHARED_NAV_NEARBY, Objects.requireNonNull(navNearbyEditText.getText()).toString());
            SharedHelp.get().putString(Constant.SHARED_NAV_MSG, Objects.requireNonNull(navMsgEditText.getText()).toString());
            SharedHelp.get().putString(Constant.SHARED_HOME_FOLLOW, Objects.requireNonNull(homeFollowEditText.getText()).toString());
            SharedHelp.get().putString(Constant.SHARED_USER_LINK, Objects.requireNonNull(userLinkEditText.getText()).toString());
            SharedHelp.get().putString(Constant.SHARED_USER_RATE, Objects.requireNonNull(userRateEditText.getText()).toString());
            SharedHelp.get().putString(Constant.SHARED_USER_FRIEND, Objects.requireNonNull(userFriendEditText.getText()).toString());
            SharedHelp.get().putString(Constant.SHARED_USER_BASE, Objects.requireNonNull(userBaseEditText.getText()).toString());
            Toast.makeText(get(), "正在处理，处理成功后会重启APP~", Toast.LENGTH_LONG).show();
            mainWebView.loadUrl(userLinkEditText.getText().toString());
        });

        mainWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                mainWebView.loadUrl(url);
                return true;
            }

            @Nullable
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                if (url.contains("https://www.iesdouyin.com/web/api/v2/user/info/")) {
                    url = url.substring(url.lastIndexOf("=") + 1);
                    SharedHelp.get().putString(Constant.SHARED_USER_SUID, url);
                    BaseApplication.get().setSuid(url);
                    BaseApplication.get().setUid("");
                    startActivity(new Intent(get(), LoadActivity.class));
                    onReturn();
                    return super.shouldInterceptRequest(view, request);
                }
                return super.shouldInterceptRequest(view, request);
            }
        });

    }

}
