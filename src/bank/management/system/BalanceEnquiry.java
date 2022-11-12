
package bank.management.system;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    String pinnumber;
    JButton back;
    public BalanceEnquiry(String pinnumber) {
        this.pinnumber=pinnumber;
        setSize(900,900);
        setLocation(00,300);
        setLayout(null);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        image.add(back);
        back.addActionListener(this);
        int balance=0;
        try {
            Conn con=new Conn();
            
            String query="select* from bank where pin = '"+pinnumber+"'";
            ResultSet rs=con.s.executeQuery(query);
                 if(rs.next()){
                     if(rs.getString("type").equals("Deposit")){
                         balance+=Integer.parseInt(rs.getString("amount"));
                     }else{
                         balance-=Integer.parseInt(rs.getString("amount"));
                     }
                 }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JLabel bal=new JLabel("Your Current Account Balance is"+balance);
        bal.setForeground(Color.white);
        bal.setBounds(170,300,400,30);
        image.add(bal);
        
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent as){
        setVisible(false);
        new Transactions(pinnumber);
    }
    
    
    
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
    
}
