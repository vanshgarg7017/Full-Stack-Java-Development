import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

class Scientific extends JFrame implements ActionListener {
    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bdiv, bzero, bsub, bmul, badd, bdec, bclr, beq, bsqr;
    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    Scientific() {
    	// For Button
        f = new JFrame("My Calculator");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bzero = new JButton("0");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bsub = new JButton("-");
        badd = new JButton("+");
        bdec = new JButton(".");
        beq = new JButton("=");
        bclr = new JButton("Clear");
        bsqr = new JButton("x^");
        //for design
        t.setBounds(30, 40, 280, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        bdiv.setBounds(250, 100, 50, 40);

        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        bmul.setBounds(250, 170, 50, 40);

        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        bsub.setBounds(250, 240, 50, 40);

        bdec.setBounds(40, 310, 50, 40);
        bzero.setBounds(110, 310, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        badd.setBounds(250, 310, 50, 40);

        bsqr.setBounds(40, 380, 50, 40);
        bclr.setBounds(110, 380, 100, 40);
        Font buttonFont = new Font("Arial", Font.PLAIN, 18); 
        Color backgroundColor = new Color(63, 194, 212); 
        Color buttonColor = new Color(63, 212, 197);     
        Color textColor = Color.BLACK;
        f.getContentPane().setBackground(backgroundColor);
        JButton[] buttons = { b1, b2, b3, b4, b5, b6, b7, b8, b9, bzero, bdiv, bmul, bsub, badd, bdec, beq, bclr, bsqr };
        for (JButton button : buttons) {
            button.setBackground(buttonColor);
            button.setForeground(textColor);
        }
        t.setBackground(Color.WHITE); 
        t.setForeground(textColor); 
        
        JButton[] buttons1 = { b1, b2, b3, b4, b5, b6, b7, b8, b9, bzero, bdiv, bmul, bsub, badd, bdec, beq, bclr, bsqr };
        for (JButton button : buttons1) {
            button.setBackground(buttonColor);
            button.setForeground(textColor);
            button.setFont(buttonFont); 
        }
        
        t.setBackground(Color.WHITE); 
        t.setForeground(textColor);    
        t.setFont(buttonFont); 
        //showing button
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(bzero);
        f.add(beq);
        f.add(badd);
        f.add(bsqr);
        f.add(bclr);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 500);
        f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bzero.addActionListener(this);
        bdiv.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bclr.addActionListener(this);
        bmul.addActionListener(this);
        bdec.addActionListener(this);
        bsqr.addActionListener(this);
        beq.addActionListener(this);
        t.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            t.setText(t.getText().concat("1"));
        if (e.getSource() == b2)
            t.setText(t.getText().concat("2"));
        if (e.getSource() == b3)
            t.setText(t.getText().concat("3"));
        if (e.getSource() == b4)
            t.setText(t.getText().concat("4"));
        if (e.getSource() == b5)
            t.setText(t.getText().concat("5"));
        if (e.getSource() == b6)
            t.setText(t.getText().concat("6"));
        if (e.getSource() == b7)
            t.setText(t.getText().concat("7"));
        if (e.getSource() == b8)
            t.setText(t.getText().concat("8"));
        if (e.getSource() == b9)
            t.setText(t.getText().concat("9"));
        if (e.getSource() == bzero)
            t.setText(t.getText().concat("0"));
        if (e.getSource() == bdec)
            t.setText(t.getText().concat("."));
        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }
        if (e.getSource() == bsub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }
        if (e.getSource() == bmul) {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }
        if (e.getSource() == bdiv) {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        }
        if (e.getSource() == bsqr) {
            a = Double.parseDouble(t.getText());
            operator = 5;
            t.setText(t.getText().concat("^"));

        }
        if (e.getSource() == bclr)
            t.setText("");
        if (e.getSource() == beq) {
            if (operator == 5) {
                b = a;
            } else {
                b = Double.parseDouble(t.getText());
            }
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                case 5:
                    result = a * b;
                    break;
            }
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            System.out.println("result=" + result);
            t.setText("" + result);
            System.out.println("*********************");
        }
    }

    public static void main(String[] args) {
        new Scientific();
    }
}
