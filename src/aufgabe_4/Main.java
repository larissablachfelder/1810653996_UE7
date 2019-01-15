package aufgabe_4; //

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Bitte gib hier deine Telefonnummer ein.");

        try
        {
            int number = Integer.parseInt(eingabe);
            checkNummer(number);
            JOptionPane.showMessageDialog(null, "Die Telefonnummer existiert.");



        }
        catch (MyException e) //meine neu erstellte exception
        {
            JOptionPane.showMessageDialog(null, "Das ist keine gültige Telefonnummer.");

        }
    }

    public static void checkNummer(int n) throws MyException
    {
        if(n == (int)n)
        {
            throw new MyException();

        }



    }






}
