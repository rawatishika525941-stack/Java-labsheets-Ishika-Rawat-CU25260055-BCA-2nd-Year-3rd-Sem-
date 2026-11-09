
public class Q2{ 
    public static void main(String[] args) { 
        int[] marks = {80, 75, 90}; 
 
        try { 
            // Valid indexes are 0, 1 and 2. 
            System.out.println(marks[5]); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Invalid array index."); 
        } 
    } 
} 