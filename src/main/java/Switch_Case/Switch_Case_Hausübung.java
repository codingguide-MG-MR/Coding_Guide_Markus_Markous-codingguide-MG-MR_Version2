package Switch_Case;

/*Lies per Scanner 2 Zahlen und ein Rechenzeichen (+, -, *, /) ein
* Sorge dafür dass mit den 2 Zahlen die eingegebene Rechenoperation durchgeführt wird
* Achte auf entsprechene Fehlermelungen wenn (/0 dividiert wird, ein ungültiges rechenzeichen eingegeben wird,...)
*
* */


import java.util.Scanner;

public class Switch_Case_Hausübung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihre 1. Zahl ein: ");
        Double number = scanner.nextDouble();



        System.out.println("Geben Sie Ihre 2. Zahl ein: ");
        Double number2 = scanner.nextDouble();


        System.out.println("Geben Sie Ihr Rechenzeichen ein: ");
        char number3 = scanner.next().charAt(0);

        Double ergebnis = null;

        switch (number3){
            case '+':
                ergebnis = number + number2;
                System.out.println("Ergebnis: " + number + " + " + number2 + " = " + ergebnis);
                break;

            case '-':
                ergebnis = number - number2;
                System.out.println("Ergebnis: " + number + " - " + number2 + " = " + ergebnis);
                break;

            case '*':
                ergebnis = number * number2;
                System.out.println("Ergebnis: " + number + " * " + number2 + " = " + ergebnis);
                break;

            case '/':

                if (number2 == 0)
                {
                    System.out.println("Es darf nicht durch null (0) dividiert werden!");
                }

                ergebnis = number / number2;
                System.out.println("Ergebnis: " + number + " / " + number2 + " = " + ergebnis);
                break;
            default:
                System.out.println("Das ist kein gültiges Zeichen! ");
                ergebnis = null;
                break;
        }





        scanner.close();


    }
}