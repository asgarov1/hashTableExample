package com.asgarov;

public class HashTable {
    private final Data[] table;

    public HashTable(int tableSize) {
        this.table = new Data[tableSize];
    }

    public void placeData(Data data) {
        int index = data.hashCode() % table.length;

        int number = 0;
        while (table[index] != null) {
            index = (data.hashCode() + (++number * number)) % table.length;

            if (number > 100) {
                throw new RuntimeException("No space in hashtable left");
            }
        }

        table[index] = data;
    }

    public Data findData(String value) {
        return findData(new Data(value));
    }

    public Data findData(Data data) {
        int index = data.hashCode() % table.length;

        int number = 0;
        while (table[index] != null && !table[index].equals(data)) {
            index = (data.hashCode() + (++number * number)) % table.length;
        }

        return table[index];
    }
}
