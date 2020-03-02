package by.htp.library.dao;

import by.htp.library.dao.impl.FileBookDao;
import by.htp.library.dao.impl.FileClientDao;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    public static DAOProvider getInstance() {
        return instance;
    }

    private DAOProvider() {
    }

    private ClientDao clientDao = new FileClientDao();
    private BookDao bookDao = new FileBookDao();

    public ClientDao getClientDao() {
        return clientDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }
}
