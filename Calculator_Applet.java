
import java.awt.*;
import javax.swing.*;

public class Calculator_Applet extends JApplet {
	public void init() {
		
	}
	
	public static void main (String [] args) {
		Calculator_Applet applet = new Calculator_Applet();
		JFrame calculator = new JFrame("calculator");
		
		calculator.add(applet);
		calculator.setSize(500, 400);
		applet.init();
		calculator.setVisible(true);
	}
}
