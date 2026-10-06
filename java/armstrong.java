/*
AIM:
To write a Java program to check whether a given positive number is an Armstrong number or not.

ALGORITHM:
Step-1: Start the program.
Step-2: Import the Scanner class to read input from the user.
Step-3: Read a positive number n from the user.
Step-4: Store the original number in the variable nu.
Step-5: Initialize num to 0.
Step-6: Extract the last digit using nu % 10.
Step-7: Find the cube of the extracted digit and add it to num.
Step-8: Remove the last digit using nu / 10.
Step-9: Repeat Steps 6–8 until nu becomes 0.
Step-10: Compare num with the original number n.
Step-11: If both are equal, display "Armstrong Number"; otherwise, display "Not an Armstrong Number".
Step-12: Stop the program.

SORCE CODE:*/
import java.util.Scanner;
public class armstrong{
public static void main(String[]args){
int n,nu,num=0,rem;
Scanner scan=new Scanner(System.in);
System.out.print("enter any positive number:");
n=scan.nextInt();
nu=n;
while(nu!=0)
{
rem=nu%10;
num=num+rem*rem*rem;
nu=nu/10;
}
if(num==n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("NOt an Armstrong Number");
}
}
}
/*
OUTPUT:
OUTPUT
enter any positive number: 153
Armstrong Number
enter any positive number:123
NOt an Armstrong Number
  
RESULT:
Thus, the Java program to check whether a given number is an Armstrong number or not was successfully executed and the required output was obtained.*/
