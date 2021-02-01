package com.example.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ZodiacAdapter(private  val sign: List<Zodiac>)
    : RecyclerView.Adapter<ZodiacAdapter.SignViewHolder>() {

    class SignViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.SignName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SignViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.zodiac_item, parent, false)
        return SignViewHolder(view)
    }

    override fun onBindViewHolder(holder: SignViewHolder, position: Int) {

        val s = sign[position]
        val currentUrl: String = s.url
        val sName: String = s.name

        holder.textView.text = sName




        Glide.with(holder.imageView.context)
            .load(currentUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(holder.imageView)

    }

    override fun getItemCount(): Int = sign.size

}