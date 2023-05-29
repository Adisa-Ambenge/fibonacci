package com.angela.fibonacciactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var fibonacciRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fibonacciRecyclerView = findViewById(R.id.fibonacciRecyclerView)
        fibonacciRecyclerView.layoutManager = LinearLayoutManager(this)

        val fibonacciList = generateFibonacci(100)
        val adapter = FibonacciAdapter(fibonacciList)
        fibonacciRecyclerView.adapter = adapter
    }

    private fun generateFibonacci(n: Int): List<Long> {
        val fibonacciSequence = mutableListOf<Long>()

        var a = 0L
        var b = 1L

        for (i in 0 until n) {
            fibonacciSequence.add(a)
            val sum = a + b
            a = b
            b = sum
        }

        return fibonacciSequence
    }
}
