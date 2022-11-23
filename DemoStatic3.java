//Write a Java Program to demonstrate the use of static variable, static block and static method.
//DemoStatic3

class DemoStatic3{
    static{
        System.out.println("SP");
    }
    //static variables
    static int a=1;
    static int b=2;
    static int c;

    //static method
    static void disp()
    {
        c=a*b;
        System.out.println("Static Method : C = "+c);
    }

    //static block
    static {
        c=a+b;
        System.out.println("Value of C by static block and static method");
        System.out.println("Static Block : C = "+c);
    } 

    public static void main(String args[])
    {
        disp();
    }
}
