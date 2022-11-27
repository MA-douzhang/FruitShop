package com.example.fruitshop;

import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fruitshop.Adapter.FruitAdapter;
import enity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Fruit> list = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initFruits();
        FruitAdapter adapter = new FruitAdapter(list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 5; i++) {
            Fruit apple = new Fruit("陕西红富士",R.drawable.apple,"优质苹果","￥20元/kg");
            list.add(apple);
            Fruit orange = new Fruit("橙子",R.drawable.orange,"优质橙子","￥49元/kg");
            list.add(orange);
            Fruit pineapple = new Fruit("菠萝",R.drawable.pineapple,"优质菠萝","￥38元/kg");
            list.add(pineapple);
            Fruit pomegranate = new Fruit("石榴",R.drawable.pomegranate,"优质石榴","￥15元/kg");
            list.add(pomegranate);
            Fruit watermelon = new Fruit("西瓜",R.drawable.watermelon,"优质西瓜","￥8元/kg");
            list.add(watermelon);
            Fruit mango = new Fruit("芒果",R.drawable.mango,"优质芒果","￥25元/kg");
            list.add(mango);
            Fruit grape = new Fruit("葡萄",R.drawable.grape,"优质葡萄","￥19元/kg");
            list.add(grape);
        }
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerview);
    }
}