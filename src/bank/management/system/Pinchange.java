
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;


public class Pinchange extends JFrame implements ActionListener{
    JTextField pin,repin;
    JButton change,back;
    String pinnumber;
    Pinchange(String pinnumber){
        this.pinnumber=pinnumber;
        setSize(900,900);
        setLocation(300,0);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Change Your PIN");
        text.setBounds(170,300,400,40);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,35));
        image.add(text);
        
        JLabel pintext=new JLabel("New PIN");
        pintext.setBounds(165,360,180,25);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);
        
         pin=new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,360,180,25);
        image.add(pin);
        
        JLabel repintext=new JLabel("Re-Enter New PIN");
        repintext.setBounds(165,400,180,25);
        repintext.setForeground(Color.white);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);
        
         repin=new JTextField();
        repin.setFont(new Font("Raleway",Font.BOLD,22));
        repin.setBounds(330,400,180,25);
        image.add(repin);
        
         change=new JButton("Change");
        change.setBounds(355,485,150,30);
        image.add(change);
        change.addActionListener(this);
        
         back=new JButton("Back");
        back.setBounds(355,520,150,30);
        image.add(back);
        back.addActionListener(this);
        
        
        
       
        
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent re){
        if(re.getSource()==change){
             try {
            String npin= pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
         JOptionPane.showMessageDialog(null, "Password Mismatch!!!");
         return;

            }
            if(npin.equals("")){
     JOptionPane.showMessageDialog(null, "Please Enter PIN!!!");

                return;
            }
            Conn con=new Conn();
            String query1="update bank set pin = '"+rpin+"'where pin ='"+pinnumber+"'";
            String query2="update login set pin = '"+rpin+"'where pin ='"+pinnumber+"'";
            String query3="update signup3 set pin = '"+rpin+"'where pin ='"+pinnumber+"'";
            con.s.executeUpdate(query1);
            con.s.executeUpdate(query2);
            con.s.executeUpdate(query3);
            JOptionPane.showMessageDialog(null, "PIN changed successfully!!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }else{
            setVisible(false);
            new Transactions(pinnumber);
        }
       
    }
    public static void main(String[] args) {
        new Pinchange("");
    }
            
    
}
