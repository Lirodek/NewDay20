package newScreenDesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx01 extends JFrame {
	public static Container         contentPane;
	public static JTable            table;
	public static DefaultTableModel tableModel;
	public static JScrollPane       scrollPane;
	
	Object[][] rowData;
	Object[]   colNames;
	{
		colNames = new Object[] {"number", "name", "email", "phone"};
		rowData  = new Object[][] 
		{
			{1, "kim", "AscII@gamil.com", "1111-1111"},     {2, "lee", "StarCraft@gamil.com", "2222-2222"},
			{3, "park", "Kulkulza@gamil.com", "3333-3333"}, {4, "kang", "Lulu@gamil.com", "4444-4444"},
			{5, "Bae", "Lirodek@gamil.com", "5555-5555"}
		};
		
		tableModel = new DefaultTableModel(rowData, colNames);
		table = new JTable(tableModel);
	}
	private void init() {
		contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		mkTbl();
		
	}
	
	public JScrollPane mkTbl() {		
	
	
		//------------update
//		tableModel.setDataVector(null, colNames);
//		tableModel.addRow(new Object[] {3, "ccc","시발좀", "7777-7777" });
//		tableModel.addRow(new Object[] {4, "ddd", "8888-8888" });
//		tableModel.addRow(new Object[] {5, "eee", "9999-9999" });
		return scrollPane = new JScrollPane(table);
		
	}
	public void ipdateData(int number, String name, String email, String phone) {
		tableModel.setDataVector(rowData, colNames);
		tableModel.addRow(new Object[] {number, name, email, phone });
	}

	public JTableEx01() {
		init();
		mkTbl();
		
	}
	public static void main(String[] args) {
		new JTableEx01();

	}

}
