package ecommerce;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class cartpanel1 extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    int totalprice=0;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    cartpanel1 frame = new cartpanel1();
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
    public cartpanel1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 934, 652);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 218, 185));
        panel.setBounds(10, 10, 900, 595);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("View Cart");
        lblNewLabel.setBackground(new Color(222, 184, 135));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblNewLabel.setBounds(398, 10, 132, 45);
        panel.add(lblNewLabel);
        String[] columnnames={"ID","Price"};
        DefaultTableModel model = new DefaultTableModel(columnnames,0);
        JTable table=new JTable(model);
        try
        {
             Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo","root","aniket");
            PreparedStatement st=(PreparedStatement) conn.prepareStatement("Select * from cart1");
            ResultSet rs=st.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt("id");
              double price=rs.getDouble("price");
              totalprice+=price;
                Object[] row={id,price};
                model.addRow(row);
            }
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(157,80,569,287);
        panel.add(scrollPane);
        JLabel totalpricelabel=new JLabel("Total Price: "+totalprice);
        totalpricelabel.setForeground(Color.BLACK);
        totalpricelabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        totalpricelabel.setBounds(633,477,247,68);
        panel.add(totalpricelabel);
        JButton btnNewButton = new JButton("Checkout");
        btnNewButton.setBackground(new Color(255, 218, 185));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBounds(352, 526, 178, 45);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo","root","aniket");
                    PreparedStatement st1=(PreparedStatement) conn.prepareStatement("SET SQL_SAFE_UPDATES=0");
                    st1.executeUpdate();
                    PreparedStatement st2=(PreparedStatement) conn.prepareStatement("Delete from cart1");
                    st2.executeUpdate();
                    JOptionPane.showMessageDialog(btnNewButton,"Your Total Bill is "+totalprice);
                    
                    itemlist frame=new itemlist();
                    frame.setVisible(true);
                    setVisible(false);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        panel.add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\360_F_270580128_R9AzHD4z0oEhMGOptSdIwSz4xAJVeuAw-removebg-preview (1).png"));
        lblNewLabel_1.setBounds(20, 359, 367, 226);
        panel.add(lblNewLabel_1);



    }
}
