package com.model.sampleb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.model.common.CommonUtils;

public class ModelBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelb);
        System.out.println("ModelBActivity");
        CommonUtils.testCommon();
    }
}
