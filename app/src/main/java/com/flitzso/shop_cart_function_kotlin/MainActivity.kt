package com.flitzso.shop_cart_function_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flitzso.shop_cart_function_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.icNavegar.setOnClickListener {

            val navegarSegundaTela = Intent(this,cart_shop::class.java)
            startActivity(navegarSegundaTela)
        }
    }
}