import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Splash extends JFrame implements ActionListener {
    Splash() {
         getContentPane().setBackground(Color.PINK);
         setLayout(null);

         

         JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
         heading.setBounds(80,30,1200,60);
         heading.setFont(new Font("serif",Font.PLAIN,60));
         heading.setForeground(Color.BLACK);
         add(heading);

         
         ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("sp.jpg"));
         Image i2 =i1.getImage().getScaledInstance(1970,1550,Image.SCALE_DEFAULT);
         ImageIcon i3 =new ImageIcon(i2);
         JLabel image =new JLabel(i3);
         image.setBounds(0,0,1870,1150);
         add(image);

       
        JButton clickhere =new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(390,690,300,70);
        clickhere.addActionListener(this);
         clickhere.setBackground(Color.PINK);
         clickhere.setForeground(Color.BLACK);
         image.add(clickhere);


         setSize(1370,1150);
         setLocation(200,50);
         setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }
     public static void main(String[] args) {
     new Splash();
        
    }
}

 