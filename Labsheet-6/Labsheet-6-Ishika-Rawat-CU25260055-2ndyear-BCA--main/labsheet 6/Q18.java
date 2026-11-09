public class Q18 { 
    static void process() { 
        try { 
            System.out.println("Processing started."); 
            int value = 100 / 0; 
            System.out.println(value); 
        } catch (ArithmeticException e) { 
            System.out.println("Processing error handled."); 
        } finally { 
            
            System.out.println("Cleanup completed."); 

 
        } 
    } 
 
    public static void main(String[] args) { 
        process(); 
    } 
} 
