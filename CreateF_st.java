import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateF_st extends JFrame implements ActionListener {
    JLabel l1,l2,n1,n2,n3,n4;
    JLabel l5;
    JTextField t1,t2,t3;
    JPasswordField t4;
    JButton b1,b2,ln;
    ImageIcon i1,logo;

    CreateF_st() {
        logo = new ImageIcon("rit2.png");

        this.setBounds(200, 100, 380, 620);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(238,238,238));
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(Color.white);
        this.setTitle("CREATE ACCOUNT");

        i1 = new ImageIcon("./rit.png");

        l1 = new JLabel(" ");
        l1.setIcon(i1);
        l1.setForeground(new Color(5,5,5));
        l1.setVerticalAlignment(JLabel.TOP);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBounds(5,-5,20,5);
        l1.setBorder(BorderFactory.createLineBorder(Color.BLACK,5,false));


        l2 = new JLabel("CREATE ACCOUNT");
        l2.setForeground(new Color(5,5,5));
        l2.setLayout(null);
        l2.setFont(new Font("ROBOTO",Font.BOLD,20));
        l2.setBounds(80,140,200,20);

         n1  = new JLabel();
         n2  = new JLabel();
         n3  = new JLabel();
         n4  = new JLabel();
        n1.setText("Name");
        n1.setLayout(null);
        n1.setForeground(new Color(5,5,5));
        n1.setBounds(20,200,50,30);
        n1.setFont(new Font("Poppins",Font.BOLD,15));

        n2.setText("PRN NO");
        n2.setLayout(null);
        n1.setForeground(new Color(5,5,5));
        n2.setBounds(20,250,70,30);
        n2.setFont(new Font("Poppins",Font.BOLD,15));

        n3.setText("Email");
        n3.setLayout(null);
        n1.setForeground(new Color(5,5,5));
        n3.setBounds(20,300,50,30);
        n3.setFont(new Font("Poppins",Font.BOLD,15));

        n4.setText("Password");
        n4.setLayout(null);
        n1.setForeground(new Color(5,5,5));
        n4.setBounds(20,350,100,30);
        n4.setFont(new Font("Poppins",Font.BOLD,15));

        t1 = new JTextField();

        t1.setPreferredSize(new Dimension(200,25));
        t1.setFont(new Font("Poppins",Font.BOLD,15));
        t1.setLayout(null);
        t1.setBounds(100,200,200,30);

        t2 = new JTextField();

        t2.setPreferredSize(new Dimension(200,25));
        t2.setFont(new Font("Poppins",Font.BOLD,15));
        t2.setLayout(null);
        t2.setBounds(100,250,200,30);


        t3 = new JTextField();

        t3.setPreferredSize(new Dimension(200,25));
        t3.setFont(new Font("Poppins",Font.BOLD,15));
        t3.setLayout(null);
        t3.setBounds(100,300,200,30);


        t4 = new JPasswordField();

        t4.setFont(new Font("Poppins",Font.BOLD,15));
        t4.setPreferredSize(new Dimension(200,25));
        t4.setLayout(null);
        t4.setBounds(100,350,200,30);

       b1 = new JButton();
        b1.setLayout(null);
        b1.setText("Create Account");
        b1.setFocusable(false);
        b1.setForeground(new Color(1,1,1));
        b1.setBackground(new Color(248, 200, 36));
        b1.setBorder(BorderFactory.createLineBorder(new Color(5,5,5),2,true));
        b1.setBounds(20,420,150,40);
        b1.addActionListener(this);

        b2 = new JButton();
        b2.setLayout(null);
        b2.setText("Cancel");
        b2.setFocusable(false);
        b2.setForeground(new Color(1,1,1));
        b2.setBackground(new Color(248, 200, 36));
        b2.setBorder(BorderFactory.createLineBorder(new Color(5,5,5),2,true));
        b2.setBounds(200,420,150,40);
        b2.addActionListener(this);

        l5 = new JLabel("Account Created Successfully");
        l5.setLayout(null);
        l5.setForeground(new Color(4,4,4));
        l5.setBounds(80,460,250,50);
        l5.setFont(new Font("Roboto",Font.BOLD,14));
        l5.setVisible(false);

        ln = new JButton();
        ln.setLayout(null);
        ln.setText("Log In ");
        ln.setForeground(new Color(3,3,3));
        ln.setFocusable(false);
        ln.setFont(new Font("Roboto",Font.BOLD,20));
        ln.setContentAreaFilled(false);
        ln.setBounds(120,500,150,50);
        ln.setBorder(null);
        ln.addActionListener(this);


        l1.add(l2);


        this.add(l5);
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.add(n4);

        this.add(b1);
        this.add(b2);

        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);

        this.add(ln);

        this.add(l1);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Please Provide All details","Error",JOptionPane.ERROR_MESSAGE);
                System.out.println("Please Enter Required Details ");

            }
            else{
                System.out.println("Name  :"+t1.getText());
                System.out.println("PRN NO :"+t2.getText());
                System.out.println("Email :"+t3.getText());
                System.out.println("Password :"+t4.getText());
                l5.setVisible(true);
            }
        }

        if(e.getSource()==b2){
            this.dispose();

        }
        if(e.getSource()==ln){
            new LogInFrameSt();
            ln.setEnabled(false);
        }
    }
}
