package com.example.mukul.demoabc

import android.content.Context
import android.graphics.Color
import android.media.MediaPlayer
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.element.view.*
import java.util.*


/**
 * Created by mukul on 1/31/18.
 */

class Adaptor(private val items: ArrayList<Data>, private val context:Context) : RecyclerView.Adapter<Adaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.element, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.text.text = items.get(position).text
        holder.itemView.imageForground.setBackgroundColor(getMatColor("500"))
        holder.itemView.define.text = items.get(position).define
        holder.itemView.setOnClickListener{
            MediaPlayer.create(context,items.get(position).uri).start()
            Log.e("Playing Music","OK")
        }
        if (items.get(position).imageUri.equals("")){}
        else{
        Picasso.with(context).load(items.get(position).imageUri).into(holder.itemView.textimage)}

    }

    private fun getMatColor(typeColor: String): Int {
        var returnColor = Color.BLACK
        val arrayId = context.getResources().getIdentifier("mdcolor_" + typeColor, "array",context.getApplicationContext().getPackageName())

        if (arrayId != 0) {
            val colors = context.getResources().obtainTypedArray(arrayId)
            val index = (Math.random() * colors.length()).toInt()
            returnColor = colors.getColor(index, Color.BLACK)
            colors.recycle()
        }
        return returnColor
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}