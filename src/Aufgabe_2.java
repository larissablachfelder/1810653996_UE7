import javax.swing.*;

public class Aufgabe_2
{

    public static void main(String[] args)
    {
        while (true)
        {
            try
            {
                int number = Integer.parseInt(JOptionPane.showInputDialog("Bitte eine Zahl eingeben."));

                JOptionPane.showMessageDialog(null, "Danke für die Eingabe.");
                break;//wird abgebrochen wenn eine Zahl eingegeben wurde

            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Das war keine Zahl. Bitte erneut Zahl eingeben.");

            }

        }
    }
}
