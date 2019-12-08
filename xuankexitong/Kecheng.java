package xuankexitong;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Kecheng extends JFrame implements ActionListener {
	public Kecheng() {
		super("ѡ����Ϣ�б�");
		DefaultTableModel model=new DefaultTableModel();
		final Course course=new Course();
		model.setColumnIdentifiers(new Object[]{"�γ̱��","�γ�����","�Ͽε�ַ","�Ͽ�ʱ��","ѧ��","��ʦ���","�ڿν�ʦ","��ʦ�Ա�"});
		model.addRow(new Object[] {course.getCourseId(),course.getCourseName(),course.getCourseAddress(),course.getCourseDate(),course.getCourseCredit(),course.getTeacher()});
		Connection con=null;
		JTable table=new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(500,70));
		JScrollPane scrollPane=new JScrollPane(table);
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		JButton button=new JButton("�ύ");
		GridBagLayout layout = new GridBagLayout();
	    this.setLayout(layout);
		this.add(button);
		GridBagConstraints s= new GridBagConstraints();
		s.gridwidth=0;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(button, s);
		addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		button.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String str2="�γ̱�ţ�"+course.getCourseId()+"�γ�����:"+course.getCourseName()+"�Ͽε�ַ:"+course.getCourseAddress()+"�Ͽ�ʱ�䣺"+course.getCourseCredit()+"�ον�ʦ��"+course.getTeacher();
				File f=new File("1.txt"); 
				try { if(!f.exists()) { 
					f.createNewFile(); } 
				FileWriter hu=new FileWriter(f,true);
				BufferedWriter buff=new BufferedWriter(hu); 
				buff.write(str2);
				buff.newLine(); 
				buff.flush(); 
				buff.close(); 
					JOptionPane.showMessageDialog(null, "�ύ�ɹ�");					
					Sousuo model=new Sousuo();				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {				
			}			}
		});	
		pack();
		setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {		
	}
}