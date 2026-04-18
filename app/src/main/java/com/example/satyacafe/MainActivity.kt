package com.example.satyacafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    Create Key
    companion object{
        const val KEY="com.examples.satyacafe.MainActivity.KEY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnOrder=findViewById<Button>(R.id.btnOrder)
        val editTextText1=findViewById<EditText>(R.id.editTextText1)
        val editTextText2=findViewById<EditText>(R.id.editTextText2)
        val editTextText3=findViewById<EditText>(R.id.editTextText3)
        val editTextText4=findViewById<EditText>(R.id.editTextText4)





        btnOrder.setOnClickListener {
              val orderList ="1. "+editTextText1.text.toString()+","+ "2. "+editTextText2.text.toString()+", "+"3. "+editTextText3.text.toString()+", "+"4. "+editTextText4.text.toString()+" "


            intent= Intent(applicationContext, ShowOrder::class.java)
            intent.putExtra(KEY, orderList)
            startActivity(intent)
        }
    }
}