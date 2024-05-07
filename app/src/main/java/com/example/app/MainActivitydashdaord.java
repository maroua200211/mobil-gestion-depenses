package com.example.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivitydashdaord extends AppCompatActivity {
    RecyclerView recyclerView ;
    FloatingActionButton add_button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_activitydashdaord);
       recyclerView = findViewById(R.id.recycleview);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydashdaord.this,AddActivity.class);

                startActivity(intent);
                finish();
            }
        })

        ;



        public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                RecyclerView recyclerView = findViewById(R.id.recycleview);

                // Créer une liste de données
                ArrayList<String> dataList = new ArrayList<>();
                dataList.add("Élément 1");
                dataList.add("Élément 2");
                dataList.add("Élément 3");

                // Créer un adaptateur et lui fournir les données
                MyAdapter adapter = new MyAdapter(dataList);

                // Associer l'adaptateur à votre RecyclerView
                recyclerView.setAdapter(adapter);

                // Définir le gestionnaire de disposition pour le RecyclerView
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
            }
        }


    }
}