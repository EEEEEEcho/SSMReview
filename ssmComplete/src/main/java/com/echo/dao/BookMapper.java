package com.echo.dao;

import com.echo.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    public int addBook(Books books);

    public int deleteBook(@Param("bookID") int id);

    public int updateBook(Books books);

    public Books findBookById(int id);

    public List<Books> findAllBooks();

    public Books queryBookByName(@Param("bookName") String bookName);
}
