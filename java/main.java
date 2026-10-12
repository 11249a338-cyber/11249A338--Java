/*
Aim
To write a Java program to demonstrate the implementation of an interface using a class.
Algorithm
Step 1: Start the program.
Step 2: Create an interface named Animal with two methods, animalsound() and sleep().
Step 3: Create a class named cat that implements the Animal interface.
Step 4: Define the animalsound() method to display the sound made by a cat.
Step 5: Define the sleep() method to display the sleeping sound.
Step 6: Create the main() method in the main class.
Step 7: Create an object of the cat class.
Step 8: Call the animalsound() and sleep() methods using the object.
Step 9: Stop the program.
Source Code:*/
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
Output
the cat says:meow meow
zzzzzz

Result
Thus, the Java program to demonstrate the implementation of an interface was executed successfully.*/
