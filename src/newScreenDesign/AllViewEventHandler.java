package newScreenDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AllViewEventHandler implements ActionListener{
	JTableEx01 table = new JTableEx01();
	JPanel panel;
	
	AllViewEventHandler(JPanel panel){
		this.panel = panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼눌림");
		JScrollPane jsp = table.mkTbl();
		
		panel.add(jsp);
	}

}
