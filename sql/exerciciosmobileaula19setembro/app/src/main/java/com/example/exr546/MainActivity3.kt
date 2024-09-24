package com.example.exr546

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exr546.databinding.ActivityMain3Binding
import com.example.exr546.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                setContentView(binding.root)



                Toast.makeText(applicationContext, "login errado ", Toast.LENGTH_SHORT).show()

                binding.btnLoginerrado.setOnClickListener {


                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                }
            }
        }


