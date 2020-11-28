package list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search {

	public JFrame frame;
	private JTextField searchbar;
	private JTextField namebar;
	private JTextField contactbar;
	private JTextField mailbar;

	/**
	 * Launch the application.
	 */

	
	public search(doublelist obj) {
		initialize(obj);
	}

	
	private void initialize(doublelist obj) {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainmanu window = new mainmanu(obj);
				window.frmContactList.setVisible(true);
				frame.dispose();
			}
		});
		btnQuit.setBounds(366, 316, 89, 23);
		frame.getContentPane().add(btnQuit);
		
		searchbar = new JTextField();
		searchbar.setBounds(317, 72, 161, 20);
		frame.getContentPane().add(searchbar);
		searchbar.setColumns(10);
		
		JLabel lblEnterNameTo = new JLabel("Enter name to search");
		lblEnterNameTo.setForeground(Color.WHITE);
		lblEnterNameTo.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblEnterNameTo.setBounds(268, 21, 305, 20);
		frame.getContentPane().add(lblEnterNameTo);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(211, 75, 48, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblSearchResults = new JLabel("search results");
		lblSearchResults.setForeground(Color.WHITE);
		lblSearchResults.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSearchResults.setBounds(317, 127, 161, 28);
		frame.getContentPane().add(lblSearchResults);
		
		JButton btnSave = new JButton("Search");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node n=obj.search(searchbar.getText());
				if(n==null) {
					JOptionPane.showMessageDialog(null, "no contact found");
				}
				else {
				namebar.setText(n.name);
				 String con = Integer.toString(n.cont_n0); 
				contactbar.setText(con);
				mailbar.setText(n.email);}
				
			}
		});
		btnSave.setBounds(551, 71, 89, 23);
		frame.getContentPane().add(btnSave);
		
		namebar = new JTextField();
		namebar.setBounds(439, 191, 149, 20);
		frame.getContentPane().add(namebar);
		namebar.setColumns(10);
		
		contactbar = new JTextField();
		contactbar.setBounds(439, 234, 149, 20);
		frame.getContentPane().add(contactbar);
		contactbar.setColumns(10);
		
		mailbar = new JTextField();
		mailbar.setBounds(439, 285, 149, 20);
		frame.getContentPane().add(mailbar);
		mailbar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(227, 194, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contact Number");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(227, 237, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(227, 288, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(search.class.getResource("/Pictures/image3.png")));
		lblNewLabel_3.setBounds(0, 0, 784, 361);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
