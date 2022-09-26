import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {

	private JButton OrderButton;
	private JButton BurgerButton;
	private JButton BeverageButton;
	private JButton ExtraButton;
	private JPanel contentPane;
	private JTextField InfoPanel;
	private JTextArea Menu;

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 420);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Menu = new JTextArea();
		Menu.setFont(new Font("Monospaced", Font.BOLD, 16));
		Menu.setText("Welcome to SKKU Subway ;)");
		Menu.setEditable(false);
		Menu.setBackground(Color.WHITE);
		Menu.setBounds(251, 51, 374, 205);
		contentPane.add(Menu);

		InfoPanel = new JTextField();
		InfoPanel.setEditable(false);
		InfoPanel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		InfoPanel.setBackground(Color.ORANGE);
		InfoPanel.setText("Information Panel");
		InfoPanel.setHorizontalAlignment(SwingConstants.CENTER);
		InfoPanel.setBounds(251, 260, 374, 20);
		contentPane.add(InfoPanel);
		InfoPanel.setColumns(10);

		JPanel panel = new JPanel(); // this panel is used only for SkkuIcon background
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 635, 20);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel SkkuIcon = new JLabel("");
		SkkuIcon.setBounds(0, 0, 166, 19);
		SkkuIcon.setVerticalAlignment(SwingConstants.TOP);
		SkkuIcon.setHorizontalAlignment(SwingConstants.LEFT);
		SkkuIcon.setIcon(new ImageIcon(Main.class.getResource("/Icons/subway_logo_skku.png")));
		panel.add(SkkuIcon);

		// Here all the buttons are initialized
		OrderButton = new JButton("READY TO ORDER!"); // This button is used to exit the program when user is ready to
														// order
		OrderButton.setFont(new Font("Arial", Font.BOLD, 18));
		OrderButton.setBounds(0, 346, 635, 35);
		OrderButton.setBackground(new Color(0, 128, 0));
		OrderButton.setForeground(new Color(255, 255, 255));
		contentPane.add(OrderButton);

		BurgerButton = new JButton("\r\n");
		BurgerButton.setBackground(Color.WHITE);
		BurgerButton.setIcon(new ImageIcon(Main.class.getResource("/Icons/burger_icon.png")));
		BurgerButton.setBounds(10, 51, 205, 77);
		contentPane.add(BurgerButton);

		BeverageButton = new JButton("\r\n");
		BeverageButton.setIcon(new ImageIcon(Main.class.getResource("/Icons/beverages_icon.png")));
		BeverageButton.setBackground(Color.WHITE);
		BeverageButton.setBounds(10, 127, 205, 77);
		contentPane.add(BeverageButton);

		ExtraButton = new JButton("\r\n");
		ExtraButton.setHorizontalAlignment(SwingConstants.RIGHT);
		ExtraButton.setIcon(new ImageIcon(Main.class.getResource("/Icons/extras_icon.png")));
		ExtraButton.setBackground(Color.WHITE);
		ExtraButton.setBounds(10, 203, 205, 77);
		contentPane.add(ExtraButton);

		OrderButton.addActionListener(this);
		BurgerButton.addActionListener(this);
		BeverageButton.addActionListener(this);
		ExtraButton.addActionListener(this);
	}

	/*
	 * This function makes all the actions required for this program It just changes
	 * the text inside the textObject called Menu
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == OrderButton)
			System.exit(1);
		else if (e.getSource() == BurgerButton) {
			Menu.setFont(new Font("Monospaced", Font.BOLD, 16));
			Menu.setText("Burger Menu:\n" + "1. Egg mayo - 4,000 won\n" + "2. Chicken Tikka - 5,000 won\n"
					+ "3. Chicken Ham - 5,000 won\n" + "4. Roasted Chicken - 5,500 won\n");
		} else if (e.getSource() == BeverageButton) {
			Menu.setFont(new Font("Monospaced", Font.BOLD, 16));
			Menu.setText("Beverage Menu:\n" + "1. Cola - 1,000 won\n" + "2. Fanta - 1,100 won\n"
					+ "3. Chilsung Cider - 900 won\n" + "4. Zero Cola - 1,200 won\n" + "5. Coffee - 2,000 won\n");
		} else if (e.getSource() == ExtraButton) {
			Menu.setFont(new Font("Monospaced", Font.BOLD, 16));
			Menu.setText("Extras Menu:\n" + "1. Cookies - 1,500 won\n" + "2. French Fries - 1,300 won\n"
					+ "3. Chips - 1,700 won\n");
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
