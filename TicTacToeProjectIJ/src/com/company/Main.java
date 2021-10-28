package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row of the array: ");
        int row = scanner.nextInt();

        System.out.print("Enter the coloumn of the array: ");
        int coloumn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the symbol: ");
        String symbol = scanner.nextLine();

        String[][] myArray = new String[row][coloumn];

        //Initializing the array and printing.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                myArray[i][j] = symbol;
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}