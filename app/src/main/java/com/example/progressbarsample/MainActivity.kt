package com.example.progressbarsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.example.progressbarsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var barprogress = 0
    var barsecond = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressBar01.max = 100
        binding.progressBar01.progress = barprogress
        binding.progressBar01.secondaryProgress = 0

        binding.buttonleft.setOnClickListener {
            binding.progressBar01.progress = barprogress
            pushButtonleft()
        }
        binding.button01.setOnClickListener { pushButtonright() }
    }
    fun pushButtonright(){
        binding.progressBar02.visibility = ProgressBar.INVISIBLE
    }
    fun pushButtonleft(){
        barprogress++
    }
}