package com.example.mobilelogin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView txemail, txpassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txemail = findViewById(R.id.txtEmail);
        txpassword = findViewById(R.id.txtPass);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String password = bundle.getString("b");

        txemail.setText(email);
        txpassword.setText(password);

    }
}