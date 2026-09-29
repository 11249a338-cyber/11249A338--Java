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
 