package com.paleevigor.booklist.domain

class GetBookListUseCase (private val bookListRepository: BookListRepository){
    fun getBookList(): List<BookItem> {
        return bookListRepository.getBookList()
    }
}