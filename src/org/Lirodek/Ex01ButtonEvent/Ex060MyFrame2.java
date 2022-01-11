package org.Lirodek.Ex01ButtonEvent;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.Lirodek.gulex.MyFrame.MyJFrame2;

public class Ex060MyFrame2 extends MyJFrame2{
	Container contentPan = null;
	JButton btn1;
	JButton btn2;
	Ex060MyFrame2(){
		super("",300,320);
	}
	
	@Override
	protected void displayLayer() {
		contentPan = getContentPane();
//		JPanel jpl =  new JPanel( new GridLayout(9, 1) );
//		JPanel jpl1 = new JPanel( new GridLayout(1, 2) );
//		
//		JPanel jpl01 = new JPanel( new GridLayout(1, 2) );
//		jpl.add(jpl01);
//		
//		JPanel jpl0 = new JPanel( new GridLayout(1, 2) );
//		jpl.add(jpl0);
//		
//		jpl.add(jpl1);
//		jpl1.add(new JLabel("이름:"));
//		jpl1.add(new JTextField(10));
//		
//		JPanel jpl2 = new JPanel( new GridLayout(1, 2) );
//		jpl.add(jpl2);
//		jpl2.add(new JLabel("아이디:"));
//		jpl2.add(new JTextField(10));
//		
//		JPanel jpl3 = new JPanel( new GridLayout(1, 2) );
//		jpl.add(jpl3);
//		jpl3.add(new JLabel("패스워드:"));
//		jpl3.add(new JTextField(10));
//		
//		JPanel jpl4 = new JPanel( new GridLayout(1, 2) );
//		jpl.add(jpl4);
//		jpl4.add(new JLabel("나이:"));
//		jpl4.add(new JTextField(10));
//		
//		JPanel jpl5 = new JPanel( new FlowLayout() );
//		jpl.add(jpl5);
//		jpl5.add(new JButton("가입하기"));
//		jpl5.add(new JButton("다시쓰기"));
		
		
		
		
		
		final int SIZE=15;
		JPanel gridpan = new JPanel(new GridLayout(7,1));
		
		JPanel panel0 = new JPanel();
		gridpan.add(panel0);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("이   름    :   ");
		JTextField txtID = new JTextField(SIZE);
		panel.add(label);
		panel.add(txtID);
		gridpan.add(panel);
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("아 이 디   : ");
		JTextField txtID1 = new JTextField(SIZE);
		panel1.add(label1);
		panel1.add(txtID1);
		gridpan.add(panel1);
		
		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel("비밀번호 : ");
		JTextField txtID2 = new JTextField(SIZE);
		panel2.add(label2);
		panel2.add(txtID2);
		gridpan.add(panel2);
		
		JPanel panel3 = new JPanel();
		JLabel label3 = new JLabel(" 나    이    :  ");
		JTextField txtID3 = new JTextField(SIZE);
		panel3.add(label3);
		panel3.add(txtID3);
		gridpan.add(panel3);
		
		JPanel panel4 = new JPanel(new FlowLayout());
		btn1 =  new JButton("가입하기");
		btn2 =  new JButton("다시쓰기");
		panel4.add(btn1);
		panel4.add(btn2);
		gridpan.add(panel4);

		contentPan.add(BorderLayout.WEST, gridpan);
		
		
	}

	@Override
	protected void actionEvent() {

		
	}
	
	public static void main(String[] args) {
		new Ex060MyFrame2().setVisible(true);
	}

	

}
