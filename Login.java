import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {

	static JFrame first = new JFrame();
	static JFrame second = new JFrame();

	JPanel panl1 = new JPanel();
	JPanel panl2 = new JPanel();
	JPanel panl3 = new JPanel();
	JPanel panl4 = new JPanel();

	ImageIcon image = new ImageIcon("icon.png");

	Font f1 = new Font("Roboto", Font.BOLD, 20);
	Font f2 = new Font("Roboto", Font.BOLD, 12);
	Font f3 = new Font("Roboto", Font.BOLD, 12);

	JLabel back = new JLabel();
	JLabel title = new JLabel("MCDOLIBEE");
	JLabel usr = new JLabel("Username:");
	JLabel pw = new JLabel("Password:");
	JLabel message = new JLabel();

	// LOG IN FRAME BUTTON
	JButton log = new JButton("Login");
	JButton clr = new JButton("Clear");

	// 2nd FRAME BUTTON
	JButton food = new JButton("FOODS");
	JButton order = new JButton("Order");
	JButton close = new JButton("Close");
	JButton logout = new JButton("Logout");

	static JTextField usrField = new JTextField(15);
	static JPasswordField passField = new JPasswordField(15);

	public void activate() {
		colors();
	}

	// FRAME LAYOUTING
	public void colors() {

		back.setSize(100, 100);
		panl1.setBackground(new Color(0xE34363));
		panl2.setBackground(new Color(0xE34363));
		panl3.setBackground(new Color(0xE34363));
		panl4.setBackground(new Color(0xE34363));

		first.setIconImage(image.getImage());
		first.setSize(245, 245);
		first.setLocationRelativeTo(null);
		first.setTitle("Restaurant LOGIN");
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title.setFont(f1);
		usr.setFont(f2);
		pw.setFont(f2);
		log.setFont(f2);
		clr.setFont(f2);
		log.setFocusable(false);
		clr.setFocusable(false);
		panl2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 4));

		panl1.add(title);
		panl2.add(usr);
		panl2.add(usrField);
		panl2.add(pw);
		panl2.add(passField);
		panl2.add(log);
		panl2.add(clr);

		log.addActionListener(new ActionButton1());
		panl2.add(log);
		clr.addActionListener(new ActionButton1());
		panl2.add(clr);
		panl2.add(back);

		first.add(panl1, BorderLayout.NORTH);
		first.add(panl2, BorderLayout.CENTER);
		first.add(panl3, BorderLayout.WEST);
		first.add(panl4, BorderLayout.EAST);
		first.setVisible(true);
		first.setResizable(false);

	}

	// LOG IN ERROR LAY OUT
	public void notfound() {
		second.remove(panl2);
		second.setIconImage(image.getImage());
		second.setSize(200, 200);
		second.setTitle("MCDOLIBEE");
		second.setLocationRelativeTo(null);
		second.setLocation(100, 100);
		second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panl1.setBackground(new Color(0xE34363));
		title.setFont(f1);

		panl1.add(title);
		message.setForeground(Color.red);
		message.setText("Incorrect Username or Password");
		message.setFont(f3);
		back.setText("\n");

		panl1.add(message);
		panl1.add(back);
		close.setFocusable(false);
		close.addActionListener(new ActionButton1());
		panl1.add(close);
		panl1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 4));

		second.add(panl1);

		second.setVisible(true);
		second.setResizable(false);

	}

	public void part2() {
		first.dispose();
		second.remove(panl1);
		second.setIconImage(image.getImage());
		second.setSize(200, 145);
		second.setLocationRelativeTo(null);
		second.setTitle("Restaurant Management");
		second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panl2.setBackground(new Color(0xfaafc9));

		back.setFont(f3);
		title.setFont(f1);

		panl2.add(title);
		panl2.add(back, "\n");

		order.setFocusable(false);
		order.addActionListener(new ActionButton2());
		panl2.add(order);

		logout.setFocusable(true);
		logout.setBackground(new Color(0xF3F3F3));
		logout.addActionListener(new ActionButton2());
		panl2.add(logout);

		second.add(panl2);

		second.setVisible(true);
		second.setResizable(false);
	}

	class ActionButton1 extends Main implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == log) {
				String usrID = usrField.getText();
				String password = String.valueOf(passField.getPassword());
				Main main = new Main();
				logiin(usrID, password);
			} else if (e.getSource() == clr) {
				usrField.setText("");
				passField.setText("");
			}

			else if (e.getSource() == close) {
				second.dispose();
				second.repaint();
				second.validate();
				usrField.setText("");
				passField.setText("");
			}

		}
	}

	class ActionButton2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == food) {
				second.dispose();
				Food food = new Food();
				food.face();
			}

			else if (e.getSource() == order) {
				second.dispose();
				Orders order = new Orders();
				order.face();
			}

			else if (e.getSource() == logout) {
				second.dispose();
				second.repaint();
				second.validate();
				first.setVisible(true);
				usrField.setText("");
				passField.setText("");

			}

		}
	}
}