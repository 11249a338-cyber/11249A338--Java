/*
AIM:
To write a Java program to demonstrate multilevel inheritance using Animal, Dog, and puppy classes.

ALGORITHM:
Step-1: Start the program.
Step-2: Create a base class Animal with the eat() method.
Step-3: Create a class Dog that extends Animal and define the bark() method.
Step-4: Create a class puppy that extends Dog and define the weep() method.
Step-5: Create an object d of the puppy class.
Step-6: Call the eat() method using the puppy object.
Step-7: Call the bark() method using the same object.
Step-8: Call the weep() method using the same object.
Step-9: Display all the corresponding messages.
Step-10: Stop the program.

SOURCE CODE:
*/
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class puppy extends Dog{
void weep(){
System.out.println("puppy is weeping");
}
}

public class InheritanceExample {
    public static void main(String[] args) {
        puppy d = new puppy();

        d.eat();   
        d.bark();
        d.weep();
    }
}
/*
OUTPUT
Animal is eating
Dog is barking
puppy is weeping
    
RESULT:
Thus, the Java program to demonstrate multilevel inheritance was successfully executed and the required output was obtained.*/
