/*
AIM:
To write a Java program to read and display the contents of a text file using the FileReader class.
ALGORITHM:
Step-1: Start the program.
Step-2: Import the java.io.* package.
Step-3: Create a FileReader object to open the file sample2.txt.
Step-4: Declare an integer variable i to store the character read from the file.
Step-5: Read the file character by character using the read() method.
Step-6: Continue reading until read() returns -1, which indicates the end of the file.
Step-7: Convert each character into char and display it on the screen.
Step-8: Close the file using the close() method.
Step-9: If any exception occurs, display the exception message.
Step-10: Stop the program.
SORCE CODE:
*/
import java.io.*;
class Filereader
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("sample2.txt");

            int i;

            while ((i = fr.read()) != -1)
            {
                System.out.println((char)i);
            }

            fr.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
/*
OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
RESULT:
Thus, the Java program to read and display the contents of sample2.txt using FileReader was successfully executed and the contents from A to Z were displayed.*/
