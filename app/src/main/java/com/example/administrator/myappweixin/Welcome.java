package com.example.administrator.myappweixin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/6/22.
 */
public class Welcome extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public void welcome_login(View v) {
        Intent intent = new Intent();
        intent.setClass(Welcome.this,Login.class);
        startActivity(intent);
        //this.finish();
    }
    public void welcome_register(View v) {
        Intent intent = new Intent();
        intent.setClass(Welcome.this,WelCome_ZhuCe.class);
        startActivity(intent);
        //this.finish();
    }
}
