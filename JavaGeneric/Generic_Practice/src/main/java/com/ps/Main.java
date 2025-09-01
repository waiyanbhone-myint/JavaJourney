package com.ps;

public class Main {
    public static void main(String[] args) {

//        Pair pair = new Pair("Hello", 42);
//        pair.setFirst(23);
//
//        GenericPair<String> genericPair = new GenericPair<>("Hello");
//        genericPair.setValue("Hola");
//        System.out.println(genericPair.getValue());

        GenericPair<String> genericPair = new GenericPair<>("Hello");
        genericPair.setValue("Hello");
        printFirstNum(genericPair);

        GenericPair<Integer> genericPairInt = new GenericPair<>(32);
        genericPairInt.setValue(21);
        printFirstNum(genericPairInt);

    }

    public static <T> void printFirstNum(GenericPair<T> num){
        T value = num.getValue();
        System.out.println(value);
    }


}