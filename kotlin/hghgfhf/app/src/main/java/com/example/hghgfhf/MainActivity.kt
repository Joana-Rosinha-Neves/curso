package com.example.hghgfhf

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hghgfhf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private val binding by lazy {
    ActivityMainBinding.inflate(layoutInflater)
}

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)


    binding.horasid.setOnClickListener {

        val horas: Double = binding.horasid.text.toString().toDouble();

        binding.semanaId.text = "o numero é par"

        val pass: String = binding.pass.text.toString();
        if (nome != "user" || pass != "pass") {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        } else {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
}