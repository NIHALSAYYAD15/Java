//Develop a BankAccount class which should contain all methods of Bank i.e. balanceEnquiry(), withdraw() and deposit().
//BankApp9

import java.util.*;

class LowBalanceException extends Exception {
  public String toString() {
    return "Low balance in Account !";
  }
}

class NegativeNumberException extends Exception {
  public String toString() {
    return "Plzz insert Positive Amount only ";
  }
}

class BankAccount {

  int balance, n, x;

  public void balanceEnquiry() {
    System.out.println("Your Balance is : " + balance);
  };

  public void withdraw() throws LowBalanceException, NegativeNumberException {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Amount to be Withdraw");
    n = scan.nextInt();
    if (n < 0) {
      throw new NegativeNumberException();
    }
    if (n > balance) {
      throw new LowBalanceException();
    }
    balance = balance - n;
    System.out.println("Rupees " + n + " Debited");
    System.out.println("Updated balance is : " + balance);
  };

  public void deposit() throws NegativeNumberException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Amount to be Deposited");
    x = scan.nextInt();
    if (x < 0) {
      throw new NegativeNumberException();
    }
    balance = balance + x;
    System.out.println("Rupees " + x + " Credited");
    System.out.println("Updated balance is : " + balance);
  };
}

public class BankApp9 {
  static int ch;

  public static void main(String[] args) {

    BankAccount bk = new BankAccount();

    System.out.println("Welcome to Bank");

    System.out.println("Select your Choice");

    do {
      System.out.println("\n1. Balance Enquiry \n2. Withdraw Amount \n3. Deposit Amount \n4. Exit \n");

      Scanner scan = new Scanner(System.in);
      ch = scan.nextInt();

      switch (ch) {
        case 1:
          bk.balanceEnquiry();
          break;
        case 2:
          try {

            bk.withdraw();
          } catch (LowBalanceException e) {
            System.out.println(e);
          } catch (NegativeNumberException e) {
            System.out.println(e);
          }
          System.out.flush();
          break;
        case 3:
          try {
            bk.deposit();
          } catch (NegativeNumberException e) {
            System.out.println(e);
          }
          System.out.flush();
          break;
        case 4:
          System.out.println("Thankyou for Banking with Us !");
          ;
          break;
        default:
          System.out.println("Invalid Choice");
          System.out.flush();
          break;
      }
    } while (ch != 4);
  }
}

