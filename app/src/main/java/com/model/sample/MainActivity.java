package com.model.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

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
            ARouter.getInstance().build("/businessa/modelA")
                    .navigation( this,new NavigationCallbackImp());

        }
        if (id == R.id.modelB) {
            ARouter.getInstance().build("/businessb/modelB")
                    .navigation(this,new NavigationCallbackImp());
        }

    }

    class NavigationCallbackImp implements NavigationCallback{

        @Override
        public void onFound(Postcard postcard) {
            String path = postcard.getPath();
            System.out.println("path="+path+",onFound");
        }

        @Override
        public void onLost(Postcard postcard) {
            String path = postcard.getPath();
            System.out.println("path="+path+",onLost");

        }

        @Override
        public void onArrival(Postcard postcard) {
            String path = postcard.getPath();
            System.out.println("path="+path+",onArrival");

        }

        @Override
        public void onInterrupt(Postcard postcard) {
            String path = postcard.getPath();
            System.out.println("path="+path+",onInterrupt");

        }
    }
}
