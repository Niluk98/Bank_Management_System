
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.*;
/**
 *
 * @author nilpa
 */
public class SignUpOne extends JFrame implements ActionListener{
    long random;
      JTextField nameText,fnameText,EnameText,AnameText,CnameText,SnameText,pnameText;
       JButton next;
       JDateChooser dateChooser;
       JRadioButton male,female,married,unmarried;
       
     public SignUpOne() {
         setTitle("Sign Up");
         getContentPane().setBackground(Color.white);
         setSize(850,800);
         setLocation(350,10);
         
         setLayout(null);
         
//         JLabel backgroundImage=new JLabel("",new ImageIcon(ClassLoader.getSystemResource("icons/images.png")),JLabel.CENTER);
//         backgroundImage.setBounds(0,0,850,800);
//         add(backgroundImage);
         Random ran=new Random();
          random=Math.abs((ran.nextLong()%9000L)+1000L);
         JLabel formn=new JLabel("APPLICATION FORM NO. "+random);
         formn.setBounds(140,20,600,40);
         formn.setFont(new Font("Raleway",Font.BOLD,38));
         add(formn);
         
         JLabel personalDetails=new JLabel("Page 1 Personal Details");
         personalDetails.setBounds(290,80,400,40);
         personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
         add(personalDetails);
         
         JLabel name=new JLabel("Name: ");
         name.setBounds(100,140,100,30);
         name.setFont(new Font("Raleway",Font.BOLD,22));
         add(name);
         nameText=new JTextField();
         nameText.setFont(new Font("Arial",Font.BOLD,20));
         nameText.setBounds(300,140,400,30);
         add(nameText);
         
         JLabel fname=new JLabel("Father's Name: ");
         fname.setBounds(100,190,200,20);
         fname.setFont(new Font("Raleway",Font.BOLD,22));
         add(fname);
         fnameText=new JTextField();
         fnameText.setFont(new Font("Arial",Font.BOLD,20));
         fnameText.setBounds(300,190,400,30);
         add(fnameText);
         
         JLabel dob=new JLabel("Date Of Birth: ");
         dob.setBounds(100,230,200,20);
         dob.setFont(new Font("Raleway",Font.BOLD,22));
         add(dob);
          dateChooser=new JDateChooser();
         dateChooser.setBounds(300,240,400,30);
         dateChooser.setFont(new Font("Raleway",Font.BOLD,20));
         add(dateChooser);
//           dobField=new JTextField();
//           dobField.setBounds(300,230,400,30);
//           dobField.setText("DD-MM-YYYY");
//           dobField.setFont(new Font("RAleway",Font.BOLD,22));
//           add(dobField);
//           
         
         JLabel gender=new JLabel("Gender: ");
         gender.setBounds(100,270,200,20);
         gender.setFont(new Font("Raleway",Font.BOLD,22));
         add(gender);
          male=new JRadioButton("Male");
         male.setBounds(300,270,60,30);
         male.setBackground(Color.white);
         add(male);
        
          female=new JRadioButton("Female");
         female.setBounds(450,270,80,30);
         female.setBackground(Color.white);
         add(female);
          ButtonGroup genderGroup=new ButtonGroup();
         genderGroup.add(male);
         genderGroup.add(female);
         
         
         JLabel email=new JLabel("Email: ");
         email.setBounds(100,310,200,20);
         email.setFont(new Font("Raleway",Font.BOLD,22));
         add(email);
         EnameText=new JTextField();
         EnameText.setFont(new Font("Arial",Font.BOLD,20));
         EnameText.setBounds(300,310,400,30);
         add(EnameText);
         
         
         JLabel maritial=new JLabel("Maritial Status: ");
         maritial.setBounds(100,350,200,20);
         maritial.setFont(new Font("Raleway",Font.BOLD,22));
         add(maritial);
          married=new JRadioButton("Married");
         married.setBounds(300,350,80,30);
         married.setBackground(Color.white);
         add(married);
        
          unmarried=new JRadioButton("Unmarried");
         unmarried.setBounds(450,350,90,30);
         unmarried.setBackground(Color.white);
         add(unmarried);
          ButtonGroup marriedGroup=new ButtonGroup();
         marriedGroup.add(married);
         marriedGroup.add(unmarried);
         
         JLabel address=new JLabel("Address: ");
         address.setBounds(100,390,200,20);
         address.setFont(new Font("Raleway",Font.BOLD,22));
         add(address);
         AnameText=new JTextField();
         AnameText.setFont(new Font("Arial",Font.BOLD,20));
         AnameText.setBounds(300,390,400,30);
         add(AnameText);
         
         JLabel city=new JLabel("City: ");
         city.setBounds(100,430,200,25);
         city.setFont(new Font("Raleway",Font.BOLD,20));
         add(city);
         CnameText=new JTextField();
         CnameText.setFont(new Font("Arial",Font.BOLD,20));
         CnameText.setBounds(300,430,400,30);
         add(CnameText);
         
         JLabel state=new JLabel("State: ");
         state.setBounds(100,475,200,20);
         state.setFont(new Font("Raleway",Font.BOLD,20));
         add(state);
         SnameText=new JTextField();
         SnameText.setFont(new Font("Arial",Font.BOLD,22));
         SnameText.setBounds(300,475,400,30);
         add(SnameText);
         
         
         JLabel pincode=new JLabel("PinCode: ");
         pincode.setBounds(100,515,200,25);
         pincode.setFont(new Font("Raleway",Font.BOLD,20));
         add(pincode);
         pnameText=new JTextField();
         pnameText.setFont(new Font("Arial",Font.BOLD,20));
         pnameText.setBounds(300,515,400,30);
         add(pnameText);
         
         next=new JButton("NEXT");
         next.setFont(new Font("Raleway",Font.BOLD,20));
         next.setBounds(600, 600, 90, 40);
         next.setForeground(Color.white);
         next.setBackground(Color.black);
         add(next);
         next.addActionListener(this);
         setVisible(true);
         
    }
     @Override
     public void actionPerformed(ActionEvent e){
         String formno=""+random;
         String name=nameText.getText();
         String fname=fnameText.getText();
         String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String gender=null;
         if(male.isSelected()){
             gender="Male";
         }else if(female.isSelected()){
             gender="Female";
         }
         String email=EnameText.getText();
         String maritial=null;
         if(married.isSelected()){
             maritial="Married";
         }else if(unmarried.isSelected()){
             maritial="Unmarried";
         }
         String address= AnameText.getText();
         String city= CnameText.getText();
         String state=SnameText.getText();
         String pincode=pnameText.getText();
         
         
         try{
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is Required");
             }else{
                 Conn c=new Conn();
                 String query="insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+email+"', '"+maritial+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                 c.s.executeUpdate(query);
                 setVisible(false);
                 new SignUpTwo(formno);
             }
             
         }catch(Exception ea){
             ea.printStackTrace();
         }
         
     }
    
    
    public static void main(String[] args) {
        new SignUpOne();
    }
}
