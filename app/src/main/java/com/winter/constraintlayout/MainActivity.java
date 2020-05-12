package com.winter.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
* 搜索类Ctrl+N
* 搜索文件Ctrl+Shift+N
* 搜索本页文本Ctrl+F
* 全局搜索文本Ctrl+Shift+F
* */
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    private void initViews() {
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_1:
            {
                Intent intent = new Intent(getApplicationContext(),RelativePositioningActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_2:
            {
                Intent intent = new Intent(getApplicationContext(),AnglePositioningActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_3:
            {
                Intent intent = new Intent(getApplicationContext(),MarginActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_4:
            {
                Intent intent = new Intent(getApplicationContext(),SizeConstraintActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_5:
            {
                Intent intent = new Intent(getApplicationContext(),ChainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_6:
            {
                Intent intent = new Intent(getApplicationContext(),AuxiliaryToolActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}// public class MainActivity
