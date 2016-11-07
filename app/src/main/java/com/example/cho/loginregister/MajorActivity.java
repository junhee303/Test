package com.example.cho.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.ImageButton;
import android.widget.ListView;

public class MajorActivity extends AppCompatActivity {

    private SearchView svMajorSearch;
    private ImageButton imgB_Search;
    private ListView MajorList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);

        svMajorSearch = (SearchView) findViewById(R.id.svMajorSearch);
        imgB_Search = (ImageButton) findViewById(R.id.imgB_Search);
        MajorList = (ListView) findViewById(R.id.MajorList);


    }
}
