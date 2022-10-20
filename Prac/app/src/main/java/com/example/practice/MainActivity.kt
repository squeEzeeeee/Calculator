package com.example.practice


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_0.setOnClickListener { setTextFields("0") }
        btn_1.setOnClickListener { setTextFields("1") }
        btn_2.setOnClickListener { setTextFields("2") }
        btn_3.setOnClickListener { setTextFields("3") }
        btn_4.setOnClickListener { setTextFields("4") }
        btn_5.setOnClickListener { setTextFields("5") }
        btn_6.setOnClickListener { setTextFields("6") }
        btn_7.setOnClickListener { setTextFields("7") }
        btn_8.setOnClickListener { setTextFields("8") }
        btn_9.setOnClickListener { setTextFields("9") }
        sum_btn.setOnClickListener { setTextFields("+") }
        min_btn.setOnClickListener { setTextFields("-") }
        divide_btn.setOnClickListener { setTextFields("/") }
        multiply_btn.setOnClickListener { setTextFields("*") }

        clear_btn.setOnClickListener {
            math_operation.text= ""
            result.text=""
        }

        bck_btn.setOnClickListener {
            val str=math_operation.text.toString()
            if(str.isNotEmpty())
                math_operation.text= str.substring(0,str.length-1)
        }

    }

    fun setTextFields(str: String) {
    math_operation.append(str)
    }
}