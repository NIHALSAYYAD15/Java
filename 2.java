import java.util.Scanner;

class Employee 
{
    static{
        System.out.println("SP");
    }
    String firstname;
    String lastname;
    double salary;

    Employee()
    {

    }

    void claculate()
    {
        if(salary>=0)
        {
            salary=salary+salary*0.1;
        }
        else
        {
            salary=0.00;
        }
    }

    void setfirstname(String fn)
    {
        firstname=fn;
    }
    void setlastname(String ln)
    {
        lastname=ln;
    }
    void setsalary(double sl)
    {
        salary=sl;
    }
    String getfirstname()
    {
        return firstname;
    }
    String getlastname()
    {
        return lastname;
    }
    double getsalary()
    {
        return salary;
    }
}
public class EmployeeTest
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Employee Details :");
        System.out.println("Enter first name : ");
        String f=scan.nextLine();
        e1.setfirstname(f);
        System.out.println("Enter Last name : ");
        String l=scan.nextLine();
        e1.setlastname(l);
        System.out.println("Enter Salary : ");
        double s=scan.nextDouble();
        e1.setsalary(s);
        e1.claculate();

        System.out.println(" ");

        System.out.println("*****First Employee Details*******");
        System.out.println("First Name is : "+e1.getfirstname());
        System.out.println("Last Name is : "+e1.getlastname());
        System.out.println("Salary with 10% raise is : "+e1.getsalary());

        System.out.println(" ");
        
        System.out.println("Enter Second Employee Details :");
        System.out.println("Enter first name : ");
        e2.firstname=scan.nextLine();
        String f1=scan.nextLine();
        e2.setfirstname(f1);
        System.out.println(" ");
        System.out.println("Enter Last name : ");
        String l1=scan.nextLine();
        e2.setlastname(l1);
        System.out.println("Enter Salary : ");
        double s1=scan.nextDouble();
        e2.setsalary(s1);
        e2.claculate();
        
        System.out.println("*****Second Employee Details*******");
        System.out.println("First Name is : "+e2.getfirstname());
        System.out.println("Last Name is : "+e2.getlastname());
        System.out.println("Salary with 10% raise is : "+e2.getsalary());
    }
}
