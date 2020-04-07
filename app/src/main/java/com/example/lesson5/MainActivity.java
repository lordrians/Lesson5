package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKota;
    public static ArrayList<Kota> list = new ArrayList<>();
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.fab);

        rvKota = findViewById(R.id.rvKota);
        rvKota.setHasFixedSize(true);
        if (list.isEmpty()){
            list.addAll(dtKota.getListData());
        }
        if (getIntent().hasExtra("nama")){
            getDataFromIntent();
        }
        rvKota.setLayoutManager(new LinearLayoutManager(this));
        KotaAdapter kotaAdapter = new KotaAdapter(list, getApplicationContext());
        rvKota.setAdapter(kotaAdapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TambahActivity.class);
                startActivity(intent);
            }
        });

    }

    private void getDataFromIntent() {
        String newnama = getIntent().getStringExtra("nama");
        Kota kota = new Kota();
        kota.setNama(newnama);
        list.add(kota);
    }
}
