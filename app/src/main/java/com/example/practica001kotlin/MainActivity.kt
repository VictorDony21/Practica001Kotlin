package com.example.practica001kotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var spnPaises: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spnPaises = findViewById(R.id.spnPaises)
        val adaptador = ArrayAdapter(
            this,
            android.R.layout.simple_expandable_list_item_1,
            resources.getStringArray(R.array.paises)
        )
        spnPaises.adapter = adaptador
        spnPaises.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView: AdapterView<*>, view: View, i: Int, l: Long ->
                Toast.makeText(
                    this,
                    "Selecciono el pais " + adapterView.getItemAtPosition(i).toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}
