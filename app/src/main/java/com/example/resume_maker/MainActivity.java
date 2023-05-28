package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;

    TextView name,dob,hight,weight,hobbie,ocupation,mobile,address,skill;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btnnext);
        name=findViewById(R.id.name);
        dob=findViewById(R.id.dob);
        hight=findViewById(R.id.hight);
        weight=findViewById(R.id.weight);
        hobbie=findViewById(R.id.hobbie);
        ocupation=findViewById(R.id.ocupation);
        mobile=findViewById(R.id.mobile);
        address=findViewById(R.id.address);
        skill=findViewById(R.id.skill);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = name.getText().toString();
                String dob1 = dob.getText().toString();
                String hight1 = hight.getText().toString();
                String weight1 = weight.getText().toString();
                String hobbie1 = hobbie.getText().toString();
                String ocupation1 = ocupation.getText().toString();
                String mobile1 = mobile.getText().toString();
                String address1 = address.getText().toString();
                String skill1 = skill.getText().toString();


                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("user",name1);
                intent.putExtra("dob.",dob1);
                intent.putExtra("hightt",hight1);
                intent.putExtra("weightt",weight1);
                intent.putExtra("hobbiee",hobbie1);
                intent.putExtra("ocupationn",ocupation1);
                intent.putExtra("mobilee",mobile1);
                intent.putExtra("addresss",address1);
                intent.putExtra("skilll",skill1);
                startActivity(intent);

            }
        });

    }
}