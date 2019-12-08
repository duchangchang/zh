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

public class Sousuo extends JFrame{//类声明  继承
	    JComboBox j5;
	    JTextField j6;
	    JButton j7;	
	public static void main(String[] args) {//方法声明      无返回值
		Sousuo demo = new Sousuo();//  建立新的对象
    }	
	public Sousuo() {
        init();
        this.setSize(600,400);
        this.setVisible(true);
    }	
	public void init() {
        //标签
        setTitle("选课系统");
        JLabel j0=new JLabel("选课查找  ");
        String[] str = { "  ","java", "计算机网络", "计算机组成原理" ,"离散数学","高等数学"};//方法体
        j5 = new JComboBox(str);
        j6 = new JTextField();
        JButton  j7=new   JButton("选择");
   
        j0.setBounds(10, 10, 200, 18);
        j5.setBounds(10, 50, 200, 18);
        j6.setBounds(20, 10, 100, 20);
        j7.setBounds(250, 50, 70, 20);
        add(j7);
        add(j0);
        add(j5);
        add(j6);   
      //事件监听
        j7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "您已选课成功");	
				}   });  }  }