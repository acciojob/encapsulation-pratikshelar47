package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.Setter("Mr.Nobody");
        System.out.println(obj.Getter());
    }
}