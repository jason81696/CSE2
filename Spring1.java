import java.util.Scanner;

public class Spring2 {
    public static void main(String[] args) {
        int x = 0;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a positive value");       
        
        do{
            System.out.println("invalid entry");
            x = myScanner.nextInt(System.in);
        }while(x<=0);
        
        
    }
}