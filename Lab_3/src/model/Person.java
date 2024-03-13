package model;

public class Person
{
    private String Name;
    private int phone_number;
    private String email_address;

    public Person(String nume, int nr_telefon, String email)
    {
        this.Name = nume;
        this.phone_number = nr_telefon;
        this.email_address = email;
    }
    public Person()
    {
        this("",0,"");
    }

    public String getName() {
        return this.Name;
    }

    public int getPhone_number() {
        return this.phone_number;
    }

    public String getEmail_address() {
        return this.email_address;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}
