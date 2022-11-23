//Write a program to perform multilevel inheritance
//MultilevelInheritance

class Student
{
     protected
          int roll_no;
          Student(int rn)
          {
               roll_no = rn;
          }
}

class Test extends Student_23
{
     int sub1,sub2;
     Test(int a,int b,int rn)
     {
          super(rn);
          sub1 = a;
          sub2 = b;          
     }
}

class Result extends Test
{
     int result;
     Result(int a,int b,int rn)
     {
          super(a,b,rn);
     }
     void result()
     {          
          System.out.println("Roll No. of student is "+super.roll_no);
          System.out.println("Result in percentage "+((super.sub1+super.sub2)/2)*100);
     }
}

public class MultilevelInheritance
{
     public static void main(String[] args) 
     {
          Result r = new Result(35,56,2);     
          r.result();
     }
}