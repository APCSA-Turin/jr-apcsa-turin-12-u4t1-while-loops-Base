package U4T1_Lab2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number that is either positive, even, and a multiple of 7 OR prime: ");
    int userNumber = scanner.nextInt();
    boolean pos = false;
    boolean even = false;
    boolean mult = false;
    if(isPrime(userNumber)) {
      System.out.println("Well done, " + userNumber + " is prime!");
    } else {
      if(userNumber >= 0) {
        pos = true;
      } else {
        System.out.println("Not positive");
      }
      if(userNumber % 2 == 0) {
        even = true;
      } else {
        System.out.println("Not even");
      }
      if(userNumber % 7 == 0) {
        mult = true;
      } else {
        System.out.println("Not a multiple of 7");
      }
    }
    while(!isPrime(userNumber) && (!pos || !even || !mult)) {
      System.out.print("Try again: ");
      userNumber = scanner.nextInt();
      if(isPrime(userNumber)) {
        System.out.println("Well done, " + userNumber + " is prime!"); 
        break;
      }
      if(userNumber >= 0) {
        pos = true;
      } else {
        pos = false;
        System.out.println("Not positive");
      }
      if(userNumber % 2 == 0) {
        even = true;
      } else {
        even = false;
        System.out.println("Not even");
      }
      if(userNumber % 7 == 0) {
        mult = true;
      } else {
        mult = false;
        System.out.println("Not a multiple of 7");
      }
    }
    if(pos && even && mult) {
      System.out.println("Well done, " + userNumber + " is a positive, even, multiple of 7!");
    }
    scanner.close();
  }

  /* Returns true if number is prime and false
        if it is not prime; if number is 1, return false */
  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    int currentDivisor = 2; //start at 2 since no need to check 1

    while (currentDivisor < number) {
      if (number % currentDivisor == 0) {
        return false;  // breaks the loop AND exits the method
      }
      currentDivisor++;
    }
    return true;
  }
}