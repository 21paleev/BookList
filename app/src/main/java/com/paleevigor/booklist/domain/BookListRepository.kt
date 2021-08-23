package com.paleevigor.booklist.domain

import androidx.lifecycle.LiveData

interface BookListRepository {
    fun addBookItem(bookItem: BookItem)

    fun deleteBookItem(bookItem: BookItem)

    fun editBookItem(bookItem: BookItem)

    fun getBookItem(bookItemId: Int): BookItem

    fun getBookList(): LiveData<List<BookItem>>
}