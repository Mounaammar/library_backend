package com.library.books.dao;

import com.library.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book, Integer> {
}
