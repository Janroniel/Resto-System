import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Orders extends Food {
	//LABELS
	JLabel back = new JLabel();
	JLabel title = new JLabel("    MCDOLIBEE");
	JLabel ID = new JLabel("                              Enter Food ID: ");
	JLabel Name = new JLabel("                              Enter Name: ");
	JLabel Quan = new JLabel("                              Enter Quantity: ");
	JLabel Price = new JLabel("                              Enter Price: ");
	//TEXT FIELD
	JTextField T1 = new JTextField(20);
	JTextField T2 = new JTextField(20);
	JTextField T3 = new JTextField(20);
	JTextField T4 = new JTextField(20);

	//Buttons
    JButton add = new JButton("Insert");
    JButton remv = new JButton("Delete");
    JButton rtrn = new JButton("Return");
    JButton edit = new JButton("Replace");
    JButton add2 = new JButton("Insert");
    JButton rmv2 = new JButton("Delete");
    JButton return1 = new JButton("Return");
    JButton edit2 = new JButton("Replace");


	// FRAME 1 ADJUSTMENTS

	public void face() {
		first.setIconImage(image.getImage());
		first.setSize(450, 200);
		first.setLocationRelativeTo(null);
		first.setTitle("Ordering");
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnl.setBackground(new Color(0xE34363));
		back.setText("        ");
		back.setFont(f3);

		title.setFont(f);

		pnl.add(title);
		pnl.add(back, "\n");
		add.setFocusable(false);
		remv.setFocusable(false);
		edit.setFocusable(false);
		rtrn.setFocusable(false);
		add.addActionListener(new ActionButton1());
		pnl.add(add);
		remv.addActionListener(new ActionButton1());
		pnl.add(remv);
		edit.addActionListener(new ActionButton1());
		pnl.add(edit);
		rtrn.addActionListener(new ActionButton1());
		pnl.add(rtrn);

		first.add(pnl);

		first.setVisible(true);
		first.setResizable(false);
	}

	// ACTION BUTTON LAY OUTING
	class ActionButton1 implements ActionListener {
		private Component add3;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == add) {
				first.dispose();
				first.remove(pnl);
				first.repaint();
				first.validate();

				fr2.remove(pnl5);
				fr2.remove(pnl6);
				fr2.remove(pnl7);
				fr2.remove(panel8);
				fr2.remove(panel9);
				fr2.remove(lastPanel);

				fr2.repaint();
				fr2.revalidate();

				fr2.setIconImage(image.getImage());
				fr2.setSize(500, 500);
				fr2.setLocationRelativeTo(null);
				fr2.setTitle("Add Orders");
				fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				panel2.setBackground(new Color(0xE34363));
				panel3.setBackground(new Color(0xE34363));
				pnl4.setBackground(new Color(0xE34363));
				title.setFont(f);
				ID.setFont(f2);
				Name.setFont(f2);
				Quan.setFont(f2);
				Price.setFont(f2);

				panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
				panel3.add(Box.createRigidArea(new Dimension(0, 5)));

				Main main = new Main();
				table = new JTable(main.dft());
				sp = new JScrollPane(table);

				panel2.add(title);
				panel3.add(sp);
				panel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				panel3.add(ID);
				panel3.add(T5);
				panel3.add(Name);
				panel3.add(T2);
				panel3.add(Quan);
				panel3.add(T3);
				add3 = panel3.add(Price);
				panel3.add(T4);

				add2.setFocusable(false);
				add2.addActionListener(new ActionButton2());
				pnl4.add(add2);
				return1.setFocusable(false);
				return1.addActionListener(new ActionButton2());
				pnl4.add(return1);

				fr2.add(panel2, BorderLayout.NORTH);
				fr2.add(panel3, BorderLayout.CENTER);
				fr2.add(pnl4, BorderLayout.SOUTH);

				fr2.setResizable(true);
				fr2.setVisible(true);
			}

			else if (e.getSource() == remv) {
				first.dispose();
				first.remove(pnl);
				first.repaint();
				first.validate();

				fr2.remove(panel2);
				fr2.remove(panel3);
				fr2.remove(pnl4);
				fr2.remove(panel8);
				fr2.remove(panel9);
				fr2.remove(lastPanel);

				fr2.repaint();
				fr2.revalidate();

				fr2.setIconImage(image.getImage());
				fr2.setSize(500, 500);
				fr2.setLocationRelativeTo(null);
				fr2.setTitle("REMOVE");
				fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				pnl5.setBackground(new Color(0xE34363));
				pnl6.setBackground(new Color(0xE34363));
				pnl7.setBackground(new Color(0xE34363));
				title.setFont(f);
				ID.setFont(f2);

				pnl6.setLayout(new BoxLayout(pnl6, BoxLayout.PAGE_AXIS));
				pnl6.add(Box.createRigidArea(new Dimension(0, 5)));

				Main main = new Main();
				table = new JTable(main.dft());
				sp = new JScrollPane(table);

				pnl5.add(title);
				pnl6.add(sp);
				pnl6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				pnl6.add(ID);
				pnl6.add(T5);

				rmv2.setFocusable(false);
				rmv2.addActionListener(new ActionButton2());
				pnl7.add(rmv2);
				return1.setFocusable(false);
				return1.addActionListener(new ActionButton2());
				pnl7.add(return1);

				fr2.add(pnl5, BorderLayout.NORTH);
				fr2.add(pnl6, BorderLayout.CENTER);
				fr2.add(pnl7, BorderLayout.SOUTH);

				fr2.setResizable(true);
				fr2.setVisible(true);
			}

			else if (e.getSource() == edit) {
				first.setVisible(false);
				first.repaint();
				first.validate();

				fr2.remove(panel2);
				fr2.remove(panel3);
				fr2.remove(pnl4);
				fr2.remove(pnl5);
				fr2.remove(pnl6);
				fr2.remove(pnl7);

				fr2.repaint();
				fr2.revalidate();

				fr2.setIconImage(image.getImage());
				fr2.setSize(500, 500);
				fr2.setLocationRelativeTo(null);
				fr2.setTitle("Edit");
				fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				panel8.setBackground(new Color(0xE34363));
				panel9.setBackground(new Color(0xE34363));
				lastPanel.setBackground(new Color(0xE34363));
				title.setFont(f);
				IDrep.setFont(f2);
				replace.setFont(f2);
				changed.setFont(f2);

				panel9.setLayout(new BoxLayout(panel9, BoxLayout.PAGE_AXIS));
				panel9.add(Box.createRigidArea(new Dimension(0, 5)));

				Main main = new Main();
				table = new JTable(main.dft());
				sp = new JScrollPane(table);

				panel8.add(title);
				panel9.add(sp);
				panel9.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				panel9.add(IDrep);
				panel9.add(T5);
				panel9.add(replace);
				panel9.add(T2);
				panel9.add(changed);
				panel9.add(T3);

				edit2.setFocusable(false);
				edit2.addActionListener(new ActionButton2());
				lastPanel.add(edit2);
				return1.setFocusable(false);
				return1.addActionListener(new ActionButton2());
				lastPanel.add(return1);

				fr2.add(panel8, BorderLayout.NORTH);
				fr2.add(panel9, BorderLayout.CENTER);
				fr2.add(lastPanel, BorderLayout.SOUTH);

				fr2.setResizable(true);
				fr2.setVisible(true);
			}

			else if (e.getSource() == rtrn) {
				first.dispose();
				first.remove(pnl);
				first.repaint();
				first.validate();
				Login login = new Login();
				login.first.setVisible(true);
			}
		}
	}

	class ActionButton2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == add2) {
				String a = T5.getText();
				String b = T2.getText();
				String c = T3.getText();
				String d = T4.getText();
				Main main = new Main();
				main.order(a, b, c, d);
				main.update();
				table.setModel(main.dft());
				sp.repaint();
				sp.validate();
				fr2.repaint();
				fr2.validate();
				T5.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
			}

			else if (e.getSource() == rmv2) {
				String a = T5.getText();
				Main main = new Main();
				main.remove(a);
				main.update();
				table.setModel(main.dft());
				sp.repaint();
				sp.validate();
				fr2.repaint();
				fr2.validate();
				T5.setText("");
			}

			else if (e.getSource() == edit2) {
				String a = T5.getText();
				String b = T2.getText();
				String c = T3.getText();
				Main main = new Main();
				main.editP(a, b, c);
				main.update();
				table.setModel(main.dft());
				sp.repaint();
				sp.validate();
				fr2.repaint();
				fr2.validate();
				T5.setText("");
				T2.setText("");
				T3.setText("");
			}

			else if (e.getSource() == return1) {
				fr2.dispose();
				panel3.remove(sp);
				pnl6.remove(sp);
				panel9.remove(sp);
				fr2.remove(pnl4);
				fr2.remove(pnl7);
				fr2.remove(lastPanel);
				pnl.removeAll();
				pnl.add(title);
				pnl.add(back);
				pnl.add(add);
				pnl.add(remv);
				pnl.add(edit);
				pnl.add(rtrn);
				first.add(pnl);
				first.repaint();
				first.validate();
				first.setVisible(true);
			}
		}
	}

}