package model;

public class User {
    private String login;
    private String password;
    private boolean isAdmin;
    private int year;

    public User(){}


    public User(String login, String password, boolean isAdmin, int year) {
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.year = year;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", year=" + year +
                '}';
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
