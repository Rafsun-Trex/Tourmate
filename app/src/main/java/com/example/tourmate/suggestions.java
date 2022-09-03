package com.example.tourmate;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class suggestions extends AppCompatActivity {
    RecyclerView rec;
    myadapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggestions);

        rec = (RecyclerView) findViewById(R.id.recview);
        rec.setLayoutManager(new LinearLayoutManager(this));
        adapter = new myadapter(dataqueue(), getApplicationContext());
        rec.setAdapter(adapter);
    }
    public ArrayList<DataModel> dataqueue()
    {
        ArrayList<DataModel> holder = new ArrayList<>();
        DataModel ob1 = new DataModel();
        ob1.setHeader("Sajek");
        ob1.setDesc("The beauty of nature.");
        ob1.setImagename(R.drawable.sajek);
        holder.add(ob1);

        DataModel ob2 = new DataModel();
        ob1.setHeader("Cox's Bazar");
        ob1.setDesc("Beautiful sea beach.");
        ob1.setImagename(R.drawable.coxsbazar);
        holder.add(ob2);

        DataModel ob3 = new DataModel();
        ob1.setHeader("Sylhet");
        ob1.setDesc("Explore land of Awliyas.");
        ob1.setImagename(R.drawable.sylhet);
        holder.add(ob3);

        DataModel ob4 = new DataModel();
        ob1.setHeader("Rangamati");
        ob1.setDesc("The beauty to inhale.");
        ob1.setImagename(R.drawable.rangamati);
        holder.add(ob4);

        return holder;


    }
}

