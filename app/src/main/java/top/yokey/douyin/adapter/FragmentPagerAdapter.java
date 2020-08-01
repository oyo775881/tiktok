package top.yokey.douyin.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

@SuppressWarnings("ALL")
public class FragmentPagerAdapter extends FragmentStateAdapter {

    private List<Fragment> mFragments;

    public FragmentPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<Fragment> fragments) {

        super(fragmentActivity);
        this.mFragments = fragments;

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return mFragments.get(position);

    }

    @Override
    public int getItemCount() {

        return mFragments.size();

    }

}
