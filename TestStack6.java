//Create the interface stack which has variable size, abstract methods push (), pop (), display (),
//overflow () and underflow (). Implement subclass IntegerStack by implementing interface.
//Create one test class and check for the working of all the methods of IntergerStack class.
//TestStack6

import java.util.*;

interface stack {
    int size = 5;

    void push();

    void pop();

    void display();

    void overflow();

    void underflow();
}

class IntegerStack implements stack {
    int arr[] = new int[size];
    int Top = 0;
    Scanner obj = new Scanner(System.in);
    int n;

    public void underflow() {
        System.out.println("Stack is Empty\n");
    }

    public void overflow() {
        System.out.println("Stack is Full\n");
    }

    public void push() {
        if (Top == size) {
            overflow();
        } else {
            System.out.println("Enter the Number to be added in Stack\n");
            n = obj.nextInt();
            arr[Top] = n;
            Top++;
            System.out.println("Element Added to Stack\n");
        }
    }

    public void pop() {
        if (Top == 0) {
            underflow();
        } else {
            Top--;
            System.out.println("Number : " + n + " is Removed from stack\n");
        }

    }

    public void display() {
        System.out.println("Elements of Stack are :\n");
        for (int i = 0; i < Top; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class TestStack6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        IntegerStack stk = new IntegerStack();
        System.out.println("Stack");
        int ch;
        do {
            System.out.println(
                    " PRESS 1 : To insert element in stack\n PRESS 2 : To delete element in stack\n PRESS 3 : To Display elements of stack\n PRESS 4 : To Exit\n");
            //int ch;
            System.out.println("Enter Your choice\n");
            ch = obj.nextInt();

            switch (ch) {
                case 1:
                    stk.push();
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                case 4:
                    //exit(1);
                    break;    
                default:
                    System.out.println("Invalid Choice\n");
                    break;
            }
        } while (ch!=4);
    }
}
