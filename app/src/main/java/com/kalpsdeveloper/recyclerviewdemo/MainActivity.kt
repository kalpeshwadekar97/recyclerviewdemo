package com.kalpsdeveloper.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.kalpsdeveloper.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: DemoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        adapter = DemoAdapter()
        binding.rvDemo.adapter = adapter
        Handler().postDelayed({
            adapter.list = arrayListOf<DemoModel>(DemoModel("Ganapati Bappa Morya"))
        }, 2000)

    }
}