package com.ps;

public class Main {
    public static void main(String[] args) {

        Pair stringIntPair = new Pair("Hello", 42);
        String myString = (String) stringIntPair.getFirst();
        int myInt = (Integer) stringIntPair.getSecond();
        System.out.println(myString);
        System.out.println(myInt);

    }
}