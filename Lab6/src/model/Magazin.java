package model;

import calcul.CalculChirie;

public class Magazin
{
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private double venit;
    private double suprafata;
    protected double chirie;
    public Magazin(int id, String numeMagazin,Proprietar proprietar, double venit, double suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.suprafata = suprafata;
        this.venit = venit;
    }

    public void setChirie(CalculChirie c)
    {
        this.chirie = c.calculeazaChirie(this.suprafata);
    }
    public int compareToProprietar(Magazin obiectDeComparat){

        return this.proprietar.getNume().compareTo(obiectDeComparat.proprietar.getNume());
    }

    public Proprietar getProprietar()
    {
        return proprietar;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNumeMagazin()
    {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin)
    {
        this.numeMagazin = numeMagazin;
    }


    public double getVenit()
    {
        return venit;
    }

    public void setVenit(double venit)
    {
        this.venit = venit;
    }

    public double getSuprafata()
    {
        return suprafata;
    }

    public void setSuprafata(double suprafata)
    {
        this.suprafata = suprafata;
    }

    public double getChirie()
    {
        return chirie;
    }
    @Override
    public String toString() {
        return "model.Magazin{" +
                "id=" + id +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + this.proprietar.getNume() + " " + this.proprietar.getPrenume() +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chiria=" + chirie +
                '}';
    }
}
