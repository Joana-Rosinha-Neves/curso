package com.example.exe545

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe545.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnClicar.setOnClickListener {
           Toast.makeText(applicationContext, " botao clicado", Toast.LENGTH_SHORT).show()



        }
        binding.btnClick.setOnClickListener {
            val intent = Intent(this, MainActivity2 ::class.java)
            startActivity(intent)
        }

    }
}