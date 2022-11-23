//Create a class called Employee that includes three pieces of information as instance variables- first name, a last name and a monthly salary. Your class should have a constructor that initializes the three instance variables. 
//Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class Employee's capabilities. Create two Employee 
//objects and display each object's yearly salary. Then give each Employee a 10% raise and display each Employee's yearly salary again.
//save EmployeeTest.java

import java.util.*;

class Employee
{
     public
          String fname,lname;
          double mnthl_sal;
     
          Employee()
          {
               fname = "NULL";
               lname = "NULL";
               mnthl_sal = 0.0;
          }

          void set(String fn,String ln,double ms)
          {
               fname = fn;
               lname = ln;
               if(ms<0)
                    mnthl_sal = 0.0;
               else
                    mnthl_sal = ms;
          }

          void get()
          {
               System.out.println("\nFirst Name: "+fname);
               System.out.println("Last Name: "+lname);
               System.out.println("Monthly Salary: "+mnthl_sal);
               System.out.println("Yearly Salary of "+fname+" "+lname+" is "+mnthl_sal*12);
          }
}


public class EmployeeTest2
{
     public static void main(String[] args) 
     {
          Employee e1 = new Employee();
          Employee e2 = new Employee();

          Scanner sc = new Scanner(System.in);
          
          String fn,ln;
          double ms;
          int i;
          
          for (i=1; i<=2;i++)
          {
               System.out.print("\nEnter Employee first name: ");
               fn = sc.nextLine();
               System.out.print("\nEnter Employee last name: ");
               ln = sc.nextLine();
               System.out.print("\nEnter Employee monthly salary: ");
               ms = sc.nextInt();

               sc.nextLine();

               if(i==1)
                    e1.set(fn,ln,ms);
               else 
                    e2.set(fn,ln,ms);
          }

          System.out.print("\nSalary before the increment is: ");
          e1.get();
          e2.get();

          e1.mnthl_sal = e1.mnthl_sal + ((e1.mnthl_sal)*0.10);
          e2.mnthl_sal = e2.mnthl_sal + ((e2.mnthl_sal)*0.10);

          System.out.print("\nSalary after the increment is: ");
          e1.get();
          e2.get();
     }     
}