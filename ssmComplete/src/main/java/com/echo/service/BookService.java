package com.echo.service;


import com.echo.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    public int addBook(Books books);

    public int deleteBook(int id);

    public int updateBook(Books books);

    public Books findBookById(int id);

    public List<Books> findAllBooks();

    public Books queryBookByName(String bookName);
}
