//Jason Stein
//CSE002 1010-1100
//Hexadecimal Conversion

import java.util.*; //imports the scanner to be used in program
import java.lang.*; 
public class ToHex {//every program in java has to have a class
public static void main(String[] args) {//declaring the main method

Scanner input = new Scanner(System.in); //allows for the program to utilize an input prompt
System.out.print("Please enter three numbers representing RGB values: ");

String Hex7;


int red = input.nextInt();
int green = input.nextInt();
int blue = input.nextInt();

int Hex1;
int Hex2;
int Hex3;
int Hex4;
int Hex5;
int Hex6;

if(red>0 && red<16) {
Hex1 = 0;
Hex2 = red;
}
if(red>=16 && red<=255); {
Hex1 = red/16;
Hex2 = red%16;
}

if(green>0 && green<16) {
Hex3 = 0;
Hex4 = green;
}
if(green>=16 && green<=255); {
Hex3 = green/16;
Hex4 = green%16;
}

if(blue>0 && blue<16) {
Hex5 = 0;
Hex6 = blue;
}
if(blue>=0 && blue<=255); {
Hex5 = blue/16;
Hex6 = blue%16;
}


String letter = "" ;


if(Hex1>9) {
switch(Hex1) {
case 10:
letter = "A";
break;
case 11: 
letter = "B";
break;
case 12:
letter = "C";
break;
case 13:
letter = "D";
break;
case 14:
letter = "E";
break;
case 15: 
letter = "F";
break;
}
Hex7 = letter;
}
else{
    Hex7 = Integer.toString(Hex1);

}

if(Hex2>9) {
switch(Hex2) {
case 10:
letter = "A";
break;
case 11: 
letter = "B";
break;
case 12:
letter = "C";
break;
case 13:
letter = "D";
break;
case 14:
letter = "E";
break;
case 15: 
letter = "F";
break;
}
Hex7 += letter;
}
else{
    Hex7 += Integer.toString(Hex2);
}

if(Hex3>9) {
switch(Hex3) {
case 10:
letter = "A";
break;
case 11: 
letter = "B";
break;
case 12:
letter = "C";
break;
case 13:
letter = "D";
break;
case 14:
letter = "E";
break;
case 15: 
letter = "F";
break;
}
Hex7 += letter;
}
else {
    Hex7 += Integer.toString(Hex3);
}

if(Hex4>9) {
switch(Hex4){
case 10:
letter = "A";
break;
case 11: 
letter = "B";
break;
case 12:
letter = "C";
break;
case 13:
letter = "D";
break;
case 14:
letter = "E";
break;
case 15: 
letter = "F";
break;
}
Hex7 += letter;
}
else {
    Hex7 += Integer.toString(Hex4);
}

if(Hex5>9) {
switch(Hex5) {
case 10:
letter = "A";
break;
case 11: 
letter = "B";
break;
case 12:
letter = "C";
break;
case 13:
letter = "D";
break;
case 14:
letter = "E";
break;
case 15: 
letter = "F";
break;
}
Hex7 += letter;
}
else {
   Hex7 += Integer.toString(Hex5);
}

if(Hex6>9) {
switch(Hex6) {
case 10:
letter = "A";
break;
case 11: 
letter = "B";
break;
case 12:
letter = "C";
break;
case 13:
letter = "D";
break;
case 14:
letter = "E";
break;
case 15: 
letter = "F";
break;
}
Hex7 += letter;
}
else {
    Hex7 += Integer.toString(Hex6);
}

if(red<=0 || red>255 || green<=0 || green>255 || blue<=0 || blue>255){
System.out.println("Sorry, you must enter values between 0-255");
}
else{
    System.out.println("The decimal numbers R: " +red+" G: " +green+ "B: " +blue+ " is represented in hexadecimal as " +(Hex7));
}
}
}