import java.awt.Container;
import java.util.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JFrameEx extends JFrame implements ActionListener{
	
	public JFrameEx() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		Container c = this.getContentPane();
		ImageIcon img = new ImageIcon(getClass().getResource("yellowFlower.png"));
		
		JLabel j1= new JLabel("test", img,JLabel.LEFT );
		JButton jb = new JButton(img);
		jb.addActionListener(this);
		
		JTabbedPane p = new JTabbedPane();
		p.add("one", new Home());
		p.add("two", new View());
		
		c.add(j1);
		c.add(jb);
		this.add(p);
	}
	

	public void actionPerformed(ActionEvent e) {
		System.out.println( new Date());
	}
	
public static void main(String ar[]) {
	JFrameEx f = new JFrameEx();
	f.setSize(500, 400);
	f.setVisible(true);
	
	
}
}

class Home extends JPanel{
	public Home() {
		// TODO Auto-generated constructor stub
		JButton jb1 = new JButton();
		JButton jb2 = new JButton();
		JButton jb3 = new JButton();
	}
}


class View extends JPanel{
	public View() {
		// TODO Auto-generated constructor stub
		JButton jb1 = new JButton();
		JButton jb2 = new JButton();
		JButton jb3 = new JButton();
	}
}
