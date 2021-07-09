import java.awt.*;
public class GraphicsEx extends Frame{
	public void paint(Graphics g1){
		g1.setColor(Color.MAGENTA);
		g1.drawLine(20, 40, 100, 20);
		g1.drawRect(100, 60, 150, 50);
		g1.drawOval(100, 60, 150, 50);
		g1.drawString("Shaanu", 459, 50);
		g1.fill3DRect(100, 60, 150, 50, getFocusTraversalKeysEnabled());
	}
	
	public static void main(String ar[]) {
		GraphicsEx g = new GraphicsEx();
        g.setSize (500,500);
        g.setVisible(true);
	}

}
