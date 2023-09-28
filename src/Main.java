import java.util.ArrayList;
import java.util.Scanner;

import classes.Funcionary;
import classes.Manager;
import classes.Person;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

     ArrayList<Person> people = new ArrayList<Person>();

     int count = -1;

     while (count != 0) {
       System.out.println("""
           1 - Create Funcionary
           2 - Create Manager
           3 - Get Salary Funcionary
           4 - Get Salary Manager
           0 - Exit
           """);

       count = scan.nextInt();

       switch (count) {
         case 1:
           System.out.println("Name: ");
           String name = scan.next();
           System.out.println("CPF: ");
           String CPF = scan.next();
           System.out.println("Birthdate: ");
           String birthdate = scan.next();
           System.out.println("Salary: ");
           double salary = scan.nextDouble();
           people.add(new Funcionary(name, CPF, birthdate));
            ((Funcionary) people.get(people.size() - 1)).setSalary(salary);
           break;
         case 2:
           System.out.println("Name: ");
           String nameM = scan.next();
           System.out.println("CPF: ");
           String CPFM = scan.next();
           System.out.println("Birthdate: ");
           String birthdateM = scan.next();
           System.out.println("Salary: ");
           double salaryM = scan.nextDouble();
           System.out.println("Departament: ");
           String departament = scan.next();
           people.add(new Manager(nameM, CPFM, birthdateM, departament));
          ((Funcionary) people.get(people.size() - 1)).setSalary(salaryM);
        
           break;
         case 3:
           System.out.println("Name: ");
           String nameF = scan.next();
           for (Person p : people) {
             if (p.getName().equals(nameF)) {
               System.out.println(((Funcionary) p).getSalary());
             }
           }
           break;
         case 4:
           System.out.println("Name: ");
           String nameM2 = scan.next();
           for (Person p : people) {
             if (p.getName().equals(nameM2)) {
               System.out.println(((Manager) p).getSalary());
             }
           }
           break;
         default:
           break;
       }
     }
     
  }

}