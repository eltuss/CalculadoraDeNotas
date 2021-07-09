package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val BTCalcular = botao
        val resultado = textResposta


        BTCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(editnota1.text.toString())
            val nota2 = Integer.parseInt(editnota2.text.toString())
            val faltas = Integer.parseInt(editfaltas.text.toString())

            val media = (nota1 + nota2)/2

            if (media >=6 && faltas <=10){
                resultado.setText("Aluno foi Aprovado" + "Nota Final: " + media + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }else {
                resultado.setText("Aluno foi reprovado!")
                resultado.setTextColor(Color.RED)
            }

        }
    }
}

