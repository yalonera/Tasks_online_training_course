package by.htp.library.service;

import by.htp.library.service.impl.BookServiceImpl;
import by.htp.library.service.impl.ClientServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    public ServiceProvider getInstance() {
        return instance;
    }

    public ServiceProvider() {
    }

    private ClientService clientService = new ClientServiceImpl();
    private BookService bookService = new BookServiceImpl();

    public ClientService getClientService() {
        return clientService;
    }

    public BookService getBookService() {
        return bookService;
    }
}
