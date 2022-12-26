import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInFrameSt extends JFrame implements ActionListener {
    ImageIcon i1,rit ;
    JLabel j1,j2,n1,p1;
//    JPasswordField p1;
    JTextField t1;
    JPasswordField t2;
    JButton b , c ,cr;

    LogInFrameSt(){
        rit=new ImageIcon("./rit3.jpg");
       this.setBounds(200,100,380,620);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setIconImage(rit.getImage());
        this.getContentPane().setBackground(new Color(238,238,238));

        this.setTitle("LOG IN");


//       this.setBackground(new Color(20,200,189));

        i1 = new ImageIcon("./rit.png");

       j1= new JLabel(" ");
       j1.setIcon(i1);
       j1.setBounds(10,5,200,200);
       j1.setVerticalAlignment(JLabel.TOP);
       j1.setHorizontalAlignment(JLabel.CENTER);
       j1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3,false));

       j2 = new JLabel();
       j2.setText("STUDENT LOG IN");
       j2.setFont(new Font("Poppins ",Font.BOLD,20));
       j2.setForeground(new Color(4,4,4));
       j2.setBounds(100,100,200,50);

       n1 = new JLabel();
       n1.setLayout(null);
       n1.setText("USERNAME");
       n1.setBounds(30,200,200,30);
       n1.setForeground(new Color(4,4,4));
       n1.setFont(new Font("Poppins",Font.BOLD,15));

        p1 = new JLabel();
        p1.setText("PASSWORD");
        p1.setLayout(null);
        p1.setForeground(new Color(4,4,4));
        p1.setBounds(30,280,200,30);
        p1.setFont(new Font("Poppins",Font.BOLD,15));

        t1 = new JTextField();

        t1.setLayout(null);
        t1.setPreferredSize(new Dimension(200,30));
        t1.setBounds(120,200,200,30);
        t1.setForeground(Color.black);
        t1.setFont(new Font("Poppins",Font.BOLD,15));

        t2= new JPasswordField();
        t2.setLayout(null);
        t2.setPreferredSize(new Dimension(200,30));
        t2.setBounds(120,280,200,30);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Poppins",Font.BOLD,15));

        b = new JButton();
        b.setText("OK");
        b.setLayout(null);
        b.setFocusable(false);
        b.addActionListener(this);
        b.setBounds(70,380,100,40);
        b.setFont(new Font("Roboto",Font.BOLD,15));
        b.setBackground(new Color(248, 207, 36));
        b.setForeground(new Color(5,5,5));
        b.setBorder(BorderFactory.createLineBorder(new Color(3,3,3),2,true));

        c = new JButton();
        c.setText("Cancel");
        c.setBackground(new Color(248, 207, 36));
        c.setForeground(new Color(4,4,4));
        c.setLayout(null);
        c.setFocusable(false);
        c.setBounds(230,380,100,40);
        c.setFont(new Font("Roboto",Font.BOLD,15));
        c.addActionListener(this);
        c.setBorder(BorderFactory.createLineBorder(new Color(3,3,3),2,true));


        cr = new JButton();
        cr.setText("CREATE ACCOUNT");
        cr.setBackground(null);
        cr.setFont(new Font("Poppins",Font.BOLD,20));
        cr.setLayout(null);
        cr.setContentAreaFilled(false);
        cr.setBounds(80,480,250,40);
        cr.setBorder(null);
        cr.setForeground(new Color(5,5,5));
        cr.addActionListener(this);
        cr.setFocusable(false);

        j1.add(j2);

        this.add(t1);
        this.add(t2);
        this.add(b);
        this.add(c);
        this.add(cr);

        this.add(n1);
        this.add(p1);
        this.add(j1);

       this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b) {
            if (t1.getText().isEmpty() || t2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error In Logging", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Logged In Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
//
                    new Student();
            }
        }



        if(e.getSource()== c){
            this.dispose();
        }

        if(e.getSource()==cr){
            new CreateF_st();

        }
    }
}
