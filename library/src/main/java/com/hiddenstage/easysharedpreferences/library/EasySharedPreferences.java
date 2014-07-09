package com.hiddenstage.easysharedpreferences.library;

// Copyright 2014 HiddenStage

import android.content.Context;
import android.content.SharedPreferences;
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

    public Set<String> getStringSet(String key, Set<String> defaultValue) {
        return mSharedPreferences.getStringSet(key, defaultValue);
    }

    public Map<String, ?> getAll() {
        return mSharedPreferences.getAll();
    }

    public void putInt(String key, int value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public void putBoolean(String key, boolean value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public void putString(String key, String value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public void putFloat(String key, float value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    public void putLong(String key, long value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public void putStringSet(String key, Set<String> value) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putStringSet(key, value);
        editor.apply();
    }

    public void remove(String key) {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.remove(key);
        editor.apply();
    }

    public void clear() {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    public boolean contains(String key) {
        return mSharedPreferences.contains(key);
    }
}
