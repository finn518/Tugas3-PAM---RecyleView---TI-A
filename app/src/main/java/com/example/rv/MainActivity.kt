package com.example.rv


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv1:RecyclerView = findViewById(R.id.rv1)
        val TAG: String

        val data: ArrayList<Mahasiswa> = getData()
        val adapter = MahasiswaAdapter(this,data)
        rv1.adapter = adapter
        rv1.layoutManager = LinearLayoutManager(this)
    }

    fun getData():ArrayList<Mahasiswa> {
        val data = ArrayList<Mahasiswa>()
        val nim: List<String> = resources.getStringArray(R.array.nim).toList()
        val nama: List<String> = resources.getStringArray(R.array.nama).toList()
        for (i in nim.indices){
            val mhs = Mahasiswa()
            mhs.nim = nim[i]
            mhs.nama= nama[i]
            data.add(mhs)
        }
        return data
    }

}