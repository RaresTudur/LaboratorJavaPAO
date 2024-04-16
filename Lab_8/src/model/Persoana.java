package model;

import java.io.Serializable;

public class Persoana implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String nume;
    private String prenume;
    private int varsta;
    private double suma;
    private String valuta;

    public Persoana(String nume, String prenume, int varsta, double suma, String valuta)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        this.valuta = valuta;
    }
    public String toString()
    {
        return "Nume: " + nume + ", Prenume: " + prenume + ", Varsta: " + varsta + ", Suma: " + suma + ", Valuta: " + valuta;
    }
    public boolean areNumeleSiPrenumele(String numeCautat, String prenumeCautat)
    {
        return nume.equalsIgnoreCase(numeCautat) && prenume.equalsIgnoreCase(prenumeCautat);
    }
}
