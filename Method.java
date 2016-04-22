import java.util.Scanner;

public class Method {
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int a,b = 0;
        System.out.print("Enter first number");
        a = myScanner.nextInt();
        do{
            
        System.out.print("Enter the second number above " +a);
        b = myScanner.nextInt();
        if(b<=a) {
        System.out.println("Sorry, you've entered an invalid number");
        }
        }while(a>=b);
        System.out.println(sum(a,b));
    }


public static int sum(int a, int b) {
    int total = 0;
    while(a<=b){
        total += a;
        a++;
    }
    return total;
}
}
        
        

    

    
    