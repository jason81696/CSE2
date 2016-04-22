/*
0***0
*1*1*
**2**
*3*3*
4***4

0*0
*1*
2*2

*/
import java.util.Scanner;



public class Blah{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = new scan.nextInt();
        System.out.println(a(x));
    
}

    public static int a(int y){

        System.out.println("Enter a number less than or equal to 10");
        y = scan.nextInt();
        do{
            System.out.println("Invalid input, enter a number less than or equal to 10");
            y = scan.nextInt();
        }while(y>10);
            return y;
        }
    }
    
        