package com.example.figmapage4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Data> fill_with_data() {
        List<Data> data = new ArrayList<>();

        data.add(new Data("5101 45 •• •••• 6981", "Master Card ", R.drawable.ic_ic_mastercard_white));
        data.add(new Data("4242 45 •• •••• 8117", "Visa ", R.drawable.ic_ic_mastercard_white));

        return data;
    }
}