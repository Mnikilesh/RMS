package javaProject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class loginpage {

	private JFrame frmEpicureanhavencom;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.frmEpicureanhavencom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage() {
		initialize();
		frmEpicureanhavencom.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEpicureanhavencom = new JFrame();
		frmEpicureanhavencom.setBounds(100, 100, 1348, 826);
		frmEpicureanhavencom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEpicureanhavencom.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Restaurant login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEpicureanhavencom.dispose();
				RestaurantLogin res = new RestaurantLogin();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(345, 225, 298, 43);
		frmEpicureanhavencom.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEpicureanhavencom.dispose();
				CustomerLogin cuslog = new CustomerLogin();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton_1.setBounds(691, 225, 339, 43);
		frmEpicureanhavencom.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Epicurean Haven");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 43));
		lblNewLabel.setBounds(267, 34, 759, 86);
		frmEpicureanhavencom.getContentPane().add(lblNewLabel);
	}
}
