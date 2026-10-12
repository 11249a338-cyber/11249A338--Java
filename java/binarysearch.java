/*
Aim
To write a Java program to display the names and marks of students who scored 60 or above.
Algorithm
Step 1: Start the program.
Step 2: Declare an integer array marks of size 6 and a string array name of size 30.
Step 3: Create a Scanner object to get input from the user.
Step 4: Read the names and marks of six students using a for loop.
Step 5: Check each student's marks using another for loop.
Step 6: If the marks are greater than or equal to 60, display the student's name and marks.
Step 7: Repeat the process until all six students have been checked.
Step 8: Stop the program.
Source Code:
*/
import java.util.Scanner;
public class binarysearch{
public static void main(String [] args){
int marks[]=new int[6];
int i;
String name[]=new String[30];
Scanner scanner=new Scanner(System.in);
for(i=0;i<6;i++){
System.out.print("enter the name of the student and the marks of the subject"+(i+1)+":");
name[i]=scanner.next();
marks[i]=scanner.nextInt();
}
for(i=0;i<6;i++)
{
if(marks[i]>=60)
{
System.out.println(name[i]+" "+marks[i]);    
}
}
}
}
/*
Output
enter the name of the student and the marks of the subject1:Arun 75
enter the name of the student and the marks of the subject2:Priya 85
enter the name of the student and the marks of the subject3:Ram 45
enter the name of the student and the marks of the subject4:Kavi 60
enter the name of the student and the marks of the subject5:Raj 35
enter the name of the student and the marks of the subject6:Anu 90
Arun 75
Priya 85
Kavi 60
Anu 90

Result
Thus, the Java program to display the names and marks of students who scored 60 or above was executed successfully.*/
