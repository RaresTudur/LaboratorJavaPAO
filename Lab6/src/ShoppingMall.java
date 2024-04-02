import model.Magazin;
import model.Proprietar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShoppingMall
{
    private List<Magazin> listaMagazine;
    public ShoppingMall()
    {
        this.listaMagazine = new ArrayList<>();
    }
    public void addMagazin(Magazin var_mag)
    {
        this.listaMagazine.add(var_mag);
    }
    public void sortaredupaProprietar()
    {
        this.listaMagazine.sort(Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume)).thenComparing(Magazin::getProprietar,Comparator.comparing(Proprietar::getPrenume)));
    }
    public double venitTotalProprietar(String nume_proprietar)
    {
        double venit = 0;
        for(Magazin magazin : listaMagazine)
        {
            if(magazin.getProprietar().getNume().equals(nume_proprietar))
            {
                venit += magazin.getVenit();
            }
        }
        return venit;
    }
    public double chirieTotalProprietar(String nume_proprietar)
    {
        double chirie = 0;
        for(Magazin magazin : listaMagazine)
        {
            if(magazin.getProprietar().getNume().equals(nume_proprietar))
            {
                chirie += magazin.getChirie();
            }
        }
        return chirie;
    }
    public List<Magazin> getMagazine()
    {
        return this.listaMagazine;
    }

    public List<Magazin> getListaMagazineProprietar(String nume_proprietar)
    {
        List<Magazin> magazine_proprietar = new ArrayList<>();
        for(Magazin magazin: listaMagazine)
        {
            if(magazin.getProprietar().getNume().equals(nume_proprietar))
            {
                magazine_proprietar.add(magazin);
            }
        }
        return magazine_proprietar;
    }
}
