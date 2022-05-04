package com.mycodelochana.mywallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        String[] wallpaperName={"wallpaper1","wallpaper2","wallpaper3","wallpaper4","wallpaper5","wallpaper6","wallpaper7","wallpaper8","wallpaper9","wallpaper10"};

        int[] wallpaper={R.drawable.wallpaper1,
        R.drawable.wallpaper2,
        R.drawable.wallpaper3,
        R.drawable.wallpaper4,
        R.drawable.wallpaper5,
        R.drawable.wallpaper6,
        R.drawable.wallpaper7,
        R.drawable.wallpaper8,
        R.drawable.wallpaper9,
        R.drawable.wallpaper10};

        ArrayAdapter<String> adapter=new ArrayAdapter<String >(this,R.layout.item,R.id.item_txt,wallpaperName);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);

                intent.putExtra("w_key",wallpaper[position]);
                startActivity(intent);
            }
        });




    }
}