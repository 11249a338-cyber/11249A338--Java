import java.util.Scanner;
public class arithmeticoperators
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
while (true)
{
System.out.print("");
System.out.println("Enter the two numbers to perform operations");
System.out.println("Enter first number");
int x=s.nextInt();
System.out.println("Enter second number");
int y=s.nextInt();
System.out.println("choose the operation you want to perform");
System.out.println("choose 1 for addition");
System.out.println("choose 2 for subtraction");
System.out.println("choose 3 for multiplication");
System.out.println("choose 4 for division");
System.out.println("choose 5 for modulus");
System.out.println("choose 6 for exit");
int n=s.nextInt();
switch(n)
{
case 1:
int add;
add=x+y;
System.out.println("Result:" +add);
break;
case 2:
int sub;
sub=x-y;
System.out.println("Result:" +sub);
break;
case 3:
int mul;
mul=x*y;
System.out.println("Result:" +mul);
break;
case 4:
float div;
div=(float) x/y;
System.out.println("Result:" +div);
break;
case 5:
int mod;
mod=x%y;
System.out.println("Result:" +mod);
break;
case 6:
System.exit(0);
}
}
}
}

















