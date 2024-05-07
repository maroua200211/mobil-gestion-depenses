package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.app.helpers.StringHelper;

public class SignInActivity extends AppCompatActivity {
Button sign_in_btn,go;
EditText Email,MotDepasse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);

        Email = findViewById(R.id.Email);

        MotDepasse = findViewById(R.id.MotDepasse);
        sign_in_btn = findViewById(R.id.sign_in_btn);
        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){authenticateUser();}
        });

        Button button=findViewById(R.id.go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MainActivity2.class);

                startActivity(intent);
                finish();
            }
        });
    }
public void authenticateUser(){
    if (validateEmail()  || !validateMotDepasse()) {
        return;
    }

}

    public void goToHome(View view){
        Intent intent = new Intent(SignInActivity.this,MainActivity.class);

        startActivity(intent);
        finish();
    }

    public void gotoSigUpAct(View view){
        Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);

        startActivity(intent);
        finish();

    }
    public boolean validateEmail() {
        String emailText = Email.getText().toString();
        if (emailText.isEmpty()) {
            Email.setError("Email cannot be empty");
            return false;
        } else if (!StringHelper.regexEmailValidationPattern(emailText)) {
            Email.setError("Please enter a valid email");
            return false;
        } else {
            Email.setError(null);
            return true;
        }
    }
    public boolean validateMotDepasse() {
        String motDepasseText = MotDepasse.getText().toString();
        if (motDepasseText.isEmpty()) {
            MotDepasse.setError("Password cannot be empty");
            return false;
        } else {
            MotDepasse.setError(null);
            return true;
        }
    }
}

