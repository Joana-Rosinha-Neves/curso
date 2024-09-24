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

<<<<<<< HEAD
        binding.buttonClicar1.setOnClickListener {
=======
        binding.btnClicar.setOnClickListener {
>>>>>>> 65da33f392fd55756cb4ee8b304f12cb324d6b30
           Toast.makeText(applicationContext, " botao clicado", Toast.LENGTH_SHORT).show()



        }
<<<<<<< HEAD
        binding.buttonClicar2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
=======
        binding.btnClick.setOnClickListener {
            val intent = Intent(this, MainActivity2 ::class.java)
>>>>>>> 65da33f392fd55756cb4ee8b304f12cb324d6b30
            startActivity(intent)
        }

    }
}