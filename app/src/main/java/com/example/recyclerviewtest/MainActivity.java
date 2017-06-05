package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.recyclerviewtest.adapter.FruitAdapter;
import com.example.recyclerviewtest.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView view = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        view.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        view.setAdapter(adapter);

    }

    private void initFruits(){
        for(int i = 0;i < 2;i++){
            Fruit apple =  new Fruit("apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banner = new Fruit("banner",R.drawable.banana_pic);
            fruitList.add(banner);
            Fruit orange = new Fruit("orange",R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit waterMelon = new Fruit("waterMelon",R.drawable.watermelon_pic);
            fruitList.add(waterMelon);
            Fruit pear = new Fruit("pear",R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape",R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit mango = new Fruit("mango",R.drawable.mango_pic);
            fruitList.add(mango);
            Fruit cherry = new Fruit("cherry",R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit strawberry = new Fruit("strawberry",R.drawable.strawberry_pic);
            fruitList.add(strawberry);
        }
    }

}
