package com.echo.service.impl;

import com.echo.dao.BookMapper;
import com.echo.pojo.Books;
import com.echo.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books findBookById(int id) {
        return bookMapper.findBookById(id);
    }

    public List<Books> findAllBooks() {
        return bookMapper.findAllBooks();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
