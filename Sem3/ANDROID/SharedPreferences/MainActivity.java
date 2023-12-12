package com.example.sharedepreferences;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname, email;
    String a, b;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("MyPref", MODE_PRIVATE);
        uname = findViewById(R.id.uname);
        email = findViewById(R.id.email);
        if (sp.contains("Name"))
            uname.setText(sp.getString("Name", ""));
        if (sp.contains("Email"))
            email.setText(sp.getString("Email", ""));
    }

    public void nextActivity(View v) {
        a = uname.getText().toString();
        b = email.getText().toString();

        if (isValidEmail(b)) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("Name", a);
            editor.putString("Email", b);
            editor.apply();
            Intent i = new Intent(this, SecondActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidEmail(CharSequence target) {
        return Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
