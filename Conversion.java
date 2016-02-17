//Jason Stein
//CSE2 11:10-12
//convert meters to inches

import java.util.Scanner;
public class Conversion {
    //declare main method
   public static void main(String[] args) {
   Scanner myScanner=new Scanner (System.in); //declares new scanner
   System.out.println("Enter the distance in meters");
   double distancemeter=myScanner.nextDouble();
   double distanceinches=distancemeter*39.37; //converts meters to inches
   System.out.println("There are " +distanceinches+ " inches in " +distancemeter+ " meters");
   }
}