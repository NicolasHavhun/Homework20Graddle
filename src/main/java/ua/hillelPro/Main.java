package ua.hillelPro;

import lombok.*;
import ua.hillelPro.entity.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user = new User();
        user.setName("Nico");
        System.out.println(user.getName());
    }
}