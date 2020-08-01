package top.yokey.douyin.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

import top.yokey.douyin.R;
import top.yokey.douyin.other.BaseActivity;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.CountDown;
import top.yokey.douyin.other.SharedHelp;

@SuppressWarnings("ALL")
public class LoadActivity extends BaseActivity {

    @Override
    public void initView() {

        setContentView(R.layout.activity_load);

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void onResume() {

        super.onResume();
        List<String> list = new ArrayList<>();
        for (String permissions : getPermissions()) {
            if (ContextCompat.checkSelfPermission(get(), permissions) != PackageManager.PERMISSION_GRANTED) {
                list.add(permissions);
            } else {
                if (ActivityCompat.shouldShowRequestPermissionRationale(get(), permissions)) {
                    list.add(permissions);
                }
            }
        }
        if (list.size() > 0) {
            ActivityCompat.requestPermissions(get(), list.toArray(new String[0]), 0);
            return;
        }
        new CountDown(1000, 1000) {
            @Override
            public void onFinish() {
                super.onFinish();
                String first = SharedHelp.get().getString(Constant.SHARED_APP_FIRST);
                if (first.isEmpty()) {
                    SharedHelp.get().putString(Constant.SHARED_APP_FIRST, "1");
                    startActivity(new Intent(get(), SettingActivity.class));
                    onReturn();
                    return;
                }
                startActivity(new Intent(get(), MainActivity.class));
                onReturn();
            }
        }.start();

    }

    private String[] getPermissions() {

        return new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
        };

    }

}
