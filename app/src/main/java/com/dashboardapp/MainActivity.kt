package com.dashboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dashboardapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.background = null
       // binding.bottomNavigationView.menu.getItem(0).isEnabled = false
    }
}