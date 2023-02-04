package com.savik.kotlin_lesson_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var textView: TextView? = null //Создаем переменную

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvText) //Находим ее и присваиваем
        textView?.setText(getString(R.string.con)) //Выводим текст из стринг можно выводить только текст
    }
}