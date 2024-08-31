package Mehrdimensionale_Arrays;

import java.util.Random;
import java.util.Scanner;

/*
Befülle ein 2D Array Integerarray mit einer spalten x spalten Matrix mit zufälligen Werten von (1 - 10)

Diese sollen dannach alle Zusammengezählt werden.

Die Errechnete Summe und Matrix soll in der Konsole zu guter Letzt ausgegeben werden.

 */
public class Mehrdimensionale_Arrays_Hausübung {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein wie viele Zeilen die Matrix haben soll: ");
        int zeilen = scanner.nextInt();
        System.out.println("Bitte geben Sie ein wie viele Spalten die Matrix haben soll: ");
        int spalten = scanner.nextInt();
        scanner.close();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Matrix:");

        Random rand = new Random();
        int [][] matrix = new int[zeilen][spalten];

        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++){
                matrix[i][j] = rand.nextInt(10) + 1;

                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }

    }
}