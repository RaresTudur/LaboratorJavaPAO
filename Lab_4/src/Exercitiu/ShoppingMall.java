package Exercitiu;

public class ShoppingMall {
    private BankCard card;

    public ShoppingMall() {}
    public ShoppingMall(BankCard card) {
        this.card = card;
    }

    public BankCard getCard() {
        return card;
    }

    public void setCard(BankCard card) {
        this.card = card;
    }
    public void achizitie(double amount)
    {
        card.doTransaction(amount);
    }
}
