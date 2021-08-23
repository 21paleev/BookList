package com.paleevigor.booklist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.paleevigor.booklist.R


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //подписываемся на объект bookList
        viewModel.bookList.observe(this) {
            Log.d("MainActivityTest", it.toString())
        }
        viewModel.getBookList()
    }
}