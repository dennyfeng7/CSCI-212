/*
Name: Denny Feng
Task: Random Number Generator
Description: Create a program that generates random numbers. Display those numbers and perform operations on them. 
*/

import java.util.Random;


public class Rand {
   public static void main (String[] args) {
      int aRand[] = new int [20];
      
      Random r = new Random();
         for(int i = 0; i < 20; i++) { 
            aRand[i] = r.nextInt(1000);
         }
      
      System.out.println("The numbers are: ");
      for(int x = 0; x < 20; x++) {
      System.out.println(aRand[x] + " ");
      }
      
      System.out.println();     

      int sum = 0;
      System.out.print("The average of these numbers are: ");
      for (int j = 0; j < 20; j++) {
            sum = aRand[j] + sum;
         }
      double avg = sum/20; 
      System.out.println(avg);

   }
}