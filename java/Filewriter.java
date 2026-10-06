/*
AIM:
To write a Java program to write the characters A to Z into a file using the FileWriter class.

ALGORITHM:
Step-1: Start the program.
Step-2: Import the java.io.* package.
Step-3: Create a FileWriter object for the file sample2.txt.
Step-4: Initialize the character value with ASCII value 65 (A).
Step-5: Use a for loop to generate characters from ASCII value 65 to 90 (Z).
Step-6: Write each character into sample2.txt using the write() method.
Step-7: Display each character on the screen using System.out.print().
Step-8: Close the file using the close() method.
Step-9: If an exception occurs, display the exception message.
Step-10: Stop the program.

SORCE CODE:*/
import java.io.*;
class Filewriter
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("sample2.txt");

            for (char i = 65; i < 91; i++)
            {
                fw.write(i);
System.out.print(i);
            }

            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
/*
OUTPUT:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
RESULT:
Thus, the Java program to write characters A to Z into a file using FileWriter was successfully executed, and the characters were stored in sample2.txt and displayed on the screen.*/
