package com.example.pesenkuy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListOrderAdapter(private val listOrder: ArrayList<Order>) :
    RecyclerView.Adapter<ListOrderAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_order_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_order_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_order_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_order, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val order = listOrder[position]

        Glide.with(holder.itemView.context)
            .load(order.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = order.name
        holder.tvDetail.text = order.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listOrder[holder.absoluteAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listOrder.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Order)
    }
}