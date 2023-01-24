package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class payment extends orderSummary{

	public JFrame frame;
	public JPanel panel ;
	public JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3;
	public JTextField textField;
    public JButton btnNewButton,btnNewButton_1;
    public JRadioButton rdbtnNewRadioButton_1;
    public JRadioButton rdbtnNewRadioButton;
    public String paymentMethod=null;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/javaproject";
	public JTextField textField_1 ;
	public JTextArea textArea;	
	
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment p=new payment();
					p.frame.setVisible(true);
				}   catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}		
	public payment() {
		initialize();
	}

	public void initialize() {
		/* create Frame for payment page
		 * set location and size     
		 */ 
		frame = new JFrame();		
		frame.setResizable(false);
		frame.setBounds(250, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*add for "PAYMENT" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		lblNewLabel = new JLabel("PAYMENT");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tunga", Font.BOLD, 20));
		lblNewLabel.setBounds(324, 55, 110, 28);
		frame.getContentPane().add(lblNewLabel);
		
		/*add for " ADDRESS" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		lblNewLabel_1 = new JLabel("           ADDRESS :");
		lblNewLabel_1.setBounds(234, 170, 120, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		/* add textArea for address
		 * set location(bounds) 
		 */
		textArea = new JTextArea();
		textArea.setBounds(374, 165, 190, 61);
		frame.getContentPane().add(textArea);
		
		/*add for "PAYMENT METHODE" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		lblNewLabel_2 = new JLabel("PAYMENT METHODE :");
		lblNewLabel_2.setBounds(218, 254, 135, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		/* add "PLACE ORDER" button      
		 * set font size and color
		 * set location(bounds)		
		 */    
		btnNewButton = new JButton("PLACE ORDER");
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setForeground(new Color(0, 140, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(344, 335, 120, 23);
		frame.getContentPane().add(btnNewButton);
		
		/* add "back" button      
		 * set font size and color
		 * set location(bounds)
		 * set action for back button
		 * closing the payment page frame
		 * opening the store page frame   
		 */    
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				store s= new store();
				frame.dispose();
				s.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		/*add radiobutton for payment method "CASH ON DELVERY" option
		 * set font size and color
		 * set location(bounds)
		 */
		rdbtnNewRadioButton = new JRadioButton("CASH ON DELVERY");
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton.setBounds(374, 252, 150, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);		

		/*add radiobutton for payment method "UPI" option
		 * set font size and color
		 * set location(bounds)
		 */
		rdbtnNewRadioButton_1 = new JRadioButton("UPI");
		rdbtnNewRadioButton_1.addActionListener(this) ;
		rdbtnNewRadioButton_1.setBounds(540, 249, 120, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		/*add for "MOBILE NUMBER " label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		lblNewLabel_3 = new JLabel("MOBILE NUMBER :");
		lblNewLabel_3.setBounds(225, 120, 120, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		/*add text box for mobile number
		 *  set size and location(bounds)
		 */
		textField_1 = new JTextField();
		textField_1.setToolTipText("enter mobile number");
		textField_1.setBounds(374,117,149,20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	}@Override
	public void actionPerformed(ActionEvent e) {
		//set action for radiobutton for payment method "CASH ON DELVERY" option 
		if(e.getSource()==rdbtnNewRadioButton) {
			paymentMethod="CASH ON DELIVERY";
		}//set action for radiobutton for payment method "UPI" option
		if(e.getSource()==rdbtnNewRadioButton_1) {			
			paymentMethod="UPI";
		}
		//set action for "PLACE ORDER" button  
		if(e.getSource()==btnNewButton) {
			String mno=textField_1.getText();
			String address=textArea.getText();
		/* check the mobile number size is 10 digits
		 * check the address length is greater than 4
		 * check paymentmethod was selected
		 */
			if(mno.length()==10 ) {
				if(address.length()>4) {
				if(paymentMethod!=null) {						
			 try {  //connection to database     		     
                 Class.forName(JDBC_DRIVER);                  
                 String dbUsername = "root";
                 String dbPassword = "Faiz@6274";
               
                 Connection conn = DriverManager.getConnection(DB_URL, dbUsername, dbPassword);
                 Statement stmt = conn.createStatement();
                 //insert payment details into database
                 String sql1 = "INSERT INTO orderDetails"+" (mobileNo, address,paymentmethod)"+" VALUES"
                 	+ " ('"+ mno + "',"+ "'" + address + "','"+paymentMethod+"')";         
     			 stmt.executeUpdate(sql1);     			    			      
      } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException e1) {		
		e1.printStackTrace();
	}       /* if the paymentmethod is upi
	         *close payment page frame
	         *open upi page frame
	         */
			 if ( paymentMethod=="UPI") {
				    frame.dispose();
				    upi u=new	upi();
					u.frame.setVisible(true);				
					} else {
						 /* show "Order placed successfully!" message 
						  * closing payment page frame         
						  * opening store page frame       
						  */                                 
		 JOptionPane.showMessageDialog(null, "Order placed successfully!");
		 frame.dispose();
		 store s=new store();
		 s.frame.setVisible(true);}}
				else { // show "Select payment methode" message 
					
					JOptionPane.showMessageDialog(null, "Select payment methode");}
				
			}else { // show "Please enter valid address " message 
					JOptionPane.showMessageDialog(null, "Please enter valid address ");}
			}
		      else  { // show "Please enter valid mobile number  " message 
				JOptionPane.showMessageDialog(null, "Please enter valid mobile number  ");			
			}	
			}}}

