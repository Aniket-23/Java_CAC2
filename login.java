package ecommerce;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(10, 10, 817, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setBounds(576, 26, 105, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name:");
		lblNewLabel_2.setForeground(new Color(113, 94, 34));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(511, 97, 123, 54);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password:");
		lblNewLabel_2_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_1.setForeground(new Color(113, 94, 34));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(511, 222, 111, 54);
		panel.add(lblNewLabel_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setBackground(new Color(171, 141, 52));
		textArea.setBounds(511, 144, 294, 54);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_1.setBackground(new Color(171, 141, 52));
		textArea_1.setBounds(513, 267, 294, 54);
		panel.add(textArea_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setForeground(new Color(113, 94, 34));
		btnNewButton.setBounds(593, 360, 147, 45);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Screenshot_2023-03-30_163232-removebg-preview.png"));
		lblNewLabel_3.setBounds(0, 26, 521, 402);
		panel.add(lblNewLabel_3);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=textArea.getText();
				String password=textArea_1.getText();
                try
				{
					Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");
					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Select username,password from user where username=? and password=?");
				    st.setString(1,username);
					st.setString(2,password);
					ResultSet rs=st.executeQuery();

					if(rs.next())
					{
                       itemlist item1=new itemlist();
					   item1.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton,"Wrong Username or Password");
					}
				}

				catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});

	}
}
