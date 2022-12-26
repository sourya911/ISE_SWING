import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener{
    ImageIcon logo,i1;
    JLabel j1,j2,j3,j4;
    JCheckBox st,fc;
    ButtonGroup grp;
    Home(){
        logo = new ImageIcon("./rit2.png");

        this.setBounds(200, 100, 380, 620);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(238,238,238));
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(Color.white);
        this.setTitle("WELCOME");

        i1= new ImageIcon("./ritlogo1.png");
        j1 = new JLabel("");            //label used to add image
        j1.setIcon(i1);
        j1.setVerticalAlignment(JLabel.TOP);
        j1.setHorizontalAlignment(JLabel.CENTER);
        j1.setBorder(BorderFactory.createLineBorder(Color.BLACK,4,false));

        j2 = new JLabel("Welcome");             //label -> welcome
        j2.setForeground(new Color(2,2,2));
        j2.setFont(new Font("Poppins",Font.BOLD,20));
        j2.setBounds(140,250,300,30);

        j3 = new JLabel("CSIT DEPARTMENT");   // label -> CSIT
        j3.setForeground(new Color(2,2,2));
        j3.setFont(new Font("Poppins",Font.BOLD,20));
        j3.setBounds(100,300,400,30);

        j4 = new JLabel("Select Log In Type ");
        j4.setForeground(new Color(2,2,2));
        j4.setFont(new Font("Poppins",Font.BOLD,20));
        j4.setBounds(100,350,300,30);

        st = new JCheckBox("Student");          //student checkbox
        st.setLayout(null);
        st.setBorder(null);
        st.setFont(new Font("Roboto",Font.BOLD,20));
        st.setContentAreaFilled(false);
        st.setBackground(null);
        st.setBounds(140,430,250,30);
        st.addActionListener(this);


        fc = new JCheckBox("Admin");            //faculty/admin checkbox
        fc.setLayout(null);
        fc.setBorder(null);
        fc.setFont(new Font("Roboto",Font.BOLD,20));
        fc.setContentAreaFilled(false);
        fc.setBackground(null);
        fc.setBounds(140,480,250,30);
        fc.addActionListener(this);

        grp = new ButtonGroup();   // Buttonroup to select one button at a time
        grp.add(st);
        grp.add(fc);

        j1.add(j2);
        j1.add(j3);
        j1.add(j4);

        this.add(st);
        this.add(fc);
        this.add(j1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==st){
            new LogInFrameSt();
        }

        if (e.getSource()==fc){
            new LogInFrameFc();
        }
    }
}
