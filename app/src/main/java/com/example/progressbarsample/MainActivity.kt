package com.example.progressbarsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.example.progressbarsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.progressBar01.max = 100
        binding.progressBar01.progress = 50
        binding.progressBar01.secondaryProgress = 70

        binding.button01.setOnClickListener { pushButton() }
    }
    fun pushButton(){
        binding.progressBar02.visibility = ProgressBar.INVISIBLE //
    }
}