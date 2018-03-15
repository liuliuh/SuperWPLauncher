package com.liuhang.wpdesk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tips", "开始学习自定义view吧小伙子");
        Log.d("tips", "我熟练的一逼");
    }
}
