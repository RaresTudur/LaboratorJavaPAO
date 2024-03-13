package repository;
import model.*;
public class StorageService {
    private static final int INT_CAP = 100;
    private static Student studenti[];
    private static Professor profesori[];
    private static int nr_studenti;
    private static int nr_profesori;

    static
    {
        nr_studenti = 0;
        nr_profesori = 0;
        studenti = new Student[INT_CAP];
        profesori = new Professor[INT_CAP];
    }

    StorageService()
    {

    }
    private static void increaseStudentArraySize() {
        int newSize = studenti.length * 2;
        Student[] newArray = new Student[newSize];
        System.arraycopy(studenti, 0, newArray, 0, nr_studenti);
        studenti = newArray;
    }
    private static void increaseProfessorArraySize() {
        int newSize = profesori.length * 2;
        Professor[] newArray = new Professor[newSize];
        System.arraycopy(profesori, 0, newArray, 0, nr_profesori);
        profesori = newArray;
    }
    public static void addStudent(Student s)
    {
        if(nr_studenti == studenti.length)
        {
            increaseStudentArraySize();
        }
        studenti[nr_studenti] = s;
        nr_studenti++;
        System.out.println("Studentul cu numele: " + s.getName() + " a fost adaugat");
    }
    public static void addProfessor(Professor p)
    {
        if(nr_profesori == profesori.length)
        {
            increaseStudentArraySize();
        }
        profesori[nr_profesori] = p;
        nr_profesori++;
        System.out.println("Profesorul cu numele: " + p.getName() + " a fost adaugat");
    }
    public static Professor getProfessorByName(String nume)
    {
        if(getNr_profesori() == 0)
        {
            return null;
        }
        for(int i = 0; i < profesori.length; i++)
        {
            if(profesori[i].getName().equals(nume))
            {
                return profesori[i];
            }
        }
        return null;
    }
    public static Student getStudentbyName(String nume)
    {
        if(getNr_studenti() == 0)
        {
            return null;
        }
        for(int i = 0; i < studenti.length; i++)
        {
            if(studenti[i].getName().equals(nume))
            {
                return studenti[i];
            }
        }
        return null;
    }
    public static void UpdateStudent(String name)
    {
    }
    public static void UpdateProfessor(String name)
    {
    }
    public static boolean DeleteStudent(String name)
    {
        for(int i = 0; i < studenti.length; i++)
        {
            if(studenti[i].getName().equals(name))
            {
                studenti[i] = null;
                for(int j = i; i < studenti.length; j++)
                {
                    studenti[j] = studenti[j+1];
                }
                nr_studenti--;
                return true;
            }
        }
        return false;
    }
    public static boolean DeleteProfessor(String name)
    {
        for(int i = 0; i < profesori.length; i++)
        {
            if(profesori[i].getName().equals(name))
            {
                profesori[i] = null;
                for(int j = i; i < profesori.length; j++)
                {
                    profesori[j] = profesori[j+1];
                }
                nr_profesori--;
                return true;
            }
        }
        return false;
    }
    public static Student[] getStudenti() {
        return studenti;
    }

    public static Professor[] getProfesori() {
        return profesori;
    }

    public static int getNr_studenti() {
        return nr_studenti;
    }

    public static int getNr_profesori() {
        return nr_profesori;
    }
}
