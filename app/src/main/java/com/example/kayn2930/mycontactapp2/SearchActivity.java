package com.example.kayn2930.mycontactapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //get the intent that started the activity
        android.content.Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //set the string in TextView
        android.widget.TextView textView = findViewById(R.id.textView4);
        textView.setText(message);

    }
}
