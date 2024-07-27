package javaProject1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Restaurant extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Restaurant frame = new Restaurant();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Restaurant() {
        setTitle("Epicurean Haven.com");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1358, 832);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Epicurean Haven");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        lblNewLabel.setBounds(372, 67, 502, 71);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Home");
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

        JLabel lblNewLabel_1 = new JLabel("Recommended");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1.setBounds(404, 132, 219, 39);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("1. Chicken Parmesan");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(400, 210, 188, 33);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("2. Grilled Salmon");
        lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(404, 239, 180, 32);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("3. Mutton Biryani");
        lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(404, 270, 157, 34);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("NON-VEG");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
        lblNewLabel_5.setBounds(388, 168, 163, 32);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("VEG");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
        lblNewLabel_6.setBounds(854, 148, 188, 38);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("1. Veg Biryani");
        lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(910, 211, 146, 43);
        contentPane.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("2. Eggplant Parmesan");
        lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_8.setBounds(910, 256, 219, 21);
        contentPane.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("3. Palak Paneer");
        lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_9.setBounds(910, 287, 163, 32);
        contentPane.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("CHEF'S SPECIAL");
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_10.setBounds(339, 374, 273, 43);
        contentPane.add(lblNewLabel_10);

        JLabel lblNewLabel_11 = new JLabel("1. Mushroom Risotto - (VEG)");
        lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_11.setBounds(372, 450, 273, 32);
        contentPane.add(lblNewLabel_11);

        JLabel lblNewLabel_12 = new JLabel("2. Lemon Herb Grilled Chicken-(NON_VEG)");
        lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_12.setBounds(372, 492, 335, 32);
        contentPane.add(lblNewLabel_12);
        
        JButton btnNewButton_5 = new JButton("");
        btnNewButton_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        		if(option == JOptionPane.YES_OPTION) {
        		dispose();
        		CustomerLogin cu = new CustomerLogin();
        		}
        		else {
        			//stays in the same page;
        		}
        	}
        });
        btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\nikil\\Downloads\\icons8-logout-50.png"));
        btnNewButton_5.setBounds(1272, 10, 62, 59);
        contentPane.add(btnNewButton_5);
    }
}
