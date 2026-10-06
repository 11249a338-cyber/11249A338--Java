/*
AIM

To write a Java program to demonstrate interface implementation using the Animal interface and cat class.

ALGORITHM

Step-1: Start the program.
Step-2: Create an interface named Animal with two methods: animalsound() and sleep().
Step-3: Create a class cat that implements the Animal interface.
Step-4: Define the animalsound() method to display the cat's sound.
Step-5: Define the sleep() method to display the sleeping sound.
Step-6: Create an object mycat for the cat class.
Step-7: Call the animalsound() and sleep() methods using the object.
Step-8: Stop the program.

SOURCE CODE:
*/
interface Animal{
public void animalsound();
public void sleep();
}
class cat implements Animal{
public void animalsound(){
System.out.println("the cat says:meow meow");
}
public void sleep(){
System.out.println("zzzzzz");
}
}
class main{
public static void main(String[]args){
cat mycat=new cat();
mycat.animalsound();
mycat.sleep();
}
}
/*
OUTPUT
the cat says:meow meow
zzzzzz
RESULT

Thus, the Java program to implement an interface using the cat class was successfully executed and the required output was obtained.
  */
