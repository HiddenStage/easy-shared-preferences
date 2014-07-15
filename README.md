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
compile 'com.hiddenstage.easysharedpreferences:library:0.1.1'
```
#License
```
Copyright 2014 HiddenStage

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
