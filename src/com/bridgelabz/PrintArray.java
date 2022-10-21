package com.bridgelabz;

public class PrintArray {
    public static void main(String[] args) {

        int [] array = new int [] {1, 2, 3, 4, 5};
        System.out.println("Elements of given array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
