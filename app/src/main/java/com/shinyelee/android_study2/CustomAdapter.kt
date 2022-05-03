package com.shinyelee.android_study2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Data(val profile: Int, val name: String)

// 매개변수 v : View
// 상속 RecyclerView.ViewHolder(v)
class CustomViewHolder(v : View) : RecyclerView.ViewHolder(v) {
    // 여기서 에러 발생
    val profile = v.iv_custom
    val name = v.tv_custom
}

class CustomAdapter(val DataList:ArrayList<Data>, val context: Context) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val cellForRow = LayoutInflater.from(context).inflate(R.layout.custom_list, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val curData = DataList[position]
        holder.profile.setImageResource(curData.profile)
        holder.name.text = curData.name

        holder.itemView.setOnClickListener {
            Toast.makeText(context, curData.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = DataList.size
}