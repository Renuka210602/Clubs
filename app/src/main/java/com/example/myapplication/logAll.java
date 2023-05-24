package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logAll extends AppCompatActivity {
    public Button button;
    //private Button button2;
   // private Button button3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_all);
        button = (Button) findViewById(R.id.student);
        //button2 = (Button) findViewById(R.id.faculty);
        //button3 = (Button) findViewById(R.id.admin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(logAll.this, SignUpActivity.class));
            }
        });
    }
        // button2.setOnClickListener(new View.OnClickListener() {
        //@Override
//            public void onClick(View view) {
//                activity_faculty_login();
//            }
//        });
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                activity_admin_login();
//            }
//        });
//    }

//    public void activity_faculty_login()
//    {
//        Intent intent = new Intent(this,Faculty_Login.class);
//    }
//    public void activity_admin_login()
//    {
//        Intent intent = new Intent(this,Admin_Login.class);
//    }
}