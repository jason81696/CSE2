import java.util.Scanner;
public class Average {
 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter three numbers");
  int a = input.nextInt();
  int b = input.nextInt();
  int c = input.nextInt();
  
  if(((a+b+c)/3)>0) {
   System.out.println("The average is positive");
  }
  else if(((a+b+c)/3)<0) {
   System.out.println("The average is negative");
  }
  else {
   System.out.println("The average is 0");
  }
 }
}