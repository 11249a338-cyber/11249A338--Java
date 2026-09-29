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
