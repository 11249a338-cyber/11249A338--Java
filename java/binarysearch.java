import java.util.Scanner;
public class binarysearch{
public static void main(String [] args){
int marks[]=new int[6];
int i;
String name[]=new String[30];
Scanner scanner=new Scanner(System.in);
for(i=0;i<6;i++){
System.out.print("enter the name of the student and the marks of the subject"+(i+1)+":");
name[i]=scanner.next();
marks[i]=scanner.nextInt();
}
for(i=0;i<6;i++)
{
if(marks[i]>=60)
{
System.out.println(name[i]+" "+marks[i]);    
}
}
}
}
