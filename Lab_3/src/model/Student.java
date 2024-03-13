package model;

public class Student extends Person{
    private int Student_Number;
    private float Average_Mark;
    private int Class;

    public Student(String nume, int phone_number, String email, int stud_num, float avg_mark, int cls)
    {
        super(nume,phone_number,email);
        this.Student_Number = stud_num;
        this.Average_Mark = avg_mark;
        this.Class = cls;
    }

    public Student()
    {
        this("",0,"",0,0,0);
    }

    public int getStudent_Number() {
        return this.Student_Number;
    }

    public void setStudent_Number(int student_Number) {
        this.Student_Number = student_Number;
    }

    public float getAverage_Mark() {
        return this.Average_Mark;
    }

    public void setAverage_Mark(float average_Mark) {
        this.Average_Mark = average_Mark;
    }
    public int getClasa()
    {
        return this.Class;
    }

    public void setClasa(int aClass) {
        this.Class = aClass;
    }
}
