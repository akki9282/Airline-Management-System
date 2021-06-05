package Airline_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Payment extends JFrame {
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
	public Payment() {
		getContentPane().setForeground(Color.BLUE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("PAYMENT");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(778,486);
		getContentPane().setLayout(null);
		
		JLabel pnr=new JLabel("PNR NO");
		pnr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnr.setBounds(60, 30, 150, 27);
		add(pnr);
		
		textField_6=new JTextField();
		textField_6.setBounds(220, 30, 150, 27);
		add(textField_6);
		
		JLabel phno=new JLabel("PHONE NO");
		phno.setBounds(60,80,150,27);
		phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(phno);
		
		textField=new JTextField();
		textField.setBounds(220, 80, 150, 27);
		add(textField);
		
		JLabel payMode=new JLabel("PAYMENT MODE");
		payMode.setFont(new Font("Tahoma", Font.PLAIN, 17));
		payMode.setBounds(60, 130, 150, 27);
		add(payMode);
		
		
		
		String[] mode =  {"CHEQUE","CARD"};
		JComboBox comboBox = new JComboBox(mode);
		comboBox.setBounds(220, 130, 150, 27);
		add(comboBox);
		
		JLabel number=new JLabel("CHEQUE/CARD NO");
		number.setFont(new Font("Tahoma", Font.PLAIN, 17));
		number.setBounds(60, 180, 150, 27);
		add(number);
		
		textField_2=new JTextField();
		textField_2.setBounds(220, 180, 150, 27);
		add(textField_2);
		
		JLabel paidAmt=new JLabel("PAID AMT");
		paidAmt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		paidAmt.setBounds(60, 230, 150, 27);
		add(paidAmt);
		
		textField_3=new JTextField();
		textField_3.setBounds(220, 230, 150, 27);
		add(textField_3);
		
		JLabel payD=new JLabel("PAY DATE");
		payD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		payD.setBounds(60, 280, 150, 27);
		add(payD);
	
		textField_4=new JTextField();
		textField_4.setBounds(220, 280, 150, 27);
		add(textField_4);
		
		
	
		
		JButton save=new JButton("PAYMENT");
		save.setBounds(220, 350, 150, 30);
		save.setBackground(Color.black);
		save.setForeground(Color.WHITE);
		add(save);
		
		setVisible(true);
		
		JLabel addPassenger=new JLabel("PAYMENT");
		addPassenger.setForeground(Color.BLUE);
		addPassenger.setFont(new Font("Tahoma", Font.PLAIN,31));
		addPassenger.setBounds(530, 24, 442, 35);
		add(addPassenger);
		
		ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("Airline_project/Icons/payment_1.png"));
		JLabel image=new JLabel(icon);
		image.setBounds(450, 80, 370, 280);
		add(image);
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pnr=textField_6.getText();
				String phno=textField.getText();
				String mode=(String) comboBox.getSelectedItem();
				String num=textField_2.getText();
				String paidAmt=textField_3.getText();
				String date=textField_4.getText();
				String chequeNo="-";
				String cardNo="-";
				if(mode=="CHEQUE")
				{
					chequeNo=num;
				}
				else if(mode=="CARD")
				{
					cardNo=num;
				}
				
				Conn c=new Conn();
				String 	qry="insert into payment values ('"+pnr+"','"+phno+"','"+chequeNo+"','"+cardNo+"','"
						+paidAmt+"','"+date+"')";
				try {
					c.s.executeUpdate(qry);
					JOptionPane.showMessageDialog(null, "Payment Successfuly Done");
					setVisible(false);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		
		setSize(900,600);
		setVisible(true);
		setLocation(400, 200);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Payment();
	}

}
