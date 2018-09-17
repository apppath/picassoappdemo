package com.example.basicprogramming.picassoappdemo.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.basicprogramming.picassoappdemo.R;
import com.example.basicprogramming.picassoappdemo.adapters.ImageAdapter;
import com.example.basicprogramming.picassoappdemo.model.Images;
import com.example.basicprogramming.picassoappdemo.model.ImagesData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Images> imagesArrayList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private ImageAdapter imageAdapter;
    private FloatingActionButton fab;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.my_recycler_view_picasso);
        gridLayoutManager = new
                GridLayoutManager(this, 3
                , GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);

        fab.setOnClickListener(this);
        setImages();
    }

    public void setImages() {

        imagesArrayList = new ArrayList<>();
        imagesArrayList = ImagesData.setMovieData();

        imageAdapter = new ImageAdapter(MainActivity.this, imagesArrayList);
        recyclerView.setAdapter(imageAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this,
                        "Setting Menu Clicked",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,
                "Images View",
                Toast.LENGTH_SHORT).show();
    }
}
