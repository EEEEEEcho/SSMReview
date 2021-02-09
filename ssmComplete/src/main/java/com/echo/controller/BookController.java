package com.echo.controller;

import com.echo.pojo.Books;
import com.echo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
    //跳到新增页面
    @RequestMapping("/addBook")
    public String addBook(Books books){
        return "addBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(Books books){
        System.out.println("ADD book");
        bookService.addBook(books);
        //重定向请求
        return "redirect:/book/allBook";
    }
    //跳到修改页面
    @RequestMapping("/updateBook/{bookID}")
    public String updateBook(@PathVariable int bookID,Model model){
        System.out.println(bookID);
        Books bookById = bookService.findBookById(bookID);
        model.addAttribute("Qbook",bookById);
        return "updateBook";
    }
    //实现修改功能
    @RequestMapping("/doUpdateBook")
    public String doUpdateBook(Books books){
        System.out.println(books);
        int i = bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    //实现删除功能
    @RequestMapping("/deleteBook/{bookID}")
    public String doDeleteBook(@PathVariable int bookID){
        bookService.deleteBook(bookID);
        return "redirect:/book/allBook";
    }

    //书籍查询功能
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName,Model model){
        Books books = bookService.queryBookByName(bookName);
        System.out.println(books);
        List<Books> booksList = new ArrayList<Books>();
        if(books == null){
            booksList = bookService.findAllBooks();
            model.addAttribute("error","无信息");
        }
        else {
            booksList.add(books);
        }
        model.addAttribute("books",booksList);
        return "allBook";
    }
}
