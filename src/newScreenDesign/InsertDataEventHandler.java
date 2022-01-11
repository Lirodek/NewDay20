package newScreenDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class InsertDataEventHandler implements ActionListener{
	JTableEx01 tableEx = new JTableEx01();
	
	JTextField numberField;
	JTextField nameField;
	JTextField emailField;
	JTextField phoneField;
	JScrollPane scroll;

	InsertDataEventHandler(){
		this(null,null,null,null);
	}
	public InsertDataEventHandler(JTextField numberField,
			 JTextField nameField, JTextField emailField,
			 JTextField phoneField) 
	{
		this.numberField = numberField;
		this.nameField = nameField;
		this.emailField = emailField;
		this.phoneField = phoneField;
		this.scroll = scroll;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int number = Integer.valueOf(numberField.getText());
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		System.out.println(name);
		
		tableEx.ipdateData(number, name, email, phone);
		numberField.setText("");
		nameField.setText("");
		emailField.setText("");
		phoneField.setText("");
		

	}

}
