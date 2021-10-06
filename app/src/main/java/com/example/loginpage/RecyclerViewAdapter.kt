package com.example.loginpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_list.view.*


class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val title = arrayOf("Deep Dave","Mufadlal Makda","Murtuza Sugarwala","Nikunj Rakholiya","Aditi Gupta","Mahesh Gadia")
    private val description = arrayOf("Ahmedabad,India","Junagadh,India","Ahmedabad,India","Ahmedabad,India","Junagadh,India","Ahmedabad,India")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.custom_list,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.itemView.title.text = title[position]
        holder.itemView.description.text = description[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        init
        {
            itemView.setOnClickListener {
                Toast.makeText( itemView.context,itemView.title.text, Toast.LENGTH_SHORT).show()
            }
        }
    }


}


