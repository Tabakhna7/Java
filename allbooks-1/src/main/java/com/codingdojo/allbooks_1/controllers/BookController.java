package com.codingdojo.allbooks_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.allbooks_1.models.Book;
import com.codingdojo.allbooks_1.services.BookService;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        if (book != null) {
            model.addAttribute("book", book);
            return "/index.jsp";
        } else {
            return "redirect:/books";
        }
    }
}
