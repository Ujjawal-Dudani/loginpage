package com.example.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_list.*
import kotlinx.android.synthetic.main.toolbar.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //RecyclerView Part
       val layoutManager = LinearLayoutManager(this)
        rv_recyclerView.layoutManager = layoutManager
        val adapter = RecyclerViewAdapter()
        rv_recyclerView.adapter = adapter
       //RecyclerView Part Complete


        //Toolbar part

        left_icon.setOnClickListener(){
            Toast.makeText(this,"you clicked menu", Toast.LENGTH_SHORT).show()
        }

        right_icon.setOnClickListener(){
            Toast.makeText(this,"you clicked notification", Toast.LENGTH_SHORT).show()
        }

       /* tv_toolbartitle.setOnClickListener(){
            tv_toolbartitle.setText("Dashboard1")
        }*/

        //Toolbar Part Complete

        }
    }
