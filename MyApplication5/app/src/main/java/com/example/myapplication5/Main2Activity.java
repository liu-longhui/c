package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pojo.Student;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();

        Bundle bundle=getIntent().getExtras();
        String age=bundle.getString("age");
        String myage=age+"";
       Toast.makeText(this,myage,Toast.LENGTH_LONG).show();
        final TextView textView4=(TextView)findViewById(R.id.textView4);
        textView4.setText(myage);

        String  button1=intent.getStringExtra("button1");
        final TextView textView1=(TextView)findViewById(R.id.textView1);
        textView1.setText(button1);


//        Student stu1=(Student) intent.getSerializableExtra("stu1");
//        Toast.makeText(this,stu1.toString(),Toast.LENGTH_LONG).show();
//        final TextView textView5=(TextView)findViewById(R.id.textView5);
//        textView5.setText(stu1.toString());

    }
}
