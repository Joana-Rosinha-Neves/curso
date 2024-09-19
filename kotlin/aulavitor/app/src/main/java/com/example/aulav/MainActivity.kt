package com.example.aulav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aulav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome: String = binding.firstName.text.toString()

            val lastname: String = binding.ultimoName.text.toString()

            binding.textResultado.text = " ola, $nome $lastname"
        }
    }
}