package org.Lirodek.Ex01ButtonEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.Accessible;
import javax.swing.JComponent;
import javax.swing.plaf.SliderUI;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.Lirodek.gulex.MyFrame.MyFrame;

public class Ex04ButtonEvent04 extends MyFrame{
	
	Panel p1 = new Panel(new GridBagLayout());
	Panel p2 = new Panel(new GridLayout(10,1));
	
	Checkbox cBox = new Checkbox(" ");
	TextField tfield = new TextField(15);
	String colorList[] = { "YELLO", "DARK", "GREEN", "BLUE", "GRAY", "DARKGRAY", "RED" };
	Button[] btn = new Button[7];
	{
		for(int i =0; i<7; i++)
		{
			btn[i] = new Button(colorList[i]);
		}
	}

	public Ex04ButtonEvent04() {
		super("두번째 실험", 680, 480);
		start();
		
	}
	private void start() {
		add(BorderLayout.CENTER, p1);
		p1.add(new Label("Center"));
		p1.setBackground(Color.DARK_GRAY);
		
		add(BorderLayout.WEST, p2);
		Panel inp1 = new Panel( );
		inp1.add(new Label("check 1 "));
		inp1.add(cBox);
		p2.add(inp1);
		
		Panel inp2 = new Panel( );
		inp2.add(new Label("   tField "));
		inp2.add(tfield);
		p2.add(inp2);
		
		int i=0;
		Panel inp3 = new Panel( );
		inp3.add(new Label(colorList[i]));
		inp3.add(btn[i]);
		p2.add(inp3);
		getColor(btn[i], p1);
		
		i+=1;
		Panel inp4 = new Panel( );
		inp4.add(new Label(colorList[i]));
		inp4.add(btn[i]);
		p2.add(inp4);
		
		
		i+=1;
		Panel inp5 = new Panel( );
		inp5.add(new Label(colorList[i]));
		inp5.add(btn[i]);
		p2.add(inp5);
		
		i+=1;
		Panel inp6 = new Panel( );
		inp6.add(new Label(colorList[i]));
		inp6.add(btn[i]);
		p2.add(inp6);
		
		i+=1;
		Panel inp7 = new Panel( );
		inp7.add(new Label(colorList[i]));
		inp7.add(btn[i]);
		p2.add(inp7);
		
		i+=1;
		Panel inp8 = new Panel( );
		inp8.add(new Label(colorList[i]));
		inp8.add(btn[i]);
		p2.add(inp8);
		
		i+=1;
		Panel inp9 = new Panel( );
		inp9.add(new Label(colorList[i]));
		inp9.add(btn[i]);
		p2.add(inp9);
		
		
		
	}
	private void getColor(Button btn, Panel p)
	{
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.yellow);
				
				
			}
		});
	}
	public static void main(String[] args) {
		new Ex04ButtonEvent04().setVisible(true);
	}

}
