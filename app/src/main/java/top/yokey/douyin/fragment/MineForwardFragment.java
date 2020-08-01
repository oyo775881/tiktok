package top.yokey.douyin.fragment;

import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import top.yokey.douyin.R;
import top.yokey.douyin.adapter.MineForwardAdapter;
import top.yokey.douyin.douyin.DouYinHttp;
import top.yokey.douyin.other.BaseApplication;
import top.yokey.douyin.other.BaseFragment;
import top.yokey.douyin.other.Constant;
import top.yokey.douyin.other.CountDown;
import top.yokey.douyin.other.GridDecoration;

@SuppressWarnings("unused")
public class MineForwardFragment extends BaseFragment {

    private final MineForwardAdapter adapter = new MineForwardAdapter(BaseApplication.get().getMineForwardArrayList());
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

        adapter.setOnItemClickListener((position, bean) -> BaseApplication.get().startPlay(getActivity(), position, "forward"));

    }

    //自定义方法

    private void getData() {

        if (BaseApplication.get().getMineForwardArrayList().size() >= 100) return;
        if (cursor.equals("0")) BaseApplication.get().getMineForwardArrayList().clear();
        DouYinHttp.get().getUserForward(BaseApplication.get().getUid(), BaseApplication.get().getSuid(), cursor, (result, arrayList) -> {
            BaseApplication.get().getMineForwardArrayList().addAll(arrayList);
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
