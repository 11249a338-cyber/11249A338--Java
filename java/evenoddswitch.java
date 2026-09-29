import java.util.Scanner;
public class evenoddswitch{
public static void main(String [] args){
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.println("This number is even");
break;
case 1:
System.out.println("This number is odd:");
break;
}
}
}