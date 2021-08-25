package com.paleevigor.booklist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.paleevigor.booklist.R
import com.paleevigor.booklist.domain.BookItem


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: BookListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //подписываемся на объект bookList
        viewModel.bookList.observe(this) {
            adapter.bookList = it
        }
    }

    // метод установки RV
    private fun setupRecyclerView() {
        val rvBookList = findViewById<RecyclerView>(R.id.rv_book_list)
        adapter = BookListAdapter()
        rvBookList.adapter = adapter
    }
}