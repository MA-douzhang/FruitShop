package com.example.fruitshop;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import enity.Fruit;

public class DetailActivity extends AppCompatActivity {
    ImageView img;
    TextView textView;
    TextView name;
    TextView introduce;
    TextView price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        Intent intent = getIntent();
        Fruit fruit = (Fruit) getIntent().getSerializableExtra("myposition");
        img.setImageResource(fruit.getImgId());
        name.setText("水果"+fruit.getName());
        introduce.setText("特色"+fruit.getIntroduce());
        price.setText("价格"+fruit.getPrice());
    }

    private void initView() {
        img = findViewById(R.id.image);
        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        introduce = findViewById(R.id.introduce);
    }
}