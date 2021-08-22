package com.paleevigor.booklist.domain

interface BookListRepository {
    fun addBookItem(bookItem: BookItem)

    fun deleteBookItem(bookItem: BookItem)

    fun editBookItem(bookItem: BookItem)

    fun getBookItem(bookItemId: Int): BookItem

    fun getBookList(): List<BookItem>
}