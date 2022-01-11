package org.Lirodek.Ex02ButtonEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import org.Lirodek.gulex.MyFrame.MyJFrame;

public class Ex02FrameStartSwing extends MyJFrame {
	int w=480, h=260;

	public Ex02FrameStartSwing() {
		super("제목", 480, 260);
	}
	
	private void start() {

	}

	private void endProcess() {
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램을 종료합니다.");
				dispose();
				System.exit(0);
			}
		
		});
		
	}

	public static void main(String[] args) {
		
		new Ex02FrameStartSwing().setVisible(true);
		
	}
}
