package com.springdb.springdatabase.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class JsonHelper {
    private static Gson gson;
    private static final String TAG = "JsonHelper";

    static {
        if (gson == null)
            gson = new GsonBuilder().serializeNulls().excludeFieldsWithoutExposeAnnotation().create();
    }

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static <T> T getObject(String json, Class<T> clazz) throws NullPointerException {
        if (json == null || json.isEmpty())
            throw new NullPointerException("INPUT IS NULL OR EMPTY");
        else
            return gson.fromJson(json, clazz);
    }

    public static <T> T getObjectNoException(String json, Class<T> clazz) {
        if (json == null || json.isEmpty()) {
            System.out.println(TAG + "------ getObjectNoException: " + json);
            return null;
        }

        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T getArrayObject(String json, List<T> list) {
        if (json == null || json.isEmpty()) {
            return null;
        }
        try {
            return (T) gson.toJson(json, new TypeToken<List<T>>() {
            }.getType());
        } catch (Exception e) {
            System.out.println(TAG + "-----------------getArrayObject Exception: " + e.toString());
            return null;
        }
    }


}