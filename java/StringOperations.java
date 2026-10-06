/*
AIM:
To write a Java program to demonstrate various String operations such as creating strings, finding length, concatenation, comparison, case conversion, replacement, searching, and checking prefixes and suffixes.

ALGORITHM:
Step-1: Start the program.
Step-2: Create strings using string literals and the String constructor.
Step-3: Display the created strings and find their length using length().
Step-4: Perform string concatenation using + operator and concat() method.
Step-5: Compare strings using equals(), equalsIgnoreCase(), and compareTo().
Step-6: Convert a string into uppercase and lowercase using toUpperCase() and toLowerCase().
Step-7: Replace a particular word using the replace() method.
Step-8: Compare strings using the == operator.
Step-9: Find the last occurrence of a substring using lastIndexOf().
Step-10: Remove digits from a string using replaceAll().
Step-11: Check whether a string starts or ends with a particular value using startsWith() and endsWith().
Step-12: Concatenate first name and last name using the + operator.
Step-13: Display all the results.
Step-14: Stop the program.
SOURCE CODE:*/
public class StringOperations {
    public static void main(String[] args) {

        // 1. Creating Strings
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 2. Length
        System.out.println("Length: " + str1.length());

        // 3. Concatenation
        System.out.println("Concatenation: " + str1 + " " + str2);
        System.out.println("Using concat(): " + str1.concat(" Java"));

        // 4. Comparing Strings
        String a = "Java";
        String b = "Java";

        System.out.println("equals(): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " +
                a.equalsIgnoreCase("JAVA"));

        System.out.println("compareTo(): " + a.compareTo(b));


        // 7. Uppercase and Lowercase
        String str4 = "Java Programming";

        System.out.println("Uppercase: " + str4.toUpperCase());
        System.out.println("Lowercase: " + str4.toLowerCase());

        // 9. Replace
        System.out.println("Replace: " +
                str4.replace("Java", "Python"));
     
        // 16. String comparison using ==
        String x = "Java";
        String y = "Java";

        System.out.println("Using == : " + (x == y));

        // 17. lastIndexOf()
        String text = "Java Programming Java";

        System.out.println("Last index of Java: "
                + text.lastIndexOf("Java"));

        // 18. replaceAll()
        String data = "Java123Programming456";

        System.out.println("replaceAll(): "
                + data.replaceAll("[0-9]", ""));

        // 19. startsWith() and endsWith()
        String file = "program.java";

        System.out.println("Starts with program: "
                + file.startsWith("program"));

        System.out.println("Ends with .java: "
                + file.endsWith(".java"));

        // 20. String concatenation using +
        String firstName = "John";
        String lastName = "Smith";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);
    }
}
/*
OUTPUT:
str1: Hello
str2: World
Length: 5
Concatenation: Hello World
Using concat(): Hello Java
equals(): true
equalsIgnoreCase(): true
compareTo(): 0
Uppercase: JAVA PROGRAMMING
Lowercase: java programming
Replace: Python Programming
Using == : true
Last index of Java: 18
replaceAll(): JavaProgramming
Starts with program: true
Ends with .java: true
Full Name: John Smith
    
RESULT:
Thus, the Java program to demonstrate various String operations and methods was successfully executed and the required output was obtained.*/
