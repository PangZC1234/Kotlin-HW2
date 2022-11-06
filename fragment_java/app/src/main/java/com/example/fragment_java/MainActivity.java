package com.example.fragment_java;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        //創建一個adapter
        adapter = new ViewPagerAdapter(this);
        //將adapter放入ViewPager
        viewPager.setAdapter(adapter);
        //指定一開始ViewPager顯示內容位置
        viewPager.setCurrentItem(0);
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.e("MainActivity","onRestart");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.e("MainActivity","onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy");
    }
}