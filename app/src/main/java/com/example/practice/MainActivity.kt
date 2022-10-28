package com.example.practice


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var myBinding: ActivityMainBinding
    var firstNumber: Int? = null
    var secondNumber: Int? = null
    var currentNumber = ""
    var operator = ""
    var numberPressed = false
    var operatorPressed = false


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding.root)


        // Numbers
        myBinding.btn0.setOnClickListener {
            myBinding.mathOperation.append("0")
            currentNumber += "0"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()

            } else {
                secondNumber = currentNumber.toInt()

            }


        }

        myBinding.btn1.setOnClickListener {
            myBinding.mathOperation.append("1")
            currentNumber += "1"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()

            }

        }

        myBinding.btn2.setOnClickListener {
            myBinding.mathOperation.append("2")
            currentNumber += "2"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()

            } else {
                secondNumber = currentNumber.toInt()

            }

        }

        myBinding.btn3.setOnClickListener {
            myBinding.mathOperation.append("3")
            currentNumber += "3"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }

        myBinding.btn4.setOnClickListener {
            myBinding.mathOperation.append("4")
            currentNumber += "4"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }

        myBinding.btn5.setOnClickListener {
            myBinding.mathOperation.append("5")
            currentNumber += "5"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }

        myBinding.btn6.setOnClickListener {
            myBinding.mathOperation.append("6")
            currentNumber += "6"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }

        myBinding.btn7.setOnClickListener {
            myBinding.mathOperation.append("7")
            currentNumber += "7"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }

        myBinding.btn8.setOnClickListener {
            myBinding.mathOperation.append("8")
            currentNumber += "8"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }

        myBinding.btn9.setOnClickListener {
            myBinding.mathOperation.append("9")
            currentNumber += "9"
            numberPressed = true
            if (!operatorPressed) {
                firstNumber = currentNumber.toInt()
            } else {
                secondNumber = currentNumber.toInt()
            }
        }
        // Operations
        myBinding.sumBtn.setOnClickListener {
            myBinding.mathOperation.append("+")
            if (firstNumber != null && !operatorPressed) {
                currentNumber = ""
                operator = "+"
                operatorPressed = true
            }

        }

        myBinding.minBtn.setOnClickListener {
            myBinding.mathOperation.append("-")
            if (firstNumber != null && !operatorPressed) {
                currentNumber = ""
                operator = "-"
                operatorPressed = true
            }
        }

        myBinding.multiplyBtn.setOnClickListener {
            myBinding.mathOperation.append("*")
            if (firstNumber != null && !operatorPressed) {
                currentNumber = ""
                operator = "*"
                operatorPressed = true
            }
        }

        myBinding.divideBtn.setOnClickListener {
            myBinding.mathOperation.append("/")

            if (firstNumber != null && !operatorPressed) {
                currentNumber = ""
                operator = "/"
                operatorPressed = true
            }
        }

        myBinding.bckBtn.setOnClickListener {

            val str = myBinding.mathOperation.text.toString()
            if (str.isNotEmpty() && operatorPressed) {
                myBinding.mathOperation.text = str.substring(0, str.length - 1)
            }
        }


        myBinding.clearBtn.setOnClickListener {
            myBinding.mathOperation.text = ""
            myBinding.result.text = ""
            numberPressed = false
            operatorPressed = false
            firstNumber = null
            secondNumber = null
            operator = ""
            currentNumber = ""
        }
        myBinding.equalBtn.setOnClickListener {
            myBinding.result.text =
                calculateResult(firstNumber!!, operator, secondNumber!!).toString()


        }


    }


    fun calculateResult(firstNumber: Int, operator: String, secondNumber: Int): Int? {
        var resultate: Int? = null
        when (operator) {
            "+" -> {
                resultate = firstNumber!! + secondNumber!!
            }

            "-" -> {
                resultate = firstNumber!! - secondNumber!!
            }

            "*" -> {
                resultate = firstNumber!! * secondNumber!!
            }

            "/" -> {
                try {
                    resultate = firstNumber!! / secondNumber!!
                } catch (_: java.lang.ArithmeticException) {
                    myBinding.result.text = "Error"
                }

            }

        }
        this.firstNumber = null
        this.secondNumber = null
        this.currentNumber = ""
        this.operator = ""
        this.numberPressed = false
        this.operatorPressed = false
        myBinding.mathOperation.text = ""
        return resultate
    }


}