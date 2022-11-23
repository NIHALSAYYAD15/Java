//Class student with variable rollno, getrollno(), setrollno() methods.
//IntStudent

import java.util.Scanner;
class student
{
Scanner s = new Scanner(System.in);
int rollno;
void getRoll()
{
System.out.println("Enter students roll no:");
rollno = s.nextInt();
}
void setRoll()
{
System.out.println("The roll no of student is : "+rollno);
}
}
class test extends student
{
int sub1,sub2;
void getMarks()
{
System.out.println("Enter marks of student for subject 1:");
sub1 = s.nextInt();
System.out.println("Enter marks of student for subject 2:");
sub2 = s.nextInt();
}
void setMarks()
{
System.out.println("Marks for subject1: "+sub1);
System.out.println("Marks for subject2: "+sub2);
}
}
interface sports
{
int smarks=88;
abstract void set();
}
class IntStudent extends test implements sports
{
public void set()
{
System.out.println("Marks for sports : "+smarks);
}
public static void main(String args[])
{
IntStudent i = new IntStudent();
i.getRoll();
i.getMarks();
i.set();
i.setRoll();
i.setMarks();
}
}