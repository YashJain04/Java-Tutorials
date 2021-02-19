/* Tutorial #3
Yash's Third Java Tutorial
Program Information: Learning More About Strings
Date: 2020 - 09 - 27
*/

import java.util.Scanner;
public class Strings {
public static void main(String[] args) {

String name; //Example: YASH
Scanner input = new Scanner (System.in);

System.out.println("Enter you first name!");
name = input.next();

input.close();
System.out.println("Hello " + name + ", welcome to the java experience!");

/*
Strings are a whole library of classes and much more.

Remeber programming languages start to count from 0 not from 1. It goes like 0, 1, 2 and so on. It starts from 0.

The 4 main library classes you might use in everyday coding consist of:

Length - Returns the total length of the string. Ex: name.length(); 4. This is because the name which is YASH is 4 letters long.

charAt - Can find position of the characters in the string. They go off of the length. Ex: Lets say we want to get the H out of the name string. It would look like name.chartAt(3) = H.

substring - Substring can create smaller strings out of the original string. Ex: So we could another string thats called name2. If we had name2 = name.substring(0,1). We would get the output of Y. The first coordinate represents the starting position, meanwhile the second coordinate represents the ending location of the substring. Example: name2 = name.substring(0,1) Y. It outputs Y because it counted 0 and ended at 1. Example: name2 = name.substring(0,2) YA. It outputed YA because it counted 0 and 1 which is YA and ended at 2 so it did not count S and whatever is after it.

concat - Short for concat nation which means to stick 2 things together. Example: name.concat("aleous") = YASHaleous. It combined the variable name (which was a string variable) with something called aleous. The variable name had the value YASH stored in it. So it combined YASH with what was in quotes which is aleous. The output became YASHaleous.
If you had stored car in the variable and in quotes you wrote shop. You would get something like carshop. It combined them together.
*/

}
    
}