package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.FeatureGroupInfo;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.myapplication.Homeadapter.FeaturedHelperClass;

import java.util.ArrayList;

public class Course extends AppCompatActivity {
    RecyclerView featuredRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_course);


        featuredRecycler = findViewById(R.id.featured_recycler);
        featuredRecycler();
    }
    private void featuredRecycler(){
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.sp,"maths","fghjkbn"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.sp,"ss","ryuio"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.sp,"ty","sdf"));
    }
}