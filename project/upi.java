package project;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class upi extends payment{

	public JFrame frame;
	public JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					upi window = new upi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public upi() {
		initialize();
	}

	public void initialize() {
		/* create Frame for upi page
		 * set location and size     
		 */ 
		frame = new JFrame();
		frame.setBounds(250, 100,800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*add for "ENTER UPI  ID" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		JLabel lblNewLabel = new JLabel("ENTER UPI  ID  :");
		lblNewLabel.setBounds(223, 199, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		/*add text box for enter upi id
		 * set size and location(bounds) 
		 */
		textField = new JTextField();
		textField.setToolTipText("enter upi id");
		textField.setBounds(365, 196, 156, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/* add "back" button      
		 * set font size and color
		 * set location(bounds)
		 * set action for back button
		 * closing the  upi page frame
		 * opening the payment page frame   
		 */  
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.dispose();
				 payment p=new payment();				 
				 p.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton);		

		/* add "CONFIRM" button      
		 * set font size and color
		 * set location(bounds)
		 */
		btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(this); 			
		btnNewButton_1.setBounds(320, 313, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
	}@Override
public void actionPerformed(ActionEvent e) {
		/*set action for "CONFIRM" button
		 * check whether the upi id contains @ symbol or not
		 * show "Order placed successfully!" message
		 * close upi page frame
		 *open store page frame 
		 */
		if(e.getSource()==btnNewButton_1) {
	     String upiId=textField.getText();
	       if(upiId.contains("@")){
	          JOptionPane.showMessageDialog(null, "Order placed successfully!");	  
	          frame.dispose();
	          store s=new store();
	          s.frame.setVisible(true);
	  }	}
}}
