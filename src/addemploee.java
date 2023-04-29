import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class addemploee extends JFrame implements ActionListener {
    Random ran =new Random();
    int number = ran.nextInt(999999);
    JTextField tfsalary,tfaddress,tfname1,tffname1,tfphone,tfemail,tfdesi,tfadhar;
    JDateChooser dcdob;
    JComboBox chedu;
    JButton add,back;
     JLabel lblempid;
     String name,fname,dob,salary,email,phone,education,designation,address,aadhar,empid;

    addemploee(){
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("image4.jpg"));
       Image i2 =i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
       ImageIcon i3 =new ImageIcon(i2);
       JLabel image =new JLabel(i3);
       image.setBounds(0,0,900,700);
       add(image);
       

       JLabel heading = new JLabel("Add Employee Details");
       heading.setBounds(320,30,500,50);
       heading.setFont(new Font("SAN_SERIE",Font.BOLD,25));
       image.add(heading);

       JLabel labelname1=new JLabel("Name");
       labelname1.setBounds(50,150,150,30);
       labelname1.setFont(new Font("serif",Font.PLAIN,20));
       image.add(labelname1);

       tfname1 = new JTextField();
       tfname1.setBounds(200,150,150,30);
       image.add(tfname1);

       JLabel labelfname1=new JLabel("Father's Name");
       labelfname1.setBounds(400,150,150,30);
       labelfname1.setFont(new Font("serif",Font.PLAIN,20));
      image. add(labelfname1);

        tffname1 = new JTextField();
       tffname1.setBounds(600,150,150,30);
       image.add(tffname1);

       JLabel labeldob=new JLabel("Date of Birth");
       labeldob.setBounds(50,200,150,30);
       labeldob.setFont(new Font("serif",Font.PLAIN,20));
       image.add(labeldob);

        JDateChooser dcdob =new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        image.add(dcdob);

        JLabel labelsalary=new JLabel("Salary");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelsalary);
 
        tfsalary = new JTextField();
        tfsalary.setBounds(600,200,150,30);
        image.add(tfsalary);

        JLabel labeladdress=new JLabel("Address");
        labeladdress.setBounds(50,250,150,30);
        labeladdress.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labeladdress);
 
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        image.add(tfaddress);

        JLabel labelphone=new JLabel("Phone");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelphone);
 
         tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        image.add(tfphone);

        JLabel labelemail=new JLabel("Email");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelemail);
 
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        image.add(tfemail);

        JLabel labeledu=new JLabel("Highest Education");
        labeledu.setBounds(400,300,150,30);
        labeledu.setBackground(Color.BLACK);
        labeledu.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labeledu);
        
        String course[]={"BBA","B.COM","BA","MA","B.TECH","M.TECH","BCA","MCA","MBA","BSC","MSC","PHD"};
         chedu = new JComboBox(course);
        chedu.setBackground(Color.WHITE);
        chedu.setBounds(600,300,150,30);
        image.add(chedu);

        JLabel labeldesi=new JLabel("Designation");
        labeldesi.setBounds(50,350,150,30);
        labeldesi.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labeldesi);

        tfdesi = new JTextField();
        tfdesi.setBounds(200,350,150,30);
        image.add(tfdesi);

        JLabel labeladhar=new JLabel("Adhar Number");
        labeladhar.setBounds(400,350,150,30);
        labeladhar.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labeladhar);
 
        tfadhar = new JTextField();
        tfadhar.setBounds(600,350,150,30);
        image.add(tfadhar);

        JLabel labelempid=new JLabel("Employee ID");
        labelempid.setBounds(50,400,150,30);
        labelempid.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelempid);

         lblempid=new JLabel(""+number);
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("serif",Font.PLAIN,20));
        image.add(lblempid);

        add  = new JButton("Add Employee");
        add.setBounds(250,550,150,30);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        image.add(add);

        back = new JButton("Back");
        back.setBounds(450,550,150,30);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        image.add(back);

       
 
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == back){
       name = tfname1.getText();
       fname = tffname1.getText();
       dob =((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
       salary = tfsalary.getText();
       address = tfaddress.getText();
       email= tfemail.getText();
       education =(String) chedu.getSelectedItem();
       designation = tfdesi.getText();
       aadhar = tfadhar.getText();
       phone = tfphone.getText();
       empid = lblempid.getText();
      try{
       setVisible(false);
       JOptionPane.showMessageDialog(null, "Details added successfully");
      }catch(Exception e){
       
      }
        }

       else if(ae.getSource()==add){
        back.setVisible(false);
        JOptionPane.showMessageDialog(null, "Details added successfully");

        new home();
       }
      
       else{
        JOptionPane.showMessageDialog(null, "Details added successfully");
        setVisible(false);
    }
        setVisible(false);
        new home();
    
}
    public static void main(String args[]) {
        try {
      File myObj = new File("D:\\employee.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    
        new addemploee();

        
    }
}
