package com.hiddenstage.easysharedpreferencessample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Set;
import java.util.TreeSet;

import com.hiddenstage.easysharedpreferences.library.EasySharedPreferences;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView integerValue = (TextView) findViewById(R.id.integer_value);
        TextView booleanValue = (TextView) findViewById(R.id.boolean_value);
        TextView stringValue = (TextView) findViewById(R.id.string_value);
        TextView floatValue = (TextView) findViewById(R.id.float_value);
        TextView longValue = (TextView) findViewById(R.id.long_value);

        // Initialize EasySharedPreferences
        EasySharedPreferences prefs = new EasySharedPreferences(this);

        /* Put values into EasySharedPreferences */

        // Put integer
        prefs.putInt("sp_integer", 123);

        // Put boolean
        prefs.putBoolean("sp_boolean", true);

        // Put String
        prefs.putString("sp_string", "This is a string.");

        // Put float
        prefs.putFloat("sp_float", 1.23f);

        // Put long
        prefs.putLong("sp_long", 123456L);

        /* Get values from EasySharedPreferences */

        // Get integer
        int integer_variable = prefs.getInt("sp_integer");

        // Get boolean
        boolean boolean_variable = prefs.getBoolean("sp_boolean");

        // Get String
        String string_variable = prefs.getString("sp_string");

        // Get float
        float float_variable = prefs.getFloat("sp_float");

        // Get long
        long long_variable = prefs.getLong("sp_long");

        /* String Set example */

        Set<String> s = new TreeSet<String>();

        s.add("a");
        s.add("b");
        s.add("c");

        // Put StringSet
        prefs.putStringSet("sp_string_set", s);

        // Get String Set
        // Note: We require you must use a default value when getting String Sets
        prefs.getStringSet("sp_string_set", s);

        /* Set views with variables we retrieve from the shared preferences */

        integerValue.setText(Integer.toString(integer_variable));
        booleanValue.setText(Boolean.toString(boolean_variable));
        stringValue.setText(string_variable);
        floatValue.setText(Float.toString(float_variable));
        longValue.setText(Long.toString(long_variable));
    }
}
