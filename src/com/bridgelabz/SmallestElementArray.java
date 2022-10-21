package com.bridgelabz;

public class SmallestElementArray {
    public static void main(String[] args) {
        int [] array = new int [] {25, 11, 7, 75, 56};

        int small = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] < small)
                small = array[i];
        }
        System.out.println("Largest element present in given array: " + small);
    }
}
