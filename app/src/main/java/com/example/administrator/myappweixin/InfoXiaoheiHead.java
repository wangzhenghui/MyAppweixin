package com.example.administrator.myappweixin;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2016/6/22.
 */
public class InfoXiaoheiHead extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_xiaohei_head);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //        WindowManager.LayoutParams.FLAG_FULLSCREEN);   //全屏显示
        //Toast.makeText(getApplicationContext(), "孩子！好好背诵！", Toast.LENGTH_LONG).show();
        //overridePendingTransition(R.anim.hyperspace_in, R.anim.hyperspace_out);

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        finish();
        return true;
    }
}
