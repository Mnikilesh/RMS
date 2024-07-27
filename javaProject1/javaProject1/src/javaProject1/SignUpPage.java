package javaProject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SignUpPage {

	private JFrame frame;
	private JTextField txtFN;
	private JTextField txtUN;
	private JPasswordField txtPW;
	private JTextField txtPN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage window = new SignUpPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUpPage() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1348, 819);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(442, 77, 346, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(442, 188, 178, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtFN = new JTextField();
		txtFN.setBounds(630, 191, 223, 32);
		frame.getContentPane().add(txtFN);
		txtFN.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("UserName:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(442, 250, 178, 32);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone Number:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(462, 311, 178, 32);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(442, 361, 178, 32);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		txtUN = new JTextField();
		txtUN.setBounds(630, 253, 223, 32);
		frame.getContentPane().add(txtUN);
		txtUN.setColumns(10);
		
		txtPW = new JPasswordField();
		txtPW.setBounds(630, 364, 223, 32);
		frame.getContentPane().add(txtPW);
		
		txtPN = new JTextField();
		txtPN.setBounds(633, 314, 220, 32);
		frame.getContentPane().add(txtPN);
		txtPN.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFN.setText(null);
				txtUN.setText(null);
				txtPN.setText(null);
				txtPW.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(667, 464, 118, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_register", "root", "");
					Statement stmt = con.createStatement();
					String FullName = txtFN.getText();
					String UserName = txtUN.getText();
					String PhoneNumber = txtPN.getText();
					String password = txtPW.getText();
					String sql = "insert into userregister values('"+FullName+"', '"+UserName+"', '"+PhoneNumber+"', '"+password+"')";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(frame, "Registration Completed Successfully");
					CustomerLogin lp = new CustomerLogin();
					frame.dispose();
				}
				catch(Exception exc) {exc.printStackTrace();}
			}
			});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(517, 463, 118, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("←");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CustomerLogin cs = new CustomerLogin();
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(10, 10, 92, 28);
		frame.getContentPane().add(btnNewButton_2);
	}
}
