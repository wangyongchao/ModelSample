package com.model.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.modelA).setOnClickListener(this);
        findViewById(R.id.modelB).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.modelA) {
            startActivity(new Intent("com.model.sample.action.ModelAActivity"));
        }
        if (id == R.id.modelB) {
            startActivity(new Intent("com.model.sample.action.ModelBActivity"));
        }

    }
}
