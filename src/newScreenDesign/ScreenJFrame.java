package newScreenDesign;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScreenJFrame extends JFrame {
	
	JTableEx01 table = new JTableEx01();
	
	int w = 730, h = 380;
	final int SIZE=15;
	JPanel PanelSide =   new JPanel( new GridLayout( 8, 1, 0, 0 ) );
	JPanel SouthSide =   new JPanel( new FlowLayout() );
	JPanel CenterSide =  new JPanel( new FlowLayout() );
	
	JLabel numberLabel = new JLabel("번  호 ");
	JLabel nameLabel =   new JLabel("이  름 ");
	JLabel emailLabel =  new JLabel(" 이메일");
	JLabel phoneLabel =  new JLabel("전화번호");
	
	JPanel numberGrid =  new JPanel();
	JPanel nameGrid =    new JPanel();
	JPanel emailGrid =   new JPanel();
	JPanel phoneGrid =   new JPanel();

	JTextField number =  new JTextField(SIZE);
	JTextField name =    new JTextField(SIZE);
	JTextField email =   new JTextField(SIZE);
	JTextField phone =   new JTextField(SIZE);
	
	JButton allBtn;
	JButton istBtn;
	JButton delBtn;
	JButton serBtn;
	JButton cenBtn;
	{
		allBtn = new JButton(" 전체보기 ");
		istBtn = new JButton(" 추   가 ");
		delBtn = new JButton(" 삭   제 ");
		serBtn = new JButton(" 검   색 ");
		cenBtn = new JButton(" 취   소 ");
	}
	
	JTextArea area = new JTextArea("", 30, 60);
	
	
	public ScreenJFrame() // 생성자
	{
		super.setTitle(" ");
		super.setSize( w, h );
		
		settingCenter();
		settingClosing();
		add(BorderLayout.LINE_START, PanelSide);
		add(BorderLayout.CENTER, CenterSide);
//		JScrollPane jsp = table.mkTbl();
//		CenterSide.add(jsp);
		
		
		
		PanelSide.add(numberGrid);
		numberGrid.add(numberLabel);
		numberGrid.add(number);
		
		PanelSide.add(nameGrid);
		nameGrid.add(nameLabel);
		nameGrid.add(name);
		
		PanelSide.add(emailGrid);
		emailGrid.add(emailLabel);
		emailGrid.add(email);
		
		PanelSide.add(phoneGrid);
		phoneGrid.add(phoneLabel);
		phoneGrid.add(phone);
		
		add(BorderLayout.SOUTH, SouthSide);
		SouthSide.add( allBtn );
		SouthSide.add( istBtn );
		SouthSide.add( delBtn );
		SouthSide.add( serBtn );
		SouthSide.add( cenBtn );
		
		allBtn.addActionListener(new AllViewEventHandler(CenterSide));
		istBtn.addActionListener(new InsertDataEventHandler(number,name,email,phone));
		cenBtn.addActionListener(new CancelDataEventHandler());
		
	}
	
	
	private void settingClosing() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void settingCenter() 
	{
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrW = ( int ) tk.getScreenSize().getWidth();
		int scrH = ( int ) tk.getScreenSize().getHeight();
		int x = scrW / 2 - w / 2;
		int y = scrH / 2 - h / 2;
		this.setLocation(x, y);
	}
	
	public static void main(String[] args) {
		new ScreenJFrame().setVisible(true);
	}
}
