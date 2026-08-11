package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;

    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRepository.getBookById(id);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Integer id, Book book){
        return bookRepository.update(id, book);
    }

    public boolean deleteBook(Integer id){
        return bookRepository.deleteById(id);
    }


}
