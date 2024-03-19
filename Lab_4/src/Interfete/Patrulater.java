package Interfete;

public class Patrulater implements Calcul{
    private int lung, lat;

    public int getLung() {
        return lung;
    }

    public int getLat() {
        return lat;
    }

    public Patrulater() {}

    public Patrulater(int var_lung, int var_lat)
    {
        this.lung = var_lung;
        this.lat = var_lat;
    }

    @Override
    public double calculeaza_perimetru()
    {
        return 2*lat + 2*lung;
    }

    @Override
    public String toString() {
        return "Patrulater cu lungimea " + this.lung + " si latimea " + this.lat;
    }
}
