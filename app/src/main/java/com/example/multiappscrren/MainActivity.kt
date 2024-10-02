package com.example.multiappscrren

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    //creating key

    companion object {
        const val KEY ="com.example.MainActivity.KEY"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Bind view by using the findviebyid
        val textView=findViewById<TextView>(R.id.textView)
        val editText1= findViewById<EditText>(R.id.eT1)
        val editText2=findViewById<EditText>(R.id.eT2)
        val editText3=findViewById<EditText>(R.id.eT3)
        val editText4=findViewById<EditText>(R.id.eT4)
        val button=findViewById<Button>(R.id.button)

        //Handle the button on the event

         button.setOnClickListener {

             val order1 = editText1.text.toString()
             val order2=editText2.text.toString()
              val order3=editText3.text.toString()
             val order4=editText4.text.toString()


             //Display a message with order details

             if(order1.isEmpty() && order2.isEmpty() && order3.isEmpty() && order4.isEmpty()) {
                 Toast.makeText(this, "Please Enter at least one order!", Toast.LENGTH_SHORT).show()
             } else{
                 val orders =" Order Summary:\n1. $order1\n2 . $order2\n3 . $order3\n4 . $order4"
                 Toast.makeText(this,orders,Toast.LENGTH_LONG).show()

                 intent= Intent( this,Order::class.java)
                 intent.putExtra(KEY,orders )
                 startActivity(intent)
             }


         }






    }
}