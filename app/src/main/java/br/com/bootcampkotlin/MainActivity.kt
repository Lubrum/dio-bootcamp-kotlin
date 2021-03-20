package br.com.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu_1 -> {
                showToast("Exibindo item menu 1")
                return true
            }
            R.id.item_menu_2 -> {
                showToast("Exibindo item menu 2")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
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

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}