import model.Magazin;
import model.Proprietar;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ShoppingMall mall = new ShoppingMall();
        Proprietar var_p1 = new Proprietar("Popescu","Mihai",40);
        Proprietar var_p2 = new Proprietar("Ionescu", "Andrei", 54);
        Proprietar var_p3 = new Proprietar("Tomescu","Oliviu",35);
        Magazin magAlimentar1 = new Magazin(1, "Profi", var_p1, 1000, 50);
        Magazin magHaine1 = new Magazin(2, "H&M", var_p2, 2000, 60);
        Magazin magChimicale1 = new Magazin(3, "Tom's chimicals", var_p3, 1500, 70);

        magAlimentar1.setChirie(new MagazinAlimentar());
        magChimicale1.setChirie(new MagazinChimicale());
        magHaine1.setChirie(new MagazinHaine());

        mall.addMagazin(magChimicale1);
        mall.addMagazin(magAlimentar1);
        mall.addMagazin(magHaine1);

        mall.sortaredupaProprietar();
        System.out.println("Magazine sortate dupa proprietar:");
        List<Magazin> magazine = mall.getMagazine();
        for(Magazin magazin : magazine)
        {
            System.out.println(magazin);
        }
        System.out.println("Introdu numele proprietarului");
        String nume_proprietar = in.nextLine();
        List<Magazin>magazineProprietar = mall.getListaMagazineProprietar(nume_proprietar);
        magazineProprietar.sort(Comparator.comparing(Magazin::getNumeMagazin).thenComparing(Magazin::getVenit).thenComparing(Magazin::getChirie).thenComparing(Magazin::getSuprafata));
        System.out.println("Magazinele sortate ale proprietarului " + nume_proprietar + ":");
        for(Magazin magazin : magazineProprietar)
        {
            System.out.println(magazin);
        }

        System.out.println("Introdu numele proprietarului");
        nume_proprietar = in.nextLine();
        System.out.println("Venitul total al proprietarului " + nume_proprietar + ":");
        System.out.println(mall.venitTotalProprietar(nume_proprietar));

        System.out.println("Introdu numele proprietarului");
        nume_proprietar = in.nextLine();
        System.out.println("Chiria total al proprietarului " + nume_proprietar + ":");
        System.out.println(mall.chirieTotalProprietar(nume_proprietar));
    }
}
