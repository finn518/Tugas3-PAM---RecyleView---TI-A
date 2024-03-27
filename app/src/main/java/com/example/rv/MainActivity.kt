package com.example.rv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val data: ArrayList<Mahasiswa> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv1: RecyclerView = findViewById(R.id.rv1)


        data.addAll(getData())

        val btn1: Button = findViewById(R.id.bt1)
        val adapter = MahasiswaAdapter(this, data)
        rv1.adapter = adapter
        rv1.layoutManager = LinearLayoutManager(this)

        btn1.setOnClickListener {
            addData()
            adapter.notifyDataSetChanged()
        }
    }

    private fun getData(): List<Mahasiswa> {
        val data = ArrayList<Mahasiswa>()
        val nimArray: Array<String> = resources.getStringArray(R.array.nim)
        val namaArray: Array<String> = resources.getStringArray(R.array.nama)
        for (i in nimArray.indices) {
            val mhs = Mahasiswa()
            mhs.nim = nimArray[i]
            mhs.nama = namaArray[i]
            data.add(mhs)
        }
        return data
    }

    private fun addData() {
        val et1: EditText = findViewById(R.id.etNim)
        val et2: EditText = findViewById(R.id.editTextTextPersonName2)

        val nimInput = et1.text.toString()
        val namaInput = et2.text.toString()

        if (nimInput.isNotEmpty() && namaInput.isNotEmpty()) {
            val mhs = Mahasiswa()
            mhs.nim = nimInput
            mhs.nama = namaInput
            data.add(mhs)

            et1.text.clear()
            et2.text.clear()
        } else{
            Toast.makeText(this,"Tidak boleh kosong", Toast.LENGTH_SHORT).show()
        }
    }
}
