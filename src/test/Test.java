package test;

import Service.UserService;
import model.User;

public class Test {

    public static void main(String[] args) {
        User user = new User("login","password",true,2021);
        UserService.serializeToXML(user);

        User user2 = UserService.deserializeFromXML();
        System.out.println(user2);
    }
}
