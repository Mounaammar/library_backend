package com.library.books.controller;

import com.library.books.entity.Author;
import com.library.books.entity.Book;
import com.library.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    /*******************************For author*********************************************/
@PostMapping("/authors")
public List<Author> addAuthor(@RequestBody List<Author> authors){
 return bookService.createAuthors(authors);
}
@GetMapping("/authors")
public List<Author> getAllAuthor(){
    return bookService.getAllAuthors();
}

    /*******************************For book*********************************************/

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookbyId(id);
    }
    @GetMapping("/books")
        public List<Book> getAllBooks() {
            return bookService.getAllBooks();
        }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
    @PostMapping("/books")
    public List<Book> createBooks(@RequestBody List<Book> books){
        return bookService.createBooks(books);
    }
    @PutMapping("/book")
        public Book updateBook(@RequestBody Book book){
            return bookService.updateBook(book);
        }
    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }

}
