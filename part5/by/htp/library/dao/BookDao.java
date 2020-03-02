package by.htp.library.dao;

import by.htp.library.bean.Book;

import java.util.List;

public interface BookDao {
    boolean add(Book book);

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

    List<Book> findByGenre(String genre);
}
