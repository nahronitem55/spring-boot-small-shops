package com.business.springbootsmallshops.repository;

import com.business.springbootsmallshops.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
