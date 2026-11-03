/*AIM
To write a Java Applet program to draw lines, rectangles and rounded rectangles using Graphics methods.

ALGORITHM
Step-1: Start the program.
Step-2: Import the required Java packages.
Step-3: Create an Applet class named linerect.
Step-4: Override the paint(Graphics g) method.
Step-5: Use drawLine() to draw straight lines.
Step-6: Use drawRect() to draw a rectangle.
Step-7: Use fillRect() to draw a filled rectangle
Step-8: Use drawRoundRect() and fillRoundRect() to draw rounded rectangles.
Step-9: Display the shapes in the Applet window.
Step-10: Stop the program. 
SOURCE CODE:*/ 
import java.awt.*; 
import java.io.*; 
import java.applet.*;
/*<applet code="linerect.class" height=300 width=300>
</applet>*/
public class linerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,10,50,50); g.drawRect(10,60,40,30);
g.fillRect(60,10,30,80);
g.drawRoundRect(10,100,80,50,10,10);
g.fillRoundRect(20,110,60,30,5,5);
g.drawLine(100,10,230,140);
g.drawLine(100,140,230,10);
}
}
/*RESULT:
Thus, the Java Applet program to draw lines, rectangles and rounded rectangles was executed successfully. */
