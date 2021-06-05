package Airline_project;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Flight_Info extends JFrame{
	private JTable table;
	private JTextField textfield;
	
	public Flight_Info() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setFont(new Font("Tahoma",Font.PLAIN,13));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(860,532);
		setLayout(null);
		setVisible(true);
		
		JLabel FlightDetails=new JLabel("FLIGHT INFORMATION");
		FlightDetails.setFont(new Font("Tahoma",Font.PLAIN,31));
		FlightDetails.setBounds(50,20,570,35);
		FlightDetails.setForeground(new Color(100,149,237));
		add(FlightDetails);
		
		JLabel Fcode=new JLabel("FLIGHT CODE");
		Fcode.setFont(new Font("Tahoma",Font.PLAIN,17));
		Fcode.setBounds(50,100,200,30);
		add(Fcode);
		
		textfield=new JTextField();
		textfield.setBounds(220, 100, 200, 30);
		add(textfield);
		
		JButton btnShow=new JButton("SHOW");
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code=textfield.getText();
				
				try {
				Conn c=new Conn();
				String str="Select f_code,f_name,src,dst,capacity,class_code,class_name from flight,sector where f_code='"+code+"'";
					ResultSet rs=c.s.executeQuery(str);
					
					if(rs.next())
					{
						table.setModel(DbUtils.resultSetToTableModel(rs));
					}
					else
					{
						JOptionPane.showMessageDialog(null,"YOU ENTERED WRONG FLIGHT CODE");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		btnShow.setBounds(220, 150, 120, 30);
		add(btnShow);
		
		table=new JTable();
		table.setBackground(Color.white);
		table.setBounds(23, 250, 800, 300);
		
		JScrollPane pane=new JScrollPane(table);
		pane.setBounds(23, 250, 800, 300);
		pane.setBackground(Color.WHITE);
		add(pane);
		
		JLabel fCode=new JLabel("FLIGHT CODE");
		fCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fCode.setBounds(23, 220, 126, 14);
		add(fCode);
		
		JLabel fName=new JLabel("FLIGHT NAME");
		fName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fName.setBounds(145, 220, 120, 14);
		add(fName);

		JLabel src=new JLabel("SOURCE");
		src.setFont(new Font("Tahoma", Font.PLAIN, 13));
		src.setBounds(275, 220, 104, 14);
		add(src);

		JLabel dst=new JLabel("DESTINATION");
		dst.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dst.setBounds(367, 220, 120, 14);
		add(dst);

		JLabel capacity=new JLabel("CAPACITY");
		capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		capacity.setBounds(497, 220, 111, 14);
		add(capacity);

		JLabel classCode=new JLabel("CLASS CODE");
		classCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		classCode.setBounds(587, 220, 120, 14);
		add(classCode);

		JLabel className=new JLabel("CLASS NAME");
		className.setFont(new Font("Tahoma", Font.PLAIN, 13));
		className.setBounds(700, 220, 111, 14);
		add(className);

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(900,650);
		setVisible(true);
		setLocation(550, 100);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Flight_Info().setVisible(true);

	}

}
