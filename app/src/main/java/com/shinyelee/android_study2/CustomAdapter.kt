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

class CustomAdapter(val context: Context) : RecyclerView.Adapter<CustomViewHolder>() {

    val DataList = arrayListOf(
        Data(R.drawable.paw, "1번"),
        Data(R.drawable.paw, "2번"),
        Data(R.drawable.paw, "3번"),
        Data(R.drawable.paw, "4번"),
        Data(R.drawable.paw, "5번"),
        Data(R.drawable.paw, "6번"),
        Data(R.drawable.paw, "7번"),
        Data(R.drawable.paw, "8번"),
        Data(R.drawable.paw, "9번"),
        Data(R.drawable.paw, "10번"),
        Data(R.drawable.paw, "11번"),
        Data(R.drawable.paw, "12번"),
        Data(R.drawable.paw, "13번"),
        Data(R.drawable.paw, "14번"),
        Data(R.drawable.paw, "15번"),
        Data(R.drawable.paw, "16번"),
        Data(R.drawable.paw, "17번"),
        Data(R.drawable.paw, "18번"),
        Data(R.drawable.paw, "19번"),
        Data(R.drawable.paw, "20번")
    )

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