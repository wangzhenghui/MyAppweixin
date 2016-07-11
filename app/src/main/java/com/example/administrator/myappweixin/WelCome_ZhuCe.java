package com.example.administrator.myappweixin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/27.
 */
public class WelCome_ZhuCe extends Activity {
    public static WelCome_ZhuCe instance = null;
    Button mBtnBack;
    EditText editText;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_zhuce);
       /* //启动activity时不自动弹出软键盘
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        instance = this;*/
        relativeLayout = (RelativeLayout) findViewById(R.id.nicheng);
        relativeLayout = (RelativeLayout) findViewById(R.id.guojia);
        relativeLayout = (RelativeLayout) findViewById(R.id.dianhua);
        relativeLayout = (RelativeLayout) findViewById(R.id.mima);
        editText = (EditText) findViewById(R.id.king1);
        editText = (EditText) findViewById(R.id.king2);
        editText = (EditText) findViewById(R.id.king3);
        editText = (EditText) findViewById(R.id.king4);

        mBtnBack = (Button) findViewById(R.id.main_zhuce_btn);

    }
}
