package javaProject1;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTable;

public class AboutUs extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setTitle("AboutUs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1356, 823);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Restaurant rest = new Restaurant();
				rest.setVisible(true);
			}
		});
		 btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
	        btnNewButton.setBounds(266, 10, 146, 32);
	        contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("About Us");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
        btnNewButton_1.setBounds(422, 10, 146, 32);
        contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu menu = new Menu();
				menu.setVisible(true);
			}
		});
		 btnNewButton_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
	        btnNewButton_2.setBounds(578, 10, 132, 32);
	        contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reviews");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Reviews rev = new Reviews();
				rev.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
        btnNewButton_3.setBounds(720, 10, 132, 32);
        contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Contact us");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ContactUs conu = new ContactUs();
				conu.setVisible(true);
			}
		});
		 btnNewButton_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
	        btnNewButton_4.setBounds(862, 10, 146, 32);
	        contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Welcome to Epicurean Haven, a culinary sanctuary where passion meets palate.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(24, 83, 895, 81);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("At Epicurean Haven, we believe that dining is not just a necessity; it's an experience to be savored,");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(24, 140, 752, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A journey of flavors that tantalize the senses. Our story is one of relentless dedication to the art");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(24, 188, 752, 68);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("of gastronomy, where each dish is meticulously crafted to elevate the ordinary to the extraordinary.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(24, 246, 752, 51);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Inspired by the ancient philosophy of Epicurus, we embrace the notion that good food is not just a pleasure;");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(24, 288, 836, 51);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("it's a fundamental source of joy. Our haven is a place where discerning diners can escape the ordinary,");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_5.setBounds(24, 337, 802, 44);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("immerse themselves in a world of culinary excellence, and embark on a gastronomic adventure.");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setBounds(23, 373, 785, 51);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Join us on this journey as we redefine the boundaries of taste, one exceptional dish at a time.");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_7.setBounds(24, 423, 742, 48);
		contentPane.add(lblNewLabel_7);
		
		 JButton btnNewButton_5 = new JButton("");
	        btnNewButton_5.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION);
	        		if(option == JOptionPane.YES_OPTION) {
	        		dispose();
	        		CustomerLogin cu = new CustomerLogin();
	        		}
	        		else {
	        			
	        		}
	        	}
	        });
	        btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\icons8-logout-50.png"));
	        btnNewButton_5.setBounds(1272, 10, 62, 59);
	        contentPane.add(btnNewButton_5);
		
		 
	}
}
