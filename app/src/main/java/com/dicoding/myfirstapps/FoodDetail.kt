package com.dicoding.myfirstapps

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.myfirstapps.FoodDetail.Companion.DATA_PHOTO

class FoodDetail : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    private lateinit var imageDetailFood : ImageView
    private lateinit var textNameFood : TextView
    private lateinit var textDetailFood : TextView

    companion object {
        const val DATA_NAMA = "data_nama"
        const val DATA_DETAIL = "data_detail"
        const val DATA_PHOTO = "data_gambar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imageDetailFood= findViewById(R.id.img_detail_food)
        textNameFood= findViewById(R.id.text_name_food)
        textDetailFood= findViewById(R.id.text_detail_food)

        val nameFood = intent.getStringExtra(DATA_NAMA)
        val detailFood = intent.getStringExtra(DATA_DETAIL)
        val imageFood = intent.getIntExtra(DATA_PHOTO, 0)

        setDetailActivity(nameFood, detailFood, imageFood)

        val btnLike: Button = findViewById(R.id.btn_like)
        btnLike.setOnClickListener(this)
    }

    fun setDetailActivity(nameFood: String?, detailFood: String?, imageFood: Int) {
        Glide.with(this).asBitmap().load(imageFood).into(imageDetailFood)
        textNameFood.text = nameFood
        textDetailFood.text = detailFood
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_like -> {
                Toast.makeText(this, "Kamu menyukai ini" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}

