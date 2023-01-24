package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class orderSummary extends store {

	public JFrame frame;
    public JButton btnNewButton_1 ;
    public String itemname;
    public String price;   
    public int id;
	public String totalPrice;
    public String quantity;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/javaproject";
 
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderSummary os=new orderSummary();
					os.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}   
	public orderSummary() {
		initialize();		
	}
	public void initialize() {
		/* create Frame for orderSummary page
		 * set location and size     
		 */                          
		frame = new JFrame();		
		frame.setResizable(false);
		frame.setVisible(true);;
		frame.setBounds(250, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	try {
			//connecting to database
             Class.forName(JDBC_DRIVER); 
              
             Connection conn = DriverManager.getConnection(DB_URL, "root", "Faiz@6274");
             Statement stmt = conn.createStatement();
             //taking item details from database using item id
             String sql = "SELECT * FROM items WHERE id = " + id +  "";
             ResultSet rs = stmt.executeQuery(sql);
             if(rs.next()) {
            	 itemname=rs.getString("name");
            	 price=(rs.getString("price"));
                 quantity=(rs.getString("quantity"));                                    
             }
}  catch (SQLException ex) {
  ex.printStackTrace();
} catch (ClassNotFoundException e1) {

  e1.printStackTrace();
}       
	   /*add "ORDER SUMMERY" label     
        * set image in the label
        * set location(bounds)   
        */  
		JLabel lblNewLabel = new JLabel("ORDER SUMMERY");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(332, 61, 131, 14);
		frame.getContentPane().add(lblNewLabel);
		
		/* add "back" button      
		 * set font size and color
		 * set location(bounds)
		 * set action for back button
		 * closing the ordersummary page frame
		 * opening the store page frame   
		 */                       
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
					frame.dispose();
		        	store s = new store();
		        	s.frame.setVisible(true);
				}		
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		/*add for quantity label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */ 
		JLabel quantity1 = new JLabel("per "+quantity);
		quantity1.setFont(new Font("Tahoma", Font.BOLD, 11));
		quantity1.setBounds(475, 187, 120, 18);
		frame.getContentPane().add(quantity1);
		
		/*add for itemname label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		JLabel lblNewLabel_1 = new JLabel(itemname+" :");
		lblNewLabel_1.setBounds(200, 187, 270, 18);
		frame.getContentPane().add(lblNewLabel_1);		
		
		/*add for price label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		JLabel lblNewLabel_2 = new JLabel(price);
		lblNewLabel_2.setBounds(417, 187, 46, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		/* add "CONTINUE WITH ORDER" button      
		 * set font size and color
		 * set location(bounds)
		 * set action for back button
		 * closing the ordersummary page frame
		 * opening the payment page frame   
		 */    
		btnNewButton_1 = new JButton("CONTINUE WITH ORDER");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	 
				 frame.dispose();
				 payment p=new payment();				
				 p.frame.setVisible(true);
				 p.initialize();
			}
		});
		btnNewButton_1.setBounds(320, 313, 175, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		/*add for "ITEM" label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		JLabel lblNewLabel_4 = new JLabel("ITEM");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(200, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		/*add for "PRICE " label         
		 *  set font size and color     
		 *  set location(bounds)        
		 */
		JLabel lblNewLabel_5 = new JLabel("PRICE ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(417, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
}
	 
		public String getItemname() {
			return itemname;
		}
		public void setItemname(String itemname) {
			this.itemname = itemname;
		}}