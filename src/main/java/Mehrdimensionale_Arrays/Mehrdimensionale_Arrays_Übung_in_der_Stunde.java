package Mehrdimensionale_Arrays;

public class Mehrdimensionale_Arrays_Übung_in_der_Stunde {
    public static void main(String[] args) {
//---------------------------------------------------------- Verschachtelte Schleifen und 2D Arrays
        System.out.println("Matrix: ");
        String[][] ausgabe = new String[5][6];
        //Verarbeitung Zeilenindex
        for (int i1 = 0; i1 < 5; i1++)
        {
            //Verarbeitung Spaltenindex
            for (int i2 = 0; i2 < 5; i2++)
            {
                ausgabe[i1][i2] = "x";
            }
            ausgabe[i1][5] = "\n";
        }


        for (int i1 = 0; i1 < 5; i1++)
        {
            //Verarbeitung Spaltenindex
            for (int i2 = 0; i2 < 5; i2++)
            {
                System.out.print(ausgabe[i1][i2]);
            }
            System.out.print(ausgabe[i1][5]);
        }


        //Exkurs 2D Foreach
        /*for (String[] zeile: ausgabe) {
            for (String spalte: zeile) {
                System.out.print(spalte);
            }
        }*/


    }
}