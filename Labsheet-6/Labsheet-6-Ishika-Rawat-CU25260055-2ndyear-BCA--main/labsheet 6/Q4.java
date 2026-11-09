public class Q4{ 
    public static void main(String[] args) { 
        String value = "25A"; 
 
        try {  
            int number = Integer.parseInt(value); 
            System.out.println("Number = " + number); 
        } catch (NumberFormatException e) { 
            System.out.println("Invalid integer value: " + value); 
        } 
    } 
} 