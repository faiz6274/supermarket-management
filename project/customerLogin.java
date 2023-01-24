package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;

public class customerLogin extends home {

	public JFrame frame;
	public JTextField txtUsername;
	public JPasswordField passwordField;
	public JButton btnNewButton_2;
	public JButton btnNewButton_1;
	public JButton btnNewButton;
	public String username ;
    public String  password ;
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/javaproject";
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerLogin c = new customerLogin();
					c.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public customerLogin() {
		initialize();
	}

	public void initialize() {
		/* create Frame for login page
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
		passwordField.setBounds(415, 180, 165, 20);
		frame.getContentPane().add(passwordField);
		
	    /* add "login" button
	     * set location and size(bounds)
	     */
	    btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(340, 235, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		/* add sign up button
		 * set location and size(bounds)
		 */
		btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.addActionListener(this);	
		btnNewButton_1.setBounds(340, 270, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		 /*add "username" label
		 *  set font size and color
		 *  set location(bounds)
		 */
		JLabel lblNewLabel = new JLabel("USERNAME  :");
		lblNewLabel.setFont(new Font("Tahoma",Font.PLAIN,13));
		lblNewLabel.setBounds(265, 120, 97, 20);
		frame.getContentPane().add(lblNewLabel);
		
		 /*add "password" label
		  *  set font size and color
		  *  set location(bounds)
		  */
		JLabel lblNewLabel_1 = new JLabel("PASSWORD  :");
		lblNewLabel_1.setFont(new Font("Tahoma",Font.PLAIN,13));
		lblNewLabel_1.setBounds(265, 180, 89, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		 /*add "login" label
		  *  set font size and color
		  *  set location(bounds)
		  */
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(363, 48, 79, 28);
		frame.getContentPane().add(lblNewLabel_2);	
		
         	
		/* add "back" button
		 * set font size and color
		 * set location(bounds)
		 */
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_2);}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		/* set the action for "back" button
		 * closing the home frame
		 * opening the login page frame
		 */
		if(e.getSource()==btnNewButton_2) {	
			frame.dispose();
			home h = new home();
			h.frame.setVisible(true);
		} 
	      username = txtUsername.getText();
	      
	      password = new String( passwordField.getPassword());
	     
	     
	        /*set action for login button
	         * check the whether the username and password is correct or not.
	         */
	      
	        if(e.getSource()==btnNewButton) {  
	        	// connecting database
	        	 try {	                  
	                	Class.forName(JDBC_DRIVER); 
	                    String dbUsername = "root";
	                    String dbPassword = "Faiz@6274";
	                    Connection conn = DriverManager.getConnection(DB_URL, dbUsername, dbPassword);
	                    Statement stmt = conn.createStatement();
	                    //checking the whether the username and password exist in the database
	                    String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
	                    ResultSet rs = stmt.executeQuery(sql);
	                   
                            /* To show login successful message
                             * closing login page frame 
                             * opening customerpage frame
                             */
	                    if(rs.next()){
	                    	JOptionPane.showMessageDialog(null, "Login successful!");
	                    	frame.dispose();	                    	
	                    	customerPage cp=new customerPage();
	                    	cp.frame.setVisible(true);
	                    	
	                    	//To give error message
	                    }else{
	                        JOptionPane.showMessageDialog(null, "Invalid username or password.");
	                        txtUsername.setText("");
	                        passwordField.setText("");
	                    }
	                } catch (SQLException ex) {
	                	 ex.printStackTrace();
	                } catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}
	            }
           /*set action for "sign up" button
            * closing login page frame  
            * opening signup page frame 
            */
	        if(e.getSource()==btnNewButton_1) {
	        	frame.dispose();
	        	signUp su = new signUp();
	        	su.frame.setVisible(true);
	        }
	    }
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = txtUsername.getText();
	}
		}
