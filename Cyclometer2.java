//Jason Stein
//CSE002 Lab 10:10-11
//Given time in seconds and rotations in two trips
//Will print the minutes, counts, distance in miles, and total distance of both trips

public class Cyclometer2 {
//main method
public static void main(String[] args) {

int secondstrip1=480;
int secondstrip2=3220;
int countstrip1=1561;
int countstrip2=9037;
double wheeldiameter=27.0,
PI=3.14159,
feetPerMile=5280,
inchesPerFoot=12,
secondsPerMinute=60;
double distancetrip1, distancetrip2, totaldistance;
System.out.println("Trip 1 took"+(secondstrip1/secondsPerMinute)+"minutes and had"+countstrip1+"counts.");
System.out.println("Trip 2 took"+(secondstrip2/secondsPerMinute)+"minutes and had"+countstrip2+"counts.");

distancetrip1=countstrip1*wheeldiameter*PI/inchesPerFoot/feetPerMile;
distancetrip2=countstrip1*wheeldiameter*PI/inchesPerFoot/feetPerMile;


totaldistance=distancetrip1*distancetrip2;

System.out.println("Trip 1 was"+distancetrip1+"miles.");
System.out.println("Trip 2 was"+distancetrip2+"miles.");
}
}