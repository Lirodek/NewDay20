package org.Lirodek.Ex01ButtonEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.Lirodek.gulex.MyFrame.MyFrame;

public class Ex03ButtonEventEx03 extends MyFrame{
	
	Panel leftPan = new Panel( new GridLayout( 10,1 ) );
	Button btn1 = new Button("Btn1");
	
	Panel centPan = new Panel( new GridBagLayout() );
	TextField txtFld1 = new TextField(10);
	TextField txtFld2 = new TextField(10);
	TextField txtFld3 = new TextField(10);
	TextField txtFld4 = new TextField(10);

	public Ex03ButtonEventEx03() 
	{
		super("Member Management System", 640, 480);
		add(BorderLayout.WEST, leftPan);
		
		Panel rowPan1 = new Panel();
		rowPan1.add( new Label("Button 1 : ") );
		rowPan1.add(btn1);
		
		Panel rowPan2 = new Panel();
		rowPan2.add( new Label("text01") );
		rowPan2.add(txtFld1);
		
		Panel rowPan3 = new Panel();
		rowPan3.add( new Label("text02") );
		rowPan3.add(txtFld2);
		
		Panel rowPan4 = new Panel();
		rowPan4.add( new Label("text03") );
		rowPan4.add(txtFld3);
		
		leftPan.add(rowPan1);
		leftPan.add(rowPan2);
		leftPan.add(rowPan3);
		leftPan.add(rowPan4);

		actionButton(btn1, centPan);
		add(BorderLayout.CENTER, centPan);
		centPan.add(new Label("Center"));
		centPan.setBackground(Color.darkGray);
	}
	
	private void actionButton(Button b, final Panel p) {
		b.addActionListener(new ActionListener() {
			int i=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				Button btn = (Button)e.getSource();
				if((i % 2) == 0)
					p.setBackground(Color.yellow);
				else
					p.setBackground(Color.DARK_GRAY);
				
				
				
			}
		});
		
	}

	public static void main(String[] args) {
		new Ex03ButtonEventEx03().setVisible(true);;

	}

}
