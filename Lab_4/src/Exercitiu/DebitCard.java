package Exercitiu;

public record DebitCard(String nume_utilizator, int limitAmount) implements BankCard {
    private static double spentAmount = 0;

    public DebitCard(String nume_utilizator, int limitAmount)
    {
        this.nume_utilizator = nume_utilizator;
        this.limitAmount = limitAmount;
    }

    public static void setSpentAmount(double spentAmount)
    {
        DebitCard.spentAmount = spentAmount;
    }

    @Override
    public void doTransaction(double amount) {
        if(amount + spentAmount > limitAmount)
        {
            System.out.println("Not enough money");
        }
        else
        {
            System.out.println("Utilizator " + nume_utilizator + " a cheltuit " + amount);
            DebitCard.setSpentAmount(amount + spentAmount);
            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
        }
    }
}
