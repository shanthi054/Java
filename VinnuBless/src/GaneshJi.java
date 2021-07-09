

import javax.swing.*;
import java.awt.*;

public class GaneshJi extends JFrame {

	private ImageIcon Gimage;
	private JLabel GaneshLabel;
	private ImageIcon Flowerimage;
	private JLabel FlowerLabel;
	JPanel p;

	GaneshJi() {
		FlowLayout fl = new FlowLayout();
		setLayout(fl);

		Gimage = new ImageIcon(getClass().getResource("Ganesh.jpg"));
		// setLayout(new FlowLayout());
		Flowerimage = new ImageIcon(getClass().getResource("test.gif"));
		FlowerLabel = new JLabel(Flowerimage);
		GaneshLabel = new JLabel(Gimage);

		add(GaneshLabel);
		add(FlowerLabel);
		   
	}

	void setup() {
	}

	void draw() {
	}

	public static void main(String ar[]) {
		GaneshJi gui = new GaneshJi();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setBackground(Color.blue);
		gui.setTitle("Vinnu");

	}

}
