/*
Aim
To write a Java program to check whether a given number is even or odd using a switch statement.
Algorithm
Step 1: Start the program.
Step 2: Import the Scanner class.
Step 3: Declare an integer variable n.
Step 4: Read a number from the user.
Step 5: Calculate the remainder using n % 2.
Step 6: Use a switch statement to check the remainder.
Step 7: If the remainder is 0, display “This number is even”.
Step 8: If the remainder is 1, display “This number is odd”.
Step 9: Stop the program.
Source Code:
*/
import java.util.Scanner;
public class evenoddswitch{
public static void main(String [] args){
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.println("This number is even");
break;
case 1:
System.out.println("This number is odd:");
break;
}
}
}
/*
Output
Enter a number
8
This number is even

Enter a number
7
This number is odd:

Result
Thus, the Java program to check whether a given number is even or odd using a switch statement was executed successfully.*/
