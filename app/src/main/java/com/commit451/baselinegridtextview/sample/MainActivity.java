package com.commit451.baselinegridtextview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.commit451.baselinegridtextview.BaselineGridTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BaselineGridTextView textView = (BaselineGridTextView) findViewById(R.id.textview);
        textView.setLineHeightHint(1.0f);
    }
}
