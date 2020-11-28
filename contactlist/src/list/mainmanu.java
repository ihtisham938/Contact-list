package list;

import java.awt.EventQueue;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class mainmanu {
	
	public JFrame frmContactList;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doublelist obj=new doublelist();
					mainmanu window = new mainmanu(obj);
					window.frmContactList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public mainmanu(doublelist obj) {
		initialize(obj);
	}
	private void initialize(doublelist obj) {
		frmContactList = new JFrame();
		frmContactList.setTitle("Contact list");
		frmContactList.setBounds(100, 100, 800, 400);
		frmContactList.setLocationRelativeTo(null);
		frmContactList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContactList.getContentPane().setLayout(null);
		
		JLabel lblPersonalContactRegestory = new JLabel("personal contact regestory");
		lblPersonalContactRegestory.setForeground(Color.WHITE);
		lblPersonalContactRegestory.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		lblPersonalContactRegestory.setBounds(195, 38, 344, 56);
		frmContactList.getContentPane().add(lblPersonalContactRegestory);
		
		JButton btnAddContact = new JButton("Add contact");
		btnAddContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addcontact objn=new addcontact(obj);
				objn.frmContactList.setVisible(true);
				frmContactList.dispose();
			}
		});
		btnAddContact.setBounds(71, 171, 152, 23);
		frmContactList.getContentPane().add(btnAddContact);
		
		JButton btnSearchContact = new JButton("search contact");
		btnSearchContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search src=new search(obj);
				src.frame.setVisible(true);
				frmContactList.dispose();
			}
		});
		btnSearchContact.setBounds(285, 171, 152, 23);
		frmContactList.getContentPane().add(btnSearchContact);
		
		JButton btnDeleteContact = new JButton("delete contact");
		btnDeleteContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dlt dl=new dlt(obj);
				dl.frmContactList.setVisible(true);
				frmContactList.dispose();
			}
		});
		btnDeleteContact.setBounds(516, 171, 152, 23);
		frmContactList.getContentPane().add(btnDeleteContact);
		
		JButton btnNewButton = new JButton("ListContact");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				TableList obj1=new TableList(obj);
				obj1.setVisible(true);
				frmContactList.dispose();
			}
		});
		btnNewButton.setBounds(283, 234, 154, 23);
		frmContactList.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(mainmanu.class.getResource("/Pictures/image3.png")));
		lblNewLabel.setBounds(0, 0, 784, 361);
		frmContactList.getContentPane().add(lblNewLabel);

		
	
	}
}
