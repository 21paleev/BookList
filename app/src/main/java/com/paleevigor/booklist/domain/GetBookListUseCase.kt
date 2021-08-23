package com.paleevigor.booklist.domain

import androidx.lifecycle.LiveData

class GetBookListUseCase (private val bookListRepository: BookListRepository){
    fun getBookList(): LiveData<List<BookItem>> {
        return bookListRepository.getBookList()
    }
}