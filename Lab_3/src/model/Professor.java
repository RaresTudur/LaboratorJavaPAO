package model;

public class Professor extends Person{
    private String course;
    private int year;
    public Professor(String nume,int ph_nm, String email,String course, int year)
    {
        super(nume,ph_nm,email);
        this.course = course;
        this.year = year;
    }
    public Professor()
    {
        this("",0,"","",0);
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
