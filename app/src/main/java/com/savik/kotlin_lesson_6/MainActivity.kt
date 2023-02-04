package com.savik.kotlin_lesson_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameList = ArrayList<String>()
        nameList.add("Серега")
        nameList.add("Леха")
        nameList.add("Егор")
        nameList.add("Семен")
        nameList.add("Денис")
        nameList.add("Степан")
        nameList.add("Игорь")
        nameList.add("Андрей")

        var listView = findViewById<ListView>(R.id.listView)
        var adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, nameList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Нажата позиция: ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}