/*
Name: Denny Feng
Task: Hailstone Sequence
Description: This program takes a number and performs the Hailstone Sequence. Any even result will divide the number by two, and any odd result will multiply itself by 3 and add 1. This sequence continues until it hits 1, in which the sequence will stop and the program will count how many steps it took to get to 1. 
*/

import java.util.Scanner;


public class A15347739_2 {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a value: ");
      int x = input.nextInt();
      int count = 0; 
      while(x != 1) {
      if (x % 2 == 0) {
         System.out.println(x + " " + "is even so take half: " + x/2);
         x /= 2; 
         }
      else {
         System.out.println(x + " " + "is odd so multiply by 3 and add 1: " + ((x*3)+1));
         x = x*3+1;
         }
         count++;
      }
      System.out.println("The process took " + count + " " + "steps to reach 1.");

   }
}