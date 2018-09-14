package org.lanqiao.jdmrg.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import org.lanqiao.jdmrg.bean.Client;
import org.lanqiao.jdmrg.common.Check;
import org.lanqiao.jdmrg.dao.ClientDao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PersonMasssge extends JFrame{
	private JTextField tf_accountNum;
	private JTextField tf_nickname;
	private JTextField tf_name;
	private JTextField tf_age;
	private JTextField tf_Idcard;
	private JTextField tf_phone;
	public PersonMasssge(String s,String s1,String s2) {
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 24));
		setTitle("欢迎使用");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 480, 380);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("完善个人信息");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel.setBounds(165, 25, 150, 41);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("账号");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(100, 80, 40, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("昵称");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(100, 115, 40, 30);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("姓名");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(100, 150, 40, 30);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("年龄");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(100, 185, 40, 30);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("身份证号");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(85, 220, 70, 30);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("手机号码");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(85, 255, 70, 30);
		getContentPane().add(label_4);
		
		tf_accountNum = new JTextField();
		tf_accountNum.setFont(new Font("宋体", Font.PLAIN, 16));
		tf_accountNum.setEnabled(false);
		tf_accountNum.setBounds(159, 80, 190, 30);
		getContentPane().add(tf_accountNum);
		tf_accountNum.setColumns(10);
		tf_accountNum.setText(s);
		
		tf_nickname = new JTextField();
		tf_nickname.setFont(new Font("宋体", Font.PLAIN, 16));
		tf_nickname.setColumns(10);
		tf_nickname.setBounds(159, 115, 190, 30);
		tf_nickname.setText(s2);
		getContentPane().add(tf_nickname);
		
		tf_name = new JTextField();
		tf_name.setFont(new Font("宋体", Font.PLAIN, 16));
		tf_name.setColumns(10);
		tf_name.setBounds(159, 150, 190, 30);
		getContentPane().add(tf_name);
		
		tf_age = new JTextField();
		tf_age.setFont(new Font("宋体", Font.PLAIN, 16));
		tf_age.setColumns(10);
		tf_age.setBounds(159, 185, 190, 30);
		getContentPane().add(tf_age);
		
		tf_Idcard = new JTextField();
		tf_Idcard.setFont(new Font("宋体", Font.PLAIN, 16));
		tf_Idcard.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				  String ids = tf_Idcard.getText();  
				  if(ids.length() >17) e.consume();
			}
		});
		tf_Idcard.setColumns(10);
		tf_Idcard.setBounds(159, 220, 190, 30);
		getContentPane().add(tf_Idcard);
		
		tf_phone = new JTextField();
		tf_phone.setFont(new Font("宋体", Font.PLAIN, 16));
		tf_phone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				  String phs = tf_phone.getText();  
				  if(phs.length()>10) e.consume();
			}
		});
		tf_phone.setColumns(10);
		tf_phone.setBounds(159, 255, 190, 30);
		getContentPane().add(tf_phone);
		
		JButton btn_comfire = new JButton("确认");
		btn_comfire.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_comfire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if("".equals(tf_Idcard.getText())||"".equals(tf_name.getText())||"".equals(tf_phone.getText())) {
					JOptionPane.showMessageDialog(null,"身份证号，姓名，手机号码不能为空!","",JOptionPane.WARNING_MESSAGE);
				}else if(false==Check.checkage(tf_age.getText())) {
					JOptionPane.showMessageDialog(null,"年龄输入有误！","",JOptionPane.WARNING_MESSAGE);
				}else if(false==Check.checkidcard(tf_Idcard.getText())){
					JOptionPane.showMessageDialog(null,"身份证号输入有误！","",JOptionPane.WARNING_MESSAGE);
				}else if(false==Check.checkphone(tf_phone.getText())){
					JOptionPane.showMessageDialog(null,"手机号输入有误！","",JOptionPane.WARNING_MESSAGE);
				}else {
					Client obj=new Client(tf_accountNum.getText(),s1,tf_nickname.getText(),Integer.valueOf(tf_age.getText()),tf_name.getText(),tf_Idcard.getText(),tf_phone.getText());
					new ClientDao().add(obj);
					new Denglu();
					dispose();
				}
			}
		});
		btn_comfire.setBounds(100, 300, 100, 35);
		getContentPane().add(btn_comfire);
		
		JButton btn_return = new JButton("返回");
		btn_return.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Denglu();
				dispose();
			}
		});
		btn_return.setBounds(280, 300, 100, 35);
		getContentPane().add(btn_return);
		setVisible(true);
		
	}
	
}
