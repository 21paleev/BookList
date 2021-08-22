package com.paleevigor.booklist.domain

class GetBookItemUseCase (private val bookListRepository: BookListRepository){
    fun getBookItem(bookItemId: Int): BookItem {
        return bookListRepository.getBookItem(bookItemId)
    }
}