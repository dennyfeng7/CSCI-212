/*
Name: Denny Feng
Task: Mortgage Calculator Simulator
Description: Create a basic mortgage calculating simulator. 
*/

import java.util.Scanner;

public class Mortgage {
   public static void main(String[] args) {
      double x, y, i, intpay, prinpay;  
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your monthly payment amount: ");     
      x = scan.nextFloat();
  
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Enter your outstanding balance (Total Balance Remaining): ");
      y = scan2.nextFloat();

      i = 0.0749/12;
      intpay = y * i;
      prinpay = x - intpay; 
   
      System.out.println("Your monthly interest payment is: " + " $" + intpay);
      System.out.println("Your monthly principal payment is: " + " $" + prinpay);



      System.out.println(x + " " + y + " " + i + " " + intpay + " " + prinpay);
   }
}