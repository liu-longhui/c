package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pojo.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {//点击事件
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle=new Bundle();
                bundle.putString("age","字符串");
                intent.putExtras(bundle);
                intent.putExtra("button1","字符");
                //Student stu1=new Student(100,"刘","70");
                //bundle.putSerializable("stu1",stu1);
                //intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
