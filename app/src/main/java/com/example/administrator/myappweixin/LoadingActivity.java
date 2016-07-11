package com.example.administrator.myappweixin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/6/22.
 */
public class LoadingActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent (LoadingActivity.this,Whatsnew.class);
                startActivity(intent);
                LoadingActivity.this.finish();
                Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
            }
        }, 200);
    }
}
