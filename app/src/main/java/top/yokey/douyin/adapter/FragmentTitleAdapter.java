package top.yokey.douyin.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

@SuppressWarnings("ALL")
public class FragmentTitleAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = null;
    private List<String> stringList = null;

    public FragmentTitleAdapter(FragmentManager fragmentManager, List<Fragment> fragmentList, List<String> stringList) {

        super(fragmentManager);
        this.fragmentList = fragmentList;
        this.stringList = stringList;

    }

    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);

    }

    @Override
    public int getCount() {

        return fragmentList.size();

    }

    @Override
    public CharSequence getPageTitle(int position) {

        return stringList.get(position % stringList.size());

    }

}
