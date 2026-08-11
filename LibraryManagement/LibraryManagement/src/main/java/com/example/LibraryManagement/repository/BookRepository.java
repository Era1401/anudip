package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>();
    private Integer nextId = 3;

    public BookRepository(){
        books.add(
                new Book(1, "Java Basics", "James Gosling", 500));
        books.add(
                new Book(2, "Spring Boot", "John", 700));
    }

    public List<Book> findAll(){
        return books;
    }

    //Find the data by id
    public Book getBookById(int id){
        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    //Post Mapping: Add the data
    public Book save(Book book){
        book.setId(nextId++);
        books.add(book);
        return book;

    }

    //Put Mapping: Update the Data
    public Book update(Integer id, Book updateBook){
        for(Book book : books){
            if(book.getId() == id ){
                book.setTitle(updateBook.getTitle());
                book.setAuthor(updateBook.getAuthor());
                book.setPrice(updateBook.getPrice());
                return book;
            }
        }
        return null;
    }

    //Delete Mapping: Delete the data
    public boolean deleteById(Integer id){
        for(Book book: books){
            if(book.getId() == id){
                books.remove(book);
                return true;
            }
        }
        return false;
    }

}
