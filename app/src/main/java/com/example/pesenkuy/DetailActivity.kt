package com.example.pesenkuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val item = intent.getParcelableExtra<Order>("ORDER")
        supportActionBar?.title = "Order " + item?.name.toString()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvOrderName: TextView = findViewById(R.id.tv_order_detailName)
        val tvOrderDetail: TextView = findViewById(R.id.tv_order_detailDetail)
        val imgOrderPhoto: ImageView = findViewById(R.id.iv_order_detailPhoto)
        val tvPrice: TextView = findViewById(R.id.tv_price)
        val tvTag: TextView = findViewById(R.id.tv_tag)
        val tvCalorie: TextView = findViewById(R.id.tv_calorie)
        val btnBuy: Button = findViewById(R.id.btn_buy)
        val btnShare: Button = findViewById(R.id.btn_share)

        tvOrderName.text = item?.name
        tvOrderDetail.text = item?.detail
        item?.photo?.let { imgOrderPhoto.setImageResource(it) }
        val price = "Rp" + item?.price.toString()
        tvPrice.text = price
        tvTag.text = item?.tag
        tvCalorie.text = item?.calorie

        btnBuy.setOnClickListener {
            Toast.makeText(this, "Anda membeli " + item?.name, Toast.LENGTH_SHORT).show()
        }
        btnShare.setOnClickListener {
            Toast.makeText(this, "Berhasil membagikan " + item?.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}