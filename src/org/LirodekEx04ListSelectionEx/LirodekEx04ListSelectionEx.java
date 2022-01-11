package org.LirodekEx04ListSelectionEx;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.Lirodek.gulex.MyFrame.MyJFrame2;



public class LirodekEx04ListSelectionEx extends MyJFrame2 implements ListSelectionListener{
	JPanel jpl;
	JList list;
	JButton jb1;
	JTextField tf;
	private void init() {
		String str[] = { "등산", "윈드서핑", "독서", "수영", "골프", "영화" };
		jpl = new JPanel(new GridLayout(2, 1));
		list = new JList(str);
		jb1 = new JButton("등록");
		jpl.add(list);
		tf = new JTextField(10);
	}
	public LirodekEx04ListSelectionEx() {
		super("실습",400,400);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object[] itemObjects;
		String total= "";
		
		JList li = (JList)e.getSource();
		itemObjects = li.getSelectedValues();
		for(int i =0; i<itemObjects.length;i++) {
			total = total+ itemObjects[i] + " ";
		}
		tf.setText( "선택된 항목 >> "+ total);
		
	}

	@Override
	protected void displayLayer() {
		init();
		this.add(new JLabel("취미를 선택하세요!"), BorderLayout.NORTH);
		this.add(jpl, BorderLayout.CENTER);
		this.add(tf, BorderLayout.SOUTH);
		
	}

	@Override
	protected void actionEvent() {
		// TODO Auto-generated method stub
		list.addListSelectionListener(this);
	}
	
	public static void main(String[] args) {
		new LirodekEx04ListSelectionEx().setVisible(true);;
	}

}

