package list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class addcontact {
	doublelist obj=new doublelist();

	JFrame frmContactList;
	private JTextField Name;
	private JTextField Email;
	String name;
	String contact;
	String email;
	int i;
	private JTextField ointactNo;

	public addcontact(doublelist obj) {
		initialize(obj);
	}

	private void initialize(doublelist obj) {
		frmContactList = new JFrame();
		frmContactList.setTitle("Contact list");
		frmContactList.setBounds(100, 100, 800, 400);
		frmContactList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContactList.getContentPane().setLayout(null);
		
		Name = new JTextField();
		Name.setBounds(318, 86, 236, 20);
		frmContactList.getContentPane().add(Name);
		Name.setColumns(10);
		
		ointactNo = new JTextField();
		ointactNo.setBounds(318, 147, 236, 20);
		frmContactList.getContentPane().add(ointactNo);
		ointactNo.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(318, 209, 236, 20);
		frmContactList.getContentPane().add(Email);
		Email.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(175, 89, 48, 14);
		frmContactList.getContentPane().add(lblName);
		
		JLabel lblContactNumber = new JLabel("Contact number");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setBounds(175, 150, 117, 14);
		frmContactList.getContentPane().add(lblContactNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(175, 212, 48, 14);
		frmContactList.getContentPane().add(lblEmail);
		
		JLabel lblEnterTheContact = new JLabel("Enter the Contact Information");
		lblEnterTheContact.setForeground(Color.WHITE);
		lblEnterTheContact.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnterTheContact.setBounds(250, 29, 347, 20);
		frmContactList.getContentPane().add(lblEnterTheContact);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name=Name.getText();
				contact=ointactNo.getText();
				email=Email.getText();
				i=Integer.parseInt(contact); 
				obj.CreateNode(name, i, email);
				JOptionPane.showMessageDialog(null, "Contact Added");
				Name.setText(null);
				ointactNo.setText(null);
				Email.setText(null);
			}
		});
		btnSave.setBounds(216, 272, 89, 23);
		frmContactList.getContentPane().add(btnSave);
		
		JButton MainMenu = new JButton("Exit");
		MainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainmanu window = new mainmanu(obj);
				window.frmContactList.setVisible(true);
				frmContactList.dispose();
			}
		});
		MainMenu.setBounds(403, 272, 89, 23);
		frmContactList.getContentPane().add(MainMenu);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(addcontact.class.getResource("/Pictures/image3.png")));
		label.setBounds(0, 0, 784, 361);
		frmContactList.getContentPane().add(label);
	
	}
}



