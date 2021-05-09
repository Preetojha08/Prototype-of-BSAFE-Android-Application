package com.example.b_safe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {


    EditText username;
    EditText upassword;
    EditText uAge;
    EditText uphone;
    EditText ucity;
    EditText ustate;
    EditText uaddress;
    EditText uemail;
    Button btnregister;
    EditText ucpassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username = (EditText)findViewById(R.id.editTextusername);
        upassword = (EditText)findViewById(R.id.editTextpassword);
        uAge = (EditText)findViewById(R.id.editTextage);
        uphone = (EditText)findViewById(R.id.editTextphone);
        ucity = (EditText)findViewById(R.id.editTextcity);
        ustate = (EditText)findViewById(R.id.editTextstate);
        uaddress = (EditText)findViewById(R.id.editTextaddress);
        uemail = (EditText)findViewById(R.id.editTextemail);
        ucpassword = (EditText)findViewById(R.id.editTextcpwd);

        btnregister= (Button)findViewById(R.id.buttonregistration);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(RegistrationActivity.this,Main2Activity.class);
                startActivity(i);
                Toast.makeText(RegistrationActivity.this,"You have registered Successfully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
