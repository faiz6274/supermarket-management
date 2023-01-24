package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class customerPage extends signUp{

	public JFrame frame;
  

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerPage cp = new customerPage();
					cp.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public customerPage() {
		initialize();
	}
	
	public void initialize() {
		/* create Frame for customerpage
		 * set location and size     
		 */                          
		frame = new JFrame();		 
		frame.setResizable(false);
		frame.getContentPane().setFocusCycleRoot(true);
		frame.setBounds(250, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 /*add "Welcome To ABC Supermarket" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */                             
		JLabel lblNewLabel = new JLabel("Welcome To ABC Supermarket");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		lblNewLabel.setBounds(258, 74, 300, 22);
		frame.getContentPane().add(lblNewLabel);
		
		/* add "GO TO STORE" button             
		 * set location and size(bounds)  
		 */                               
		JButton btnNewButton_1 = new JButton("GO TO STORE");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 127, 80));
		btnNewButton_1.addActionListener(new ActionListener() {
			/*set action for "GO TO STORE" button
			 * closing the customerpage frame
			 * opening the store frame
			 */
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				store s=new store();				
				s.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(326, 186, 150, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		/* add LOGOUT button             
		 * set location and size(bounds)  
		 */                               
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.addActionListener(new ActionListener() {

			/* set the action for "logout" button
			 * closing the customerpage frame
			 * opening the login page frame
			 */
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				customerLogin c=new customerLogin();
				c.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(695, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		

		/* set the action for "back" button
		 * closing the customerpage frame
		 * opening the home page frame
		 */
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3) {
					frame.dispose();
		        	home h = new home();
		        	h.frame.setVisible(true);
				}
			}
		});
		btnNewButton_3.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
	}

}