package com.example.rahulyiet.listview2;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.rahulyiet.listview2.R.id.name;

public class Main3Activity extends AppCompatActivity {
      TextView name1,email1,phone1;
      String userName,userEmail,userPhone;
    @SuppressLint({"ResourceType", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        TextView name1 =findViewById(R.id.name);
        TextView email1 =findViewById(R.id.email);
        TextView phone1 =findViewById(R.id.phone);


        SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);
        //     create editor
        userName= sp.getString("name","none");
        userEmail = sp.getString("email","none");
        userPhone =sp.getString("phone","none");

        name1.setText(userName);
        email1.setText(userEmail);
        phone1.setText(userPhone);


    }
}
