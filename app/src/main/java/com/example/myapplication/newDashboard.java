package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class newDashboard extends AppCompatActivity {

    public LinearLayout club;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dashboard);

        club = (LinearLayout)findViewById(R.id.clubs);
        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(newDashboard.this, "Clubs Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(newDashboard.this, clubs.class));
            }
        });
    }
}
