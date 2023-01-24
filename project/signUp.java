package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signUp extends customerLogin{

	public JFrame frame;
	public JTextField txtUsername;
	public JPasswordField passwordField;
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/javaproject";
    public JButton btnNewButton_1 ;
    public JButton btnNewButton ;
    public String username;
    public String password;    

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUp su=new signUp();
					su.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public signUp() {
		initialize();
	}
	
	public void initialize() {
		/* create Frame for signup page
		 * set location and size     
		 */                          
		frame = new JFrame();
		frame.getContentPane().setFocusCycleRoot(true);
		frame.setResizable(false);
		frame.setBounds(250, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		
		/*add text box for username  
		 *set location and size      
		 */                          
		txtUsername = new JTextField();
		txtUsername.setToolTipText("enter username");
		txtUsername.setBounds(415, 120, 165, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		 
		/* To add text box for password 
		 * set location and size        
		 */                             
		passwordField = new JPasswordField();
		passwordField.setToolTipText("enter password");
		passwordField.setBounds(415, 181, 165, 20);
		frame.getContentPane().add(passwordField);
		 
		/* add sign up button             
		 * set location and size(bounds)  
		 */                               
		btnNewButton_1 = new JButton("SIGNUP");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(465, 239, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		 /*add "username" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */                             
		JLabel lblNewLabel = new JLabel("USERNAME    :");
		lblNewLabel.setFont(new Font("Tahoma",Font.PLAIN,13));
		lblNewLabel.setBounds(265, 120, 97, 20);
		frame.getContentPane().add(lblNewLabel);
		
        
        /*add "password" label     
         *  set font size and color
         *  set location(bounds)   
         */                        
		JLabel lblNewLabel_1 = new JLabel("PASSWORD   :");
		lblNewLabel_1.setFont(new Font("Tahoma",Font.PLAIN,13));
		lblNewLabel_1.setBounds(265, 180, 97, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		 /*add "sign up" label           
		  *  set font size and color   
		  *  set location(bounds)      
		  */                           
		JLabel lblNewLabel_2 = new JLabel("SIGNUP");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(363, 48, 100, 28);
		frame.getContentPane().add(lblNewLabel_2);

		/* add "back" button              
		 * set location and size(bounds)   
		 */                                
		btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(this);	
		btnNewButton.setBounds(319, 239, 89, 23);
		frame.getContentPane().add(btnNewButton);		
	}
   //To create account
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		/* set action for "back" button
		 * close signup page frame
		 * opening login page frame 
		 */
		if(e.getSource()==btnNewButton) {
			frame.dispose();
        	customerLogin cl = new customerLogin();
        	cl.frame.setVisible(true);
		}
		//set action for "sign up" button
		if(e.getSource()==btnNewButton_1) {			
				  username = txtUsername.getText();
		          password = passwordField.getText();
		    /* To check whether the password contains at least one special characters and length must be between 8 to 12
		     * To check the username length is between 4 to 20
		     * 
		     */
          if(passwordField.getPassword().length>=8 && passwordField.getPassword().length<=12 
        		  && txtUsername.getText().length()>=4) {
        	  if(password.contains("!")||password.contains("@")||password.contains("#")||
        			  password.contains("$")||password.contains("%")||
        			  password.contains("?")||password.contains("&")) {
        	  
       	 try {     // connecting to database using JDBC  		     
                   Class.forName(JDBC_DRIVER); 
                   String dbUsername = "root";
                   String dbPassword = "Faiz@6274";

                   Connection conn = DriverManager.getConnection(DB_URL, dbUsername, dbPassword);
                   Statement stmt = conn.createStatement();
                   //inserting the new username and password into database
                   String sql1 = "INSERT INTO users"+" (username, password)"+" VALUES "
                   		+ "( '"+ username + "','" + password + "')";         
       			   stmt.executeUpdate(sql1);       			   
       			   stmt.close();
    			   conn.close();      			    
        } catch (SQLException ex) {
        	 ex.printStackTrace();
      } catch (ClassNotFoundException e1) {	
		e1.printStackTrace();
	}		/* To show Account created successfully message
       	     * closing the signup page frame 
       	     * opening the login page frame
       	     */
       	    JOptionPane.showMessageDialog(null, "Account created successfully!");
            frame.dispose();
       	    customerLogin cl=new customerLogin();
       	    cl.frame.setVisible(true);}
        	  else{//To give error message "Invalid username or password."
                  JOptionPane.showMessageDialog(null, "Invalid username or password."); 
                  txtUsername.setText("");
                  passwordField.setText("");
                  }}
               else{
                 JOptionPane.showMessageDialog(null, "Invalid username or password.");
                 txtUsername.setText("");
                 passwordField.setText("");
                 }}	    
}}

		


