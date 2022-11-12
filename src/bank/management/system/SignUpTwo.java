
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
public class SignUpTwo extends JFrame implements ActionListener {
      JTextField nameText,fnameText,EnameText,AnameText,CnameText,adhar,pan;
       JButton next;
       JRadioButton eyes,eNo,syes,sNo;
       JComboBox religion,category,salary,education,occupation;
       String formno;
       
     public SignUpTwo(String formno) {
         this.formno=formno;
         setTitle("Sign Up");
         getContentPane().setBackground(Color.white);
         setSize(850,800);
         setLocation(350,10);
         
         setLayout(null);
         
//         JLabel backgroundImage=new JLabel("",new ImageIcon(ClassLoader.getSystemResource("icons/images.png")),JLabel.CENTER);
//         backgroundImage.setBounds(0,0,850,800);
//         add(backgroundImage);
         setTitle("NEW ACCOUNT FORM -PAGE 2");
//         JLabel formn=new JLabel("APPLICATION FORM NO. "+random);
//         formn.setBounds(140,20,600,40);
//         formn.setFont(new Font("Raleway",Font.BOLD,38));
//         add(formn);
         
         JLabel additionalDetails=new JLabel("Page 2 Additional Details");
         additionalDetails.setBounds(290,80,400,40);
         additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
         add(additionalDetails);
         
         JLabel name=new JLabel("Religion: ");
         name.setBounds(100,140,120,30);
         name.setFont(new Font("Raleway",Font.BOLD,22));
         add(name);
         String str[]={"Hindu","Muslim","Christian","Other"};
          religion =new JComboBox(str);
//         nameText=new JTextField();
//         nameText.setFont(new Font("Arial",Font.BOLD,20));
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.white);
         add(religion);
         
         JLabel fname=new JLabel("Category: ");
         fname.setBounds(100,190,200,20);
         fname.setFont(new Font("Raleway",Font.BOLD,22));
         add(fname);
         String catStr[]={"General","SC","ST","OBC"};
          category =new JComboBox(catStr);
//         nameText=new JTextField();
//         nameText.setFont(new Font("Arial",Font.BOLD,20));
         category.setBounds(300,190,400,30);
         category.setBackground(Color.white);
         add(category);
         
         JLabel dob=new JLabel("Income: ");
         dob.setBounds(100,230,200,20);
         dob.setFont(new Font("Raleway",Font.BOLD,22));
         add(dob);
          String salStr[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
          salary =new JComboBox(salStr);
//         nameText=new JTextField();
//         nameText.setFont(new Font("Arial",Font.BOLD,20));
         salary.setBounds(300,230,400,30);
         salary.setBackground(Color.white);
         add(salary);
//           dobField=new JTextField();
//           dobField.setBounds(300,230,400,30);
//           dobField.setText("DD-MM-YYYY");
//           dobField.setFont(new Font("RAleway",Font.BOLD,22));
//           add(dobField);
//           
         
         JLabel gender=new JLabel("Education: ");
         gender.setBounds(100,270,200,20);
         gender.setFont(new Font("Raleway",Font.BOLD,22));
         add(gender);
         String edStr[]={"10th Pass","12th Pass","Under Graduate","Graduate"};
          education =new JComboBox(edStr);
         education.setBounds(300,270,400,30);
         education.setBackground(Color.white);
         add(education);
//          male=new JRadioButton("Male");
//         male.setBounds(300,270,60,30);
//         male.setBackground(Color.white);
//         add(male);
        
//          female=new JRadioButton("Female");
//         female.setBounds(450,270,80,30);
//         female.setBackground(Color.white);
//         add(female);
//          ButtonGroup genderGroup=new ButtonGroup();
//         genderGroup.add(male);
//         genderGroup.add(female);
         
         
         JLabel email=new JLabel("Qualification: ");
         email.setBounds(100,310,200,20);
         email.setFont(new Font("Raleway",Font.BOLD,22));
         add(email);
         EnameText=new JTextField();
         EnameText.setFont(new Font("Arial",Font.BOLD,20));
         EnameText.setBounds(300,310,400,30);
         add(EnameText);
         
         
         JLabel maritial=new JLabel("Occupation: ");
         maritial.setBounds(100,350,200,20);
         maritial.setFont(new Font("Raleway",Font.BOLD,22));
         add(maritial);
         String ocStr[]={"Salaried","Self-EmPloyed","Bussiness","Student","Retired"};
          occupation =new JComboBox(ocStr);
         occupation.setBounds(300,350,400,30);
         occupation.setBackground(Color.white);
         add(occupation);
          
        
          
         
         JLabel address=new JLabel("PAN No.: ");
         address.setBounds(100,390,200,20);
         address.setFont(new Font("Raleway",Font.BOLD,22));
         add(address);
         pan=new JTextField();
         pan.setFont(new Font("Arial",Font.BOLD,20));
         pan.setBounds(300,390,400,30);
         add(pan);
         
         JLabel city=new JLabel("Adhaar No: ");
         city.setBounds(100,430,200,25);
         city.setFont(new Font("Raleway",Font.BOLD,20));
         add(city);
         adhar=new JTextField();
         adhar.setFont(new Font("Arial",Font.BOLD,20));
         adhar.setBounds(300,430,400,30);
         add(adhar);
         
         JLabel state=new JLabel("Senior Citizen: ");
         state.setBounds(100,475,200,20);
         state.setFont(new Font("Raleway",Font.BOLD,20));
         add(state);
         syes=new JRadioButton("Yes");
         syes.setBounds(300,475,80,30);
         syes.setBackground(Color.white);
         add(syes);
         sNo=new JRadioButton("No");
         sNo.setBounds(450,475,90,30);
         sNo.setBackground(Color.white);
         add(sNo);
          ButtonGroup citizenGroup=new ButtonGroup();
         citizenGroup.add(syes);
         citizenGroup.add(sNo);
         
         
         JLabel pincode=new JLabel("Existing Account: ");
         pincode.setBounds(100,515,200,25);
         pincode.setFont(new Font("Raleway",Font.BOLD,20));
         add(pincode);
        eyes=new JRadioButton("Yes");
         eyes.setBounds(300,515,80,30);
         eyes.setBackground(Color.white);
         add(eyes);
         eNo=new JRadioButton("No");
         eNo.setBounds(450,515,90,30);
         eNo.setBackground(Color.white);
         add(eNo);
          ButtonGroup accountGroup=new ButtonGroup();
         accountGroup.add(eyes);
         accountGroup.add(eNo);
         
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
         
         String Sreligion=(String)religion.getSelectedItem();
         String Scategory=(String)category.getSelectedItem();
         String Sincome=(String)salary.getSelectedItem();
         String Seducation=(String)education.getSelectedItem();
         String Soccupation=(String)occupation.getSelectedItem();
         String citizen=null;
         if(syes.isSelected()){
             citizen="Yes";
         }else if(eNo.isSelected()){
             citizen="No";
         }
         
         String exists=null;
         if(eyes.isSelected()){
             exists="Yes";
         }else if(eNo.isSelected()){
             exists="No";
         }
         String Span=pan.getText();
         String Sadhar=adhar.getText();
        
         
         try{
             if(Span.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is Required");
             }else{
                 Conn c=new Conn();
                 String query="insert into signuptwo values('"+formno+"', '"+Sreligion+"', '"+Scategory+"', '"+Sincome+"', '"+Soccupation+"', '"+Span+"', '"+Sadhar+"', '"+citizen+"', '"+exists+"')";
                 c.s.executeUpdate(query);
//                 System.out.println("insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+email+"', '"+maritial+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')");
                   setVisible(false);
                   new SignUpThree(formno);
             }
             
         }catch(Exception ea){
             ea.printStackTrace();
         }
         
     }
    
    
    public static void main(String[] args) {
        new SignUpTwo("");
    }
}
