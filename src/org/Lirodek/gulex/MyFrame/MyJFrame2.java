package org.Lirodek.gulex.MyFrame;

import java.awt.Toolkit;

import javax.swing.JFrame;


import java.awt.Container;

import javax.swing.JFrame;

public abstract class MyJFrame2 extends JFrame {
   protected Container contentPan = null;
   
   public MyJFrame2() {
      this("My JFrame",400,300);
      
   }
   public MyJFrame2(String title, int w, int h)  {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle(title);
      setSize(w, h);
      
      settingCenter(w,h);
      displayLayer();
      actionEvent();
   }
   
   protected void settingCenter(int w, int h) {
	   Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrW = ( int ) tk.getScreenSize().getWidth();
		int scrH = ( int ) tk.getScreenSize().getHeight();
		int x = scrW/2 - w/2;
		int y = scrH/2 - h/2;
		this.setLocation(x, y);
   }
   protected abstract void displayLayer();
   protected abstract void actionEvent();
}
