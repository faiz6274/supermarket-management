package project;


import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class store extends customerPage{

	public JFrame frame;
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JButton btnNewButton_4;
	public JButton btnNewButton_5;
	public JButton btnNewButton_6;
	public JButton btnNewButton_7;
	public JButton btnNewButton_8;	  
	 
   public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					store s=new store();
					s.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}   
	public store() {
		initialize();
	}

	public void initialize() {
		/* create Frame for store page
		 * set location and size     
		 */                          	
		frame = new JFrame();		
		frame.setResizable(false);
		frame.setBounds(250, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 /*add "ABC SUPERMARKET" label           
		  *  set font size and color   
		  *  set location(bounds)      
		  */                           
		JLabel lblNewLabel_2 = new JLabel("ABC SUPERMARKET");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(318, 31, 192, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		/* add "back" button              
		 * set location and size(bounds)   
		 */                                
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_2);		
        
         /*add label     
          * set image in the label
          * set location(bounds)   
          */                        
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery01.jpg"));
		lblNewLabel.setBounds(36, 105, 82, 81);
		frame.getContentPane().add(lblNewLabel);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery 04.jpg"));
		lblNewLabel_1.setBounds(232, 92, 71, 94);
		frame.getContentPane().add(lblNewLabel_1);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery 03.jpg"));
		lblNewLabel_3.setBounds(456, 92, 89, 94);
		frame.getContentPane().add(lblNewLabel_3);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery02.jpg"));
		lblNewLabel_4.setBounds(650, 94, 89, 92);
		frame.getContentPane().add(lblNewLabel_4);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery05.jpg"));
		lblNewLabel_5.setBounds(26, 267, 104, 74);
		frame.getContentPane().add(lblNewLabel_5);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery08.jpg"));
		lblNewLabel_6.setBounds(232, 267, 104, 74);
		frame.getContentPane().add(lblNewLabel_6);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery06.jpg"));
		lblNewLabel_7.setBounds(456, 267, 89, 74);
		frame.getContentPane().add(lblNewLabel_7);
		
		 /*add label     
         * set image in the label
         * set location(bounds)   
         */  
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\muhammed.v\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\grocery07.jpg"));
		lblNewLabel_8.setBounds(650, 267, 104, 74);
		frame.getContentPane().add(lblNewLabel_8);
		
		/* add "back" button              
		 * set location and size(bounds)   
		 */                                
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(this) ;		
		btnNewButton_2.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton = new JButton("ORDER NOW");
		btnNewButton.setBackground(new Color(255, 127, 80));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(25, 221, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_1 = new JButton("ORDER NOW");
		btnNewButton_1.setBackground(new Color(255, 127, 80));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(215, 221, 110, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_3 = new JButton("ORDER NOW");
		btnNewButton_3.setBackground(new Color(255, 127, 80));
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(445, 221, 110, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_4 = new JButton("ORDER NOW");
		btnNewButton_4.setBackground(new Color(255, 127, 80));
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(640, 221, 110, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_5 = new JButton("ORDER NOW");
		btnNewButton_5.setBackground(new Color(255, 127, 80));
		btnNewButton_5.addActionListener(this);
		btnNewButton_5.setBounds(25, 377, 110, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_6 = new JButton("ORDER NOW");
		btnNewButton_6.setBackground(new Color(255, 127, 80));
		btnNewButton_6.addActionListener(this);
		btnNewButton_6.setBounds(215, 377, 110, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_7 = new JButton("ORDER NOW");
		btnNewButton_7.setBackground(new Color(255, 127, 80));
		btnNewButton_7.addActionListener(this);
		btnNewButton_7.setBounds(455, 377, 110, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		/* add "ORDER NOW" button              
		 * set location and size(bounds)   
		 */  
		btnNewButton_8 = new JButton("ORDER NOW");
		btnNewButton_8.setBackground(new Color(255, 127, 80));
		btnNewButton_8.addActionListener(this); 	
		btnNewButton_8.setBounds(640, 377, 110, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		 /*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */                               
        JLabel lblNewLabel_10 = new JLabel("Sugar 1kg packet");
		lblNewLabel_10.setBounds(40, 196, 100, 18);
		frame.getContentPane().add(lblNewLabel_10);	
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_9 = new JLabel("Dairy milk silk");
		lblNewLabel_9.setBounds(225, 196, 100, 18);
		frame.getContentPane().add(lblNewLabel_9);
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_11 = new JLabel("Parachute oil 200ml");
		lblNewLabel_11.setBounds(450, 196, 115, 18);
		frame.getContentPane().add(lblNewLabel_11);	
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_12 = new JLabel("Rice 25kg bag");
		lblNewLabel_12.setBounds(660, 196, 100, 18);
		frame.getContentPane().add(lblNewLabel_12);	
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_13 = new JLabel("Tomato");
		lblNewLabel_13.setBounds(69, 352, 46, 18);
		frame.getContentPane().add(lblNewLabel_13);
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_14 = new JLabel("Chilly");
		lblNewLabel_14.setBounds(268, 352, 46, 18);
		frame.getContentPane().add(lblNewLabel_14);
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_15 = new JLabel("Potato");
		lblNewLabel_15.setBounds(481, 352, 46, 18);
		frame.getContentPane().add(lblNewLabel_15);
		
		/*add  label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel lblNewLabel_16 = new JLabel("Beans");
		lblNewLabel_16.setBounds(685, 352, 46, 18);
		frame.getContentPane().add(lblNewLabel_16);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int id = 0;
		 
		/*set action for "ORDER NOW" buttons
		 */
		if(e.getSource()==btnNewButton) {
			id=1;}
		else if(e.getSource()==btnNewButton_1) {			
			id=2;	
		}else if(e.getSource()==btnNewButton_3) {			
			id=3;	} 
		else if(e.getSource()==btnNewButton_4) {	
			id=4;
		}else if(e.getSource()==btnNewButton_5) {			
			id=5;
		}else if(e.getSource()==btnNewButton_6) {			
			id=6;	 
		}else if(e.getSource()==btnNewButton_7) {			
			id=7;
		} else if(e.getSource()==btnNewButton_8) {			
			id=8;}
		
		/*set action for "ORDER NOW" buttons
		 * closing the store frame
		 * set the value of id using set method
		 * opening orderSummary frame
		 */
	if((e.getSource()==btnNewButton) || (e.getSource()==btnNewButton_1)||  (e.getSource()==btnNewButton_3)
			||(e.getSource()==btnNewButton_4)||
		   (e.getSource()==btnNewButton_5)|| (e.getSource()==btnNewButton_6)||(e.getSource()==btnNewButton_7)
		   || (e.getSource()==btnNewButton_8)) {
		    frame.dispose();
		    orderSummary os=new orderSummary();
		    os.setId(id);
			os.frame.setVisible(true);
			os.initialize();
		}
	/*set action for "back" buttons
	 * closing the store frame
	 * opening customerpage frame
	 */
	if(e.getSource()==btnNewButton_2) {		
		frame.dispose();
		customerPage cp=new customerPage();
        cp.frame.setVisible(true);
	}
		 
	}}
	
		