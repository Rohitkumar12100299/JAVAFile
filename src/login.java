import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener{
    JTextField tfusername,tfpassword;
    login(){
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(450,230,100,30);
        add(lblusername);
       

         tfusername = new JTextField();
        tfusername.setBounds(550,230,150,30);
        add(tfusername);

        JLabel lblupassword = new JLabel("Password");
        lblupassword.setBounds(450,300,100,30);
        add(lblupassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(550,300,150,30);
        add(tfpassword);

        JButton login = new JButton("Login");
        login.setBounds(550,400,150,30);
        login.addActionListener(this);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);

        add(login);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("sss.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1970,1550,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1600,1250);
        add(image);

       
    setSize(1100,1000);
    //setBounds(0,0 , WIDTH, HEIGHT);
    setLocation(450,200);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String username = tfusername.getText();
        String password = tfpassword.getText();
        if(username.equals("admin")&&password.equals("12345")){
           // JOptionPane.showMessageDialog(null, "Logged in Succesfully!");
           
          setVisible(false);  
        }else{
          JOptionPane.showMessageDialog(null, "Invalid Username or Password");
           
         setVisible(false); 
        }

        setVisible(false);
        new home();
    }
    public static void main(String[]args){
        new login();
    }
}
