package com.example.administrator.myappweixin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/6/23.
 */
public class Main_Gerenxinxi extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_xinxi);
    }
   /* public void btn_back(View v) {     //标题栏 返回按钮
        this.finish();
    }
    public void btn_gerenxinxi(View v) {     //头像按钮
        Intent intent = new Intent();
        intent.setClass(Main_Gerenxinxi.this,InfoXiaoheiHead.class);
        startActivity(intent);
    }*/
}
