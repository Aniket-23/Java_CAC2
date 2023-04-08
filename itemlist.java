package ecommerce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class itemlist extends JFrame {

	private JPanel contentPane;
	private JTextField txtSizeM;
	private JTextField txtRs;
	private JTextField txtRs_1;
	private JTextField txtRs_2;
	private JTextField txtRs_3;
	private JTextField txtRs_4;
	private JTextField txtRs_5;
	private JTextField txtSpidermanStationarySet;
	private JTextField txtHamleysAlienFriend;
	private JTextField txtJingleKnock;
	private JTextField txtHoodedBear;
	private JTextField txtColorBook;
	private JTextField txtDollyDolphin;
	private JTextField txtRs_6;
	private JTextField txtStinkyPeppaPig;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					itemlist frame = new itemlist();
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
	public itemlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(1650,1480);
		setBounds(100, 100, 1554, 998);
		contentPane = new JPanel();
		//contentPane.setBackground(Color.red);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 128, 0));
		panel_1.setBackground(new Color(125, 155, 170));
		panel_1.setBounds(29, 112, 1501, 723);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(25, 39, 290, 308);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\1.jpg"));
		lblNewLabel_1.setBounds(10, 10, 270, 210);
		panel_2.add(lblNewLabel_1);

		JButton btnNewButton_1_1 = new JButton("ADD TO CART\r\n");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1_1.setBounds(146, 259, 134, 32);

		panel_2.add(btnNewButton_1_1);
		txtSizeM = new JTextField();
		txtSizeM.setBounds(20, 216, 260, 32);
		panel_2.add(txtSizeM);
		txtSizeM.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSizeM.setHorizontalAlignment(SwingConstants.CENTER);
		txtSizeM.setForeground(new Color(255, 255, 255));
		txtSizeM.setText("Duck");
		txtSizeM.setBackground(new Color(128, 0, 128));
		txtSizeM.setColumns(10);

		txtRs = new JTextField();
		txtRs.setBounds(10, 257, 70, 32);
		panel_2.add(txtRs);
		txtRs.setText("Rs 750");
		txtRs.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs.setForeground(new Color(0, 0, 0));
		txtRs.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs.setColumns(10);
		txtRs.setBackground(new Color(255, 218, 185));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,1);
					st.setInt(2,750);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1_1,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1.setBounds(381, 39, 290, 308);
		panel_1.add(panel_2_1);
		JLabel lblNewLabel_1_2 = new JLabel("\r\n");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Dell\\Desktop\\Java Images\\2.jpg"));
		lblNewLabel_1_2.setBounds(43, 22, 214, 194);
		panel_2_1.add(lblNewLabel_1_2);

		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1.setBounds(151, 260, 129, 32);
		panel_2_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,2);
					st.setInt(2,850);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});

		txtSpidermanStationarySet = new JTextField();
		txtSpidermanStationarySet.setText("Spiderman Stationary Set");
		txtSpidermanStationarySet.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpidermanStationarySet.setForeground(Color.WHITE);
		txtSpidermanStationarySet.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSpidermanStationarySet.setColumns(10);
		txtSpidermanStationarySet.setBackground(new Color(128, 0, 128));
		txtSpidermanStationarySet.setBounds(20, 218, 260, 32);
		panel_2_1.add(txtSpidermanStationarySet);

		txtRs_1 = new JTextField();
		txtRs_1.setBounds(20, 258, 70, 32);
		panel_2_1.add(txtRs_1);
		txtRs_1.setText("Rs 850");
		txtRs_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_1.setForeground(new Color(0, 0, 0));
		txtRs_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_1.setColumns(10);
		txtRs_1.setBackground(new Color(255, 218, 185));

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1_1.setBounds(735, 39, 290, 308);
		panel_1.add(panel_2_1_1);

		txtHamleysAlienFriend = new JTextField();
		txtHamleysAlienFriend.setText("Mario");
		txtHamleysAlienFriend.setHorizontalAlignment(SwingConstants.CENTER);
		txtHamleysAlienFriend.setForeground(Color.WHITE);
		txtHamleysAlienFriend.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtHamleysAlienFriend.setColumns(10);
		txtHamleysAlienFriend.setBackground(new Color(128, 0, 128));
		txtHamleysAlienFriend.setBounds(20, 219, 260, 32);
		panel_2_1_1.add(txtHamleysAlienFriend);

		JButton btnNewButton_2 = new JButton("ADD TO CART");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBackground(new Color(255, 218, 185));
		btnNewButton_2.setBounds(162, 261, 118, 32);
		panel_2_1_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,3);
					st.setInt(2,500);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_2,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Desktop\\Java Images\\3.jpg"));
		lblNewLabel_1_1.setBounds(52, 4, 228, 252);
		panel_2_1_1.add(lblNewLabel_1_1);

		txtRs_2 = new JTextField();
		txtRs_2.setBounds(20, 259, 70, 32);
		panel_2_1_1.add(txtRs_2);
		txtRs_2.setText("Rs 500");
		txtRs_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_2.setForeground(new Color(0, 0, 0));
		txtRs_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_2.setColumns(10);
		txtRs_2.setBackground(new Color(255, 218, 185));

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2.setBounds(25, 382, 290, 308);
		panel_1.add(panel_2_2);

		txtJingleKnock = new JTextField();
		txtJingleKnock.setText("Green Mario");
		txtJingleKnock.setHorizontalAlignment(SwingConstants.CENTER);
		txtJingleKnock.setForeground(Color.WHITE);
		txtJingleKnock.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtJingleKnock.setColumns(10);
		txtJingleKnock.setBackground(new Color(128, 0, 128));
		txtJingleKnock.setBounds(7, 226, 273, 32);
		panel_2_2.add(txtJingleKnock);

		JButton btnNewButton_3 = new JButton("ADD TO CART");
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBackground(new Color(255, 218, 185));
		btnNewButton_3.setBounds(157, 266, 123, 32);
		panel_2_2.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,5);
					st.setInt(2,950);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_3,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_3 = new JLabel("\r\n");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\4.jpg"));
		lblNewLabel_1_3.setBounds(10, 12, 270, 246);
		panel_2_2.add(lblNewLabel_1_3);

		txtRs_3 = new JTextField();
		txtRs_3.setBounds(10, 264, 70, 32);
		panel_2_2.add(txtRs_3);
		txtRs_3.setText("Rs 950");
		txtRs_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_3.setForeground(new Color(0, 0, 0));
		txtRs_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_3.setColumns(10);
		txtRs_3.setBackground(new Color(255, 218, 185));

		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2_1.setBounds(381, 382, 290, 308);
		panel_1.add(panel_2_2_1);

		txtHoodedBear = new JTextField();
		txtHoodedBear.setText("Pickachu");
		txtHoodedBear.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoodedBear.setForeground(Color.WHITE);
		txtHoodedBear.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtHoodedBear.setColumns(10);
		txtHoodedBear.setBackground(new Color(128, 0, 128));
		txtHoodedBear.setBounds(7, 224, 273, 32);
		panel_2_2_1.add(txtHoodedBear);

		JButton btnNewButton_4 = new JButton("ADD TO CART");
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.setBackground(new Color(255, 218, 185));
		btnNewButton_4.setBounds(158, 266, 122, 32);
		panel_2_2_1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,6);
					st.setInt(2,500);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_4,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_4 = new JLabel("\r\n");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\5.jpg"));
		lblNewLabel_1_4.setBounds(7, 10, 270, 246);
		panel_2_2_1.add(lblNewLabel_1_4);

		txtRs_4 = new JTextField();
		txtRs_4.setBounds(10, 264, 70, 32);
		panel_2_2_1.add(txtRs_4);
		txtRs_4.setText("Rs 500");
		txtRs_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_4.setForeground(new Color(0, 0, 0));
		txtRs_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_4.setColumns(10);
		txtRs_4.setBackground(new Color(255, 218, 185));

		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setLayout(null);
		panel_2_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2_2.setBounds(735, 382, 290, 308);
		panel_1.add(panel_2_2_2);

		JButton btnNewButton_5 = new JButton("ADD TO CART");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,7);
					st.setInt(2,790);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_5,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});

		txtColorBook = new JTextField();
		txtColorBook.setText("Ambulance");
		txtColorBook.setHorizontalAlignment(SwingConstants.CENTER);
		txtColorBook.setForeground(Color.WHITE);
		txtColorBook.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtColorBook.setColumns(10);
		txtColorBook.setBackground(new Color(128, 0, 128));
		txtColorBook.setBounds(10, 221, 273, 32);
		panel_2_2_2.add(txtColorBook);

		JLabel lblNewLabel_1_5 = new JLabel("\r\n");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\6.jpg"));
		lblNewLabel_1_5.setBounds(28, -26, 236, 265);
		panel_2_2_2.add(lblNewLabel_1_5);
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(255, 218, 185));
		btnNewButton_5.setBounds(167, 266, 116, 32);
		panel_2_2_2.add(btnNewButton_5);

		txtRs_5 = new JTextField();
		txtRs_5.setBounds(10, 264, 70, 32);
		panel_2_2_2.add(txtRs_5);
		txtRs_5.setText("Rs 790");
		txtRs_5.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_5.setForeground(new Color(0, 0, 0));
		txtRs_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_5.setColumns(10);
		txtRs_5.setBackground(new Color(255, 218, 185));

		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1_1_1.setBounds(1137, 39, 290, 308);
		panel_1.add(panel_2_1_1_1);

		txtDollyDolphin = new JTextField();
		txtDollyDolphin.setText("Dino");
		txtDollyDolphin.setHorizontalAlignment(SwingConstants.CENTER);
		txtDollyDolphin.setForeground(Color.WHITE);
		txtDollyDolphin.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtDollyDolphin.setColumns(10);
		txtDollyDolphin.setBackground(new Color(128, 0, 128));
		txtDollyDolphin.setBounds(20, 224, 260, 32);
		panel_2_1_1_1.add(txtDollyDolphin);

		JButton btnNewButton_2_1 = new JButton("ADD TO CART");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_1.setBackground(new Color(255, 218, 185));
		btnNewButton_2_1.setBounds(162, 261, 118, 32);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,4);
					st.setInt(2,800);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1_1,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		panel_2_1_1_1.add(btnNewButton_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\7.jpg"));
		lblNewLabel_1_1_1.setBounds(20, 4, 260, 252);
		panel_2_1_1_1.add(lblNewLabel_1_1_1);

		txtRs_6 = new JTextField();
		txtRs_6.setText("Rs 800");
		txtRs_6.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_6.setForeground(Color.BLACK);
		txtRs_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_6.setColumns(10);
		txtRs_6.setBackground(new Color(255, 218, 185));
		txtRs_6.setBounds(20, 259, 70, 32);
		panel_2_1_1_1.add(txtRs_6);

		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1_1_2.setBounds(1137, 382, 290, 308);
		panel_1.add(panel_2_1_1_2);

		txtStinkyPeppaPig = new JTextField();
		txtStinkyPeppaPig.setText("Builders");
		txtStinkyPeppaPig.setHorizontalAlignment(SwingConstants.CENTER);
		txtStinkyPeppaPig.setForeground(Color.WHITE);
		txtStinkyPeppaPig.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtStinkyPeppaPig.setColumns(10);
		txtStinkyPeppaPig.setBackground(new Color(128, 0, 128));
		txtStinkyPeppaPig.setBounds(20, 225, 260, 32);
		panel_2_1_1_2.add(txtStinkyPeppaPig);

		JButton btnNewButton_2_2 = new JButton("ADD TO CART");
		btnNewButton_2_2.setForeground(Color.BLACK);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_2.setBackground(new Color(255, 218, 185));
		btnNewButton_2_2.setBounds(162, 261, 118, 32);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "aniket");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,8);
					st.setInt(2,500);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1_1,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		panel_2_1_1_2.add(btnNewButton_2_2);

		JLabel lblNewLabel_1_1_2 = new JLabel("\r\n");
		lblNewLabel_1_1_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\8.jpg"));
		lblNewLabel_1_1_2.setBounds(52, 4, 228, 252);
		panel_2_1_1_2.add(lblNewLabel_1_1_2);

		textField_3 = new JTextField();
		textField_3.setText("Rs 500");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 218, 185));
		textField_3.setBounds(20, 266, 70, 32);
		panel_2_1_1_2.add(textField_3);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1647, 956);
		panel_3.setBackground(new Color(64, 128, 128));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		JButton viewcart=new JButton("View Cart");
		viewcart.setBounds(1356, 65, 128, 30);
		panel_3.add(viewcart);
		viewcart.setIcon(null);
		viewcart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				cartpanel1 cart=new cartpanel1();
				cart.setVisible(true);
			}
		});
		viewcart.setForeground(new Color(139, 69, 19));
		viewcart.setFont(new Font("Tahoma", Font.BOLD, 12));
		viewcart.setBackground(new Color(255, 255, 255));

		JLabel lblNewLabel = new JLabel("Khilauna ");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setBounds(666, 10, 247, 54);
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(0, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("Laugh & Learn – With Toys that teach");
		lblNewLabel_2.setForeground(new Color(255, 218, 185));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setBounds(562, 56, 462, 42);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\Java Images\\shopping-cart-removebg-preview__1___1_-removebg-preview (2).png"));
		lblNewLabel_3.setBounds(1392, 10, 71, 54);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\toyyy-removebg-preview.png"));
		lblNewLabel_4.setBounds(52, 10, 102, 94);
		panel_3.add(lblNewLabel_4);

	}
}
