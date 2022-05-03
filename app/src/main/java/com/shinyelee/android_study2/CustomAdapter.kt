package com.shinyelee.android_study2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Data(val profile: Int, val name: String)

// 매개변수 v : View
// 상속 RecyclerView.ViewHolder(v)
class CustomViewHolder(v : View) : RecyclerView.ViewHolder(v) {}

class CustomAdapter(val DataList:ArrayList<Data>) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val cellForRow = LayoutInflater.from(parent.context).inflate(R.layout.custom_list, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

    }

    override fun getItemCount() = DataList.size
}