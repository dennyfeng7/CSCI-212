/*
Name: Denny Feng
Task: Quadratic Formula
Description: This program takes the input values of a, b and c and calculates the two possible results we get from the quadratic formula. If there is no real solution, the program will display as such.
*/

import java.util.Scanner; 

public class A15347739_1 {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in); 

   System.out.println("Enter 'a' value: ");
      int a = input.nextInt();

   System.out.println("Enter 'b' value: ");
      int b = input.nextInt();

   System.out.println("Enter 'c' value: ");
      int c = input.nextInt();

   System.out.println("a = " + a);
   System.out.println("b = " + b);
   System.out.println("c = " + c);

   double x, y, quadadd, quadsubtract, ifnegative;
   x = (b*b)-(4*a*c);
   y = Math.sqrt(x);
   quadadd = (-b+y)/(2*a);
   quadsubtract = (-b-y)/(2*a); 
   
   if(x > 0) {
   System.out.println("The first solution (+) is: " + " " + quadadd);
   System.out.println("The second solution (-) is: " + " " + quadsubtract);
      }

   if(x < 0) {
   System.out.println("There is no real solution because the number under square root in equation is negative.");
      }
   }
}