import java.io.FileNotFoundException;
import java.io.FileReader;

public class Aufgabe_5
{
    /*Checked Exceptions: müssen im Programmcode  immer behandelt werden;
     dies wird bei  der Übersetzung geprüft.
     Anwender führt Fehler herbei und muss mit  try-catch geprüft werden

     Unchecked Exceptions: können im  Programmcode behandelt werden;
      passiert das nicht kümmert sich das  Laufzeitsystem darum. (Gefahr von Laufzeitfehlern!)
     Programmierer kann Fehler sozusagen abfangen

      */

    public static void main(String[] args) throws FileNotFoundException {
        //unchecked
         int a = 10;
         int b = 0;

         int ergebnis = a/b;
        System.out.println(ergebnis);

        //checked
        FileReader datei = new FileReader("C:\\myFile.dat");
        //kommentiert die Datei für den Benutzer

    }








}
