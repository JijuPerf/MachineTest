package com.perfomatix.demoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    private var mSubmitButton : Button? = null
    private var mInputText : AppCompatEditText? = null
    private var inputText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()
        mSubmitButton?.setOnClickListener {

            inputText = mInputText?.text.toString().trim()
            var reverseText = ""

            if (inputText.isNotEmpty()){

                for (test in inputText.length-1 downTo  0){
                    reverseText += inputText[test]
                }

                if (inputText == reverseText){
                    Toast.makeText(this, R.string.text_palindrom, Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, R.string.text_palindrom_not, Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, R.string.enter_text, Toast.LENGTH_LONG).show()
            }

        }
    }

    private fun bindView() {
        mSubmitButton = findViewById(R.id.btn_submit)
        mInputText = findViewById(R.id.edt_InputText)
    }
}
