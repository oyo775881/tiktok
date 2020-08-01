package top.yokey.douyin.other;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("ALL")
public class JsonUtil {

    public static String toJson(Object bean) {

        Gson gson = new Gson();
        return gson.toJson(bean);

    }

    public static JSONArray toJSONArray(String json) {

        try {
            return new JSONArray(json);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONArray();
        }

    }

    public static JSONObject toJSONObject(String json) {

        try {
            return new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }

    }

    public static <T> T json2Object(String json, Class<T> cls) {

        return new Gson().fromJson(json, cls);

    }

    public static String getArrayString(String json, int position) {

        try {
            JSONArray jsonArray = new JSONArray(json);
            return jsonArray.length() > position ? jsonArray.getString(position) : "";
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static <T> ArrayList<T> json2ArrayList(String json, Class<T> cls) {

        try {
            ArrayList<T> arrayList = new ArrayList<>();
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                arrayList.add(new Gson().fromJson(jsonArray.getString(i), cls));
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    public static <T> ArrayList<T> object2ArrayList(String json, Class<T> cls) {

        try {
            ArrayList<T> arrayList = new ArrayList<>();
            JSONObject jsonObject = new JSONObject(json);
            Iterator iterator = jsonObject.keys();
            while (iterator.hasNext()) {
                String key = iterator.next().toString();
                String value = jsonObject.getString(key);
                arrayList.add(json2Object(value, cls));
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    public static ArrayList<HashMap<String, String>> json2ArrayList(String string) {

        try {
            ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
            JSONObject jsonObject = new JSONObject(string);
            Iterator iterator = jsonObject.keys();
            while (iterator.hasNext()) {
                HashMap<String, String> hashMap = new HashMap<>();
                String key = iterator.next().toString();
                String value = jsonObject.getString(key);
                hashMap.put("key", key);
                hashMap.put("value", value);
                arrayList.add(hashMap);
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    public static int getInt(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getInt(name) : 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static boolean has(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.has(name);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static long getLong(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getLong(name) : 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static String getString(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getString(name) : "";
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static double getDouble(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getDouble(name) : 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static boolean getBoolean(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getBoolean(name) : false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static JSONArray getJSONArray(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getJSONArray(name) : null;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONArray();
        }

    }

    public static JSONObject getJSONObject(String json, String name) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            return has(json, name) ? jsonObject.getJSONObject(name) : null;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }

    }

    public static int getInt(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getInt(name) : 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static boolean has(JSONObject jsonObject, String name) {

        return jsonObject.has(name);

    }

    public static long getLong(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getLong(name) : 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static String getString(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getString(name) : "";
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static double getDouble(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getDouble(name) : 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static boolean getBoolean(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getBoolean(name) : false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static JSONArray getJSONArray(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getJSONArray(name) : null;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONArray();
        }

    }

    public static JSONObject getJSONObject(JSONObject jsonObject, String name) {

        try {
            return has(jsonObject, name) ? jsonObject.getJSONObject(name) : null;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }

    }

    public static int getInt(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getInt(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static long getLong(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getLong(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static String getString(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getString(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static double getDouble(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getDouble(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static boolean getBoolean(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getBoolean(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static JSONArray getJSONArray(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getJSONArray(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONArray();
        }

    }

    public static JSONObject getJSONObject(JSONArray jsonArray, int position) {

        try {
            return jsonArray.getJSONObject(position);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }

    }

}
