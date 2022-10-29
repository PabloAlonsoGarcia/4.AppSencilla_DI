package com.example.p

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre: EditText
    private lateinit var btnAceptar: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Asignamos una referencia a los botones
        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)


        /*btnAceptar.setOnClickListener {
            //Creamos el Intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            //Iniciamos la nueva actividad
            startActivity(intent)
        }*/
    }

    fun aceptar(view: View) {


        val intent = Intent(this@MainActivity, SaludoActivity::class.java)
        //Añadimos al intent la información a pasar entre actividades

        //Iniciamos la nueva actividad
        btnAceptar.setOnClickListener {


        var comprobacionTexto = txtNombre.text.toString()


            if (comprobacionTexto.isEmpty()) {
                txtNombre.setError("No se ha ingresado ningun nombre")
            }else{
                intent.putExtra("NOMBRE", comprobacionTexto)
                startActivity(intent)
            }
        }
    }





}