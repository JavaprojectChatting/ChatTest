import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class ChatTest {

	private JFrame frame;
	private JTextField loginIDTextfield;
	private JTextField loginPWTextfield;
	private CardLayout card;
	private JTextField signIDTextfield;
	private JTextField signPWTextfield;
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
		frame.setLayout(new BorderLayout());  //
		
		JPanel testJPanel = new JPanel();  //
		
		// cardlayout
		card = new CardLayout();
		testJPanel.setLayout(card);  //
		//frame.getContentPane().setLayout(card);
		
		//로그인창
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 250, 240));
		loginPanel.setBounds(0, 0, 800, 600);
		//frame.getContentPane().add(loginPanel);
		testJPanel.add("loginPanel",loginPanel);  //
		frame.getContentPane().add(testJPanel); //
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
		
		JTextPane loginIDText = new JTextPane();
		loginIDText.setBackground(new Color(255, 250, 240));
		loginIDText.setForeground(new Color(211, 211, 211));
		loginIDText.setFont(new Font("Arial Black", Font.PLAIN, 26));
		loginIDText.setText("ID");
		loginIDText.setBounds(36, 149, 47, 36);
		inloginPanel.add(loginIDText);
		
		JTextPane loginPWText = new JTextPane();
		loginPWText.setText("PW");
		loginPWText.setForeground(new Color(211, 211, 211));
		loginPWText.setFont(new Font("Arial Black", Font.PLAIN, 26));
		loginPWText.setBackground(new Color(255, 250, 240));
		loginPWText.setBounds(36, 228, 47, 36);
		inloginPanel.add(loginPWText);
		
		loginIDTextfield = new JTextField();
		loginIDTextfield.setBounds(95, 148, 222, 37);
		inloginPanel.add(loginIDTextfield);
		loginIDTextfield.setColumns(10);
		
		loginPWTextfield = new JTextField();
		loginPWTextfield.setColumns(10);
		loginPWTextfield.setBounds(95, 228, 222, 37);
		inloginPanel.add(loginPWTextfield);
		
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
		
		JButton loginSignupButton = new JButton("SIGN UP");
		loginSignupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(testJPanel,"signupPanel");
			}
		});
		loginSignupButton.setFont(new Font("Arial", Font.PLAIN, 12));
		loginSignupButton.setBackground(new Color(175, 238, 238));
		loginSignupButton.setBounds(96, 322, 86, 36);
		inloginPanel.add(loginSignupButton);
		
		JButton loginSigninButton = new JButton("SIGN IN");
		loginSigninButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(testJPanel,"chattingPanel");
			}
		});
		loginSigninButton.setFont(new Font("Arial", Font.PLAIN, 12));
		loginSigninButton.setBackground(new Color(175, 238, 238));
		loginSigninButton.setBounds(232, 322, 86, 36);
		inloginPanel.add(loginSigninButton);
		
		//회원가입창
		JPanel signupPanel = new JPanel();
		signupPanel.setLayout(null);
		signupPanel.setBackground(new Color(255, 250, 240));
		// frame.getContentPane().add(signupPanel, "name_3243073249200");
		testJPanel.add("signupPanel", signupPanel);  //
		frame.getContentPane().add(testJPanel); //
		
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
		
		JTextPane signIDText = new JTextPane();
		signIDText.setText("ID");
		signIDText.setForeground(new Color(211, 211, 211));
		signIDText.setFont(new Font("Arial Black", Font.PLAIN, 18));
		signIDText.setBackground(new Color(255, 250, 240));
		signIDText.setBounds(51, 66, 47, 28);
		singinupinPanel.add(signIDText);
		
		signIDTextfield = new JTextField();
		signIDTextfield.setColumns(10);
		signIDTextfield.setBounds(51, 94, 299, 37);
		singinupinPanel.add(signIDTextfield);
		
		JButton idCheckButton = new JButton("check");
		idCheckButton.setFont(new Font("Arial", Font.PLAIN, 12));
		idCheckButton.setBackground(new Color(175, 238, 238));
		idCheckButton.setBounds(362, 94, 65, 36);
		singinupinPanel.add(idCheckButton);
		
		JTextPane statusLabel_1 = new JTextPane();
		statusLabel_1.setText("\uC77C\uB2E8 \uBB50\uB77C\uB3C4 \uC368\uB193\uC790");
		statusLabel_1.setForeground(new Color(240, 128, 128));
		statusLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		statusLabel_1.setBackground(new Color(255, 250, 240));
		statusLabel_1.setBounds(234, 128, 117, 24);
		singinupinPanel.add(statusLabel_1);
		
		JButton signinButton = new JButton("SIGN IN");
		signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(testJPanel,"loginPanel");
			}
		});
		signinButton.setFont(new Font("Arial", Font.PLAIN, 12));
		signinButton.setBackground(new Color(175, 238, 238));
		signinButton.setBounds(102, 425, 86, 36);
		singinupinPanel.add(signinButton);
		
		JButton signupButton = new JButton("SIGN UP");
		signupButton.setFont(new Font("Arial", Font.PLAIN, 12));
		signupButton.setBackground(new Color(175, 238, 238));
		signupButton.setBounds(238, 425, 86, 36);
		singinupinPanel.add(signupButton);
		
		JTextPane signPWText = new JTextPane();
		signPWText.setText("PW");
		signPWText.setForeground(new Color(211, 211, 211));
		signPWText.setFont(new Font("Arial Black", Font.PLAIN, 18));
		signPWText.setBackground(new Color(255, 250, 240));
		signPWText.setBounds(51, 134, 47, 28);
		singinupinPanel.add(signPWText);
		
		signPWTextfield = new JTextField();
		signPWTextfield.setColumns(10);
		signPWTextfield.setBounds(51, 162, 299, 37);
		singinupinPanel.add(signPWTextfield);
		
		JTextPane emailText = new JTextPane();
		emailText.setText("Email address");
		emailText.setForeground(new Color(211, 211, 211));
		emailText.setFont(new Font("Arial Black", Font.PLAIN, 18));
		emailText.setBackground(new Color(255, 250, 240));
		emailText.setBounds(52, 272, 148, 28);
		singinupinPanel.add(emailText);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(52, 301, 299, 37);
		singinupinPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(53, 232, 299, 37);
		singinupinPanel.add(textField_3);
		
		JTextPane confirmPWText = new JTextPane();
		confirmPWText.setText("Confirm PW");
		confirmPWText.setForeground(new Color(211, 211, 211));
		confirmPWText.setFont(new Font("Arial Black", Font.PLAIN, 18));
		confirmPWText.setBackground(new Color(255, 250, 240));
		confirmPWText.setBounds(53, 203, 222, 28);
		singinupinPanel.add(confirmPWText);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(53, 369, 299, 37);
		singinupinPanel.add(textField_4);
		
		JTextPane nicknameText = new JTextPane();
		nicknameText.setText("Nickname");
		nicknameText.setForeground(new Color(211, 211, 211));
		nicknameText.setFont(new Font("Arial Black", Font.PLAIN, 18));
		nicknameText.setBackground(new Color(255, 250, 240));
		nicknameText.setBounds(53, 340, 117, 28);
		singinupinPanel.add(nicknameText);
		
		JTextPane statusLabel_1_1 = new JTextPane();
		statusLabel_1_1.setText("\uC77C\uB2E8 \uBB50\uB77C\uB3C4 \uC368\uB193\uC790");
		statusLabel_1_1.setForeground(new Color(240, 128, 128));
		statusLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		statusLabel_1_1.setBackground(new Color(255, 250, 240));
		statusLabel_1_1.setBounds(234, 267, 117, 24);
		singinupinPanel.add(statusLabel_1_1);
		
		//채팅창
		JPanel chattingPanel = new JPanel();
		chattingPanel.setLocation(-9, -41);
		chattingPanel.setLayout(null);
		chattingPanel.setBackground(new Color(255, 250, 240));
		//frame.getContentPane().add(chattingPanel, "name_4419250378900");
		testJPanel.add("chattingPanel",chattingPanel);  //
		frame.getContentPane().add(testJPanel); //
		
		JPanel adressPanel = new JPanel();
		adressPanel.setBorder(new LineBorder(new Color(175, 238, 238), 4));
		adressPanel.setBackground(new Color(255, 250, 240));
		adressPanel.setBounds(7, 41, 373, 478);
		chattingPanel.add(adressPanel);
		adressPanel.setLayout(null);
		
		JTextPane userIDText = new JTextPane();
		userIDText.setText("\uBBFC\uCD08\uC655");
		userIDText.setBounds(63, 12, 80, 36);
		userIDText.setForeground(new Color(105, 105, 105));
		userIDText.setFont(new Font("Arial Black", Font.BOLD, 20));
		userIDText.setBackground(new Color(255, 250, 240));
		adressPanel.add(userIDText);
		
		table = new JTable();
		table.setBounds(12, 51, 349, 417);
		adressPanel.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(344, 51, 17, 417);
		adressPanel.add(scrollBar);
		
		JLabel userImageLabel = new JLabel("Image");
		userImageLabel.setBounds(12, 10, 47, 44);
		adressPanel.add(userImageLabel);
		
		JTextPane addressText = new JTextPane();
		addressText.setBounds(4, 2, 210, 56);
		chattingPanel.add(addressText);
		addressText.setText("ADDRESS");
		addressText.setForeground(new Color(175, 238, 238));
		addressText.setFont(new Font("Arial Black", Font.BOLD, 32));
		addressText.setBackground(new Color(255, 250, 240));
		
		JPanel chattinginPanel = new JPanel();
		chattinginPanel.setLayout(null);
		chattinginPanel.setBorder(new LineBorder(new Color(175, 238, 238), 4));
		chattinginPanel.setBackground(new Color(255, 250, 240));
		chattinginPanel.setBounds(386, 41, 373, 478);
		chattingPanel.add(chattinginPanel);
		
		JTextArea dialogTextarea = new JTextArea();
		dialogTextarea.setBounds(12, 413, 297, 55);
		chattinginPanel.add(dialogTextarea);
		
		JTextArea sendTextarea = new JTextArea();
		sendTextarea.setBounds(12, 10, 349, 393);
		chattinginPanel.add(sendTextarea);
		
		JButton sendButton = new JButton("\uC804");
		sendButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		sendButton.setBackground(new Color(175, 238, 238));
		sendButton.setBounds(321, 414, 40, 54);
		chattinginPanel.add(sendButton);
		
		card.show(testJPanel,"loginPanel");
	}
}
