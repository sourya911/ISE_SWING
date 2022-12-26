import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuggestionFrameStudent extends JFrame implements ActionListener {
    ImageIcon rit,i1,i2;
    JLabel j1,j2;
    JButton b;
    JTextArea t1;
    SuggestionFrameStudent(){
        rit = new ImageIcon("./rit3.jpg");
        this.setBounds(200,100,380,650);
        this.setIconImage(rit.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(250,250,250));
        this.setTitle("Suggestion");


        i1= new ImageIcon("./rit.png");
        j1 = new JLabel("");
        j1.setIcon(i1);
        j1.setVerticalAlignment(JLabel.TOP);
        j1.setHorizontalAlignment(JLabel.CENTER);

        j2 = new JLabel("Suggestions??");
        j2.setForeground(new Color(2,2,2));
        j2.setFont(new Font("Poppins",Font.BOLD,20));
        j2.setBounds(120,100,300,30);
        j1.add(j2);


        t1 = new JTextArea();
        t1.setBackground(new Color(250,250,230));
        t1.setFont(new Font("Poppins",Font.BOLD,15));
        t1.setForeground(new Color(2,2,2));
        t1.setBounds(40,150,300,320);
        t1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,false));

        i2 = new ImageIcon("./Check2.png");
        b= new JButton("Submit");
        b.setIcon(i2);
        b.setContentAreaFilled(false);
        b.setFocusable(false);
        b.setBorder(null);
        b.setPreferredSize(new Dimension(200,50));
        b.setBounds(50,500,300,50);
        b.addActionListener(this);

        this.add(b);
        this.add(t1);
        this.add(j1);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b){
            if(t1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Enter Something","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Submitted Successfully !","Submit",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
