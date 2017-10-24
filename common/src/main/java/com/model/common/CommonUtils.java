package com.model.common;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by wangyongchao on 2017/9/22.
 */

public class CommonUtils {

    public static void  testCommon(){
        System.out.println("testCommon");
        EventBus.getDefault().post(new Object());
        System.out.println("new 14:1");

    }

}
