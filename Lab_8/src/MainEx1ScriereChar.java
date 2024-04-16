import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEx1ScriereChar
{
    public static void main(String[] args)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("persoaneChar.txt")))
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

                    if (suma > 2000) {
                        throw new SumaPreaMareException("Suma introdusa este prea mare (> 2000)");
                    }

                    System.out.println("Introduceti valuta:");
                    String valuta = in.nextLine();
                    writer.write(nume + ";" + prenume + ";" + varsta + ";" + suma + ";" + valuta + "\n");
                    System.out.println("Datele au fost scrise cu succes.");

                } catch (NumberFormatException e) {
                    System.err.println("Va rugam introduceti o valoare numerica pentru varsta sau suma.");
                } catch (SumaPreaMareException e) {
                    System.err.println(e.getMessage() + " Va rugam reintroduceti datele.");
                }
                System.out.println("Doriti sa introduceti alte date? (Da/Nu)");
                String raspuns = in.nextLine();
                if (raspuns.equalsIgnoreCase("Nu"))
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
