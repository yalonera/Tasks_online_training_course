package by.htp.library.controller;

import by.htp.library.service.ClientService;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceProvider;

public class Controller {
    public String doAction(String request) {
        String commandName;
        commandName = request.split(" ")[0];
        String response;
        switch (commandName) {
            case "authorization":
                response = doAuthorization(request);
                break;
            case "registration":
                response = "";
                break;
            default:
                response = "no command";
        }
        return response;
    }

    public String doAuthorization(String request) {
        String[] params;
        params = request.split(" ");

        String login;
        String password;

        login = params[1].split("=")[1];
        password = params[2].split("=")[1];

        ServiceProvider provider = new ServiceProvider().getInstance();
        ClientService clientService = provider.getClientService();
        String response;
        try {
            boolean result;
            result = clientService.authorization(login, password);
            if (result) {
                response = "OK";
            } else {
                response = "Not Ok";
            }
        } catch (ServiceException e) {
            System.err.println(e);
            response = "error";
        }
        return response;

    }
}
