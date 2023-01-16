package kr.co.rv_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("main", "[create]")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = mutableListOf<String>()

        items.add("a")
        items.add("b")
        items.add("c")

        val rv = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RvAdapter(items)

        rv.adapter  = rvAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }

    override fun onStart() {
        Log.d("main", "[start]")
        super.onStart()
    }

    override fun onResume() {
        Log.d("main", "[resume]")
        super.onResume()
    }

    override fun onPause() {
        Log.d("main", "[pause]")
        super.onPause()
    }

    override fun onStop() {
        Log.d("main", "[stop]")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("main", "[Destroy]")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("main", "[reStart]")
        super.onRestart()
    }
}