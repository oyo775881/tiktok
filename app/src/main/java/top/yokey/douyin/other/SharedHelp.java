package top.yokey.douyin.other;

import android.content.SharedPreferences;

@SuppressWarnings("ALL")
public class SharedHelp {

    private static volatile SharedHelp instance = null;
    private SharedPreferences sharedPreferences = null;
    private SharedPreferences.Editor sharedPreferencesEditor = null;

    public static SharedHelp get() {

        if (instance == null) {
            synchronized (SharedHelp.class) {
                if (instance == null) {
                    instance = new SharedHelp();
                }
            }
        }
        return instance;

    }

    public void init(SharedPreferences sharedPreferences) {

        this.sharedPreferences = sharedPreferences;
        this.sharedPreferencesEditor = sharedPreferences.edit();

    }

    public void putString(String name, String value) {

        sharedPreferencesEditor.putString(name, value).apply();

    }

    public String getString(String name) {

        return sharedPreferences.getString(name, "");

    }

}
