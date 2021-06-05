package Airline_project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mainframe extends JFrame {
	
	public Mainframe() {
		super("AIRLINE RESERVATION MANAGENENT SYSTEM");
		initialize();
	}
	private void initialize() {
		setForeground(Color.CYAN);
		setLayout(null);
		
		//set image at backgroud
		JLabel newLable1=new JLabel("");
		newLable1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Airline_project/Icons/front.jpg")));
		newLable1.setBounds(-70,-45,1820,890);
		add(newLable1);
		
		JLabel AMS=new JLabel("AIR INDIA WELCOMES YOU");		//AMS=Airline management System
		AMS.setForeground(Color.DARK_GRAY);
		AMS.setFont(new Font("Tahoma",Font.BOLD,36));
		AMS.setBounds(600, 70, 1000, 55);
		newLable1.add(AMS);
		
		//create menu bar
		JMenuBar menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		
		//create menu 
		JMenu AirlineMenu=new JMenu("AIRLINE SYSTEM");
		AirlineMenu.setForeground(Color.BLUE);
		menuBar.add(AirlineMenu);
		
		JMenuItem MenuItem1=new JMenuItem("FLIGHT INFO");		//add menu item in Airline System Menu
		AirlineMenu.add(MenuItem1);
		
		JMenuItem MenuItem2=new JMenuItem("ADD CUSTOMER DETAILS");
		AirlineMenu.add(MenuItem2);
		
		JMenuItem MenuItem3=new JMenuItem("JOURNEY DETAILS");
		AirlineMenu.add(MenuItem3);
		
		JMenuItem MenuItem4=new JMenuItem("PAYMENT DETAILS");
		AirlineMenu.add(MenuItem4);
		
		JMenuItem MenuItem5=new JMenuItem("CANCELLATION");
		AirlineMenu.add(MenuItem5);
		
		JMenu menu2=new JMenu("TICKET");	//create second menu
		menu2.setForeground(Color.RED);
		menuBar.add(menu2);
		
		JMenuItem MenuItem6=new JMenuItem("BUY");
		menu2.add(MenuItem6);
		
		JMenuItem MenuItem7=new JMenuItem("CANCEL TICKET");
		menu2.add(MenuItem7);
		
		JMenu menu3=new JMenu("LIST");
		menu3.setForeground(Color.BLUE);
		menuBar.add(menu3);
		
		JMenu menu4=new JMenu("MISC");
		menu4.setForeground(Color.RED);
		menuBar.add(menu4);
		
		MenuItem1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
		});
		
		MenuItem2.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent ae)
			{
				new Add_Customer();
			}
		});
		
		MenuItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Journey_Details();
				
			}
		});
		
		MenuItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Payment_Details();
				
			}
		});
		
		MenuItem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cancel();
				
			}
		});
		
		MenuItem6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add_Customer();
				
			}
		});
		
		MenuItem7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cancel();
				
			}
		});
		
		setSize(1950,1090);
		setVisible(true);
	} 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainframe mainframe=new Mainframe();
		mainframe.setVisible(true);

	}

}
