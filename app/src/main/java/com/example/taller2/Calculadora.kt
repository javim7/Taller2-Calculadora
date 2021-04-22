package com.example.taller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Calculadora : AppCompatActivity() {
    //creando variables

    lateinit var txtResultado: TextView
    //botones fila 1
    lateinit var btnAbr: Button
    lateinit var btnCerr: Button
    lateinit var btnClr: Button
    lateinit var btnDiv: Button
    //botones fila 2
    lateinit var btnSiete: Button
    lateinit var btnOcho: Button
    lateinit var btnNueve: Button
    lateinit var btnMult: Button
    //botones fila 3
    lateinit var btnCuatro: Button
    lateinit var btnCinco: Button
    lateinit var btnSeis: Button
    lateinit var btnRest: Button
    //botones fila 4
    lateinit var btnUno: Button
    lateinit var btnDos: Button
    lateinit var btnTres: Button
    lateinit var btnSum: Button
    //botones fila 5
    lateinit var btnPunto: Button
    lateinit var btnCero: Button
    lateinit var btnDel: Button
    lateinit var btnIgual: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)

        txtResultado.text = "CAS10"

        //agregando el findviewbyid de cada boton

        //fila 1
        btnAbr = findViewById(R.id.btnAbr)
        btnCerr = findViewById(R.id.btnCerr)
        btnClr = findViewById(R.id.btnClr)
        btnDiv = findViewById(R.id.btnDiv)
        //fila 2
        btnSiete = findViewById(R.id.btnSiete)
        btnOcho = findViewById(R.id.btnOcho)
        btnNueve = findViewById(R.id.btnNueve)
        btnMult = findViewById(R.id.btnMult)
        //fila 3
        btnCuatro= findViewById(R.id.btnCuatro)
        btnCinco = findViewById(R.id.btnCinco)
        btnSeis = findViewById(R.id.btnSeis)
        btnRest = findViewById(R.id.btnRest)
        //fila 4
        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnSum = findViewById(R.id.btnSum)
        //fila 5
        btnPunto = findViewById(R.id.btnPunto)
        btnCero = findViewById(R.id.btnCero)
        btnDel = findViewById(R.id.btnDel)
        btnIgual = findViewById(R.id.btnIgual)


        //agregando los metodos de setonclicklistener de cada boton

        //fila1
        btnAbr.setOnClickListener {
            txtResultado.text = "("

        }

        btnCerr.setOnClickListener {
            txtResultado.text = ")"

        }

        btnClr.setOnClickListener {
            txtResultado.text = "CE"

        }

        btnDiv.setOnClickListener {
            txtResultado.text = "/"

        }

        //fila2
        btnSiete.setOnClickListener {
            txtResultado.text = "7"

        }

        btnOcho.setOnClickListener {
            txtResultado.text = "8"

        }

        btnNueve.setOnClickListener {
            txtResultado.text = "9"

        }

        btnMult.setOnClickListener {
            txtResultado.text = "*"

        }

        //fila3
        btnCuatro.setOnClickListener {
            txtResultado.text = "4"

        }

        btnCinco.setOnClickListener {
            txtResultado.text = "5"

        }

        btnSeis.setOnClickListener {
            txtResultado.text = "6"

        }

        btnRest.setOnClickListener {
            txtResultado.text = "-"

        }

        //fila4
        btnUno.setOnClickListener {
            txtResultado.text = "1"

        }

        btnDos.setOnClickListener {
            txtResultado.text = "2"

        }

        btnTres.setOnClickListener {
            txtResultado.text = "3"

        }

        btnSum.setOnClickListener {
            txtResultado.text = "+"

        }

        //fila5
        btnPunto.setOnClickListener {
            txtResultado.text = "."

        }

        btnCero.setOnClickListener {
            txtResultado.text = "0"

        }

        btnDel.setOnClickListener {
            txtResultado.text = "DEL"

        }

        btnIgual.setOnClickListener {
            txtResultado.text = "="

        }


    }
}