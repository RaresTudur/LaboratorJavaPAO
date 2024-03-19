package Interfete;

public class Cerc implements Calcul{

    private static final double pi = 3.14;
    private int r;

    public double getR() {
        return r;
    }

    public Cerc() {}

    public Cerc(int raza)
    {
        this.r = raza;
    }

    @Override
    public double calculeaza_perimetru()
    {
        return 2*pi*r;
    }

    @Override
    public String toString() {
        return "Cerc cu raza " + this.r;
    }
}
