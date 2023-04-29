import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class home extends JFrame implements ActionListener {
    JButton add,update,view,remove;
    home(){
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1920,1230,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1820,1130);
        add(image);

        JLabel heading = new JLabel ("Employee Management system");
        heading.setBounds(650,30,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(heading);
        

         add = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);
        image.add(add);

         view = new JButton("View Employee");
        view.setBounds(820,80,150,40);
        view.addActionListener(this);
        image.add(view);

         update = new JButton("Update Employee");
        update.setBounds(650,140,150,40);
        update.addActionListener(this);
        image.add(update);

        
        remove = new JButton("Remove Employee");
        remove.setBounds(820,140,150,40);
        remove.addActionListener(this);
        image.add(remove);




        setSize(1820,630);
        setLocation(250,100);
        setVisible(true);

      
    }
    public void actionPerformed(ActionEvent ae){
       // JOptionPane.showMessageDialog(null, "Invalid Username or Password");
           
        
     if(ae.getSource()==add){
        setVisible(false);
        new addemploee();
       // new ViewEmployee();

     }else if (ae.getSource()==view){
        new ViewEmployee();

     }else if (ae.getSource()==update){

     }else{

     }
     
    }
     public static void main(String[]rk) {
        new home();
        
    }
}
