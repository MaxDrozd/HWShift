package com.company;

public class Main {
    public static char[] shift(char[] array) {
        char[] shiftedArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                shiftedArray[i] = array[i + 1];
            } else {
                shiftedArray[i] = array[0];
            }
        }
        return shiftedArray;
    }
    public static char[] rightShift (char [] array){
        char[] shiftedArray = new char[array.length];
        shiftedArray [0] = array [array.length - 1];
        for (int i = 1 ; i < array.length; i++) {
            shiftedArray [i] = array[i - 1];
        }
        return shiftedArray;
    }
    public static void main (String[]args){
        char[] array = {'A', 'B', 'C', 'D', 'E'};
        char[] array2 = rightShift(array);
        for (int i = 0 ; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}