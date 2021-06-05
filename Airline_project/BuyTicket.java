package Airline_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class BuyTicket extends JFrame{
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
	public BuyTicket() {
		getContentPane().setForeground(Color.BLUE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("BUY TICKET");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(778,486);
		getContentPane().setLayout(null);
		
		JLabel pnr=new JLabel("PNR NO");
		pnr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnr.setBounds(60, 30, 150, 27);
		add(pnr);
		
		textField_6=new JTextField();
		textField_6.setBounds(200, 30, 150, 27);
		add(textField_6);
		
		JLabel ticketId=new JLabel("TICKET ID");
		ticketId.setBounds(60,80,150,27);
		ticketId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(ticketId);
		
		textField=new JTextField();
		textField.setBounds(200, 80, 150, 27);
		add(textField);
		
		JLabel flightC=new JLabel("FLIGHT CODE");
		flightC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightC.setBounds(60, 130, 150, 27);
		add(flightC);
		
		textField_1=new JTextField();
		textField_1.setBounds(200, 130, 150, 27);
		add(textField_1);
		
		JLabel jrnD=new JLabel("JOURNEY DATE");
		jrnD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jrnD.setBounds(60, 180, 150, 27);
		add(jrnD);
		
		textField_2=new JTextField();
		textField_2.setBounds(200, 180, 150, 27);
		add(textField_2);
		
		JLabel jrnT=new JLabel("JOURNEY TIME");
		jrnT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jrnT.setBounds(60, 230, 150, 27);
		add(jrnT);
		
		textField_3=new JTextField();
		textField_3.setBounds(200, 230, 150, 27);
		add(textField_3);
		
		JLabel src=new JLabel("SOURCE");
		src.setFont(new Font("Tahoma", Font.PLAIN, 17));
		src.setBounds(60, 280, 150, 27);
		add(src);
//		
//		textField_4=new JTextField();
//		textField_4.setBounds(200, 280, 150, 27);
//		add(textField_4);
		
		String[] src_1 =  {"BANGALORE", "MUMBAI", "CHENNAI", "PATNA","DELHI","HYDERABAD"};
		JComboBox comboBox = new JComboBox(src_1);
		comboBox.setBounds(200, 280, 150, 27);
		add(comboBox);
		
		
		JLabel dest=new JLabel("DESTINATION");
		dest.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dest.setBounds(60, 330, 150, 27);
		add(dest);
		
//		textField_5=new JTextField();
//		textField_5.setBounds(200, 330, 150, 27);
//		add(textField_5);
		
		String[] dest_1 =  {"BANGALORE", "MUMBAI", "CHENNAI", "PATNA","DELHI","HYDERABAD"};
		JComboBox comboBox_1 = new JComboBox(dest_1);
		comboBox_1.setBounds(200, 330, 150, 27);
		add(comboBox_1);
		
		JButton save=new JButton("BUY");
		save.setBounds(200, 380, 150, 30);
		save.setBackground(Color.black);
		save.setForeground(Color.WHITE);
		add(save);
		
		setVisible(true);
		
		JLabel addPassenger=new JLabel("BUY TICKET");
		addPassenger.setForeground(Color.BLUE);
		addPassenger.setFont(new Font("Tahoma", Font.PLAIN,31));
		addPassenger.setBounds(530, 24, 442, 35);
		add(addPassenger);
		
		ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("Airline_project/Icons/ticket.png"));
		JLabel image=new JLabel(icon);
		image.setBounds(450, 80, 370, 280);
		add(image);
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pnr=textField_6.getText();
				String ticketId=textField.getText();
				String f_code=textField_1.getText();
				String jrnD=textField_2.getText();
				String jrnT=textField_3.getText();
				String src=(String) comboBox.getSelectedItem();
				String dest=(String) comboBox_1.getSelectedItem();
				
				Conn c=new Conn();
				String 	qry="insert into reservation values ('"+pnr+"','"+ticketId+"','"+f_code+"','"+jrnD+"','"
						+ jrnT+"','"+src+"','"+dest+"')";
				try {
					c.s.executeUpdate(qry);
					JOptionPane.showMessageDialog(null, "Ticket  Successfuly Bought");
					setVisible(false);
					new Payment();
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
		new BuyTicket();

	}

}
