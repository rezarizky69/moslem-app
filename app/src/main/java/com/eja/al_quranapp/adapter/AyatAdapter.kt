package com.eja.al_quranapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eja.al_quranapp.R
import com.eja.al_quranapp.model.ModelAyat

class AyatAdapter (private val mContext: Context, private val items : List<ModelAyat>) : RecyclerView.Adapter<AyatAdapter.ViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AyatAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_ayat, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = items[position]
        holder.tvNomorAyat.text = data.nomor
        holder.tvArabic.text = data.arab
        holder.tvTerjemahan.text = data.indo
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var tvNomorAyat : TextView
        var tvArabic : TextView
        var tvTerjemahan : TextView

        init {
            tvNomorAyat = itemView.findViewById(R.id.tvNomorAyat)
            tvArabic = itemView.findViewById(R.id.tvArabic)
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan)
        }
    }
}