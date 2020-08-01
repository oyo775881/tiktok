package top.yokey.douyin.other;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

@SuppressWarnings("ALL")
public abstract class BaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {

        View view = initView();
        initData();
        initEvent();
        return view;

    }

    //必须重载

    public abstract View initView();

    public abstract void initData();

    public abstract void initEvent();

}
