package com.example.fragment_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        //創建一個adapter
        adapter = ViewPagerAdapter(this)
        //將adapter放入ViewPager
        viewPager.adapter = adapter
        //指定一開始ViewPager顯示內容位置
        viewPager.currentItem = 0
    }

    public override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart")
    }

    public override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    public override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume")
    }

    public override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    public override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy")
    }
}