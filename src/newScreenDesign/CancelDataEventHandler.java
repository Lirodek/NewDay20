package newScreenDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CancelDataEventHandler extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		System.exit(0);
		
	}

}
