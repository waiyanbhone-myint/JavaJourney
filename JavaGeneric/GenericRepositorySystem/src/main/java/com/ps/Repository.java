package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Repository <T>{

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll(){
        return items;
    }

    public T get(int index){
        return items.get(index);
    }

    public boolean remove(T item){
        return items.remove(item);
    }

    public boolean contain(T item){
        return items.contains(item);
    }
}
