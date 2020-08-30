package com.example.recylarviewand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recylarviewand.Adapter.RecipeAdapter;
import com.example.recylarviewand.Model.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView  =findViewById(R.id.recylerView);
        ArrayList<RecipeModel>list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.f1, "A" ));
        list.add(new RecipeModel(R.drawable.f2, "B" ));
        list.add(new RecipeModel(R.drawable.f3, "C" ));
        list.add(new RecipeModel(R.drawable.f4, "D" ));
        list.add(new RecipeModel(R.drawable.f5, "E" ));
        list.add(new RecipeModel(R.drawable.f6, "F" ));
        list.add(new RecipeModel(R.drawable.f7, "G" ));
        list.add(new RecipeModel(R.drawable.f8, "H" ));
        list.add(new RecipeModel(R.drawable.f9, "I" ));

        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recylerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager  = new GridLayoutManager(this, 2);


        recylerView.setLayoutManager(gridLayoutManager);



    }
}
