package com.example.mylistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
For listView
 ***** for single source(like string list) we wil use ArrayAdapter, for multiple
 * (multiple textView with image or audio etc)will use BaseAdapter
 1. need a listView xml
 2. Data source (array, Array list, database
 3. a view where adapter initially put data from data source than set it on listView
 4. adapter (adapter collect data from data source and paste it on that view than set it
    on list view.
 */
public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find the view
        mListView = findViewById(R.id.list_view);
        // pull data from string to mainActivity
        final String[] countryName = getResources().getStringArray(R.array.country_names);
        // Create a ArrayAdapter to pull and set data from datasource to listView via a view
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.text_view,countryName);
        // set adapter in listView
        mListView.setAdapter(adapter);
           // set a click listener on the listView
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryName[i];
                Toast.makeText(getApplicationContext(), value + " position" + i,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
