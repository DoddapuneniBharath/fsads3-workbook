package com.example.librarydemo.controller;

import com.example.librarydemo.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {

    List<Book> books = new ArrayList<>();

    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library System";
    }

    
    @GetMapping("/count")
    public int count() {
        return 50;
    }

   
    @GetMapping("/price")
    public double price() {
        return 499.99;
    }

   
    @GetMapping("/books")
    public List<String> getBooks() {

        List<String> bookTitles = new ArrayList<>();

        bookTitles.add("Java Programming");
        bookTitles.add("Spring Boot Guide");
        bookTitles.add("Data Structures");
        bookTitles.add("Algorithms");

        return bookTitles;
    }

   
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book ID: " + id;
    }

    
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book with title: " + title;
    }

    
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by author: " + name;
    }

    
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {

        books.add(book);

        return "Book added successfully";
    }

    
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {

        return books;
    }
}