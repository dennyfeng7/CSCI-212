import javax.swing.JOptionPane;

public class SortingMethods {
    public static void main (String[] args) {
        String [] wordArray = {"Denny", "Ming", "Andrew", "Rosena", "Brian", "Priscilla", "Lisa", "Ryan", "Anson", "Frank", "Cecilia", "Hisham", "Sunny", "Daniella"};
        
        String target = JOptionPane.showInputDialog("Enter a word to lookup:");
        if(search(arr, target) >= 0)
            JOptionPane.showMessageDialog(null, "The array contains the word " + target);
        else
            JOptionPane.showMessageDialog(null, "The array does not contain the word " + target);

        JOptionPane.showMessageDialog(null, "Unsorted array follows...");
        printArray(wordArray); 

        String[] sorted = sort(wordArray);
        JOptionPane.showMessageDialog("Sorted array follows..."); 
        printArray(sorted); 
        

        System.exit(0);



    }

    public static int search(String[] a, str) {
        for (int = 0; i < a.length; i++) {
            if (a[i].equals(str))
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
        for (int i = 1; i < high; i++) {
            
        }
    }

    public static void printArray(String[] a) {
    StringBuilder sb = new StringBuilder();
    for(String x : a) {
        sb.append(x + " ");
        }

    JOptionPane.showMessageDialog(null, sb.toString());


    }

}