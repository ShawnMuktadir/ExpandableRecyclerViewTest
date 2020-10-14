package com.example.expandablerecyclerviewtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<SampleList> sampleLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        SampleListAdapter sampleListAdapter = new SampleListAdapter(getApplicationContext(), sampleLists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sampleListAdapter);
    }

    private void initData() {
        sampleLists = new ArrayList<>();
        sampleLists.add(new SampleList("Chapter 1", R.drawable.ic_video, "Video 1_1",
                R.drawable.ic_document, "Document 1_1", "Document Author 1_1",
                R.drawable.ic_video, "Video 1_2"));

        sampleLists.add(new SampleList("Chapter 2", R.drawable.ic_document, "Document 2_1", "Document Author 2_1",
                R.drawable.ic_video, "Video 2_1",
                R.drawable.ic_video, "Video 2_2", "Audio 2_1"));

        sampleLists.add(new SampleList(R.drawable.ic_video, "Video 3_0"));

        sampleLists.add(new SampleList(R.drawable.ic_document, "Document 4_0", "Document Author 4_0"));
    }


}
