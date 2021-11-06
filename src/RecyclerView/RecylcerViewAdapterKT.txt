package com.example.leaverandroidapppoc

import android.content.ClipData
import android.content.Context
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class EditingAdapter(var context: Context, var al: ArrayList<Report>) : RecyclerView.Adapter<EditingAdapter.EditHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EditHolder {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.row, parent, false)
        return EditHolder(view)
    }

    override fun onBindViewHolder(holder: EditHolder, position: Int) {
        val i: Report = al[position]
        //set the values of the text
    }

    override fun getItemCount(): Int {
        return al.size
    }

    inner class EditHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var reportName: TextView


        init {

            reportName = itemView.findViewById(R.id.reportname)


        }
    }


}

