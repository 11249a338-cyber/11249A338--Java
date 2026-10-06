/*
AIM:
To write a Java program to demonstrate thread priority by creating three threads and assigning different priority levels to them.

ALGORITHM:
Step-1: Start the program.
Step-2: Create three classes A, B, and C that extend the Thread class.
Step-3: Override the run() method in each class to display thread messages and numbers from 1 to 4.
Step-4: Create objects threadA, threadB, and threadC.
Step-5: Assign maximum priority to threadC using Thread.MAX_PRIORITY.
Step-6: Assign priority to threadB using threadA.getPriority()+1.
Step-7: Assign minimum priority to threadA using Thread.MIN_PRIORITY.
Step-8: Start thread A, thread B, and thread C using the start() method.
Step-9: Display the execution messages of all three threads.
Step-10: Display the end of the main thread.
Step-11: Stop the program.

SORCE CODE:*/
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started");
for (int i=1;i<=4;i++)
{
System.out.println("From thread A i=" + i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started");
for (int j=1;j<=4;j++)
{
System.out.println("From thread B j=" + j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("Thread C started");
for (int k=1;k<=4;k++)
{
System.out.println("From thread C k=" + k);
}
System.out.println("exit from C");
}
}
class ThreadPriority
{
public static void main(String[]args)
{
A threadA=new A();
B threadB=new B();
C threadC=new C();
threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority()+1);
threadA.setPriority(Thread.MIN_PRIORITY);
System.out.println("start thread A");
threadA.start();
System.out.println("start thread B");
threadB.start();
System.out.println("start thread C");
threadC.start();
System.out.println("end of main thread");
}
}
/*
OUTPUT:
start thread A
start thread B
start thread C
end of main thread
Thread C started
From thread C k=1
From thread C k=2
From thread C k=3
From thread C k=4
exit from C
Thread B started
From thread B j=1
From thread B j=2
From thread B j=3
From thread B j=4
exit from B
Thread A started
From thread A i=1
From thread A i=2
From thread A i=3
From thread A i=4
exit from A

RESULT:
Thus, the Java program to demonstrate thread priority using MIN_PRIORITY, MAX_PRIORITY, setPriority(), and getPriority() was successfully executed and the required output was obtained.*/
