package top.yokey.douyin.fragment;

import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import top.yokey.douyin.R;
import top.yokey.douyin.adapter.MineFavoriteAdapter;
import top.yokey.douyin.douyin.DouYinHttp;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.BaseFragment;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.CountDown;
import top.yokey.douyin.other.GridDecoration;

@SuppressWarnings("unused")
public class MineFavoriteFragment extends BaseFragment {

    private final MineFavoriteAdapter adapter = new MineFavoriteAdapter(BaseApplication.get().getMineFavoriteArrayList());
    private RecyclerView mainRecyclerView = null;
    private String cursor = "0";

    @Override
    public View initView() {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.include_recycler, null);
        mainRecyclerView = view.findViewById(R.id.mainRecyclerView);
        return view;

    }

    @Override
    public void initData() {

        BaseApplication.get().setRecyclerView(mainRecyclerView, new GridLayoutManager(getActivity(), 3), adapter);
        mainRecyclerView.addItemDecoration(new GridDecoration(3, BaseApplication.get().dp2Px(2), false));
        getData();

    }

    @Override
    public void initEvent() {

        adapter.setOnItemClickListener((position, bean) -> BaseApplication.get().startPlay(getActivity(), position, "favorite"));

    }

    //自定义方法

    private void getData() {

        if (BaseApplication.get().getMineFavoriteArrayList().size() >= 100) return;
        if (cursor.equals("0")) BaseApplication.get().getMineFavoriteArrayList().clear();
        DouYinHttp.get().getUserFavorite(BaseApplication.get().getSuid(), cursor, (result, arrayList) -> {
            BaseApplication.get().getMineFavoriteArrayList().addAll(arrayList);
            adapter.notifyDataSetChanged();
            if (arrayList.size() != 0 && arrayList.get(0).getHasMore().equals("1")) {
                cursor = arrayList.get(0).getMaxCursor();
                new CountDown(Constant.TIME_COUNT, Constant.TIME_TICK) {
                    @Override
                    public void onFinish() {
                        super.onFinish();
                        getData();
                    }
                }.start();
            }
        });

    }

}
