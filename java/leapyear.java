/*
Aim
To write a Java program to check whether a given year is a leap year or not.
Algorithm
Step 1: Start the program.
Step 2: Import the Scanner class.
Step 3: Read the year from the user.
Step 4: Initialize the Boolean variable flag to false.
Step 5: Check whether the year is divisible by 400. If yes, set flag = true.
Step 6: Otherwise, check whether the year is divisible by 4. If yes, set flag = true; otherwise, set flag = false.
Step 7: If flag is true, display that the year is a leap year.
Step 8: Otherwise, display that the year is not a leap year.
Step 9: Stop the program.
Source Code:*/
import java.util.Scanner;
public class leapyear
{
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
System.out.print("Enter any year:");
int year= s.nextInt();
Boolean flag=false;
if(year%400==0)
{
flag=true;
}
else if(year%4==0)
{
flag=true;
}
else{
flag=false;
}
if(flag)
{
System.out.println("year" +year+" is a leap year");
}
else
{
System.out.println("year" +year+" is not a leap year");
}
}
}
/*
Output
Enter any year: 2024
year2024 is a leap year

Enter any year: 2023
year2023 is not a leap year

Result
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.*/
