package org.Lirodek.Ex01ButtonEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.MediaSize.Engineering;
import javax.swing.AbstractAction;

import org.Lirodek.gulex.MyFrame.MyFrame;

public class Ex01ButtonEvent2 extends MyFrame implements ActionListener{
	private Button[] btn = new Button[2];
	{
		for (int i = 0; i < 2; i++) {
			btn[i] = new Button("BUTTON" + i);
		}
	}
	private Panel southPan = new Panel(new FlowLayout());
	private Panel centPan = new Panel(new GridBagLayout());
	private Label txtLbl = new Label("didnt not press button");

	public Ex01ButtonEvent2() {
		super("ButtonEventTest", 300, 100);
		start();

	}

	private void start() {
		add(BorderLayout.SOUTH, southPan);
		add(BorderLayout.NORTH, centPan);
		centPan.add(txtLbl);
		
		southPan.add(btn[0]);
		southPan.add(btn[1]);
		ButtonEvent();
	}
	private void ButtonEvent() {
		  btn[0].addActionListener(this);
	      btn[1].addActionListener(this);
	}


	public static void main(String[] args) {
		new Ex01ButtonEvent2().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(btn[0].equals(e.getSource()))
			txtLbl.setText("[Result] Button 1 Press");
		else
			txtLbl.setText("[Result] Button 2 Press");
//		if(e.getSource() instanceof Button)
//		{
//			Button btn = (Button)e.getSource();
//			if(btn[0].equals(btn))
//				txtLbl.setText("[Result] btn1 press");
//			else
//				txtLbl.setText("[Result] btn2 press");
//		}
	}

}
