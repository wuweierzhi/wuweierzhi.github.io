package com.example.wuziqi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ydkf051 on 2018/1/3.
 */

public class first extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
    }
    public void start(View v){
        Intent intent =new Intent(first.this,MainActivity.class);
        startActivity(intent);
    }
    public void exit(View v){
        finish();
    }
}
