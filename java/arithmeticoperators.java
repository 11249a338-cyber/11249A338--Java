/*
AIM:
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven program.

ALGORITHM:
Step-1: Start the program.
Step-2: Import the Scanner class to read input from the user.
Step-3: Create a Scanner object to accept two numbers.
Step-4: Read the first number x and second number y.
Step-5: Display the menu containing addition, subtraction, multiplication, division, modulus, and exit options.
Step-6: Read the user's choice using the switch statement.
Step-7: If the choice is 1, calculate x + y and display the result.
Step-8: If the choice is 2, calculate x - y and display the result.
Step-9: If the choice is 3, calculate x * y and display the result.
Step-10: If the choice is 4, calculate x / y and display the result.
Step-11: If the choice is 5, calculate x % y and display the remainder.
Step-12: If the choice is 6, terminate the program using System.exit(0).
Step-13: Repeat the operations until the user selects the exit option.
Step-14: Stop the program.

SOURCE CODE:*/
import java.util.Scanner;
public class arithmeticoperators
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
while (true)
{
System.out.print("");
System.out.println("Enter the two numbers to perform operations");
System.out.println("Enter first number");
int x=s.nextInt();
System.out.println("Enter second number");
int y=s.nextInt();
System.out.println("choose the operation you want to perform");
System.out.println("choose 1 for addition");
System.out.println("choose 2 for subtraction");
System.out.println("choose 3 for multiplication");
System.out.println("choose 4 for division");
System.out.println("choose 5 for modulus");
System.out.println("choose 6 for exit");
int n=s.nextInt();
switch(n)
{
case 1:
int add;
add=x+y;
System.out.println("Result:" +add);
break;
case 2:
int sub;
sub=x-y;
System.out.println("Result:" +sub);
break;
case 3:
int mul;
mul=x*y;
System.out.println("Result:" +mul);
break;
case 4:
float div;
div=(float) x/y;
System.out.println("Result:" +div);
break;
case 5:
int mod;
mod=x%y;
System.out.println("Result:" +mod);
break;
case 6:
System.exit(0);
}
}
}
}
/*
OUTPUT:
Enter the two numbers to perform operations
Enter first number
20
Enter second number
5
choose the operation you want to perform
choose 1 for addition
choose 2 for subtraction
choose 3 for multiplication
choose 4 for division
choose 5 for modulus
choose 6 for exit
Addition
Result:25
Subtraction
Result:15
Multiplication
Result:100
Division
Result:4.0
Modulus
Result:0
Exit
choose 6 for exit

RESULT:
Thus, the Java program to perform arithmetic operations using a menu-driven switch statement was successfully executed and the required results were obtained.*/
