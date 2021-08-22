package com.paleevigor.booklist.domain

class AddBookItemUseCase (private val bookListRepository: BookListRepository){
    fun addBookItem(bookItem: BookItem) {
        bookListRepository.addBookItem(bookItem)
    }
}