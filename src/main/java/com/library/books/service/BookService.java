package com.library.books.service;

import com.library.books.dao.AuthorRepository;
import com.library.books.dao.Bookrepository;
import com.library.books.entity.Author;
import com.library.books.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    Bookrepository bookrepository ;
    @Autowired
    AuthorRepository authorRepository;

    public BookService(Bookrepository bookrepository, AuthorRepository authorRepository) {
        this.bookrepository = bookrepository;
        this.authorRepository = authorRepository;
    }

    /**********************AUTHOR ***************************************************/
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
    public List<Author> createAuthors(List<Author> authors){
        return authorRepository.saveAll(authors);
    }

    /************************BOOK*****************************************************/

    public Book createBook(Book book){
      return  bookrepository.save(book);
    }
    public List<Book> createBooks (List<Book> books){
        return bookrepository.saveAll(books);
    }
    public Book getBookbyId(int id){
        return bookrepository.findById(id).orElse(null);
    }
    public List<Book> getAllBooks(){
        return bookrepository.findAll();
    }

    public Book updateBook(Book book){
        Optional<Book> optionalBook=bookrepository.findById(book.getId());
        if (optionalBook.isPresent()){
            Book oldBook=optionalBook.get();
            oldBook.setAuthor(book.getAuthor());
            oldBook.setCover(book.getCover());
            oldBook.setDescription(book.getDescription());
            bookrepository.save(oldBook);
            return oldBook;
        }else{
            return new Book();
        }
    }

    public String deleteBook(int idBook){
        bookrepository.deleteById(idBook);
        return "Book got deleted";
    }
}
