package com.example.p

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        btnVolver = findViewById(R.id.btnVolver)
        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")
        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo"



    }
    fun volver(view: View) {
        val intent = Intent(this@SaludoActivity, MainActivity::class.java)
        //Iniciamos la nueva actividad
        startActivity(intent)
    }
}