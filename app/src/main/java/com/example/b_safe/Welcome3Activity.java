package com.example.b_safe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome3Activity extends AppCompatActivity {

    Button log , reg;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome3);

        log=(Button)findViewById(R.id.buttonlog);
        reg=(Button)findViewById(R.id.buttonreg);
        tx=(TextView)findViewById(R.id.textView2);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(Welcome3Activity.this,LoginActivity.class);
                startActivity(logintent);

            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regi = new Intent(Welcome3Activity.this,RegistrationActivity.class);
                startActivity(regi);
            }
        });

        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regi = new Intent(Welcome3Activity.this,Main2Activity.class);
                startActivity(regi);
            }
        });
    }
}
