package com.ps;

public class GenericMethodDemo {

    public static void main(String[] args) {

        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);

        Integer[] integersArray = {1, 2, 3};
        printArray(integersArray);

    }

    public static <T> void printArray(T[] array){

        for(T element:array){
            System.out.println(element);
        }
    }
}
