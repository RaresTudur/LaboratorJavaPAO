import java.util.regex.*;
public class Ex2_Regex
{
    public static void main(String[] args)
    {
        String sir = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        boolean hasOnlyUpperLower = Pattern.matches("^[a-zA-Z]+$", sir);
        System.out.println("Respecta sirul "+ sir + " regula: "+ hasOnlyUpperLower);
        String sir2 ="Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat." ;
        String[] cuvinte = sir2.split("\\s+");
        int indexMijloc = cuvinte.length / 2;
        if(cuvinte.length % 2 == 0)
        {
            System.out.println(": " + cuvinte[indexMijloc]);
        }
        else
        {
            System.out.println(cuvinte[indexMijloc-1] + " "+ cuvinte[indexMijloc]);
        }

        StringBuilder sir_invers = new StringBuilder(sir);
        sir_invers.reverse();
        System.out.println(sir + " + inversul: " + sir_invers);
    }
}
