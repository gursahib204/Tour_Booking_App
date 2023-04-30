package com.example.layoutdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class tour_page extends AppCompatActivity {

    RecyclerView recyclerView3;
    RecyclerviewAdapter3 recyclerviewAdapter;
    Integer image[]={R.drawable.locationfour,R.drawable.locationtwo,R.drawable.locationthree,R.drawable.locationfour,R.drawable.locationfive,R.drawable.locationsix};

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_page);
        recyclerView3=findViewById(R.id.recyclerviewlast);


        recyclerviewAdapter=new RecyclerviewAdapter3(tour_page.this,image);
        recyclerView3.setAdapter(recyclerviewAdapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));



    }
}