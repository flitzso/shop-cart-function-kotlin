package com.flitzso.shop_cart_function_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import android.widget.Toast
import com.flitzso.shop_cart_function_kotlin.databinding.ActivityCartShopBinding

class cart_shop : AppCompatActivity() {

    private lateinit var binding: ActivityCartShopBinding

    // Em sua atividade de carrinho de compras
    //private val cartItems = mutableListOf<CartItem>()

    // Para adicionar um item ao carrinho
    //fun addToCart(item: CartItem) {
      //  cartItems.add(item)
    //}

    // Para remover um item do carrinho
    //fun removeFromCart(item: CartItem) {
    //    cartItems.remove(item)
    //}

    //val buyButton = findViewById<Button>(R.id.buyButton)
    //val continueShoppingButton = findViewById<Button>(R.id.icVoltar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartShopBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.icVoltar.setOnClickListener {
            val voltarTela = Intent(this, MainActivity::class.java)
            startActivity(voltarTela)
        }

        //buyButton.setOnClickListener {
            // Lógica para a ação "Comprar Agora"
        //    Toast.makeText(this, "Produto adicionado ao carrinho", Toast.LENGTH_SHORT).show()
            // Você pode adicionar mais ações, como redirecionar para o carrinho, aqui
        //}

        //continueShoppingButton.setOnClickListener {
            // Lógica para a ação "Continuar Comprando"
        //    Toast.makeText(this, "Continuando a comprar", Toast.LENGTH_SHORT).show()
            // Você pode redirecionar para outra atividade para continuar comprando
        }
}