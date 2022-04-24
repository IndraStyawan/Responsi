package com.my.responsi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater,parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item,parent,false)) {

    private var imgview: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtSubTitle: TextView? = null

    init {
        imgview = itemView.findViewById(R.id.img)
        txtTitle = itemView.findViewById(R.id.txtTitle)
        txtSubTitle = itemView.findViewById(R.id.txtSubTitle)
    }
   fun bind(list: ListBuku){
       imgview?.setImageResource(list.imgView)
       txtTitle?.text = list.txtTitle
       txtSubTitle?.text = list.txtSubtitle
   }
}