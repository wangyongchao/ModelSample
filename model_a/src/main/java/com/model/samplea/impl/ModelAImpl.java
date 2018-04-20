package com.model.samplea.impl;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.model.common.inter.ModelAInterface;

/**
 * Created by wangyongchao on 2018/4/17.
 */

// 实现接口
@Route(path = "/service/modela", name = "modelaservice")
public class ModelAImpl implements ModelAInterface {
    @Override
    public void printModelA(String modle) {
        System.out.println("ModelAImpl printModelA "+modle);
    }

    @Override
    public void init(Context context) {

    }
}
