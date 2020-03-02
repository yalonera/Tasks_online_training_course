package by.htp.library.service.impl;

import by.htp.library.bean.NewUserInfo;
import by.htp.library.dao.ClientDao;
import by.htp.library.dao.DAOException;
import by.htp.library.dao.DAOProvider;
import by.htp.library.dao.impl.FileClientDao;
import by.htp.library.service.ClientService;
import by.htp.library.service.ServiceException;
import by.htp.library.service.util.Validator;

public class ClientServiceImpl implements ClientService {
    @Override
    public boolean authorization(String login, String password) throws ServiceException {
        if (!Validator.isCredentialValid(login, password)) {
            throw new ServiceException("Не правильный логин и пароль");
        }


        DAOProvider provider = DAOProvider.getInstance();
        ClientDao clientDao = provider.getClientDao();
        boolean result;
        try {
            result = clientDao.authorization(login, password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return result;
    }

    @Override
    public boolean registration(NewUserInfo newUser) {
        return false;
    }
}
