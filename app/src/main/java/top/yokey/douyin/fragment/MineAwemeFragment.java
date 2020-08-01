package top.yokey.douyin.fragment;

import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import top.yokey.douyin.R;
import top.yokey.douyin.adapter.MineAwemeAdapter;
import top.yokey.douyin.adapter.MineAwemeMixAdapter;
import top.yokey.douyin.douyin.DouYinHttp;
import top.yokey.douyin.douyin.bean.AwemeMixListBean;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.BaseFragment;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.CountDown;
import top.yokey.douyin.other.GridDecoration;

@SuppressWarnings("unused")
public class MineAwemeFragment extends BaseFragment {

    private final ArrayList<AwemeMixListBean.MixInfosBean> awemeMixArrayList = new ArrayList<>();
    private final MineAwemeMixAdapter awemeMixAdapter = new MineAwemeMixAdapter(awemeMixArrayList);
    private final MineAwemeAdapter awemeAdapter = new MineAwemeAdapter(BaseApplication.get().getMineAwemeArrayList());
    private RecyclerView awemeMixRecyclerView = null;
    private RecyclerView awemeRecyclerView = null;
    private String awemeCursor = "0";

    @Override
    public View initView() {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_mine_aweme, null);
        awemeMixRecyclerView = view.findViewById(R.id.awemeMixRecyclerView);
        awemeRecyclerView = view.findViewById(R.id.awemeRecyclerView);
        return view;

    }

    @Override
    public void initData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        BaseApplication.get().setRecyclerView(awemeMixRecyclerView, linearLayoutManager, awemeMixAdapter);
        BaseApplication.get().setRecyclerView(awemeRecyclerView, new GridLayoutManager(getActivity(), 3), awemeAdapter);
        awemeRecyclerView.addItemDecoration(new GridDecoration(3, BaseApplication.get().dp2Px(2), false));
        getAwemeMix();
        getAweme();

    }

    @Override
    public void initEvent() {

        awemeAdapter.setOnItemClickListener((position, bean) -> BaseApplication.get().startPlay(getActivity(), position, "mine"));

    }

    //自定义方法

    private void getAwemeMix() {

        awemeMixArrayList.clear();
        DouYinHttp.get().getAwemeMixList(BaseApplication.get().getUid(), BaseApplication.get().getSuid(), "0", (result, bean) -> {
            if (bean.getMixInfos() == null) {
                awemeMixRecyclerView.setVisibility(View.GONE);
                return;
            }
            awemeMixArrayList.addAll(bean.getMixInfos());
            awemeMixAdapter.notifyDataSetChanged();
        });

    }

    private void getAweme() {

        if (BaseApplication.get().getMineAwemeArrayList().size() >= 100) return;
        if (awemeCursor.equals("0")) BaseApplication.get().getMineAwemeArrayList().clear();
        DouYinHttp.get().getUserAweme(BaseApplication.get().getSuid(), awemeCursor, (result, arrayList) -> {
            BaseApplication.get().getMineAwemeArrayList().addAll(arrayList);
            awemeAdapter.notifyDataSetChanged();
            if (arrayList.size() != 0 && arrayList.get(0).getHasMore().equals("1")) {
                awemeCursor = arrayList.get(0).getMaxCursor();
                new CountDown(Constant.TIME_COUNT, Constant.TIME_TICK) {
                    @Override
                    public void onFinish() {
                        super.onFinish();
                        getAweme();
                    }
                }.start();
            }
        });

    }

}
