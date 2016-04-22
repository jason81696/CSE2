import java.util.Scanner;

public class EddiePenis {
    public static void main (String[] args) {
    System.out.println("Enter number to be tested if prime");
    Scanner myScanner = new Scanner(System.in);
    int y = myScanner.nextInt();
    
    
    System.out.println(isPrime(y));
    }
    public static boolean isPrime(int x) {
        boolean check = true;
        int i = 2;
        do{
            System.out.println(i); 
            
            if(x % i == 0) {
                check = false;
            }
            i++;
            }while(i < x);
          
            
        
        return check;
    }
}