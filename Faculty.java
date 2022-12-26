import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Faculty extends JFrame implements ActionListener {
    JLabel home,name;
    JLabel l1,l2,l3,l4,l5,l6;
    ImageIcon r,rit;
    ImageIcon i1,i2,i3,i4,i5,i6;
    JPanel Teach, Acalender, Suggetion,Lout,Ach,Moodle;
    JButton Tl,Al,Sl,Ll,Acl,Ml;
    Faculty(){
        rit = new ImageIcon("./rit3.jpg");
        this.setBounds(200,100,380,650);
        this.setIconImage(rit.getImage());
        this.getContentPane().setBackground(new Color(238,238,238));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("DASHBOARD");


        r= new ImageIcon("./rit.png");

        home = new JLabel();
        home.setIcon(r);
        home.setHorizontalAlignment(JLabel.CENTER);
        home.setVerticalAlignment(JLabel.TOP);
        home.setBorder(BorderFactory.createLineBorder(new Color(2,2,2),3,false));

        name = new JLabel("Rajarambapu Institute of Technology  ");
        name.setFont(new Font("Poppins",Font.BOLD,20));
        name.setForeground(Color.black);
        name.setLayout(null);
        name.setBounds(10,10,400,200);


        i1 = new ImageIcon("./staff.png");

        Teach = new JPanel();
        Teach.setBackground(new Color(255,255,255));
//        Teach.setBackground(null);
        Teach.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));

        Teach.setBounds(50,150,120,120);

        Tl = new JButton("");
        Tl.setIcon(i1);             //label used to add image
        Tl.setPreferredSize(new Dimension(80,60));
        Tl.setBorder(null);
        Tl.setContentAreaFilled(false);
        Tl.setFocusable(false);
        Tl.setBounds(10,100,80,30);
        Tl.setCursor(new Cursor(Cursor.HAND_CURSOR));

        l1 = new JLabel("Teaching Staff");
        l1.setFont(new Font("Poppins",Font.PLAIN,16));
        l1.setBounds(0,100,100,20);
        l1.setForeground(new Color(1,1,1));

        Teach.add(Tl);
        Teach.add(l1);


        i2 = new ImageIcon("./cal.png");
        Acalender= new JPanel();
        Acalender.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));
        Acalender.setBackground(new Color(255,255,255));
//        Acalender.setBackground(null);
        Acalender.setBounds(200,150,120,120);

        Al = new JButton("");
        Al.setIcon(i2);
        Al.setPreferredSize(new Dimension(80,60));
        Al.setBorder(null);
        Al.setContentAreaFilled(false);
        Al.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Al.setFocusable(false);
        Al.setBounds(10,100,80,30);

        l2 = new JLabel("Academic Calender");
        l2.setFont(new Font("Poppins",Font.BOLD,12));
        l2.setForeground(new Color(1,1,1));

        Acalender.add(l2);
        Acalender.add(Al);

        i3 = new ImageIcon("./Sl.png");
        Suggetion = new JPanel();
        Suggetion.setBackground(new Color(255,255,255));
//        Suggetion.setBackground(null);
        Suggetion.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));

        Suggetion.setBounds(50,300,120,120);

        Sl = new JButton("");
        Sl.setIcon(i3);
        Sl.setPreferredSize(new Dimension(80,60));
        Sl.setBorder(null);
        Sl.setContentAreaFilled(false);
        Sl.setFocusable(false);
        Sl.setBounds(10,100,80,30);
        Sl.setCursor(new Cursor(Cursor.HAND_CURSOR));

        l3 = new JLabel("Suggetion");
        l3.setFont(new Font("Poppins",Font.BOLD,16));
        l3.setBounds(0,100,100,20);
        l3.setForeground(new Color(1,1,1));

        Suggetion.add(Sl);
        Suggetion.add(l3);


        i4 = new ImageIcon("./ach2.png");
        Ach = new JPanel();
        Ach.setBackground(null);
        Ach.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));
        Ach.setBackground(new Color(255,255,255));
//        Ach.setBackground(null);
        Ach.setBounds(200,300,120,120);

        Acl = new JButton("");
        Acl.setIcon(i4);
        Acl.setPreferredSize(new Dimension(80,60));
        Acl.setBorder(null);
        Acl.setContentAreaFilled(false);
        Acl.setFocusable(false);
        Acl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Acl.setBounds(10,100,80,30);
        Acl.setCursor(new Cursor(Cursor.HAND_CURSOR));

        l4 = new JLabel("Achievement");
        l4.setFont(new Font("Poppins",Font.BOLD,12));
        l4.setBounds(0,100,100,20);
        l4.setForeground(new Color(1,1,1));

        Acalender.add(l2);

        Ach.add(Acl);
        Ach.add(l4);

        i5 = new ImageIcon("./L2.png");
        Lout = new JPanel();
        Lout.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));
        Lout.setBackground(new Color(255,255,255));
//        Lout.setBackground(null);
        Lout.setBounds(200,450,120,120);

        Ll = new JButton("");
        Ll.setIcon(i5);
        Ll.setPreferredSize(new Dimension(80,60));
        Ll.setBorder(null);
        Ll.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Ll.setContentAreaFilled(false);
        Ll.setFocusable(false);
        Ll.setBounds(10,100,80,30);

        l5 = new JLabel("Log Out");
        l5.setFont(new Font("Poppins",Font.BOLD,18));
        l5.setBounds(0,100,100,20);
        l5.setForeground(new Color(1,1,1));


        i6 = new ImageIcon("./moodle.png");
        Moodle= new JPanel();
        Moodle.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));
        Moodle.setBackground(new Color(255,255,255));
//        Moodle.setBackground(null);
        Moodle.setBounds(50,450,120,120);

        Ml = new JButton("");
        Ml.setIcon(i6);
        Ml.setPreferredSize(new Dimension(80,60));
        Ml.setBorder(null);
        Ml.setContentAreaFilled(false);
        Ml.setFocusable(false);
        Ml.setBounds(10,100,80,30);

        l6 = new JLabel("Moodle ");
        l6.setFont(new Font("Poppins",Font.BOLD,18));
        l6.setBounds(0,100,100,20);
        l6.setForeground(new Color(1,1,1));

        Moodle.add(Ml);
        Moodle.add(l6);

        Ml.addActionListener(this);
        Tl.addActionListener(this);
        Al.addActionListener(this);
        Sl.addActionListener(this);
        Ll.addActionListener(this);
        Acl.addActionListener(this);

        Lout.add(Ll);
        Lout.add(l5);

        this.add(Teach);
        this.add(Acalender);
        this.add(Ach);
        this.add(Suggetion);
        this.add(Lout);
        this.add(Moodle);
        home.add(name);
        this.add(home);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Ll){
            int YN= JOptionPane.showConfirmDialog(this,"Are You Sure you want to logout?","CONFIRM",JOptionPane.YES_NO_CANCEL_OPTION);
            if(YN==JOptionPane.YES_OPTION){
                this.dispose();
            }

        }
        if (e.getSource()==Sl){
            new SuggestionFrameStudent();
        }

        if(e.getSource()==Tl){
            try {
                Desktop.getDesktop().browse(new URI("https://www.ritindia.edu/CSIT/index.php/faculty-csit/teaching-faculty").toURL().toURI());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (URISyntaxException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==Ml){

            try {
                Desktop.getDesktop().browse(new URI("http://210.212.171.173/my/").toURL().toURI());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (URISyntaxException ex) {
                throw new RuntimeException(ex);
            }


        }
        if(e.getSource()==Al){
            try {
                Desktop.getDesktop().browse(new URL("https://www.ritindia.edu/images/Academics/Calendar/BTechMTechMBA-Sem-I-2022-23.pdf").toURI());
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (URISyntaxException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
