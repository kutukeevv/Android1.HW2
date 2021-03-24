package com.example.lesson3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private RecyclerAdapter adapter;
    private static final int REQUEST_CODE = 1;
    private List<Students> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Students students = (Students) bundle.get("students");
            list.add(students);
            Log.i("TAG", students.getFirstName() + " ");
        }

        adapter = new RecyclerAdapter(this);
        adapter.setList(list);
        rvList.setAdapter(adapter);

    }

    public void addNewItem(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
        finish();
    }
}