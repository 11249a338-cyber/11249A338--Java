/*
Aim
To write a Java program to print the Fibonacci series up to 10 terms.
Algorithm
Step 1: Start the program.
Step 2: Initialize n1 = 0, n2 = 1, and count = 10.
Step 3: Display the first two terms, n1 and n2.
Step 4: Use a for loop starting from i = 2 until i < count.
Step 5: Calculate the next term using n3 = n1 + n2.
Step 6: Display the value of n3.
Step 7: Update n1 = n2 and n2 = n3.
Step 8: Repeat Steps 5–7 until 10 terms are printed.
Step 9: Stop the program.
Source Code:*/
class fibonacci{
public static void main(String[]args)
{
int n1=0,n2=1,count=10;
System.out.print("Fibonacci:" + n1 + " " + n2);
for (int i=2;i<count;i++){
int n3=n1+n2;
System.out.print(" " + n3);
n1=n2;
n2=n3;
}
}
}
/*
Output
Fibonacci:0 1 1 2 3 5 8 13 21 34

Result
Thus, the Java program to print the Fibonacci series up to 10 terms was executed successfully.*/
