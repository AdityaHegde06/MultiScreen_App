package com.example.multiappscrren

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)
       
        
        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

       //Bind the TextView and Display the order
        val tVOrder = findViewById<TextView>(R.id.tVOrder)
          tVOrder.text = ordersOfCustomer ?: "No Order Recieved"
    }
}