package project;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home implements ActionListener{

	public JFrame frame;
	public JButton btnNewButton;
	public JButton btnNewButton_1 ;
	
	//launch application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home h = new home();
					h.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public home() {
		initialize();
	}
	public void initialize() {
		/* create Frame for home page
		 * set location and size
		 */ 
		frame = new JFrame();
		frame.getContentPane().setFocusCycleRoot(true);
		frame.setResizable(false);
		frame.setBounds(250, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		/* add "close" button
		 * set location(bounds)
		 */
		btnNewButton = new JButton("CLOSE");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		/* add "enter" button
		 * set font size and color
		 * set location(bounds)
		 */
		btnNewButton_1 = new JButton("ENTER");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(SystemColor.inactiveCaptionText);
		btnNewButton_1.addActionListener(this); 
		btnNewButton_1.setBounds(317, 184, 150, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		/*add "home" label
		 *  set font size and color
		 *  set location(bounds)
		 */
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0,0,128));
		lblNewLabel.setBounds(359, 90, 79, 40);
		frame.getContentPane().add(lblNewLabel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/* set the action for "close" button
		 * closing the home frame
		 */
		if(e.getSource()==btnNewButton) {
			frame.dispose();
		}
		
		/* set the action for "enter" button
		 * closing the home frame
		 * opening the login page frame
		 */
		if(e.getSource()==btnNewButton_1) {
			frame.dispose();			
			customerLogin cl = new customerLogin();
			cl.frame.setVisible(true);}
	}
	}