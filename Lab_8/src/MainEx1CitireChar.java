import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainEx1CitireChar
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("persoaneChar.txt")))
        {
            Scanner userInputReader = new Scanner(System.in);

            System.out.println("Introduceti numele:");
            String numeCautat = userInputReader.nextLine();

            System.out.println("Introduceti prenumele:");
            String prenumeCautat = userInputReader.nextLine();

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null)
            {
                String[] tokens = line.split(";");
                if (tokens.length >= 2)
                {
                    String nume = tokens[0].trim();
                    String prenume = tokens[1].trim();

                    if (nume.equalsIgnoreCase(numeCautat) && prenume.equalsIgnoreCase(prenumeCautat))
                    {
                        System.out.println("Persoana gasita: " + line);
                        found = true;
                    }
                }
            }

            if (!found)
            {
                System.out.println("Nu s-a gasit nicio persoana cu numele '" + numeCautat + "' si prenumele '" + prenumeCautat + "'.");
            }

        } catch (IOException e) {
            System.err.println("Eroare la citirea din fisier: " + e.getMessage());
        }
    }
}
