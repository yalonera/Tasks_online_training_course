package by.htp.library.bean;

import java.util.Objects;

public class NewUserInfo {
    private String name;
    private String surname;
    private String login;
    private String password;

    public NewUserInfo(String name, String surname, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewUserInfo that = (NewUserInfo) o;
        return surname.equals(that.surname) &&
                login.equals(that.login) &&
                password.equals(that.password) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, login, password, name);
    }

}
