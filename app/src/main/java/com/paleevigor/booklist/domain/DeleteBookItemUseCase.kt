package com.paleevigor.booklist.domain

class DeleteBookItemUseCase (private val bookListRepository: BookListRepository){
    fun deleteBookItem(bookItem: BookItem) {
        bookListRepository.deleteBookItem(bookItem)
    }
}