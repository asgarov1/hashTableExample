package com.asgarov;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(100);

        Data data = new Data("apple", 1);
        Data data2 = new Data("pear", 2);

        hashTable.placeData(data);
        hashTable.placeData(data2);

        System.out.println(hashTable.findData("apple"));

        if(hashTable.findData("abracadabra") == null) {
            System.out.println("It is a null!");
        }

    }
}
