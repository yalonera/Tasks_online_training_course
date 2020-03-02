package by.htp.library.main;

import by.htp.library.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        String request = "authorization login = aaa password = bbb";
        String response;
        response = controller.doAuthorization(request);
        System.out.println(response);
    }
}
