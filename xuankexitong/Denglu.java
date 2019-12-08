package xuankexitong;
/**
*当输入姓名Liming  密码2019322054 学号2019322054时候，弹出验证成功
*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import muban1.Information;
import muban1.Model;

public class Denglu extends JFrame{//继承窗体容器类
	
	private static final long serialVersionUID = 1L;
	
	FileReader fileReader;
	String subname = null;
	String subpwd=null;
	JTextField name;
	JPasswordField password;

	public Denglu(){
		//设置可见
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("登录选课系统");
		setBounds(300, 200, 300, 150);//不带标签和图标的按钮
		//容器
		Container cp=getContentPane();
		//设置流式布局
		cp.setLayout(new FlowLayout());
		//设置标签
		JLabel jl=new JLabel("姓名：");
		jl.setBounds(10, 10, 200, 18);
		final JTextField name=new JTextField(10);
		name.setBounds(80, 10, 150, 18);
		
		JLabel jl2=new JLabel("密码：");
		jl2.setBounds(10, 50, 200, 18);
		final JPasswordField password=new JPasswordField(10);
		password.setBounds(80, 50, 150, 18);
		
		JLabel j3=new JLabel("学号：");
		j3.setBounds(10, 100, 200, 18);
		final JTextField xuehao=new JTextField(10);
		xuehao.setBounds(80, 10, 250, 18);
		cp.add(jl);
		cp.add(name);
		cp.add(jl2);
		cp.add(password);
		cp.add(j3);
		cp.add(xuehao);
		final JButton jb=new JButton("确定");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//判断
				if(name.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
					return;}
				if(name.getText().trim().equals("Liming")&&new String(password.getPassword()).trim().equals("2019322054")&&xuehao.getText().trim().equals("2019322054")){
					JOptionPane.showMessageDialog(null, "登录成功");
                    if(arg0.getSource()==jb){
                    	Sousuo window=new Sousuo();
                    	window.setVisible(true); }}
				else{
					JOptionPane.showMessageDialog(null, "用户名、密码或学号错误");
				}}});	
		jb.setBounds(80, 80, 60, 18);
		cp.add(jb);
		final JButton button = new JButton();
		button.setText("重置");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成方法存根
				name.setText("");
				password.setText("");
				xuehao.setText("");
			}
		});
		button.setBounds(150, 80, 60, 18);
		getContentPane().add(button);
	}
	public void readFile1() {
		try {
			   fileReader = new FileReader("shuju.txt");
			   int read = fileReader.read();
			   subname=name.getText();
			   subpwd=password.getText();   
			   while(read!=-1){
			    System.out.print((char)read);
			    read = fileReader.read();
			    }
			   if(fileReader.toString().contains(subname)&&fileReader.toString().contains(subpwd)){		    
			    Model model=new Model();
			   }			   
			   else {
			    JOptionPane.showMessageDialog(null, "用户名或密码错误");
			   }			   		   
			  }catch (IOException e) {
			   // TODO Auto-generated catch block
			   System.out.println(e);
			  }
	}	
	public void readFile2() {
		try {
			   fileReader = new FileReader("shuju.txt");
			   int read = fileReader.read();
			   subname=name.getText();
			   subpwd=password.getText();
			   
			   while(read!=-1){
			    System.out.print((char)read);
			    read = fileReader.read();
			    }
			   if(fileReader.toString().contains(subname)&&fileReader.toString().contains(subpwd)){
			    
			    Information info=new Information();
			   }			   
			   else {
			    JOptionPane.showMessageDialog(null, "用户名或密码错误");
			   }			   
			  }catch (IOException e) {
			   System.out.println(e);
			  }
	}	
	public static void main(String[] args) {
		Denglu l = new Denglu();
		l.setSize(150, 200);
		l.setVisible(true);
	}
}