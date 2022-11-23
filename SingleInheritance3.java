//Write a Java program for single inheritance diagram
//SingleInheritance

import java.util.*;

class Person
{
     protected
          String name,aadharno;
}

class Employee extends Person
{
     public
          int salary;
          Scanner sc = new Scanner(System.in);
          void getData()
          {
               System.out.println("Enter the name of the employee: ");
               name = sc.nextLine();
               System.out.println("Enter the aadhar card no. of the employee: ");
               aadharno = sc.nextLine();
               System.out.println("Enter the salary of the employee: ");
               salary = sc.nextInt();
          }

          void putData()
          {
               System.out.println("Name: "+name);
               System.out.println("Aadhar No.: "+aadharno);
               System.out.println("Salary: "+salary);               
          }
}

class SingleInheritance
{
     public static void main(String[] args) 
     {
          Employee E1 = new Employee();
          E1.getData();
          E1.putData();               
     }     
}
