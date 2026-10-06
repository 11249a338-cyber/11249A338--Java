/*
AIM:
To write a Java program to demonstrate multithreading by creating two threads using the Thread class.

ALGORITHM:
Step-1: Start the program.
Step-2: Create a class A that extends the Thread class.
Step-3: Override the run() method in class A to print numbers from 1 to 5.
Step-4: Create a class B that extends the Thread class.
Step-5: Override the run() method in class B to print numbers from 1 to 5.
Step-6: Create objects threadA and threadB for classes A and B.
Step-7: Start both threads using the start() method.
Step-8: The two threads execute their run() methods concurrently.
Step-9: Display the output produced by both threads.
Step-10: Stop the program.
SORCE CODE:*/
class A extends Thread
{
public void run()
{
for (int i=1;i<=5;i++)
{
System.out.println("Thread A:"+i);
}
}
}
class B extends Thread
{
public void run()
{
for (int j=1;j<=5;j++)
{
System.out.println("Thread B:"+j);
}
}
}
class Multithreading
{
public static void main(String[]args)
{
A threadA=new A();
B threadB=new B();
threadA.start();
threadB.start();
}
}
/*
OUTPUT:
Thread A:1
Thread A:2
Thread B:1
Thread B:2
Thread A:3
Thread B:3
Thread A:4
Thread B:4
Thread A:5
Thread B:5
  
RESULT:
Thus, the Java program to demonstrate multithreading using the Thread class was successfully executed and the required output was obtained.*/
