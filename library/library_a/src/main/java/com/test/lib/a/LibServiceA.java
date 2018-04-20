package com.test.lib.a;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lib.base.impl.a.IAService;
import com.lib.base.impl.b.IBService;

/**
 * Created by wangyongchao on 2018/4/17.
 */

@Route(path = "/liba/servicea", name = "liba-servicea")
public class LibServiceA implements IAService {

    @Override
    public void service(String service) {
        System.out.println("a service");
    }

    /**
     * 测试基础模块互相依赖
     */
    @Override
    public void testLibDependcy() {
        IBService ibService = ARouter.getInstance().navigation(IBService.class);
        ibService.service("LibServiceA testLibDependcy");

    }

    @Override
    public void init(Context context) {

    }
}
