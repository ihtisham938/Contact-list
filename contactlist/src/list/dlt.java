package list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
//this class will delete the contact of choice
public class dlt {
String name;
	 JFrame frmContactList;
	private JTextField textField;
	public dlt(doublelist obj) {
		initialize(obj);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(doublelist obj) {
		frmContactList = new JFrame();
		frmContactList.setTitle("Contact list");
		frmContactList.setBounds(100, 100, 728, 393);
		frmContactList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContactList.getContentPane().setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name;
				name=textField.getText();
				obj.Delete(name);
				JOptionPane.showMessageDialog(null, "Contact deleted");
				textField.setText(null);
			}
		});
		btnDelete.setBounds(232, 215, 89, 23);
		frmContactList.getContentPane().add(btnDelete);
		
		textField = new JTextField();
		textField.setBounds(364, 147, 168, 20);
		frmContactList.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(232, 150, 48, 14);
		frmContactList.getContentPane().add(lblName);
		
		JButton MainMenu = new JButton("Exit");
		MainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainmanu window = new mainmanu(obj);
				window.frmContactList.setVisible(true);
				frmContactList.dispose();
			}
		});
		MainMenu.setBounds(419, 215, 89, 23);
		frmContactList.getContentPane().add(MainMenu);
		
		JLabel lblEnterNameTo = new JLabel("Enter name  to delete");
		lblEnterNameTo.setForeground(Color.WHITE);
		lblEnterNameTo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnterNameTo.setBounds(263, 55, 269, 37);
		frmContactList.getContentPane().add(lblEnterNameTo);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(dlt.class.getResource("/Pictures/image3.png")));
		label.setBounds(0, 0, 712, 354);
		frmContactList.getContentPane().add(label);
	}
}
