package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository<String> stringRepository = new Repository<>();
        stringRepository.add("Alice");
        stringRepository.add("Bob");
        System.out.println("String Repository: " + stringRepository.getAll());

        Repository<Integer> integerRepository = new Repository<>();
        integerRepository.add(5);
        integerRepository.add(10);
        System.out.println("Integer Repository: " + integerRepository.getAll());

        System.out.println("Value is: " + stringRepository.contain("Alice"));
        System.out.println("Value is: " + integerRepository.contain(8));

        Repository<User> userRepository = new Repository<>();
        userRepository.add(new User("William", 23));
        userRepository.add(new User("Myint", 22));

        System.out.println(userRepository.getAll());

    }
}