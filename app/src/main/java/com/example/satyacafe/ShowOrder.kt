package com.example.satyacafe

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ShowOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_show_order)
        val myOrdersList=findViewById<TextView>(R.id.myOrder)

        val orderOfCustomer=intent.getStringExtra(MainActivity.KEY)

        myOrdersList.text="My order is: \n$orderOfCustomer "
    }
}