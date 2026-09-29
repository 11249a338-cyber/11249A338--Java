import java.util.Scanner;
public class armstrong{
public static void main(String[]args){
int n,nu,num=0,rem;
Scanner scan=new Scanner(System.in);
System.out.print("enter any positive number:");
n=scan.nextInt();
nu=n;
while(nu!=0)
{
rem=nu%10;
num=num+rem*rem*rem;
nu=nu/10;
}
if(num==n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("NOt an Armstrong Number");
}
}
}

