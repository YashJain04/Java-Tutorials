/* Tutorial #7
Yash's Seventh Java Tutorial
Program Information: While Loops Continued And More
Date: 2020 - 10 - 10
*/

import java.util.Scanner;

public class LoopsV3 {
 
public static void main (String[] args) {

Scanner input = new Scanner (System.in);

int start, finish, answer = 1, boolCheck;
boolean doAgain = true;

do {
System.out.println("Please enter the starting number for the factorial you would like to perform");
start = input.nextInt();

System.out.println("Please enter the ending number for the factorial you would like to perform");
finish = input.nextInt();

for (int x = start; x<= finish; x++) {
 answer *= x;
 
}

System.out.println("The factorial of " + finish + " from " + start + " is " + answer + ".");

System.out.println("Would you like to run another factorial? 1 = Yes. 2 = No.");
boolCheck = input.nextInt();

if (boolCheck == 1)
    doAgain = true;

else
    doAgain = false;

} while (doAgain == true);


input.close();

}

}