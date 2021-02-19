/* Tutorial #2
Yash's Second Java Tutorial
Program Information: Learning How To Declare Variables
Date: 2020 - 09 - 26
*/

//int is a type of variable used for integer whole numbers
//float is a type of variable used for decimal numbers
//double is a tpye of variable used for a lot of decimal numbers and is generally more precise than float

//char is a type of variable that will accept 1 letter or 1 character. Ex: "a"
//Boolean is a type of variable that will accept true or false values. It is like an "on" or "off" switch
//String is a type of variable that has a whole library to themselves. Can be thought of as a string of char variables/characters because you can make sentences and much more with strings. Ex: "Cool sentences can be made with strings"

import java.util.Scanner;
public class Variables {
public static void main(String[] args) {

int a = 0;
int b = 0;
int c = 0;

float d = 0;
float e = 0;
float f = 0;

double g = 0;
double h = 0;
double i = 0;

Scanner input = new Scanner (System.in);

System.out.println("Please enter the value you would like for A");
a = input.nextInt();

System.out.println("Please enter the value you would like for B");
b = input.nextInt();

System.out.println("Please enter the float value you would like for D");
d = input.nextFloat();

System.out.println("Please enter the float value you would like for E");
e = input.nextFloat();

System.out.println("Please enter the double value you would like for G");
g = input.nextDouble();

System.out.println("Please enter the double value you would like for H");
h = input.nextDouble();

input.close();
c = a + b;
f = d + e;
i = h + g;

System.out.println("The result of the 2 numbers is: " + c);
System.out.println("The result of the 2 float numbers is: " + f);
System.out.println("The result of the 2 double numbers is: " + i);

}
}