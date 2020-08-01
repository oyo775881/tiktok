package top.yokey.douyin.other;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.signature.ObjectKey;

import java.io.ByteArrayOutputStream;

@SuppressWarnings("ALL")
public class ImageHelp {

    private static volatile ImageHelp instance = null;
    private Context context = null;
    private int main = 8;

    public static ImageHelp get() {

        if (instance == null) {
            synchronized (ImageHelp.class) {
                if (instance == null) {
                    instance = new ImageHelp();
                }
            }
        }
        return instance;

    }

    public void init(Context context) {

        this.context = context;

    }

    //正常加载

    public void display(Uri uri, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation();
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void display(int resId, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation();
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void display(String url, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation();
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void display(Bitmap bitmap, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void display(int resId, int width, int height, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .override(width, height);
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void display(String url, int width, int height, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .override(width, height);
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void display(Bitmap bitmap, int width, int height, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .override(width, height);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    //圆形图片

    public void displayCircle(Uri uri, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop())
                .circleCropTransform();
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayCircle(int resId, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop())
                .circleCropTransform();
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayCircle(String url, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop())
                .circleCropTransform();
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayCircle(Bitmap bitmap, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop())
                .circleCropTransform();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    //圆角图片

    public void displayRadius(Uri uri, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(main));
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadius(int resId, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(main));
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadius(String url, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(main));
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadius(Bitmap bitmap, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(main));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadius(int resId, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(radius));
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadius(String url, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(radius));
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadius(Bitmap bitmap, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterCrop(), new RoundedCorners(radius));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displayRadiusCenter(String url, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .transform(new CenterInside(), new RoundedCorners(radius));
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    //不重复的

    public void displaySign(Uri uri, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())));
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySign(int resId, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())));
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySign(String url, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())));
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySign(Bitmap bitmap, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignCircle(Uri uri, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop())
                .circleCropTransform();
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignCircle(int resId, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop())
                .circleCropTransform();
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignCircle(String url, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop())
                .circleCropTransform();
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignCircle(Bitmap bitmap, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop())
                .circleCropTransform();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(Uri uri, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(main));
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(int resId, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(main));
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(String url, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(main));
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(Bitmap bitmap, ImageView imageView) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(main));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(Uri uri, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(radius));
        Glide.with(context)
                .load(uri)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(int resId, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(radius));
        Glide.with(context)
                .load(resId)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(String url, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(radius));
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

    public void displaySignRadius(Bitmap bitmap, ImageView imageView, int radius) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(imageView.getDrawable())
                .noAnimation()
                .signature(new ObjectKey(String.valueOf(System.currentTimeMillis())))
                .transform(new CenterCrop(), new RoundedCorners(radius));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        Glide.with(context)
                .load(bytes)
                .apply(requestOptions)
                .dontAnimate()
                .placeholder(imageView.getDrawable())
                .into(imageView);

    }

}
