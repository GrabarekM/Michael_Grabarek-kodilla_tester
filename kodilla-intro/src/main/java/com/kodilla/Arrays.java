package com.kodilla;

public class Arrays {
    public static void main(String[] args) {
        String[] array = new String[]{"pies", "kot", "agama", "papuga", "kapibara"};
        int howManyAnimals = array.length;
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}