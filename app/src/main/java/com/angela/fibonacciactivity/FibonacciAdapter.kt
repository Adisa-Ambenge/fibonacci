package com.angela.fibonacciactivity


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciAdapter(private val fibonacciList: List<Long>) :
    RecyclerView.Adapter<FibonacciAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fibonacci, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fibonacciNumber = fibonacciList[position]
        holder.numberTextView.text = fibonacciNumber.toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTextView: TextView = itemView.findViewById(R.id.numberTextView)
    }
}
