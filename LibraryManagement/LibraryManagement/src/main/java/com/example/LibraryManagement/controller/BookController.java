package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;

    }

    @GetMapping()
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        Book book = bookService.getBookById(id);

        if(book==null){

            return ResponseEntity.noContent().build();

        }

        return ResponseEntity.ok(book);
    }

    @GetMapping("/books/search")
    public String searchBook(@RequestParam String title){
        return "Searching for: " + title;     //books/search?title=Java
    }

    @PostMapping()
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book savedbook = bookService.addBook(book);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedbook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book){
        Book updatedBook = bookService.updateBook(id, book);
        if(updatedBook == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(updatedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id){
        boolean deleted =  bookService.deleteBook(id);
        if(!deleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Book Deleted Successfully");

    }

}
