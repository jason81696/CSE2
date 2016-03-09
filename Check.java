//Jason Stein
//CSE002: 1010-11
//Lab03

import java.util.Scanner; //imports a scanner to be used later in the program
public class Check {
    //main method that is required for every java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx:");
        
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip you wish to pay as a whole number:");
        
        double tipPercent = myScanner.nextDouble();
        tipPercent /=100;
        
        System.out.print("Enter the number of people who went to dinner:");
        int numPeople = myScanner.nextInt();
        
        double TotalCost;
        double costPerPerson;
        
        int dollars, dimes, pennies;
        
        TotalCost = checkCost * (1 + tipPercent);
        costPerPerson = TotalCost / numPeople;
        
        dollars = (int)costPerPerson;
        dimes = (int)costPerPerson * 10 %10;
        pennies = (int)costPerPerson * 100 %10;
        
        System.out.println("Each person owes $" +dollars+ "." +dimes+ +pennies);
        
        
        
        
    } //end of main method
} //end of class

