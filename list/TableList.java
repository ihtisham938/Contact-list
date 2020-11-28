package list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class TableList extends JFrame {
	private JPanel contentPane;
	private JTable table;
	public TableList(doublelist Obj) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360, 780);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(102, 177, 1172, 526);
		contentPane.add(scrollPane);
		
		String[] columnHeader= {"Name","Contact Number","Email"};
		String[][] data=Obj.getData();
		
		table = new JTable(data,columnHeader);
		table.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		scrollPane.setViewportView(table);
		
		JLabel lblContactList = new JLabel("Contact List");
		lblContactList.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblContactList.setBounds(570, 30, 279, 79);
		lblContactList.setForeground(Color.WHITE);
		contentPane.add(lblContactList);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(1320, 11, 30, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				mainmanu window=new mainmanu(Obj);
				window.frmContactList.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(749, 725, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel background=new JLabel();
		background.setBounds(0, 0, 1360, 780);
		background.setIcon(new ImageIcon(TableList.class.getResource("/Pictures/images1.jpg")));
		contentPane.add(background);
	}
}
