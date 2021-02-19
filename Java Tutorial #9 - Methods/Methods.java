/* Tutorial #9
Yash's Ninth Java Tutorial
Program Information: Learning Methods
Date: 2020 - 10 - 10
*/

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int num1, num2, answer = 0, select = 7;
        boolean doAgain = true;
        String verbal  = "";

    while (doAgain == true) {

        System.out.println("Please enter the first variable");
        num1 = input.nextInt();

        System.out.println("Please enter the second variable");
        num2 = input.nextInt();

        while (select > 6 || select < 1) {
            System.out.println("");
            System.out.println("Please enter the type of operation you would like to execute. 1 = Addition. 2 = Subtraction. 3 = Multiplication. 4 = Division. 5 = Factorial. 6 = Remainder.");
            select = input.nextInt();
        }

        switch (select) {
            case 1: 
                answer = addNums (num1, num2);
                verbal = "sum";
                System.out.println("");
                System.out.println("The outcome is " + addNums(num1, num2));
                break;
            
            case 2: 
                answer = subNums (num1, num2);
                verbal = "difference";
                System.out.println("");
                System.out.println("The outcome is " + subNums(num1, num2));
                break;
            
            case 3: 
                answer = multiNums (num1, num2);
                verbal = "product";
                System.out.println("");
                System.out.println("The outcome is " + multiNums(num1, num2));
                break;
        
            case 4: 
                answer = divNums (num1, num2);
                verbal = "quotient";
                System.out.println("");
                System.out.println("The outcome is " + divNums(num1, num2));
                break;
            
            case 5: 
                answer = factNums (num1, num2);
                verbal = "factorial";
                System.out.println("");
                System.out.println("The outcome is " + factNums(num1, num2));
                break;
            
            case 6: 
                answer = modNums (num1, num2);
                verbal = "remainer";
                System.out.println("");
                System.out.println("The outcome is " + modNums(num1, num2));
                break;
        }

        System.out.println(" \nWould you like to repeat the program? 1 = Yes. 2 = No.");
        int repeatProgram = input.nextInt();
        System.out.println("");

        if (repeatProgram == 1) {
            doAgain = true;
        }

        else
            doAgain = false;{

        }

    }

        input.close();
    
    }

        public static int addNums (int num1, int num2) {
            int c;
            c = num1 + num2;
            return c;
        }

        public static int subNums (int num1, int num2) {
            int c;
            c = num1 - num2;
            return c;
        }

        public static int multiNums (int num1, int num2) {
            int c;
            c = num1 * num2;
            return c;
        }

        public static int divNums (int num1, int num2) {
            int c;
            c = num1 / num2;
            return c;
        }

        public static int factNums (int num1, int num2) {
            int c = 1;
            
            for (int x = num1; x <= num2; x++) {
                c *= x;
            }

            return c;
        }

        public static int modNums (int num1, int num2) {
            int c;
            c = num1 % num2;
            return c;
        }
}

/* Kaikarden's Program
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int num1, num2, answer = 0, select = 7;
        String verbal  = "";

        System.out.println("Please enter the first variable");
        num1 = input.nextInt();

        System.out.println("Please enter the second variable");
        num2 = input.nextInt();

        while (select > 6 || select < 1) {
            System.out.println("Please enter the type of operation you would like to execute. 1 = Addition. 2 = Subtraction. 3 = Multiplication. 4 = Division. 5 = Factorial. 6 = Remainder.");
            select = input.nextInt();
        }

        switch (select) {
            case 1: 
                answer = addNums (num1, num2);
                verbal = "sum";
                break;
            
            case 2: 
                answer = subNums (num1, num2);
                verbal = "sum";
                break;
            
            case 3: 
                answer = multiNums (num1, num2);
                verbal = "sum";
                break;
        
            case 4: 
                answer = divNums (num1, num2);
                verbal = "sum";
                break;
            
            case 5: 
                answer = factNums (num1, num2);
                verbal = "sum";
                break;
            
            case 6: 
                answer = modNums (num1, num2);
                verbal = "sum";
                break;
        }
    
        public static int addNums (int a, int b) {
            int c;
            c = a + b;
            return c;
        }

        public static int subNums (int a, int b) {
            int c;
            c = a - b;
            return c;
        }

        public static int multiNums (int a, int b) {
            int c;
            c = a * b;
            return c;
        }

        public static int divNums (int a, int b) {
            int c;
            c = a / b;
            return c;
        }

        public static int factNums (int a, int b) {
            int c = 1;
            
            for (int x = a; x <= b; x++) {
                c *= y;
            }

            return c;
        }

        public static int modNums (int a, int b) {
            int c;
            c = a % b;
            return c;
        }
    }
}
*/