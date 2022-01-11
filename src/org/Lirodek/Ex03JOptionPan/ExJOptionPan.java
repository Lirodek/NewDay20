package org.Lirodek.Ex03JOptionPan;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.Lirodek.gulex.MyFrame.MyJFrame2;

public class ExJOptionPan extends MyJFrame2{
	JPanel j;
	JButton openBtn, openBtn2, openBtn3;
	
	
	ExJOptionPan(){
		super("테스트2", 400, 400);
	}
	
	@Override
	protected void displayLayer() {
		init();
		
		contentPan = getContentPane();
		contentPan.setLayout(new GridBagLayout());
		contentPan.add(openBtn);
		contentPan.add(openBtn2);
		contentPan.add(openBtn3);
		
	}
	private void init() {
		openBtn =  new JButton("message 열기");
		openBtn2 = new JButton("opsionDialog 열기");
		openBtn3 = new JButton("confirmDialog 열기");
	}
	@Override
	protected void actionEvent() {
		
		openBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ExJOptionPan.this, "환영합니다");
				
				
			}
		});
		
		openBtn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str[] = {"가입하기", "다시쓰기", "취소"};
				
				JOptionPane.showOptionDialog(
					ExJOptionPan.this,
					"옵션다이얼로그 예제",
					"옵션다이얼로그",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null, str, str[0]);
			}
		});
		
		openBtn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(
						ExJOptionPan.this,
						"아이디를 입력하세요.");
				
				
			}
		});
		
	}
	public static void main(String[] args) 
	{
		new ExJOptionPan().setVisible(true);
	}
	public static void test01(String[] args) {
		JOptionPane.showMessageDialog(null,"Hello World");

	}
	

}
