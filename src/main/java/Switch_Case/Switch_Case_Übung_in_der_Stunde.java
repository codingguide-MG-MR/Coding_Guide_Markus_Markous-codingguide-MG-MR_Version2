package Switch_Case;

public class Switch_Case_Übung_in_der_Stunde {
    public static void main(String[] args) {
        //Bisher
        int iZahl1 = 7;
        if(iZahl1 == 5)
        {
            System.out.println("Die Zahl ist 5");
        }
        else if(iZahl1 == 6)
        {
            System.out.println("Die Zahl ist 6");
        }
        else if(iZahl1 != 6)
        {
            System.out.println("Die Zahl ist nicht 6");
        }

        //Idee Switch case Idee = übersicht über Verzweigungen Schaffen
        //Create, Delete, Update, Insert,.....
        String sKommando = "Create";
        if (sKommando == "Create")
        {
            System.out.println("Erstellen");
        }
        else if(sKommando == "Delete")
        {
            System.out.println("Löschen");
        }
        else if(sKommando == "Update")
        {
            System.out.println("Ändern");
        }
        else if(sKommando == "Insert")
        {
            System.out.println("Einfügen");
        }

        switch (sKommando)
        {
            case "Create":
                System.out.println("Erstellen");
                break;
            case "Update":
                System.out.println("Ändern");
                break;
            case "Insert":
                System.out.println("Einfügen");
                break;
            default:
                System.out.println("kein richtiges Kommando");
                break;
        }
    }
}