package by.htp.library.service;

import by.htp.library.bean.Book;

public interface BookService {
    boolean add(Book book) throws ServiceException;

}
