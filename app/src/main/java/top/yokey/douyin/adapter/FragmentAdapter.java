package top.yokey.douyin.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

@SuppressWarnings("ALL")
public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = null;

    public FragmentAdapter(FragmentManager fragmentManager, List<Fragment> fragmentList) {

        super(fragmentManager);
        this.fragmentList = fragmentList;

    }

    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);

    }

    @Override
    public int getCount() {

        return fragmentList.size();

    }

}
