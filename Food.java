import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Food extends JFrame {
    static JFrame first = new JFrame();
    JFrame fr2 = new JFrame();

    // PANELS LAYOUT
    JPanel pnl = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel pnl4 = new JPanel();
    JPanel pnl5 = new JPanel();
    JPanel pnl6 = new JPanel();
    JPanel pnl7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel lastPanel = new JPanel();

    ImageIcon image = new ImageIcon("icon.png");
//Adjustments of Fonts 
    Font f = new Font("Proxima Nova", Font.BOLD, 48);
    Font f2 = new Font("Proxima Nova", Font.BOLD, 17);
    Font f3 = new Font("Proxima Nova", Font.BOLD, 17);


   //Label that was used 
    JLabel back = new JLabel();
    JLabel title = new JLabel("MCDOLIBEE");
    JLabel ID = new JLabel("Enter Food ID: ");
    JLabel price = new JLabel("Enter Price: ");
    JLabel Nam = new JLabel("Enter Name: ");
    JLabel IDrep = new JLabel("Enter ID: ");
    JLabel replace = new JLabel("Enter value to replace: ");
    JLabel changed = new JLabel("Enter new value: ");

    //Buttons
    JButton add = new JButton("Insert");
    JButton remv = new JButton("Delete");
    JButton rtrn = new JButton("Return");
    JButton edit = new JButton("Replace");
    JButton add2 = new JButton("Insert");
    JButton rmv2 = new JButton("Delete");
    JButton return1 = new JButton("Return");
    JButton edit2 = new JButton("Replace");

    JTextField T4 = new JTextField(10);
    JTextField T5 = new JTextField(10);
    JTextField T6 = new JTextField(10);

    JTable table;
    JScrollPane sp;

    public void face() {
        first.repaint();
        first.validate();
        first.setIconImage(image.getImage());
        first.setSize(450, 200);
        first.setLocationRelativeTo(null);
        first.setTitle("Food available");
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.setBackground(new Color(0xD03A3A));
        back.setText("Select Function");
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

    class ActionButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                first.setVisible(false);
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
                fr2.setTitle("Add");
                fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                panel2.setBackground(new Color(0xD03A3A));
                panel3.setBackground(new Color(0xD03A3A));
                pnl4.setBackground(new Color(0xD03A3A));
                title.setFont(f);
                IDrep.setFont(f2);
                replace.setFont(f2);
                changed.setFont(f2);

                panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
                panel3.add(Box.createRigidArea(new Dimension(0, 5)));

                Main main = new Main();
                table = new JTable(main.tebeldoc());
                sp = new JScrollPane(table);

                panel2.add(title);
                panel3.add(sp);
                panel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel3.add(ID);
                panel3.add(T4);
                panel3.add(Nam);
                panel3.add(T5);
                panel3.add(price);
                panel3.add(T6);

                add2.setFocusable(true);
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
                first.setVisible(false);
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
                fr2.setTitle("Remove ");
                fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pnl5.setBackground(new Color(0xE34363));
                pnl6.setBackground(new Color(0xE34363));
                pnl7.setBackground(new Color(0xE34363));
                title.setFont(f);
                ID.setFont(f2);
                back.setFont(f2);

                pnl6.setLayout(new BoxLayout(pnl6, BoxLayout.PAGE_AXIS));
                pnl6.add(Box.createRigidArea(new Dimension(0, 5)));

                Main main = new Main();
                table = new JTable(main.tebeldoc());
                sp = new JScrollPane(table);

                pnl5.add(title);
                pnl6.add(sp);
                pnl6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                pnl6.add(ID);
                pnl6.add(T4);

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
                ID.setFont(f2);
                Nam.setFont(f2);
                price.setFont(f2);

                panel9.setLayout(new BoxLayout(panel9, BoxLayout.PAGE_AXIS));
                panel9.add(Box.createRigidArea(new Dimension(0, 5)));

                Main main = new Main();
                table = new JTable(main.tebeldoc());
                sp = new JScrollPane(table);

                panel8.add(title);
                panel9.add(sp);
                panel9.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel9.add(IDrep);
                panel9.add(T4);
                panel9.add(replace);
                panel9.add(T5);
                panel9.add(changed);
                panel9.add(T6);

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
                String a = T4.getText();
                String b = T5.getText();
                String c = T6.getText();
                Main main = new Main();

                main.update();
                table.setModel(main.tebeldoc());
                sp.repaint();
                sp.validate();
                fr2.repaint();
                fr2.validate();
                T4.setText("");
                T5.setText("");
                T6.setText("");

            }

            else if (e.getSource() == rmv2) {
                String a = T4.getText();
                Main main = new Main();
                main.remove(a);
                main.update();
                table.setModel(main.tebeldoc());
                sp.repaint();
                sp.validate();
                fr2.repaint();
                fr2.validate();
                T4.setText("");
            }

            else if (e.getSource() == edit2) {
                String a = T4.getText();
                String b = T5.getText();
                String c = T6.getText();
                Main main = new Main();
                main.editD(a, b, c);
                main.update();
                table.setModel(main.tebeldoc());
                sp.repaint();
                sp.validate();
                fr2.repaint();
                fr2.validate();
                T4.setText("");
                T5.setText("");
                T6.setText("");
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
                pnl.add(changed);
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