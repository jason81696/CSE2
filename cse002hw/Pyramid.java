//Jason Stein
//CSE2 11:10-12
//find the volume of a pyramid


import java.util.Scanner;
public class VolumeofPyramid;
    //main method
    public static void main(String[] args) {
    Scanner myScanner=new Scanner (System.in); //statement for declaring the scanner
    System.out.println("The size of the base of the pyramid is (input base): ");
    double baselength=myScanner.nextDouble(); //gives the length of the base of the pyramid
    System.out.println("The height of the pyramid is (input height): ");
    double heightlength=myScanner.nextDouble(); //gives height of pyramid
    double volume; //declares volume as a variable
    volume=((baselength*baselength)*heightlength)/3;
    System.out.println("The volume of the pyramid is: "+volume);
    }
    }