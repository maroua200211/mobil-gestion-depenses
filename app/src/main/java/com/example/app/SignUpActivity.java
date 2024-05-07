package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.helpers.StringHelper;

public class SignUpActivity extends AppCompatActivity {
    EditText Nom, Prenom, Email, Dtn, Soldeac, MotDepasse;
    Button sign_up_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Nom = findViewById(R.id.Nom);
        Prenom = findViewById(R.id.Prenom);
        Email = findViewById(R.id.Email);
        Dtn = findViewById(R.id.Dtn);
        Soldeac = findViewById(R.id.Soldeac);
        MotDepasse = findViewById(R.id.MotDepasse);

        sign_up_btn = findViewById(R.id.sign_up_btn);
        sign_up_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);

                    startActivity(intent);
                    finish();
                }
            });
        }
    public void processFormFields() {
        if (!validateNom() || !validatePrenom() || !validateEmail() || !validateDtn() || !validateSoldeac() || !validateMotDepasse()) {
            return;
        }
        Toast.makeText(SignUpActivity.this, "Registration Successful", Toast.LENGTH_LONG).show();
    }

    public boolean validateNom() {
        String nomText = Nom.getText().toString();
        if (nomText.isEmpty()) {
            Nom.setError("Nom cannot be empty");
            return false;
        } else {
            Nom.setError(null);
            return true;
        }
    }

    public boolean validatePrenom() {
        String prenomText = Prenom.getText().toString();
        if (prenomText.isEmpty()) {
            Prenom.setError("Prénom cannot be empty");
            return false;
        } else {
            Prenom.setError(null);
            return true;
        }
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

    public boolean validateDtn() {
        String dtnText = Dtn.getText().toString();
        if (dtnText.isEmpty()) {
            Dtn.setError("Date of birth cannot be empty");
            return false;
        } else {
            Dtn.setError(null);
            return true;
        }
    }

    public boolean validateSoldeac() {
        String soldeacText = Soldeac.getText().toString();
        if (soldeacText.isEmpty()) {
            Soldeac.setError("Solde account cannot be empty");
            return false;
        } else {
            Soldeac.setError(null);
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
