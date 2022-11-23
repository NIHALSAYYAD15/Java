//Create abstract class shape with dim1, dim2 variables and abstract area() method
//Abstract5

import java.util.Scanner;
abstract class Shape{
    int dim1;
    int dim2;
    Shape(int dim1, int dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void area();
}
class Rectangle extends Shape{
    Rectangle(int dim1, int dim2)
    {
        super(dim1, dim2);
    }
    void area()
    {
        System.out.println("Area of Rectangle is : "+(dim1*dim2));
    }
}
class Triangle extends Shape{
    Triangle(int dim1, int dim2)
    {
        super(dim1, dim2);
    }
    void area()
    {
        System.out.println("Area of Triangle is : "+(dim1*dim2)/2);
    }
}
public class Abstract5 {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Length for Rectangle : ");
        int x=scan.nextInt();
        System.out.print("Enter Breadth for Rectangle : ");
        int y=scan.nextInt();
        System.out.print("Enter Base for Triangle : ");
        int p=scan.nextInt();
        System.out.print("Enter Height for Triangle : ");
        int q=scan.nextInt();

        // Shape s=new Shape(x,y);
        Rectangle r=new Rectangle(x,y);
        Triangle t=new Triangle(p,q);
        r.area();
        t.area();
    }
}
