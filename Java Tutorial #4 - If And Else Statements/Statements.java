/* Tutorial #4
Yash's Fourth Java Tutorial
Program Information: Learning Statements and Conditions
Date: 2020 - 10 - 03
*/

import java.util.Scanner;

public class Statements {
public static void main(String[] args) {

float a, b, c;
int d;

Scanner userInput = new Scanner (System.in);

System.out.println("Please enter the first value.");
a = userInput.nextFloat(); 

System.out.println("Please enter the second value.");
b = userInput.nextFloat(); 

System.out.println("Please enter the type of function you would like to perform. [1 = Addition. 2 = Subtraction. 3 = Multiplication. 4 = Divison.]");
d = userInput.nextInt();

userInput.close();

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

}
}