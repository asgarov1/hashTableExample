package com.asgarov;

import java.util.Objects;

public class Data {
    private final String name;
    private int number;

    public Data(String name) {
        this.name = name;
    }

    public Data(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Data data = (Data) obj;
        return Objects.equals(name, data.getName());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        int primeNumber = 31;

        char[] nameArray = name.toCharArray();
        for(char c : nameArray) {
            hash = hash * primeNumber + c;
        }
        return Math.abs(hash);
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
