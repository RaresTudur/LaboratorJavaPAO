import Interfete.*;
public class Application_Ex_Interfete {
    public static void main(String[] args)
    {
        Cerc c = new Cerc(3);
        Patrulater p = new Patrulater(10,10);
        System.out.println(c.toString());
        System.out.println(p.toString());
        System.out.println("Perimetrul patrulaterului este: " + p.calculeaza_perimetru());
        System.out.println("Perimetrul cercului este: " +c.calculeaza_perimetru());
    }
}
