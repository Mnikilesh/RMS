package javaProject1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactUs extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ContactUs frame = new ContactUs();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * 
     */
    public ContactUs() {
        setTitle("Contact Us");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1352, 829);
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
                dispose();
                Reviews rev = new Reviews();
                rev.setVisible(true);
            }
        });
        btnNewButton_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
        btnNewButton_3.setBounds(720, 10, 132, 32);
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Contact us");
        btnNewButton_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
        btnNewButton_4.setBounds(862, 10, 146, 32);
        contentPane.add(btnNewButton_4);

        // Contact details
        JLabel lblEmail = new JLabel("Email: EpicureanHaven@gmail.com");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblEmail.setBounds(463, 188, 364, 43);
        contentPane.add(lblEmail);

        JLabel lblInstagram = new JLabel("Instagram: @Epicurean Haven_insta");
        lblInstagram.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblInstagram.setBounds(463, 228, 364, 34);
        contentPane.add(lblInstagram);

        JLabel lblTwitter = new JLabel("Twitter: @Epicurean Haven_twitter");
        lblTwitter.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTwitter.setBounds(463, 262, 364, 43);
        contentPane.add(lblTwitter);

        JLabel lblPhoneNumber = new JLabel("Phone Number: +1234567890");
        lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPhoneNumber.setBounds(463, 292, 364, 48);
        contentPane.add(lblPhoneNumber);
        
        JLabel lblNewLabel = new JLabel("Contact us for table Reservations and other informantion");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel.setBounds(302, 89, 718, 56);
        contentPane.add(lblNewLabel);
        
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
