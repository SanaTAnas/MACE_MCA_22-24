package com.example.shared_preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences sp;
    private EditText userview,emailview;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sp = getSharedPreferences("MyPref",MODE_PRIVATE);
        t1 = findViewById(R.id.userview);
        t2 = findViewById(R.id.emailview);
        if (sp.contains("Name"))
            t1.setText(sp.getString("Name",""));
        if (sp.contains("Email"))
            t2.setText(sp.getString("Email",""));
    }
    public void previousActivity(View v){
        System.out.println("Previous");
        startActivity(new Intent(this,MainActivity.class));


    }


}
