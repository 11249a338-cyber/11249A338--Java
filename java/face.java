/* AIM
To write a Java Applet program to draw a human face using Graphics class methods.

ALGORITHM
Step-1: Start the program.
Step-2: Import the required Java packages.
Step-3: Create an Applet class named face.
Step-4: Override the paint(Graphics g) method.
Step-5: Use drawOval() to draw the face, eyes and ears.
Step-6: Use fillOval() to draw the eyeballs and nose.
Step-7: Use fillArc() to draw the mouth.
Step-8: Display the human face.
Step-9: Stop the program.
SOURCE CODE:*/
import java.awt.*; 
import java.io.*; 
import java.applet.*;
/*<applet code="face.class" height=300 width=300>
</applet>*/

public class face extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,120,150);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.fillOval(68,81,10,10);
g.fillOval(121,81,10,10);
g.fillOval(85,100,30,30);
g.fillArc(60,125,80,40,180,180);
g.drawOval(25,92,15,30);
g.drawOval(160,92,15,30);
}
}
/* RESULT:
Thus, the Java Applet program to draw a human face using Graphics methods was executed successfully.*/
