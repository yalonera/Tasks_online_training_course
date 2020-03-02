package by.htp.library.dao.impl;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

import java.util.List;

public class FileBookDao implements BookDao {
    @Override
    public boolean add(Book book) {
        return false;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByGenre(String genre) {
        return null;
    }
}






