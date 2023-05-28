package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);

        String name = getIntent().getStringExtra("user");
        String dob = getIntent().getStringExtra("dob.");
        String hight = getIntent().getStringExtra("hightt");
        String weight = getIntent().getStringExtra("weightt");
        String hobbie = getIntent().getStringExtra("hobiee");
        String ocupation = getIntent().getStringExtra("ocupationn");
        String mobile = getIntent().getStringExtra("mobilee");
        String address = getIntent().getStringExtra("addresss");
        String skill = getIntent().getStringExtra("skilll");

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("user",name);
                intent.putExtra("dob.",dob);
                intent.putExtra("hightt",hight);
                intent.putExtra("weightt",weight);
                intent.putExtra("hobbiee",hobbie);
                intent.putExtra("ocupationn",ocupation);
                intent.putExtra("mobilee",mobile);
                intent.putExtra("addresss",address);
                intent.putExtra("skilll",skill);
                startActivity(intent);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MainActivity44.class);
                intent.putExtra("user",name);
                intent.putExtra("dob.",dob);
                intent.putExtra("hightt",hight);
                intent.putExtra("weightt",weight);
                intent.putExtra("hobbiee",hobbie);
                intent.putExtra("ocupationn",ocupation);
                intent.putExtra("mobilee",mobile);
                intent.putExtra("addresss",address);
                intent.putExtra("skilll",skill);
                startActivity(intent);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MainActivity55.class);
                intent.putExtra("user",name);
                intent.putExtra("dob.",dob);
                intent.putExtra("hightt",hight);
                intent.putExtra("weightt",weight);
                intent.putExtra("hobbiee",hobbie);
                intent.putExtra("ocupationn",ocupation);
                intent.putExtra("mobilee",mobile);
                intent.putExtra("addresss",address);
                intent.putExtra("skilll",skill);
                startActivity(intent);


            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MainActivity66.class);
                intent.putExtra("user",name);
                intent.putExtra("dob.",dob);
                intent.putExtra("hightt",hight);
                intent.putExtra("weightt",weight);
                intent.putExtra("hobbiee",hobbie);
                intent.putExtra("ocupationn",ocupation);
                intent.putExtra("mobilee",mobile);
                intent.putExtra("addresss",address);
                intent.putExtra("skilll",skill);
                startActivity(intent);


            }
        });

    }
}