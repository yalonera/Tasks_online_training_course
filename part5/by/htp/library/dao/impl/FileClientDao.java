package by.htp.library.dao.impl;

import by.htp.library.bean.NewUserInfo;
import by.htp.library.dao.ClientDao;
import by.htp.library.dao.DAOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileClientDao implements ClientDao {

    private static final String USERS_SOURCE = "resources/users.txt";

    @Override
    public boolean authorization(String login, String password) throws DAOException {

        FileReader reader;
        try {
            reader = new FileReader(USERS_SOURCE);
        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } finally {
            // close
        }

        return true;
    }

    @Override
    public boolean registration(NewUserInfo newUser) {
        return false;
    }
}
