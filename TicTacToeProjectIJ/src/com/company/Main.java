package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] myArray = new String[3][3];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = "*";
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}