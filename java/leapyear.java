import java.util.Scanner;
public class leapyear
{
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
System.out.print("Enter any year:");
int year= s.nextInt();
Boolean flag=false;
if(year%400==0)
{
flag=true;
}
else if(year%4==0)
{
flag=true;
}
else{
flag=false;
}
if(flag)
{
System.out.println("year" +year+" is a leap year");
}
else
{
System.out.println("year" +year+" is not a leap year");
}
}
}

