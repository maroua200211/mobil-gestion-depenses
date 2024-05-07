package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {
EditText type,description,montant,datedepaiement,utilisateur_id;
Button save_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        type = findViewById(R.id.type);
        description = findViewById(R.id.description);
        montant = findViewById(R.id.montant);
        datedepaiement = findViewById(R.id.datedepaiement);
        utilisateur_id = findViewById(R.id.utilisateur_id);
        save_add = findViewById(R.id.save_add);
        save_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LERC A DB
            }
        });
    }
}