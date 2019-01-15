import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Bitte gib hier deine E-Mail ein.");

        try
        {
            checkEmail(eingabe);
            JOptionPane.showMessageDialog(null, "Die E-Mail wurde erkannt.");
        }
        catch (Exception e) //meine neu erstellte exception
        {
            JOptionPane.showMessageDialog(null, "Das ist keine gültige E-Mail.");

        }
    }

    private static void checkEmail(String s) throws Exception //gibt Exception zurück statt z.b. boolean
    {
        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}$");
        Matcher m = pattern.matcher(s);

        if(!m.find()) //wenn es NICHT findet dann erstelle eine neue Exception
        {
            throw new Exception();
        }


    }


}
