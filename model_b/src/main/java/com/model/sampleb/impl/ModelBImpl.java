package com.model.sampleb.impl;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.model.common.inter.ModelBInterface;

/**
 * Created by wangyongchao on 2018/4/17.
 */

@Route(path = "/serviceb/modelb", name = "modelbservice")
public class ModelBImpl implements ModelBInterface {
    @Override
    public void printModelB(String modle) {
        System.out.println("ModelBImpl printModelB "+modle);
    }

    @Override
    public void init(Context context) {

    }
}
