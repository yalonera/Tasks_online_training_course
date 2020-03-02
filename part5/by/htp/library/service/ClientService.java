package by.htp.library.service;

import by.htp.library.bean.NewUserInfo;

public interface ClientService {
    boolean authorization(String login, String password) throws ServiceException;

    boolean registration(NewUserInfo newUser) throws ServiceException;
}
