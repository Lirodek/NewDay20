package org.Lirodek.Ex01ButtonEvent;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.Lirodek.gulex.MyFrame.MyJFrame2;

public class Ex060MyFrame4 extends MyJFrame2 {

	JButton okBtn, resetBtn;
	JTextField txtFld1, txtFld2, txtFld4;
	JPasswordField txtFld3;
	JPanel centerPan, leftPan, mainPan, bottomPan;

	Ex060MyFrame4() {
		super("", 360, 300);
	}

	public void init() {
		okBtn = new JButton("가입하기");
		resetBtn = new JButton("다시쓰기");

		final int SIZE = 20;
		txtFld1 = new JTextField(SIZE);
		txtFld2 = new JTextField(SIZE);
		txtFld3 = new JPasswordField(SIZE);
		txtFld4 = new JTextField(SIZE);

		centerPan = new JPanel(new BorderLayout());
		leftPan = new JPanel(new GridLayout(4, 1));
		mainPan = new JPanel(new GridLayout(4, 1));
		bottomPan = new JPanel();
	}

	@Override
	protected void displayLayer() {
		init();

		contentPan = getContentPane();
		contentPan.setLayout(new GridBagLayout());
		contentPan.setSize(300, 300);
		contentPan.add(centerPan);
		centerPan.add(BorderLayout.WEST, leftPan);
		centerPan.add(BorderLayout.CENTER, mainPan);
		centerPan.add(BorderLayout.SOUTH, bottomPan);

		leftPan.add(new JLabel("성      명 : "));
		leftPan.add(new JLabel("아   이  디 : "));
		leftPan.add(new JLabel("패 스 워 드 : "));
		leftPan.add(new JLabel("나      이 : "));

		mainPan.add(txtFld1);
		mainPan.add(txtFld2);
		mainPan.add(txtFld3);
		mainPan.add(txtFld4);

		bottomPan.add(okBtn);
		bottomPan.add(resetBtn);

	}

	@Override
	protected void actionEvent() {
		resetBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("리셋버튼클릭");
				txtFld1.setText("");
				txtFld2.setText("");
				txtFld3.setText("");
				txtFld4.setText("");

			}
		});
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인버튼클릭");

			}
		});

	}

	public static void main(String[] args) {
		new Ex060MyFrame4().setVisible(true);
	}

}
