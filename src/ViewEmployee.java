import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener{
    ViewEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1170, 650);
        setLocation(300, 100);
        setVisible(true);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("sp.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1170,650);
        add(image);
        
    }
    public static void main(String[] args) {
        new ViewEmployee();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new home();
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
   
}
