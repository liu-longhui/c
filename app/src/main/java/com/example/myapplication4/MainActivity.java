package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chunxiaoIntent=new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(chunxiaoIntent);
            }
        });

        final Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hongdouIntent=new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(hongdouIntent);
            }
        });

        final Button b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuangqianIntent=new Intent(MainActivity.this,
                        Main4Activity.class);
                startActivity(chuangqianIntent);
            }
        });

        final TextView tv1=(TextView)findViewById(R.id.textView1);
        final Button button5=(Button)findViewById(R.id.button4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mhr="姓名：冯绍海 " +
                        "\n年龄：20 " +
                        "\n地址：九江";
                tv1.setText(mhr);
            }
        });
    }
}
