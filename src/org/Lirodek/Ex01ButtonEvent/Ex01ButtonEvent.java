package org.Lirodek.Ex01ButtonEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;

import javax.print.attribute.standard.MediaSize.Engineering;
import javax.swing.AbstractAction;

import org.Lirodek.gulex.MyFrame.MyFrame;

public class Ex01ButtonEvent extends MyFrame {
	private Button[] btn = new Button[2];
	{
		for (int i = 0; i < 2; i++) {
			btn[i] = new Button("BUTTON" + i);
		}
	}
	private Panel southPan = new Panel(new FlowLayout());
	private Panel centPan = new Panel(new GridBagLayout());
	private Label txtLbl = new Label("didnt not press button");

	public Ex01ButtonEvent() {
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
		btn[0].addActionListener(new AbstractAction() 
		{
			int i=0;
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				i++;
				txtLbl.setText("[Result] First Button Press");
				
				
				
				Button btn = (Button)(e.getSource());
				if(i%2==0)
					btn.setBackground(Color.YELLOW);
				else if(i%2==1)
					btn.setBackground(Color.darkGray);
			}
			

		});
		
		btn[1].addActionListener(new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtLbl.setText("[Result] Second Button Press");
				Button btn = (Button)(e.getSource());
				btn.setBackground(Color.BLUE);
			}
		});
		
	}

	public static void main(String[] args) {
		new Ex01ButtonEvent().setVisible(true);

	}

}
