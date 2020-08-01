package top.yokey.douyin.douyin;

@SuppressWarnings("ALL")
public interface DouYinCall<ResultType> {

    void onSuccess(String result, ResultType resultType);

}
