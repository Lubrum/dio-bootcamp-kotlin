package br.com.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateList()
        bindViews()
    }

    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList() {

        adapter.updateList(
            arrayListOf(
                Contact(
                    "Edson Shideki Kokado",
                    "(99) 99999-9999",
                    "img.png"
                ),
                Contact(
                    "Edson Shideki Kokado",
                    "(99) 99999-9999",
                    "img.png"
                )
            )
        )
    }
}