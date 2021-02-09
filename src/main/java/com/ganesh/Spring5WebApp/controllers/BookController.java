package com.ganesh.Spring5WebApp.controllers;

import com.ganesh.Spring5WebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Configure it as a Spring MVC controller
// Managed by Spring Framework
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /* MVC Design Pattern
    * Client -> Map Url to Controller method -> Controller -> Make a model with Data -> Return Model
    * -> Convert Model to View -> Return View*/
    // map this method to a specific URL
    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
