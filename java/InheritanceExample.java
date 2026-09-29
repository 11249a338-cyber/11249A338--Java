
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
