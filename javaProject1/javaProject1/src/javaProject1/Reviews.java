package javaProject1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;

public class Reviews extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reviews frame = new Reviews();
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
	public Reviews() {
		setTitle("Reviews");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1357, 820);
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
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AboutUs AU = new AboutUs();
                AU.setVisible(true);
            }
        });
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
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\user (1).png"));
	        lblNewLabel.setBounds(36, 89, 47, 115);
	        contentPane.add(lblNewLabel);
	        
	        JLabel lblNewLabel_1 = new JLabel("User_123");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_1.setBounds(93, 136, 177, 25);
	        contentPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_2 = new JLabel("");
	        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\rating.png"));
	        lblNewLabel_2.setBounds(36, 156, 146, 59);
	        contentPane.add(lblNewLabel_2);
	        
	        JLabel lblNewLabel_3 = new JLabel("To keep it simple the food was delicious and the ambiance is great, and im definitly gonna revisit the restaurant");
	        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_3.setBounds(93, 156, 726, 109);
	        contentPane.add(lblNewLabel_3);
	        
	        JLabel lblNewLabel_4 = new JLabel("");
	        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\user (1).png"));
	        lblNewLabel_4.setBounds(36, 299, 47, 115);
	        contentPane.add(lblNewLabel_4);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("User_124");
	        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_1_1.setBounds(93, 346, 177, 25);
	        contentPane.add(lblNewLabel_1_1);
	        
	        JLabel lblNewLabel_2_1 = new JLabel("");
	        lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\rating.png"));
	        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_2_1.setBounds(36, 366, 146, 59);
	        contentPane.add(lblNewLabel_2_1);
	        
	        JLabel lblNewLabel_3_1 = new JLabel("Exceptional dining experience at EQ Haven – 5 stars for impeccable service and delicious cuisine!");
	        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_3_1.setBounds(93, 366, 726, 109);
	        contentPane.add(lblNewLabel_3_1);
	        
	        JLabel lblNewLabel_4_1 = new JLabel("");
	        lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\user (1).png"));
	        lblNewLabel_4_1.setBounds(36, 485, 47, 115);
	        contentPane.add(lblNewLabel_4_1);
	        
	        JLabel lblNewLabel_1_1_1 = new JLabel("User_125");
	        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_1_1_1.setBounds(93, 532, 177, 25);
	        contentPane.add(lblNewLabel_1_1_1);
	        
	        JLabel lblNewLabel_2_1_1 = new JLabel("");
	        lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\rating.png"));
	        lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_2_1_1.setBounds(36, 552, 146, 59);
	        contentPane.add(lblNewLabel_2_1_1);
	        
	        JLabel lblNewLabel_3_1_1 = new JLabel("Absolutely fantastic! EQ Haven deserves every star for its delectable dishes and warm hospitality");
	        lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblNewLabel_3_1_1.setBounds(93, 552, 726, 109);
	        contentPane.add(lblNewLabel_3_1_1);
    }
	}


