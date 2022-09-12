package com.example.pesenkuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvOrders: RecyclerView
    private var list: ArrayList<Order> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvOrders = findViewById(R.id.rv_order)
        rvOrders.setHasFixedSize(true)

        list.addAll(OrderData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvOrders.layoutManager = LinearLayoutManager(this)
        val listOrderAdapter = ListOrderAdapter(list)
        rvOrders.adapter = listOrderAdapter

        listOrderAdapter.setOnItemClickCallback(object : ListOrderAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Order) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("ORDER", data)
                startActivity(intent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        selectedActionIcon(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun selectedActionIcon(selectedIcon: Int) {
        when(selectedIcon) {
            R.id.action_about_page -> {
                intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}