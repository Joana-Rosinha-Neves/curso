package com.example.exercicio1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicio1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros: Double = binding.euros.text.toString().toDouble()

            val dolares: Double = euros * 1.7
            val dolaress: String = String.format("%.2f", dolares);
            binding.textResultado.text = " $dolaress "
        }

    }


}


