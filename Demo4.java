//Write a java program for Hierarchical inheritance
//Demo4

import java.util.Scanner;

class Base {
    double a;
    double b;

    Base(double f, double s) {
        a = f;
        b = s;
    }
}

class Add extends Base {
    Add(double a, double b) {
        super(a, b);
    }

    double add() {
        return (a + b);
    }
}

class Sub extends Base {
    Sub(double a, double b) {
        super(a, b);
    }

    double sub() {
        return (a - b);
    }
}

class Mul extends Base {
    Mul(double a, double b) {
        super(a, b);
    }

    double mul() {
        return (a * b);
    }
}

class Div extends Base {
    Div(double a, double b) {
        super(a, b);
    }

    double div() {
        return (a / b);
    }
}

public class Demo4 {
    static{
        System.out.println("Santosh Mane SYB-35");
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double x,y;

        System.out.print("Enter Firstno : ");
        x = scan.nextDouble();
        System.out.print("Enter Secondno : ");
        y = scan.nextDouble();

        Base bs = new Base(x, y);
        Add ad = new Add(x, y);
        Sub sb = new Sub(x, y);
        Mul ml = new Mul(x, y);
        Div dv = new Div(x, y);

        int ch;
        double addition, subtraction, multiplication, division;

        System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division\n");
        ch = scan.nextInt();
        switch (ch) {
            case 1:
                
                addition = ad.add();
                System.out.println("Addition is : " + addition);
                break;

            case 2:
                
                subtraction = sb.sub();
                System.out.println("Subtraction is : " + subtraction);
            case 3:
                
                multiplication = ml.mul();
                System.out.println("Multiplication is : " + multiplication);
            case 4:
                
                division = dv.div();
                System.out.println("Division is : " + division);
            default:
                System.out.println("Invalid choice");
        }
    }
}

