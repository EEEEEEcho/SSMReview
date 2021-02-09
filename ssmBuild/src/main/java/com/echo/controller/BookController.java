package com.echo.controller;

import com.echo.pojo.Books;
import com.echo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String queryAllBooks(Model model){
        List<Books> allBooks = bookService.findAllBooks();
        model.addAttribute("books",allBooks);
        return "allBook";
    }
}
