package com.example.exer4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exer4.databinding.ActivityMainBinding

        class MainActivity : AppCompatActivity() {
            private val binding by lazy {
                ActivityMainBinding.inflate(layoutInflater)
            }

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(binding.root)


                binding.parId.setOnClickListener {
                    var perguntas: Double = binding.perguntaId.text.toString().toDouble();



                    if (perguntas % 2.0 == 0.toDouble()) {
                        binding.parId.text = "o numero é par"

                    } else {
                        binding.parId.text = " 0 numero é impar"
                    }



                    for (i in 2 until (perguntas.toInt())) {


                        if (perguntas % perguntas == 0.toDouble() && ((perguntas%i) != 0.toDouble())) {
                            binding.primoId.text = "o numero é primo"

                        } else {

                            binding.primoId.text = "o numero é não primo"

                        }
                    }
                }
            }
        }





