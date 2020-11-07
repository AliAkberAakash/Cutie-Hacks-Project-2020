package com.aliakberaakash.cutiehacksproject2020.ui.features.feed;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aliakberaakash.cutiehacksproject2020.R;
import com.aliakberaakash.cutiehacksproject2020.model.Cat

class CatAdapter(
        private val listCat: ArrayList<Cat>
) : RecyclerView.Adapter<CatAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cats, parent, false)
        return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.catId.text = listCat[position].id
        holder.catName.text = listCat[position].name
        holder.catDesc.text = listCat[position].description
        }

        override fun getItemCount(): Int = listCat.size

class ViewHolder(itemsView: View): RecyclerView.ViewHolder(itemsView) {
        val catId: TextView = itemsView.findViewById(R.id.catId)
        val catName: TextView = itemsView.findViewById(R.id.catName)
        val catDesc: TextView = itemsView.findViewById(R.id.catDescription)
        }
        }
