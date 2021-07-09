import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerEx {
public static void main(String ar[]) {
	
	Frame f = new Frame("Window Listener");
	f.setVisible(true);
	f.setSize(400,200);
	
	MyListener s = new MyListener();
	f.addWindowListener(s);
	
}
}

class MyListener implements WindowListener  // interface should have all the methods overrides
{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window deactivated");
		
	}
	}