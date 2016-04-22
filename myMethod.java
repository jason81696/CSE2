import java.util.Scanner;


public class myMethod {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a value to start");
        int i,j = 0;
        
        i = myScanner.nextInt();
        System.out.print("Enter a second value greater than the first value given");
        j = myScanner.nextInt();
        while(i>j){
        System.out.println("The second value must be greater than the first");
        System.out.println("Please enter a new value for the second variable");
        j = myScanner.nextInt();
        }
            System.out.println(difference(i,j));
        }
        
        public static int difference(int x, int y) {
            return y - x;
            }
        }
