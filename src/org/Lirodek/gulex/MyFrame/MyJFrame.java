package org.Lirodek.gulex.MyFrame;

import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyJFrame extends MyJFrame2 {
	
	private Container contentPan = null;
	
	MyJFrame(){
		this("",200,200);
	}

	public MyJFrame(String title, int w, int h) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle( title );
		setSize( w, h );
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrW = ( int ) tk.getScreenSize().getWidth();
		int scrH = ( int ) tk.getScreenSize().getHeight();
		int x = scrW/2 - w/2;
		int y = scrH/2 - h/2;
		this.setLocation(x, y);
	}

	@Override
	protected void displayLayer() {
		// TODO Auto-generated method stub
		contentPan = getContentPane();
	}

	@Override
	protected void actionEvent() {
		// TODO Auto-generated method stub
		
	}

		
		

}
