package com.hiddenstage.easysharedpreferences.library;

// Copyright 2014 HiddenStage

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;

import java.util.Map;
import java.util.Set;

public class EasySharedPreferences {

    private SharedPreferences mSharedPreferences;

    public EasySharedPreferences(Context context) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public EasySharedPreferences(Context context, String key) {
        mSharedPreferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
    }

    public int getInt(String key, int defaultValue) {
        return mSharedPreferences.getInt(key, defaultValue);
    }

    public int getInt(String key) {
        return mSharedPreferences.getInt(key, DefaultValues.INT);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return mSharedPreferences.getBoolean(key, defaultValue);
    }

    public boolean getBoolean(String key) {
        return mSharedPreferences.getBoolean(key, DefaultValues.BOOL);
    }

    public String getString(String key, String defaultValue) {
        return mSharedPreferences.getString(key, defaultValue);
    }

    public String getString(String key) {
        return mSharedPreferences.getString(key, DefaultValues.STRING);
    }

    public float getFloat(String key, float defaultValue) {
        return mSharedPreferences.getFloat(key, defaultValue);
    }

    public float getFloat(String key) {
        return mSharedPreferences.getFloat(key, DefaultValues.FLOAT);
    }

    public long getLong(String key, long defaultValue) {
        return mSharedPreferences.getLong(key, defaultValue);
    }

    public long getLong(String key) {
        return mSharedPreferences.getLong(key, DefaultValues.LONG);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public Set<String> getStringSet(String key, Set<String> defaultValue) {
        return mSharedPreferences.getStringSet(key, defaultValue);
    }

    public Map<String, ?> getAll() {
        return mSharedPreferences.getAll();
    }

    public void putInt(String key, int value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putInt(key, value);
        // save changes
        save(editor);
    }

    public void putBoolean(String key, boolean value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(key, value);
        // save changes
        save(editor);
    }

    public void putString(String key, String value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(key, value);
        // save changes
        save(editor);
    }

    public void putFloat(String key, float value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putFloat(key, value);
        // save changes
        save(editor);
    }

    public void putLong(String key, long value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putLong(key, value);
        // save changes
        save(editor);
    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void putStringSet(String key, Set<String> value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putStringSet(key, value);
        // save changes
        save(editor);
    }

    public void remove(String key) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.remove(key);
        // save changes
        save(editor);
    }

    public void clear() {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.clear();
    }

    public boolean contains(String key) {
        return mSharedPreferences.contains(key);
    }

    private void save(SharedPreferences.Editor editor){
        // use async method for SDK 9 and up
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            editor.apply();
        } else {
        // use regular commit for older SDK version
            editor.commit();
        }
    }
}
