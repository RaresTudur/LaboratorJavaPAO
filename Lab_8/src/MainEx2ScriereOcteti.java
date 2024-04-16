import model.Persoana;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainEx2ScriereOcteti
{
    public static void main(String[] args)
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("persoaneOcteti.txt")))
        {
            Scanner in = new Scanner(System.in);

            while (true)
            {
                try
                {
                    System.out.println("Introduceti numele:");
                    String nume = in.nextLine();

                    System.out.println("Introduceti prenumele:");
                    String prenume = in.nextLine();

                    System.out.println("Introduceti varsta:");
                    int varsta = Integer.parseInt(in.nextLine());

                    System.out.println("Introduceti suma:");
                    double suma = Double.parseDouble(in.nextLine());

                    if (suma > 2000)
                    {
                        throw new SumaPreaMareException("Suma introdusa este prea mare (> 2000)");
                    }

                    System.out.println("Introduceti valuta:");
                    String valuta = in.nextLine();

                    Persoana persoana = new Persoana(nume, prenume, varsta, suma, valuta);

                    outputStream.writeObject(persoana);
                    System.out.println("Datele au fost scrise cu succes.");

                } catch (NumberFormatException e)
                {
                    System.err.println("Va rugam introduceti o valoare numerica pentru varsta sau suma.");
                } catch (SumaPreaMareException e)
                {
                    System.err.println(e.getMessage() + " Va rugam reintroduceti datele.");
                }

                System.out.println("Doriti sa introduceti alte date? (Da/Nu)");
                String raspuns = in.nextLine();
                if (!raspuns.equalsIgnoreCase("Da"))
                {
                    break;
                }
            }
        } catch (IOException e)
        {
            System.err.println("Eroare la scrierea in fisier: " + e.getMessage());
        }
    }
}