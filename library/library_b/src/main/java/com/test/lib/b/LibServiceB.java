package com.test.lib.b;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lib.base.impl.a.IAService;
import com.lib.base.impl.b.IBService;

/**
 * Created by wangyongchao on 2018/4/17.
 */
@Route(path = "/libb/serviceb", name = "libb-serviceb")
public class LibServiceB implements IBService {

    @Override
    public void service(String service) {
        System.out.println("b service");
    }

    /**
     * 测试基础模块互相依赖
     */
    public void testLibDependcy() {
        IAService iaService = ARouter.getInstance().navigation(IAService.class);
        iaService.service("LibServiceB testLibDependcy");

    }

    @Override
    public void init(Context context) {

    }
}
