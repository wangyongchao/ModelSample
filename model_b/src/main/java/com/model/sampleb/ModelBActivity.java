package com.model.sampleb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.model.common.CommonUtils;

@Route(path ="/businessb/modelB")
public class ModelBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelb);
        System.out.println("ModelBActivity");
    }
}
