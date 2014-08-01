easy-shared-preferences
===========

easy-shared-preferences is an Android library that makes using SharedPreferences as easy as standard getters and setters. No need to mess with .edit(), .commit(), or .apply() anymore.

```java
public class YourActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize EasySharedPreferences
        EasySharedPreferences prefs = new EasySharedPreferences(this);

        // Put integer
        prefs.putInt("sp_integer", 123);

        // Get integer
        int integer_variable = prefs.getInt("sp_integer");
    }
}
```
We use the default SharedPreferences unless otherwise noted in the initialization
```java
EasySharedPreferences(this, "anotherSharedPreferences");
```
When retreiving a value from your SharedPreference, you can specify a default value if needed. Otherwise it will return a default value set by the library.
```java
// If sp_string_a doesn't exist, it returns 
// the default value given by the library ("default")
String string_variable = prefs.getString("sp_string_a");
        
// If sp_string_b doesn't exist, it returns 
// the default value given by the user ("string!")
String string_variable = prefs.getString("sp_string_b", "string!");
```
See examples for all data types in the sample application.
#Download
Gradle:
```java
compile 'com.hiddenstage.easysharedpreferences:library:0.1.2'
```
Maven:
```java
<dependency>
    <groupId>com.hiddenstage.easysharedpreferences</groupId>
    <artifactId>library</artifactId>
    <version>0.1.1</version>
    <type>aar</type>
</dependency>
```
#License
```
The MIT License (MIT)

Copyright (c) 2014 HiddenStage
```
