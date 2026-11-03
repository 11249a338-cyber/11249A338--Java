/*AIM
To write a Java Applet program to demonstrate BorderLayout using buttons and TextArea.

ALGORITHM
Step-1: Start the program.
Step-2: Import the required Java packages.
Step-3: Create an Applet class named insertdemo.
Step-4: Set the background color to cyan.
Step-5: Set the layout using BorderLayout().
Step-6: Add buttons to NORTH, SOUTH, EAST and WEST positions.
Step-7: Add a TextArea to the CENTER position.
Step-8: Set the margins using the getInsets() method.
Step-9: Display the BorderLayout components.
Step-10: Stop the program.
SOURCE CODE:*/
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}
/*RESULT:
Thus, the Java Applet program to demonstrate BorderLayout was executed successfully.
 */
