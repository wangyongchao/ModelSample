package com.model.samplea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.model.common.CommonUtils;

import org.greenrobot.eventbus.EventBus;


public class ModelAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modela);
        System.out.println("ModelAActivity");

        CommonUtils.testCommon();

    }

}
