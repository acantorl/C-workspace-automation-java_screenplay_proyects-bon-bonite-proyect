package com.bonbonite.utils;

public class DataGenerator {
    public static String nuevaPassword() {
        return "Pass" + (int)(Math.random() * 1000) + "Abc*";
    }
}