package xuankexitong;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Sousuo extends JFrame{//������  �̳�
	    JComboBox j5;
	    JTextField j6;
	    JButton j7;	
	public static void main(String[] args) {//��������      �޷���ֵ
		Sousuo demo = new Sousuo();//  �����µĶ���
    }	
	public Sousuo() {
        init();
        this.setSize(600,400);
        this.setVisible(true);
    }	
	public void init() {
        //��ǩ
        setTitle("ѡ��ϵͳ");
        JLabel j0=new JLabel("ѡ�β���  ");
        String[] str = { "  ","java", "���������", "��������ԭ��" ,"��ɢ��ѧ","�ߵ���ѧ"};//������
        j5 = new JComboBox(str);
        j6 = new JTextField();
        JButton  j7=new   JButton("ѡ��");
   
        j0.setBounds(10, 10, 200, 18);
        j5.setBounds(10, 50, 200, 18);
        j6.setBounds(20, 10, 100, 20);
        j7.setBounds(250, 50, 70, 20);
        add(j7);
        add(j0);
        add(j5);
        add(j6);   
      //�¼�����
        j7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "����ѡ�γɹ�");	
				}   });  }  }