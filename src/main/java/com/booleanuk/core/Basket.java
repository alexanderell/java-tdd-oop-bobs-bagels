package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final int capacity;
    private List<Bagel> items = new ArrayList<>();

    public Basket(){
        this(5);
    }

    public Basket(int capacity) {

        this.capacity = capacity;
    }


    public int numberOfItems() {
        return items.size();
    }

    public String add(Bagel item) {
        if(numberOfItems() >= capacity){
            return "";
        }
        items.add(item);
        return "";
    }

    public void remove(Bagel item) {
        items.remove(item);
    }


    public int capacity() {
        return capacity;
    }

    public int spaceLeft() {
        return capacity - numberOfItems();
    }
}
