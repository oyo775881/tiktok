package top.yokey.douyin.other;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.LinearInterpolator;

@SuppressWarnings("ALL")
public class AnimUtil {

    public static final int TIME = 200;
    public static final String ALPHA = "alpha";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRABSLATION_X = "translationX";
    public static final String TRABSLATION_Y = "translationY";

    public static void objectAnimator(View view, String name, float... values) {

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, name, values);
        objectAnimator.setDuration(TIME).start();

    }

    public static void objectAnimator(View view, String name, AnimatorCallBack callBack, float... values) {

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, name, values);
        objectAnimator.setDuration(TIME).start();
        objectAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (callBack != null) {
                    callBack.onEnd();
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    public static ObjectAnimator scale(View view, String propertyName, float from, float to, long time, long delayTime) {

        ObjectAnimator translation = ObjectAnimator.ofFloat(view, propertyName, from, to);
        translation.setInterpolator(new LinearInterpolator());
        translation.setStartDelay(delayTime);
        translation.setDuration(time);
        return translation;

    }

    public static ObjectAnimator translationX(View view, float from, float to, long time, long delayTime) {

        ObjectAnimator translation = ObjectAnimator.ofFloat(view, "translationX", from, to);
        translation.setInterpolator(new LinearInterpolator());
        translation.setStartDelay(delayTime);
        translation.setDuration(time);
        return translation;

    }

    public static ObjectAnimator translationY(View view, float from, float to, long time, long delayTime) {

        ObjectAnimator translation = ObjectAnimator.ofFloat(view, "translationY", from, to);
        translation.setInterpolator(new LinearInterpolator());
        translation.setStartDelay(delayTime);
        translation.setDuration(time);
        return translation;

    }

    public static ObjectAnimator alpha(View view, float from, float to, long time, long delayTime) {

        ObjectAnimator translation = ObjectAnimator.ofFloat(view, "alpha", from, to);
        translation.setInterpolator(new LinearInterpolator());
        translation.setStartDelay(delayTime);
        translation.setDuration(time);
        return translation;

    }

    public static ObjectAnimator rotation(View view, long time, long delayTime, float... values) {

        ObjectAnimator rotation = ObjectAnimator.ofFloat(view, "rotation", values);
        rotation.setDuration(time);
        rotation.setStartDelay(delayTime);
        rotation.setInterpolator(new TimeInterpolator() {
            @Override
            public float getInterpolation(float input) {
                return input;
            }
        });
        return rotation;

    }

    public interface AnimatorCallBack {

        void onEnd();

    }

}
