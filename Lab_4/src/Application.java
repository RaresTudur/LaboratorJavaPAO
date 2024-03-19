import Exercitiu.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args)    {
        DebitCard dCard = new DebitCard("Rares",1000);
        CreditCard cCard = new CreditCard("Rares",100000);
        ShoppingMall mall = new ShoppingMall();
        mall.setCard(dCard);
        mall.achizitie(100);
        mall.setCard(cCard);
        mall.achizitie(100);
    }

}
