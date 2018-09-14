package org.lanqiao.jdmrg.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.lanqiao.jdmrg.bean.Client;
import org.lanqiao.jdmrg.common.Check;
import org.lanqiao.jdmrg.common.RoomerAccount;
import org.lanqiao.jdmrg.dao.ClientDao;

/**
 * 个人信息（客户界面）
 * 
 * @author wzg
 */
@SuppressWarnings("serial")
public class InformationPanel extends JPanel {
	public JButton button1 = new JButton("修改");
	JTextField ZH_K = new JTextField();
	JTextField NC_K = new JTextField();
	JTextField Name_K = new JTextField();
	JTextField Age_K = new JTextField();
	JTextField Pwd_K = new JTextField();
	JTextField Phonenum_K = new JTextField();
	private Client cc;
	Client client = new ClientDao().findById(RoomerAccount.accountNum);

	public InformationPanel() {
		this.setLayout(null);
		this.setSize(840, 640);
		this.setLocation(0, 0);
		this.setBackground(Color.white);

		//
		showInfo();

		JLabel ZH = new JLabel("账号");
		ZH.setFont(new Font("楷体", Font.BOLD, 32));
		ZH.setSize(195, 65);
		ZH.setLocation(205, 80);

		ZH_K.setFont(new Font("楷体", Font.BOLD, 32));
		ZH_K.setSize(350, 48);
		ZH_K.setLocation(275, 88);

		JLabel NC = new JLabel("昵称");
		NC.setFont(new Font("楷体", Font.BOLD, 32));
		NC.setSize(195, 65);
		NC.setLocation(205, 150);

		// NC_K=new JTextField();
		NC_K.setFont(new Font("楷体", Font.BOLD, 32));
		NC_K.setSize(350, 48);
		NC_K.setLocation(275, 158);

		JLabel Name = new JLabel("姓名");
		Name.setFont(new Font("楷体", Font.BOLD, 32));
		Name.setSize(195, 65);
		Name.setLocation(205, 220);

		Name_K.setFont(new Font("楷体", Font.BOLD, 32));
		Name_K.setSize(350, 48);
		Name_K.setLocation(275, 228);

		JLabel Age = new JLabel("年龄");
		Age.setFont(new Font("楷体", Font.BOLD, 32));
		Age.setSize(195, 65);
		Age.setLocation(205, 290);

		Age_K.setFont(new Font("楷体", Font.BOLD, 32));
		Age_K.setSize(350, 48);
		Age_K.setLocation(275, 298);

		JLabel Pwd = new JLabel("身份证");
		Pwd.setFont(new Font("楷体", Font.BOLD, 32));
		Pwd.setSize(195, 65);
		Pwd.setLocation(170, 360);

		Pwd_K.setFont(new Font("楷体", Font.BOLD, 32));
		Pwd_K.setSize(350, 48);
		Pwd_K.setLocation(275, 368);

		JLabel Phonenum = new JLabel("手机号");
		Phonenum.setFont(new Font("楷体", Font.BOLD, 32));
		Phonenum.setSize(195, 65);
		Phonenum.setLocation(170, 430);

		Phonenum_K.setFont(new Font("楷体", Font.BOLD, 32));
		Phonenum_K.setSize(350, 48);
		Phonenum_K.setLocation(275, 438);

		button1.setFont(new Font("楷体", Font.BOLD, 32));
		button1.setSize(120, 50);
		button1.setLocation(370, 520);

		this.add(ZH);
		this.add(ZH_K);
		this.add(NC);
		this.add(NC_K);
		this.add(Name);
		this.add(Name_K);
		this.add(Age);
		this.add(Age_K);
		this.add(Pwd);
		this.add(Pwd_K);
		this.add(Phonenum);
		this.add(Phonenum_K);
		this.add(button1);
		// *确认按钮/
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if(button1.getText().equals("修改")) {
					updateText(true);
					button1.setText("确认");
				}else {
					if(isUpdateTrue()) {
						new ClientDao().update(cc);
						button1.setText("修改");
						JOptionPane.showMessageDialog(null, "修改成功！", getName(), JOptionPane.INFORMATION_MESSAGE);
						updateText(false);
					}else {
						JOptionPane.showMessageDialog(null, "输入的数据不合法！", getName(), JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
	}

	/**
	 * 信息展示
	 */
	private void showInfo() {
		client = new ClientDao().findById(RoomerAccount.accountNum);
		// 展示信息
		ZH_K.setText(client.getAccountNum());
		NC_K.setText(client.getNickname());
		Name_K.setText(client.getName());
		Age_K.setText("" + client.getAge());
		Pwd_K.setText(client.getId());
		Phonenum_K.setText(client.getPhoneNum());
		// 信息不可选
		updateText(false);
	}
	
	/**
	 * 修改文本框是否可写
	 */	public void updateText(boolean b) {
		ZH_K.setEditable(false);
		NC_K.setEditable(b);
		Name_K.setEditable(b);
		Age_K.setEditable(b);
		Pwd_K.setEditable(b);
		Phonenum_K.setEditable(b);
	} 

	/**
	 * 信息合法判断
	 */
	public boolean isUpdateTrue() {
		// 昵称
		String NC = NC_K.getText();
		// 判断名字
		String Name = Name_K.getText();
		if (Name.length() == 0) {
			JOptionPane.showMessageDialog(null, "名字不能为空！", getName(), JOptionPane.ERROR_MESSAGE);
			return false;
		}
		char Name1[] = Name.toCharArray();
		for (int i = 0; i < Name1.length; i++) {
			if (Character.isDigit(Name1[i])) {
				JOptionPane.showMessageDialog(null, "名字不能包含数字！", getName(), JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		// 判断年龄
		String Age = Age_K.getText();
		// if (Age.length() == 0) {
		// JOptionPane.showMessageDialog(null, "年龄不能为空！", getName(),
		// JOptionPane.INFORMATION_MESSAGE);
		// return;
		// }
		if (Age.length() != 2) {
			JOptionPane.showMessageDialog(null, "年龄为两位数！", getName(), JOptionPane.ERROR_MESSAGE);
			return false;
		}
		// 判断身份证
		String Pwd = Pwd_K.getText();
		if(!Check.checkidcard(Pwd)) {
			JOptionPane.showMessageDialog(null, "请输入正确的身份证号！", getName(), JOptionPane.ERROR_MESSAGE);
			return false;
		}
//		if (Pwd.length() != 18) {
//			JOptionPane.showMessageDialog(null, "身份证号码要为18位", getName(), JOptionPane.INFORMATION_MESSAGE);
//			return false;
//		}
//		char Pwd1[] = Pwd.toCharArray();
//		for (int i = 0; i < Pwd1.length; i++) {
//			if (!Character.isDigit(Pwd1[i])) {
//				JOptionPane.showMessageDialog(null, "身份证号码要为数字", getName(), JOptionPane.INFORMATION_MESSAGE);
//				return false;
//			}
//		}
		// 判断手机号码
		String Phonenum = Phonenum_K.getText();
		if(!Check.checkphone(Phonenum)) {
			JOptionPane.showMessageDialog(null, "请输入正确的手机号码!", getName(), JOptionPane.ERROR_MESSAGE);
			return false;
		}
//		if (Phonenum.length() != 11) {
//			JOptionPane.showMessageDialog(null, "手机号码要为11位", getName(), JOptionPane.ERROR_MESSAGE);
//			return false;
//		}
//		char Phonenum1[] = Phonenum.toCharArray();
//		for (int i = 0; i < Phonenum1.length; i++) {
//			if (!Character.isDigit(Phonenum1[i])) {
//				JOptionPane.showMessageDialog(null, "手机号码要为数字", getName(), JOptionPane.ERROR_MESSAGE);
//				return false;
//			}
//		}
		cc = new Client(RoomerAccount.accountNum, client.getPwd(), NC, Integer.parseInt(Age), Name, Pwd, Phonenum);
		return true;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = null;
		try {
			img = new ImageIcon(RoomerAccount.bg).getImage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 840,640,null);
		repaint();
	}
}