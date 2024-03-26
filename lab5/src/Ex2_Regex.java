import java.util.regex.*;
public class Ex2_Regex
{
    public static void main(String[] args)
    {
        String sir = "TestExpresie";
        boolean hasOnlyUpperLower = Pattern.matches("^[a-zA-Z]+$", sir);
        System.out.println("Respecta sirul TestExpresie regula: "+ hasOnlyUpperLower);

        String sir2 = "Ana are mere si pere!";
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
        System.out.println("TestExpresie + inversul: " + sir_invers.toString());
    }
}
