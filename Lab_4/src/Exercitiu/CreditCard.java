package Exercitiu;

public record CreditCard(String nume_utilizator, int limitAmount) implements BankCard {
    private static double spentAmount = 0;

    public CreditCard(String nume_utilizator, int limitAmount)
    {
        this.nume_utilizator = nume_utilizator;
        this.limitAmount = limitAmount;
    }

    public static void setSpentAmount(double spentAmount)
    {
        CreditCard.spentAmount = spentAmount;
    }

    @Override
    public void doTransaction(double amount) {

        System.out.println("Utilizator " + nume_utilizator + " a cheltuit " + amount);
        CreditCard.setSpentAmount(amount + spentAmount);
        System.out.println("Suma totala cheltuita cu carduri de credit este " + spentAmount);
    }
}
