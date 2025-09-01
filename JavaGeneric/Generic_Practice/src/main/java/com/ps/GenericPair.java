package com.ps;

public class GenericPair <T>{

    private T value;

    public GenericPair(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericPair{" +
                "value=" + value +
                '}';
    }
}