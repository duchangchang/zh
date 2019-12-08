package xuankexitong;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Zhuce extends JFrame{
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private Container panel4;
	private JPasswordField passwordField3;
	public static void main(String[] args) {
		Zhuce frame = new Zhuce();
		frame.setVisible(true);
	}
	public Zhuce() {
		setTitle("学生注册");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 1, 6, 6));
		JPanel panel0 = new JPanel();
		contentPane.add(panel0);
		JLabel label0 = new JLabel("注册系统");
		panel0.add(label0);
		JPanel panel1 = new JPanel();
		panel1.setLayout((LayoutManager) new FlowLayout(FlowLayout.LEFT));
		contentPane.add(panel1);
		JLabel label1 = new JLabel("用户名：     ");
		panel1.add(label1);
		textField = new JTextField();
		panel1.add(textField);
		textField.setColumns(16);	
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(panel2);
		JLabel label2 = new JLabel("密码：         ");
		panel2.add(label2);
		passwordField1 = new JPasswordField();
		passwordField1.setColumns(16);
		panel2.add(passwordField1);		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(panel3);
		JLabel label3 = new JLabel("确认密码：");
		panel3.add(label3); 
		passwordField2 = new JPasswordField();
		passwordField2.setColumns(16);
		panel3.add(passwordField2);		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(panel4);
		JLabel label4 = new JLabel("学号：       ");
		panel4.add(label4);
		passwordField1 = new JPasswordField();
		passwordField1.setColumns(16);
		panel4.add(passwordField1);		
		JButton button = new JButton("保存");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						do_button_actionPerformed(e);			
			}
		});
		panel4.add(button);
	}
	protected void do_button_actionPerformed(ActionEvent e){
		char[] password1 = passwordField1.getPassword();// 获得密码框1中的密码
		char[] password2 = passwordField2.getPassword();// 获得密码框2中的密码
		boolean equals = Arrays.equals(password1, password2);// 判断两个密码框中密码是否相同
		if (equals) {// 如果密码相同则提示注册成功
			String str2=textField.getText()+","+passwordField1; 
			File f=new File("shuju.txt"); 
			try { if(!f.exists()) { 
				f.createNewFile(); } 
			FileWriter hu=new FileWriter(f,true);
			BufferedWriter buff=new BufferedWriter(hu); 
			buff.write(str2);
			buff.newLine(); 
			buff.flush(); 
			buff.close(); 
			JOptionPane.showMessageDialog(null, "注册成功"); 
			Denglu denglu=new Denglu();
			}
			catch(Exception e1) { e1.printStackTrace(); }					
		} else {// 如果密码不同则提示密码不同
			JOptionPane.showMessageDialog(this, "两次密码不同！", null,
					JOptionPane.WARNING_MESSAGE);
		}
	}
}