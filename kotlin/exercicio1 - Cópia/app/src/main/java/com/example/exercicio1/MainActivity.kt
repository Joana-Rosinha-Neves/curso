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
<<<<<<< HEAD:kotlin/exercicio1 - Cópia/app/src/main/java/com/example/exercicio1/MainActivity.kt
            binding.textResultado.text = " $dolaress ";
=======
            binding.textResultado.text = " $dolaress $"
>>>>>>> 841c2ae64839dbba39a538ab7e2ae0ccab0b641a:exercicio1/app/src/main/java/com/example/exercicio1/MainActivity.kt
        }

    }


}


