package top.yokey.douyin.view;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

@SuppressWarnings("ALL")
public class WeakWrapperHandler extends Handler {

    private WeakReference<MessageHandler> mMessageHandler;

    public WeakWrapperHandler(MessageHandler msgHandler) {

        mMessageHandler = new WeakReference<>(msgHandler);

    }

    @Override
    public void handleMessage(Message msg) {

        MessageHandler realHandler = mMessageHandler.get();
        if (realHandler != null) {
            realHandler.handleMessage(msg);
        }

    }

    public interface MessageHandler {

        void handleMessage(Message msg);

    }

}
