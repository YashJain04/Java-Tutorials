/* Tutorial #6
Yash's Sixth Java Tutorial
Program Information: Learning For Loops
Date: 2020 - 10 - 03
*/

import java.util.Scanner;

public class LoopsV2 {
 
public static void main (String[] args) {

Scanner input = new Scanner (System.in);

int start, finish, answer = 1;

System.out.println("Please enter the starting number for the factorial you would like to perform");
start = input.nextInt();

System.out.println("Please enter the ending number for the factorial you would like to perform");
finish = input.nextInt();

for (int x = start; x<= finish; x++) {
 answer *= x;
 
}

System.out.println("The factorial of " + finish + " from " + start + " is " + answer + ".");

input.close();

}

}