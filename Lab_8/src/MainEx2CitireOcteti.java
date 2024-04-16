import model.Persoana;

import java.io.*;
import java.util.Scanner;

public class MainEx2CitireOcteti
{
    public static void main(String[] args)
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("persoaneOcteti.txt")))
        {
            Scanner in = new Scanner(System.in);

            System.out.println("Introduceti numele:");
            String numeCautat = in.nextLine();

            System.out.println("Introduceti prenumele:");
            String prenumeCautat = in.next();

            boolean found = false;

            while (true)
            {
                try
                {
                    Persoana persoana = (Persoana) inputStream.readObject();
                    if (persoana.areNumeleSiPrenumele(numeCautat, prenumeCautat))
                    {
                        System.out.println("Persoana gasita: " + persoana.toString());
                        found = true;
                    }

                }
                catch (EOFException e)
                {
                    break;
                }
            }

            if (!found)
            {
                System.out.println("Nu s-a gasit nicio persoana cu numele '" + numeCautat + "' si prenumele '" + prenumeCautat + "'.");
            }

        } catch (IOException | ClassNotFoundException e)
        {
            System.err.println("Eroare la citirea din fisier: " + e.getMessage());
        }

    }
}