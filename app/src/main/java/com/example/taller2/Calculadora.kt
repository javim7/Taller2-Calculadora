package com.example.taller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class Calculadora : AppCompatActivity() {
    //creando variables

    lateinit var txtResultado: TextView
    lateinit var txtResultado2: TextView
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
        txtResultado2 = findViewById(R.id.txtResultado2)

        txtResultado.text = "CAS10"
        txtResultado.text = ""

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
            appendOnExpression("(", false)

        }

        btnCerr.setOnClickListener {
            appendOnExpression(")", false)

        }

        btnClr.setOnClickListener {
            txtResultado.text =""
            txtResultado2.text =""

        }

        btnDiv.setOnClickListener {
            appendOnExpression("/", false)

        }

        //fila2
        btnSiete.setOnClickListener {
            appendOnExpression("7", true)

        }

        btnOcho.setOnClickListener {
            appendOnExpression("8", true)

        }

        btnNueve.setOnClickListener {
            appendOnExpression("9", true)

        }

        btnMult.setOnClickListener {
            appendOnExpression("*", false)

        }

        //fila3
        btnCuatro.setOnClickListener {
            appendOnExpression("4", true)

        }

        btnCinco.setOnClickListener {
            appendOnExpression("5", true)

        }

        btnSeis.setOnClickListener {
            appendOnExpression("6", true)

        }

        btnRest.setOnClickListener {
            appendOnExpression("-", false)

        }

        //fila4
        btnUno.setOnClickListener {
            appendOnExpression("1", true)

        }

        btnDos.setOnClickListener {
            appendOnExpression("2", true)

        }

        btnTres.setOnClickListener {
            appendOnExpression("3", true)

        }

        btnSum.setOnClickListener {
            appendOnExpression("+", false)

        }

        //fila5
        btnPunto.setOnClickListener {
            appendOnExpression(".", true)

        }

        btnCero.setOnClickListener {
            appendOnExpression("0", true)

        }

        btnDel.setOnClickListener {
            val string = txtResultado.text.toString()
            if(string.isNotEmpty()) {
                txtResultado.text = string.substring(0,string.length -1)
            }
            txtResultado2.text = ""

        }

        btnIgual.setOnClickListener {
            try {
                val Expresion = ExpressionBuilder(txtResultado.text.toString()).build()
                val Resultado = Expresion.evaluate()
                val resultadoLargo = Resultado.toLong()
                if(Resultado==resultadoLargo.toDouble())
                    txtResultado2.text = resultadoLargo.toString()
                else
                    txtResultado2.text = Resultado.toString()
            } catch (e:Exception) {
                Log.d("Excepcion", "mensaje: " + e.message)
            }

        }


    }

    fun appendOnExpression(string: String, onClear: Boolean) {

        if(txtResultado2.text.isNotEmpty()) {
            txtResultado.text = ""
        }

        if(onClear) {
            txtResultado2.text = ""
            txtResultado.append(string)
        } else {
            txtResultado.append(txtResultado2.text)
            txtResultado.append(string)
            txtResultado2.text = ""
        }

    }
}