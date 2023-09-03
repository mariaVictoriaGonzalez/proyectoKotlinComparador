package com.curso.android.app.practica.comparador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.practica.comparador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()

            val result = compareTexts(text1, text2)
            binding.resultTextView.text = result
        }
    }

    fun compareTexts(text1: String, text2: String): String {
        return if (text1 == text2) {
            "Los textos son iguales."
        } else {
            "Los textos son diferentes."
        }
    }
}


