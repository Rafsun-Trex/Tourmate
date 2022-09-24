package com.example.tourmate;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class result_recview extends AppCompatActivity {
    RecyclerView rec;
    result_adapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_recview);

        rec = (RecyclerView) findViewById(R.id.recview);
        rec.setHasFixedSize(true);
        rec.setLayoutManager(new LinearLayoutManager(this));
        adapter = new result_adapter(dataqueue(), getApplicationContext());
        rec.setAdapter(adapter);
    }
    public ArrayList<result_datamodel> dataqueue()
    {
        ArrayList<result_datamodel> holder = new ArrayList<>();
        result_datamodel ob1 = new result_datamodel();
        ob1.setHeader("Sajek");
        ob1.setDesc("The beauty of nature.");
        ob1.setImagename(R.drawable.sajek);
        holder.add(ob1);

        result_datamodel ob2 = new result_datamodel();
        ob1.setHeader("Cox's Bazar");
        ob1.setDesc("Beautiful sea beach.");
        ob1.setImagename(R.drawable.coxsbazar);
        holder.add(ob2);

        result_datamodel ob3 = new result_datamodel();
        ob1.setHeader("Sylhet");
        ob1.setDesc("Explore land of Awliyas.");
        ob1.setImagename(R.drawable.sylhet);
        holder.add(ob3);

        result_datamodel ob4 = new result_datamodel();
        ob1.setHeader("Rangamati");
        ob1.setDesc("The beauty to inhale.");
        ob1.setImagename(R.drawable.rangamati);
        holder.add(ob4);

        return holder;


    }
}

