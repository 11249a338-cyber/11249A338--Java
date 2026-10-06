/*
AIM:
To write a Java program to demonstrate thread control methods such as yield(), sleep(), and thread termination using break.

ALGORITHM:
Step-1: Start the program.
Step-2: Create three classes A, B, and C by extending the Thread class.
Step-3: In thread A, use Thread.yield() to temporarily give other threads an opportunity to execute.
Step-4: Display the values of i from 1 to 4 in thread A.
Step-5: In thread B, display the values of j from 1 to 3.
Step-6: Use break when j becomes 3 to terminate the loop in thread B.
Step-7: In thread C, display the values of k from 1 to 5.
Step-8: When k is 1, use Thread.sleep(1500) to pause thread C for 1500 milliseconds.
Step-9: Create objects a, b, and c for the three threads.
Step-10: Start all three threads using the start() method.
Step-11: Display the message indicating the end of the main thread.
Step-12: Stop the program.

SOURCE CODE:*/
import java.io.*;

class A extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                Thread.yield(); // FIXED: Called using Thread.yield()
            }
            System.out.println("From thread A i=" + i);
        }
        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j < 5; j++) {
            System.out.println("from thread B j=" + j);
            if (j == 3) {
                System.out.println("exit from B");
                break; // FIXED: Used 'break' instead of the unsafe, broken stop()
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread c=" + k);
            if (k == 1) {
                try {
                    Thread.sleep(1500); // FIXED: Best practice to use Thread.sleep()
                } catch (Exception e) { // FIXED: Changed variable name to 'e' to avoid confusion
                    System.out.println("Exit from c");
                }
            }
        }
    }
}

class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        System.out.println("start thread A");
        a.start();
        b.start();
        c.start();
        System.out.println("exit from main thread");
    }
}
/*
OUTPUT:
start thread A
exit from main thread
from thread B j=1
thread c=1
From thread A i=1
From thread A i=2
From thread A i=3
From thread A i=4
exit from A
from thread B j=2
from thread B j=3
exit from B
thread c=2
thread c=3
thread c=4
thread c=5

RESULT:
Thus, the Java program to demonstrate thread control methods yield(), sleep(), and break was successfully executed and the required output was obtained.*/
