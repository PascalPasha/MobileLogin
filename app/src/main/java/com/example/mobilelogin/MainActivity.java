package com.example.mobilelogin;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {
    Button button;
    TextView regis;
    EditText edemail,edpassword;
    String mail,pwd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button1);
        regis = (TextView)findViewById(R.id.daftarrgs);
        edemail = (EditText) findViewById(R.id.edmail);
        edpassword = (EditText)findViewById(R.id.edpasswd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mail = edemail.getText().toString();
                pwd = edpassword.getText().toString();

                String mail = "pahlevi.pasha09@gmail.com";
                String pwd = "12345";

                if (mail.equals("") || pwd.equals("")){
                    Toast.makeText(MainActivity.this, "Mohon diisi terlebih dahulu username dan password nya !", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (mail.equals("pahlevi.pasha09@gmail.com") && pwd.equals("12345"))
                    {
                        Toast.makeText(MainActivity.this, "Login berhasil ...", Toast.LENGTH_SHORT).show();


                        Intent next = new Intent(MainActivity.this, Home_Activity2.class);startActivity(next);


                    }
                    else {
                        Toast.makeText(MainActivity.this, "Login gagal ... ", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_registrasi.class);
                startActivity(i);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        if (item.getItemId() == R.id.about){
            Toast.makeText(this, "Versi yang kamu pakai sudah dalam versi terbaru", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
