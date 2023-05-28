package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity55 extends AppCompatActivity {

    TextView name, dob, hight, weight, hobbie, ocupation, mobile, address, skill;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main55);

        name=findViewById(R.id.txvwname);
        dob=findViewById(R.id.txvwdob);
        hight=findViewById(R.id.txvwhight);
        weight=findViewById(R.id.txvwweight);
        hobbie=findViewById(R.id.txvwhobbie);
        ocupation=findViewById(R.id.txvwocupation);
        mobile=findViewById(R.id.txvwmobile);
        address=findViewById(R.id.txvwaddress);
        skill=findViewById(R.id.txvwskill);

        String name1 = getIntent().getStringExtra("user");
        String dob1 = getIntent().getStringExtra("dob.");
        String hight1 = getIntent().getStringExtra("hightt");
        String weight1 = getIntent().getStringExtra("weightt");
        String hobbie1 = getIntent().getStringExtra("hobbiee");
        String ocupation1 = getIntent().getStringExtra("ocupationn");
        String mobile1 = getIntent().getStringExtra("mobilee");
        String address1 = getIntent().getStringExtra("addresss");
        String skill1 = getIntent().getStringExtra("skilll");

        name.setText(name1);
        dob.setText(dob1);
        hight.setText(hight1);
        weight.setText(weight1);
        hobbie.setText(hobbie1);
        ocupation.setText(ocupation1);
        mobile.setText(mobile1);
        address.setText(address1);
        skill.setText(skill1);

    }
}