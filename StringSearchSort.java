import javax.swing.JOptionPane;

/**
 * This program demonstrates linear search and selection sort methods in Java  
 */

public class StringSearchSort {
    public static void main(String[] args) {
       String[] arr = {"Denny", "Ming", "Andrew", "Priscilla", "Rosena", "Brian", "Anson", "Lisa", "Ryan", "Sunny", "Daniella", "Frank", "Cecilia", "Hisham"};
      
       String target = JOptionPane.showInputDialog("Enter a word to look up");
       if(search(arr, target) >= 0)
           JOptionPane.showMessageDialog(null, "The array contains the word " + target);
       else
           JOptionPane.showMessageDialog(null, "The array does not contain the word " + target);
       
       JOptionPane.showMessageDialog(null, "Unsorted array follows...");
       printArray(arr);
       
       String[] sorted  = sort(arr);
       JOptionPane.showMessageDialog(null, "Sorted array follows...");
       printArray(sorted);
       
       System.exit(0);      
    }
    
    public static int search(String[] a, String str) {
        for (int i = 0; i < a.length; i++)
            if(a[i].equals(str))
                return i;
        return -1;
    }
    
    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static int findMaxIndex(String[] a, int high) {
        int maxIndex = 0;
        for (int i = 1; i <= high; i++) {
            if(a[i].compareTo(a[maxIndex]) > 0) 
                maxIndex = i;
        }
        return maxIndex;
    }
    
    public static String[] sort(String[] a) {
        String[] copy = new String[a.length];
        
        for(int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        
        for (int entry = a.length-1; entry >= 0; entry--) {
            int index = findMaxIndex(copy, entry);
            swap(copy, index, entry);
        }
        return copy;
    }
    
    public static void printArray(String[] a) {
        StringBuilder sb = new StringBuilder();
        for(String x : a) {
            sb.append(x + " ");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}