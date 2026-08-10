package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>();
    public BookRepository(){
        books.add(
                new Book(1, "Java Basics", "James Gosling", 500));
        books.add(
                new Book(2, "Spring Boot", "John", 700));
    }

    public List<Book> findAll(){
        return books;
    }

}
