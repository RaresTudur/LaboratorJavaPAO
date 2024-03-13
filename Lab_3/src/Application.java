import repository.StorageService;
import model.*;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String choice;
        while(true)
        {
            System.out.println("Enter operation type:");
            System.out.println("create");
            System.out.println("read");
            System.out.println("update");
            System.out.println("delete");
            System.out.println("help");
            System.out.println("quit");
            choice = in.nextLine();
            switch(choice.toLowerCase())
            {
                case "create":
                    System.out.println("Command received: create");
                    System.out.println("Enter type of person:");
                    String type,nume,email;
                    int num_phone;
                    type = in.nextLine();
                    switch (type.toLowerCase(Locale.ROOT))
                    {
                        case "student":
                            System.out.println("Command received: student");
                            int student_num,clasa;
                            float avg_m;
                            System.out.println("Name: ");
                            nume = in.nextLine();
                            System.out.println("Phone Number: ");
                            num_phone = in.nextInt();
                            in.nextLine();
                            System.out.println("Email: ");
                            email = in.nextLine();
                            System.out.println("Student Number: ");
                            student_num = in.nextInt();
                            System.out.println("Average Mark: ");
                            avg_m = in.nextFloat();
                            System.out.println("Class: ");
                            clasa = in.nextInt();
                            Student var_S = new Student(nume,num_phone,email,student_num,avg_m,clasa);
                            StorageService.addStudent(var_S);
                            break;
                        case "profesor":
                            System.out.println("Command received: profesor");
                            String var_course;
                            int var_year;
                            System.out.println("Name: ");
                            nume = in.nextLine();
                            System.out.println("Phone Number: ");
                            num_phone = in.nextInt();
                            System.out.println("Email: ");
                            email = in.nextLine();
                            System.out.println("Course: ");
                            var_course = in.nextLine();
                            System.out.println("Year: ");
                            var_year = in.nextInt();
                            Professor var_p = new Professor(nume,num_phone,email,var_course,var_year);
                            StorageService.addProfessor(var_p);
                            break;
                    }
                    break;
                case "read":
                    System.out.println("Command received: read");
                    System.out.println("Enter the name of the person you want to see: ");
                    String nume_read;
                    nume_read = in.nextLine();
                    Student studentFound = StorageService.getStudentbyName(nume_read);
                    Professor professorFound = null;
                    if (studentFound != null)
                    {
                        System.out.println("Name: " + studentFound.getName());
                        System.out.println("Phone Number: " + studentFound.getPhone_number());
                        System.out.println("Email: " + studentFound.getEmail_address());
                        System.out.println("Student Number: " + studentFound.getStudent_Number());
                        System.out.println("Average Mark: " + studentFound.getAverage_Mark());
                        System.out.println("Class: " + studentFound.getClasa());
                    }
                    if (studentFound == null)
                    {
                        professorFound = StorageService.getProfessorByName(nume_read);
                        if (professorFound != null)
                        {
                            System.out.println("Name: " + professorFound.getName());
                            System.out.println("Phone Number: " + professorFound.getPhone_number());
                            System.out.println("Email: " + professorFound.getEmail_address());
                            System.out.println("Course: " + professorFound.getCourse());
                            System.out.println("Year: " + professorFound.getYear());
                        }
                    }

                    if (studentFound == null && professorFound == null) {
                        System.out.println("Not existing");
                    }
                    break;
                case "update":
                    System.out.println("Command received: update");
                    System.out.println("Enter the name of the person you want to update: ");
                    String nume_update;
                    nume_update = in.nextLine();
                    Student studentUpdate = StorageService.getStudentbyName(nume_update);
                    if(studentUpdate != null)
                    {
                        System.out.println("Student found: " + studentUpdate.getName());
                        System.out.println("Enter a new phone number: ");
                        int newPhoneNumber = in.nextInt();
                        in.nextLine();
                        System.out.println("Enter a new email: ");
                        String newEmail = in.nextLine();
                        System.out.println("Enter a new student number: ");
                        int newStudentNumber = in.nextInt();
                        System.out.println("Enter a new average mark: ");
                        float newAverageMark = in.nextFloat();
                        System.out.println("Enter a new class number: ");
                        int newClassNumber = in.nextInt();
                        in.nextLine();

                        studentUpdate.setStudent_Number(newStudentNumber);
                        studentUpdate.setEmail_address(newEmail);
                        studentUpdate.setPhone_number(newPhoneNumber);
                        studentUpdate.setClasa(newClassNumber);
                        studentUpdate.setAverage_Mark(newAverageMark);

                        System.out.println("Student has been updated!");
                    }
                    else
                    {
                        Professor professorUpdate = StorageService.getProfessorByName(nume_update);
                        if(professorUpdate != null)
                        {
                            System.out.println("Professor found: " + professorUpdate.getName());
                            System.out.println("Enter a new phone number: ");
                            int newPhoneNumber = in.nextInt();
                            in.nextLine();
                            System.out.println("Enter a new email: ");
                            String newEmail = in.nextLine();
                            System.out.println("Enter a new course: ");
                            String newCourse = in.nextLine();
                            System.out.println("Enter a new year: ");
                            int newYear = in.nextInt();
                            in.nextLine();

                            professorUpdate.setEmail_address(newEmail);
                            professorUpdate.setPhone_number(newPhoneNumber);
                            professorUpdate.setCourse(newCourse);
                            professorUpdate.setYear(newYear);

                            System.out.println("Professor has been updated!");
                        }
                    }
                    break;
                case "delete":
                    System.out.println("Command received: delete");
                    System.out.println("Enter the name of the person you want to delete: ");
                    String nume_delete;
                    nume_delete = in.nextLine();
                    if(!StorageService.DeleteStudent(nume_delete))
                    {
                        if(!StorageService.DeleteProfessor(nume_delete))
                        {
                            System.out.println("Not Existing");
                        }
                    }
                    break;
                case "exit":
                    System.out.println("Command received: exit");
                    System.exit(0);
                case "help":
                    System.out.println("Command received: help");
                    break;
            }

        }
    }

}
