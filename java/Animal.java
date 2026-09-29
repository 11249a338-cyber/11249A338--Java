interface Animal{
public void animalsound();
public void sleep();
}
class cat implements Animal{
public void animalsound(){
System.out.println("the cat says:meow meow");
}
public void sleep(){
System.out.println("zzzzzz");
}
}
class main{
public static void main(String[]args){
cat mycat=new cat();
mycat.animalsound();
mycat.sleep();
}
}

