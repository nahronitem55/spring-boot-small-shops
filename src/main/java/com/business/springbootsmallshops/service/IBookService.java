package com.business.springbootsmallshops.service;

import com.business.springbootsmallshops.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
