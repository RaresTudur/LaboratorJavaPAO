import java.util.*;

public class Application
{
    public static void main(String[] args)
    {
        User user1 = new User("Popescu", "Mihai", "RO0123456789");
        User user2 = new User("Alexandrescu", "Mihai", "GB9876543210");

        Payment payment1 = new Payment(100.0, Currency.USD, user1, "Tableta Grafica");
        Payment payment2 = new Payment(50.0, Currency.RON, user2, "Mouse Logitech");
        Payment payment3 = new Payment(200.0, Currency.GBP, user1, "Monitor LG");

        List<Tranzactie> lista_tranzactii = new ArrayList<>();
        Tranzactie tranzactie1 = new Tranzactie(1, payment1);
        lista_tranzactii.add(tranzactie1);
        Tranzactie tranzactie2 = new Tranzactie(2, payment2);
        lista_tranzactii.add(tranzactie2);
        Tranzactie tranzactie3 = new Tranzactie(3, payment3);
        lista_tranzactii.add(tranzactie3);

        //Exercitiul 1
        Tranzactie stornareTranzactie2 = tranzactie2.clone();
        stornareTranzactie2.setAmount(-stornareTranzactie2.getAmount());
        stornareTranzactie2.setRefNmb(tranzactie2.getId());

        System.out.println("Tranzactie initiala: ");
        System.out.println(tranzactie2);
        System.out.println("Tranzactie dupa stornare: ");
        System.out.println(stornareTranzactie2);
        System.out.println("\n");

        //Exercitiul 2
        Set<String> countries = new HashSet<>();
        countries.add(payment1.getCurrency().getCountry());
        countries.add(payment2.getCurrency().getCountry());
        countries.add(payment3.getCurrency().getCountry());
        System.out.println(countries);

        //Exercitiul 3
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu intregul nume al userului: ");
        String username = in.nextLine();
        List<Tranzactie> tranzactii_user = new ArrayList<>();
        for(Tranzactie tranzactie : lista_tranzactii)
        {
            if(tranzactie.getPayment().getUser().getFullName().equals(username))
            {
                tranzactii_user.add(tranzactie);
            }
        }
        for(Tranzactie tranzactie: tranzactii_user)
        {
            System.out.println("Initial ammount: " + tranzactie.getPayment().getAmount());
            System.out.println("Initial currency:  " + tranzactie.getPayment().getCurrency());
        }
    }
}
