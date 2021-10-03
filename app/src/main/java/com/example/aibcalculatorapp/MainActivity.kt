package com.example.aibcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var Button0:Button
private lateinit var Button1:Button
private lateinit var Button2:Button
private lateinit var Button3:Button
private lateinit var Button4:Button
private lateinit var Button5:Button
private lateinit var Button6:Button
private lateinit var Button7:Button
private lateinit var Button8:Button
private lateinit var Button9:Button
private lateinit var ButtonPlus:Button
private lateinit var ButtonMinus:Button
private lateinit var ButtonDivision:Button
private lateinit var ButtonMaltiply:Button
private lateinit var ButtonEqual:Button
private lateinit var ButtonDot:Button
private lateinit var ButtonNeghative:Button
private lateinit var ButtonDelete:Button
private lateinit var ButtonClear:Button
private lateinit var TheResult:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button0=findViewById(R.id.BTN0)
        Button1=findViewById(R.id.BTN1)
        Button2=findViewById(R.id.BTN2)
        Button3=findViewById(R.id.BTN3)
        Button4=findViewById(R.id.BTN4)
        Button5=findViewById(R.id.BTN5)
        Button6=findViewById(R.id.BTN6)
        Button7=findViewById(R.id.BTN7)
        Button8=findViewById(R.id.BTN8)
        Button9=findViewById(R.id.BTN9)
        ButtonPlus=findViewById(R.id.BTNplus)
        ButtonMinus=findViewById(R.id.BTNminus)
        ButtonDivision=findViewById(R.id.BTNbivision)
        ButtonMaltiply=findViewById(R.id.BTNmultiply)
        ButtonEqual=findViewById(R.id.BTNequal)
        ButtonDot=findViewById(R.id.BTNdot)
        ButtonNeghative=findViewById(R.id.BTNnegative)
        ButtonDelete=findViewById(R.id.BTNDEL)
        ButtonClear=findViewById(R.id.BTNclear)
        TheResult=findViewById(R.id.textViewResult)

        Button0.setOnClickListener {

        }
        ///********I will Complete the App*************************






    }
}