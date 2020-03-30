package com.example.mylistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
For listView
 ***** for single source(like string list) we wil use ArrayAdapter, for multiple
 * (multiple textView with image or audio etc)will use BaseAdapter
 1. need a listView xml
 2. Data source (array, Array list, database
 3. a view (adapter collect data from data source and paste it on that view than set it
    on list view.
 4. adapter
 */
public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.list_view);
        String[] countryName = getResources().getStringArray(R.array.country_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.text_view,countryName);
        mListView.setAdapter(adapter);
    }
}
