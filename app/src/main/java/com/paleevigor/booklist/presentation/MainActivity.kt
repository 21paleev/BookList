package com.paleevigor.booklist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.paleevigor.booklist.R
import com.paleevigor.booklist.domain.BookItem


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var llBookList: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llBookList = findViewById(R.id.ll_book_list)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //подписываемся на объект bookList
        viewModel.bookList.observe(this) {
            showList(it)
        }
    }
    private fun showList(list: List<BookItem>) {
        llBookList.removeAllViews()
        //для каждого элемента списка
        for (bookItem in list) {
           // выбираем соответствующий макет
            val layoutId = if (bookItem.enabled) {
                R.layout.item_shop_enabled
            } else {
                R.layout.item_shop_disabled
            }
            // делаем вью из макета
            val view = LayoutInflater.from(this).inflate(layoutId, llBookList, false)
            // находим и заполняем данные каждого элемента
            val tvName = view.findViewById<TextView>(R.id.tv_name)
            val tvCount = view.findViewById<TextView>(R.id.tv_count)
            tvName.text = bookItem.name
            tvCount.text = bookItem.count.toString()
            //устанавливаем слушатель долгого нажатия для смены свойства
            view.setOnLongClickListener {
                viewModel.changeEnableState(bookItem)
                true
            }
            // добавляем вью элемента в LL
            llBookList.addView(view)
        }
    }
}