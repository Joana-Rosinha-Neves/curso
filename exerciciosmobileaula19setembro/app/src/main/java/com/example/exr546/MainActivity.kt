package com.example.exr546

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exr546.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnValid.setOnClickListener {

            val nome: String = binding.user.text.toString();
            val pass: String = binding.pass.text.toString();
            if (nome!= "user" || pass!= "pass")
            {
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)

            }
            else
            {
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
        }


