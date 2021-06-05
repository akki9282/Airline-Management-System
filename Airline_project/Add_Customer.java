package Airline_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Add_Customer extends JFrame{
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
	public Add_Customer() {
		getContentPane().setForeground(Color.BLUE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("ADD CUSTOMER DETAILS");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(778,486);
		getContentPane().setLayout(null);
		
		JLabel flightCode=new JLabel("FLIGHT CODE");
		flightCode.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightCode.setBounds(60, 30, 150, 27);
		add(flightCode);
		
		textField_6=new JTextField();
		textField_6.setBounds(200, 30, 150, 27);
		add(textField_6);
		
		JLabel passNo=new JLabel("PASSPORT NO");
		passNo.setBounds(60,80,150,27);
		passNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(passNo);
		
		textField=new JTextField();
		textField.setBounds(200, 80, 150, 27);
		add(textField);
		
		JLabel pnrNo=new JLabel("PNR NO");
		pnrNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnrNo.setBounds(60, 130, 150, 27);
		add(pnrNo);
		
		textField_1=new JTextField();
		textField_1.setBounds(200, 130, 150, 27);
		add(textField_1);
		
		JLabel add=new JLabel("ADDRESS");
		add.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add.setBounds(60, 180, 150, 27);
		add(add);
		
		textField_2=new JTextField();
		textField_2.setBounds(200, 180, 150, 27);
		add(textField_2);
		
		JLabel nat=new JLabel("NATIONALITY");
		nat.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nat.setBounds(60, 230, 150, 27);
		add(nat);
		
		textField_3=new JTextField();
		textField_3.setBounds(200, 230, 150, 27);
		add(textField_3);
		
		JLabel name=new JLabel("NAME");
		name.setFont(new Font("Tahoma", Font.PLAIN, 17));
		name.setBounds(60, 280, 150, 27);
		add(name);
		
		textField_4=new JTextField();
		textField_4.setBounds(200, 280, 150, 27);
		add(textField_4);
		
		JLabel gender=new JLabel("GENDER");
		gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		gender.setBounds(60, 330, 150, 27);
		add(gender);
		
		JRadioButton male=new JRadioButton("MALE");
		male.setBackground(Color.WHITE);
		male.setBounds(200, 330, 70, 27);
		add(male);
		
		JRadioButton female=new JRadioButton("FEMALE");
		female.setBackground(Color.WHITE);
		female.setBounds(270, 330, 100, 27);
		add(female);
		
		JLabel phno=new JLabel("PH NO");
		phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phno.setBounds(60, 380, 150, 27);
		add(phno);
		
		textField_5=new JTextField();
		textField_5.setBounds(200, 380, 150, 27);
		add(textField_5);
		
		JButton save=new JButton("SAVE");
		save.setBounds(200, 430, 150, 30);
		save.setBackground(Color.black);
		save.setForeground(Color.WHITE);
		add(save);
		
		setVisible(true);
		
		JLabel addPassenger=new JLabel("ADD CUSTOMER DETAILS");
		addPassenger.setForeground(Color.BLUE);
		addPassenger.setFont(new Font("Tahoma", Font.PLAIN,31));
		addPassenger.setBounds(420, 24, 442, 35);
		add(addPassenger);
		
		ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("Airline_project/Icons/add.png"));
		JLabel image=new JLabel(icon);
		image.setBounds(450, 60, 380, 410);
		add(image);
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passNo=textField.getText();
				String pnrNo=textField_1.getText();
				String add=textField_2.getText();
				String nationality=textField_3.getText();
				String name=textField_4.getText();
				String flCode=textField_6.getText();
				String Ph=textField_5.getText();
				String gender=null;
				
				if(male.isSelected())
				{
					gender="male";
				}
				else if (female.isSelected()) {
					gender="female";
				}
				Conn c=new Conn();
				String 	qry="insert into passenger values ('"+pnrNo+"','"+add+"','"+nationality+"','"+name+"','"
						+ gender+"','"+Ph+"','"+passNo+"','"+flCode+"')";
				try {
					c.s.executeUpdate(qry);
					JOptionPane.showMessageDialog(null, "Customer Added");
					new BuyTicket();
					
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
		new Add_Customer().setVisible(true);

	}

}
