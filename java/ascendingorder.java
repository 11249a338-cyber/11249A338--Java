/*
Aim
To write a Java program to sort the elements of an array in ascending order.
Algorithm
Step 1: Start the program.
Step 2: Import the Scanner class.
Step 3: Read the number of elements n from the user.
Step 4: Create an integer array of size n.
Step 5: Read all the elements into the array.
Step 6: Compare each element with the remaining elements using nested for loops.
Step 7: If a[i] > a[j], swap the elements using a temporary variable.
Step 8: Display the array elements in ascending order.
Step 9: Stop the program.
Source Code: */
import java.util.Scanner;

public class ascendingorder {

    public static void main(String[] args) {

        int n, temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        // Sorting the array in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");

        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[n - 1]);

        s.close();
    }
}
/*
Output
Enter no. of elements you want in array: 5
Enter all the elements:
45
12
30
8
20
Ascending Order: 8, 12, 20, 30, 45

Result
Thus, the Java program to sort the elements of an array in ascending order was executed successfully.*/
