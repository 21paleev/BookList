package com.paleevigor.booklist.domain

class EditBookItemUseCase (private val bookListRepository: BookListRepository){
    fun editBookItem(bookItem: BookItem) {
        bookListRepository.editBookItem(bookItem)
    }
}