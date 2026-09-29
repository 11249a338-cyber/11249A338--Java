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
