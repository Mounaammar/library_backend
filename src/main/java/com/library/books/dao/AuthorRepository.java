package com.library.books.dao;

import com.library.books.entity.Author;
import com.library.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
