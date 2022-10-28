package com.example.p

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class ErrorNombre : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error_nombre)

        Snackbar.make(
            findViewById(R.layout.activity_error_nombre),
            "Error nombre",
            Snackbar.LENGTH_SHORT
        ).show()
        //

    }

}