package com.example.rv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter( private val context: Context, private val data:ArrayList<Mahasiswa>): RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        var mhs: Mahasiswa = data.get(position)
        holder.tvNama.setText(mhs.nama)
        holder.tvNim.setText(mhs.nim)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.row,parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MahasiswaViewHolder(ItemView: View) :
        RecyclerView.ViewHolder(ItemView) {
        var tvNim = ItemView.findViewById<TextView>(R.id.tvNim)
        var tvNama = ItemView.findViewById<TextView>(R.id.tvNama)

    }

}