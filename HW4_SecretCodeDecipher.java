/*
Name: Denny Feng
Task: Secret Code Translator
Description: Create a program where given a encrypted key, decrypt the message and print it out all possible passwords. 
*/

public class A15347739_3 {
    static void Translate(char hidden[], int key)
        {
        System.out.print("Key " + key + ": ");
        for (int i=0; i < hidden.length; i++) {
            char messagechar = hidden[i];
            char character;
            if ((messagechar - key) < 32)
                character = (char) (messagechar - 32 + 127 - key);
            else 
                character = (char) (messagechar - key);
                System.out.print(character);
        }    
      System.out.println();
      }

    public static void main(String[] args) 
      {
        char hidden[]= ":mmZ\\dxZmx]Zpgy".toCharArray();    
            for (int i=1; i <=100; i++)
            {
                Translate(hidden, i);
            }        
      }
}