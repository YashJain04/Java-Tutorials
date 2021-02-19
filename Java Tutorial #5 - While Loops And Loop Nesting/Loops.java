/* Tutorial #5
Yash's Fifth Java Tutorial
Program Information: Learning While Loops and Loop Nesting
Date: 2020 - 10 - 03
*/

import java.util.Scanner;

public class Loops {
public static void main(String[] args) {

float a, b, c;
int d, e;
boolean doAgain = true;

Scanner userInput = new Scanner (System.in);

while (doAgain == true)

{

System.out.println("Please enter the first value.");
a = userInput.nextFloat(); 

System.out.println("Please enter the second value.");
b = userInput.nextFloat(); 

System.out.println("Please enter the type of function you would like to perform. [1 = Addition. 2 = Subtraction. 3 = Multiplication. 4 = Divison.]");
d = userInput.nextInt();

if (d == 1)
{
    c = a + b;
    System.out.println(c);
}

else if (d == 2)
{
    c = a - b;
    System.out.println(c);
}

else if (d == 3)
{
    c = a * b;
    System.out.println(c);
}

else if (d == 4)
{
    c = a/b;
    System.out.println(c);
}

else
{
    System.out.println("I'm sorry, the operation you input was invalid.");
}

System.out.println("Would you like to do another calculation. 1 = Yes. 2 = No.");
e = userInput.nextInt();

if (e == 1)
{
    doAgain = true;
}

else
{
    doAgain = false;
}

}

userInput.close();

}
}