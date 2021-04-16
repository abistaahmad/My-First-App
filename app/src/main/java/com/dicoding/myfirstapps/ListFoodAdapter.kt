package com.dicoding.myfirstapps

import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter (private val listFood: ArrayList<Food> ) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_food, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
                .load(food.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val foodDetailActivity = Intent(context, FoodDetail::class.java)
            foodDetailActivity.putExtra(FoodDetail.DATA_NAMA, food.name)
            foodDetailActivity.putExtra(FoodDetail.DATA_DETAIL, food.detail)
            foodDetailActivity.putExtra(FoodDetail.DATA_PHOTO, food.photo)
            context.startActivity(foodDetailActivity)

            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition])
        }
    }

        override fun getItemCount(): Int {
            return listFood.size
        }

    }


