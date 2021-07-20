import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class ChatTest {

	private JFrame frame;
	private JTextField idTextField;
	private JTextField pwTextField;
	private CardLayout card;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatTest window = new ChatTest();
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
	public ChatTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// cardlayout
		card = new CardLayout();
		frame.getContentPane().setLayout(card);
		//frame.getContentPane().setLayout(card);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 250, 240));
		loginPanel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JPanel inloginPanel = new JPanel();
		inloginPanel.setBorder(new LineBorder(new Color(175, 238, 238), 4));
		inloginPanel.setBackground(new Color(255, 250, 240));
		inloginPanel.setBounds(172, 80, 424, 403);
		loginPanel.add(inloginPanel);
		inloginPanel.setLayout(null);
		
		JTextPane loginText = new JTextPane();
		loginText.setForeground(new Color(175, 238, 238));
		loginText.setBackground(new Color(255, 250, 240));
		loginText.setFont(new Font("Arial Black", Font.BOLD, 39));
		loginText.setText("LOGIN");
		loginText.setBounds(138, 46, 146, 56);
		inloginPanel.add(loginText);
		
		JTextPane idText = new JTextPane();
		idText.setBackground(new Color(255, 250, 240));
		idText.setForeground(new Color(211, 211, 211));
		idText.setFont(new Font("Arial Black", Font.PLAIN, 26));
		idText.setText("ID");
		idText.setBounds(36, 149, 47, 36);
		inloginPanel.add(idText);
		
		JTextPane pwText = new JTextPane();
		pwText.setText("PW");
		pwText.setForeground(new Color(211, 211, 211));
		pwText.setFont(new Font("Arial Black", Font.PLAIN, 26));
		pwText.setBackground(new Color(255, 250, 240));
		pwText.setBounds(36, 228, 47, 36);
		inloginPanel.add(pwText);
		
		idTextField = new JTextField();
		idTextField.setBounds(95, 148, 222, 37);
		inloginPanel.add(idTextField);
		idTextField.setColumns(10);
		
		pwTextField = new JTextField();
		pwTextField.setColumns(10);
		pwTextField.setBounds(95, 228, 222, 37);
		inloginPanel.add(pwTextField);
		
		JButton checkButton = new JButton("check");
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		checkButton.setBackground(new Color(175, 238, 238));
		checkButton.setFont(new Font("Arial", Font.PLAIN, 12));
		checkButton.setBounds(329, 149, 65, 36);
		inloginPanel.add(checkButton);
		
		JTextPane statusLabel = new JTextPane();
		statusLabel.setText("\uC77C\uB2E8 \uBB50\uB77C\uB3C4 \uC368\uB193\uC790");
		statusLabel.setForeground(new Color(240, 128, 128));
		statusLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		statusLabel.setBackground(new Color(255, 250, 240));
		statusLabel.setBounds(95, 182, 222, 28);
		inloginPanel.add(statusLabel);
		
		JButton signupButton = new JButton("SIGN UP");
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(frame,"2");
			}
		});
		signupButton.setFont(new Font("Arial", Font.PLAIN, 12));
		signupButton.setBackground(new Color(175, 238, 238));
		signupButton.setBounds(96, 322, 86, 36);
		inloginPanel.add(signupButton);
		
		JButton signinButton = new JButton("SIGN IN");
		signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(frame,"3");
			}
		});
		signinButton.setFont(new Font("Arial", Font.PLAIN, 12));
		signinButton.setBackground(new Color(175, 238, 238));
		signinButton.setBounds(232, 322, 86, 36);
		inloginPanel.add(signinButton);
		
		JPanel signupPanel = new JPanel();
		signupPanel.setLayout(null);
		signupPanel.setBackground(new Color(255, 250, 240));
		frame.getContentPane().add(signupPanel, "name_3243073249200");
		
		JPanel singinupinPanel = new JPanel();
		singinupinPanel.setLayout(null);
		singinupinPanel.setBorder(new LineBorder(new Color(175, 238, 238), 4));
		singinupinPanel.setBackground(new Color(255, 250, 240));
		singinupinPanel.setBounds(158, 27, 466, 486);
		signupPanel.add(singinupinPanel);
		
		JTextPane signupText = new JTextPane();
		signupText.setText("SIGN UP");
		signupText.setForeground(new Color(175, 238, 238));
		signupText.setFont(new Font("Arial Black", Font.BOLD, 39));
		signupText.setBackground(new Color(255, 250, 240));
		signupText.setBounds(117, 10, 207, 56);
		singinupinPanel.add(signupText);
		
		JTextPane idText_1 = new JTextPane();
		idText_1.setText("ID");
		idText_1.setForeground(new Color(211, 211, 211));
		idText_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		idText_1.setBackground(new Color(255, 250, 240));
		idText_1.setBounds(51, 66, 47, 28);
		singinupinPanel.add(idText_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(51, 94, 299, 37);
		singinupinPanel.add(textField);
		
		JButton checkButton_1 = new JButton("check");
		checkButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		checkButton_1.setBackground(new Color(175, 238, 238));
		checkButton_1.setBounds(362, 94, 65, 36);
		singinupinPanel.add(checkButton_1);
		
		JTextPane statusLabel_1 = new JTextPane();
		statusLabel_1.setText("\uC77C\uB2E8 \uBB50\uB77C\uB3C4 \uC368\uB193\uC790");
		statusLabel_1.setForeground(new Color(240, 128, 128));
		statusLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		statusLabel_1.setBackground(new Color(255, 250, 240));
		statusLabel_1.setBounds(234, 128, 117, 24);
		singinupinPanel.add(statusLabel_1);
		
		JButton signupButton_1 = new JButton("SIGN IN");
		signupButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(frame,"1");
			}
		});
		signupButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		signupButton_1.setBackground(new Color(175, 238, 238));
		signupButton_1.setBounds(102, 425, 86, 36);
		singinupinPanel.add(signupButton_1);
		
		JButton signinButton_1 = new JButton("SIGN UP");
		signinButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		signinButton_1.setBackground(new Color(175, 238, 238));
		signinButton_1.setBounds(238, 425, 86, 36);
		singinupinPanel.add(signinButton_1);
		
		JTextPane idText_1_1 = new JTextPane();
		idText_1_1.setText("PW");
		idText_1_1.setForeground(new Color(211, 211, 211));
		idText_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		idText_1_1.setBackground(new Color(255, 250, 240));
		idText_1_1.setBounds(51, 134, 47, 28);
		singinupinPanel.add(idText_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(51, 162, 299, 37);
		singinupinPanel.add(textField_1);
		
		JTextPane idText_1_1_1 = new JTextPane();
		idText_1_1_1.setText("Email address");
		idText_1_1_1.setForeground(new Color(211, 211, 211));
		idText_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		idText_1_1_1.setBackground(new Color(255, 250, 240));
		idText_1_1_1.setBounds(52, 272, 148, 28);
		singinupinPanel.add(idText_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(52, 301, 299, 37);
		singinupinPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(53, 232, 299, 37);
		singinupinPanel.add(textField_3);
		
		JTextPane idText_1_2 = new JTextPane();
		idText_1_2.setText("Confirm PW");
		idText_1_2.setForeground(new Color(211, 211, 211));
		idText_1_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		idText_1_2.setBackground(new Color(255, 250, 240));
		idText_1_2.setBounds(53, 203, 222, 28);
		singinupinPanel.add(idText_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(53, 369, 299, 37);
		singinupinPanel.add(textField_4);
		
		JTextPane idText_1_1_1_1 = new JTextPane();
		idText_1_1_1_1.setText("Nickname");
		idText_1_1_1_1.setForeground(new Color(211, 211, 211));
		idText_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		idText_1_1_1_1.setBackground(new Color(255, 250, 240));
		idText_1_1_1_1.setBounds(53, 340, 117, 28);
		singinupinPanel.add(idText_1_1_1_1);
		
		JTextPane statusLabel_1_1 = new JTextPane();
		statusLabel_1_1.setText("\uC77C\uB2E8 \uBB50\uB77C\uB3C4 \uC368\uB193\uC790");
		statusLabel_1_1.setForeground(new Color(240, 128, 128));
		statusLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		statusLabel_1_1.setBackground(new Color(255, 250, 240));
		statusLabel_1_1.setBounds(234, 267, 117, 24);
		singinupinPanel.add(statusLabel_1_1);
		
		JPanel chattingPanel = new JPanel();
		chattingPanel.setLocation(-9, -41);
		chattingPanel.setLayout(null);
		chattingPanel.setBackground(new Color(255, 250, 240));
		frame.getContentPane().add(chattingPanel, "name_4419250378900");
		
		JPanel adressPanel = new JPanel();
		adressPanel.setBorder(new LineBorder(new Color(175, 238, 238), 4));
		adressPanel.setBackground(new Color(255, 250, 240));
		adressPanel.setBounds(7, 41, 373, 478);
		chattingPanel.add(adressPanel);
		adressPanel.setLayout(null);
		
		JTextPane idText_2 = new JTextPane();
		idText_2.setText("\uBBFC\uCD08\uC655");
		idText_2.setBounds(63, 12, 80, 36);
		idText_2.setForeground(new Color(105, 105, 105));
		idText_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		idText_2.setBackground(new Color(255, 250, 240));
		adressPanel.add(idText_2);
		
		table = new JTable();
		table.setBounds(12, 51, 349, 417);
		adressPanel.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(344, 51, 17, 417);
		adressPanel.add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(12, 10, 47, 44);
		adressPanel.add(lblNewLabel);
		
		JTextPane addressText = new JTextPane();
		addressText.setBounds(4, 2, 210, 56);
		chattingPanel.add(addressText);
		addressText.setText("ADDRESS");
		addressText.setForeground(new Color(175, 238, 238));
		addressText.setFont(new Font("Arial Black", Font.BOLD, 32));
		addressText.setBackground(new Color(255, 250, 240));
		
		JPanel adressPanel_1 = new JPanel();
		adressPanel_1.setLayout(null);
		adressPanel_1.setBorder(new LineBorder(new Color(175, 238, 238), 4));
		adressPanel_1.setBackground(new Color(255, 250, 240));
		adressPanel_1.setBounds(386, 41, 373, 478);
		chattingPanel.add(adressPanel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 413, 297, 55);
		adressPanel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 10, 349, 393);
		adressPanel_1.add(textArea_1);
		
		JButton btnNewButton = new JButton("\uC804");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setBounds(321, 414, 40, 54);
		adressPanel_1.add(btnNewButton);
		
		card.show(frame,"1");
	}
}
