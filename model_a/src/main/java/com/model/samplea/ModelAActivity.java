package com.model.samplea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lib.base.impl.a.IAService;
import com.model.common.inter.ModelBInterface;

@Route(path = "/businessa/modelA")
public class ModelAActivity extends AppCompatActivity implements View.OnClickListener {

    @Autowired(name = "/serviceb/modelb") //组名称各个模块不能相同
            ModelBInterface modelBInterface;

    @Autowired(name = "/liba/servicea")
    IAService iaService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("ModelAActivity");
        ARouter.getInstance().inject(this);//使用依赖注入的方式获取服务

        // 2. 使用依赖查找的方式发现服务，主动去发现服务并使用，下面两种方式分别是byName和byType
//         modelBInterface = ARouter.getInstance().navigation(ModelBInterface.class);
//        modelBInterface = (ModelBInterface) ARouter.getInstance().build("/service/modelB").navigation();

        setContentView(R.layout.activity_modela);
        findViewById(R.id.buttonmodela).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        modelBInterface.printModelB("打印modelb");
        iaService.service("ModelAActivity onClick");
        iaService.testLibDependcy();

    }
}
