package xuankexitong;
/**
*����������Liming  ����2019322054 ѧ��2019322054ʱ�򣬵�����֤�ɹ�
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

public class Denglu extends JFrame{//�̳д���������
	
	private static final long serialVersionUID = 1L;
	
	FileReader fileReader;
	String subname = null;
	String subpwd=null;
	JTextField name;
	JPasswordField password;

	public Denglu(){
		//���ÿɼ�
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("��¼ѡ��ϵͳ");
		setBounds(300, 200, 300, 150);//������ǩ��ͼ��İ�ť
		//����
		Container cp=getContentPane();
		//������ʽ����
		cp.setLayout(new FlowLayout());
		//���ñ�ǩ
		JLabel jl=new JLabel("������");
		jl.setBounds(10, 10, 200, 18);
		final JTextField name=new JTextField(10);
		name.setBounds(80, 10, 150, 18);
		
		JLabel jl2=new JLabel("���룺");
		jl2.setBounds(10, 50, 200, 18);
		final JPasswordField password=new JPasswordField(10);
		password.setBounds(80, 50, 150, 18);
		
		JLabel j3=new JLabel("ѧ�ţ�");
		j3.setBounds(10, 100, 200, 18);
		final JTextField xuehao=new JTextField(10);
		xuehao.setBounds(80, 10, 250, 18);
		cp.add(jl);
		cp.add(name);
		cp.add(jl2);
		cp.add(password);
		cp.add(j3);
		cp.add(xuehao);
		final JButton jb=new JButton("ȷ��");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//�ж�
				if(name.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");
					return;}
				if(name.getText().trim().equals("Liming")&&new String(password.getPassword()).trim().equals("2019322054")&&xuehao.getText().trim().equals("2019322054")){
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
                    if(arg0.getSource()==jb){
                    	Sousuo window=new Sousuo();
                    	window.setVisible(true); }}
				else{
					JOptionPane.showMessageDialog(null, "�û����������ѧ�Ŵ���");
				}}});	
		jb.setBounds(80, 80, 60, 18);
		cp.add(jb);
		final JButton button = new JButton();
		button.setText("����");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɷ������
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
			    JOptionPane.showMessageDialog(null, "�û������������");
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
			    JOptionPane.showMessageDialog(null, "�û������������");
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