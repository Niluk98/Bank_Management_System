
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton Withdraw,back;
    String pinnumber;
    Withdrawl(String pinnumber){
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
        setUndecorated(true);
        
        JLabel text=new JLabel("Enter the Amount to Withdraw");
        text.setBounds(170,300,400,20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
         Withdraw=new JButton("Withdraw");
        Withdraw.setBounds(355,485,150,30);
        image.add(Withdraw);
        Withdraw.addActionListener(this);
        
         back=new JButton("Back");
        back.setBounds(355,520,150,30);
        image.add(back);
        back.addActionListener(this);
        
        
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent re){
        if(re.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber);
        }else if(re.getSource()==Withdraw){
            String number=amount.getText();
            Date date=new Date();
            
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Amount");
                
            }else{
//                 String numb = ((JButton)re.getSource()).getText().substring(3); //k
                 
                 
                 
                 try {
                    Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("mode").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            if (balance<Integer.parseInt(number)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "Amount Wihtdrawl Successfull");
               String query="insert into bank values ('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
               c.s.executeUpdate(query);
               new Transactions(pinnumber);

            }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                     
                 
            
            }
        }
    }
    public static void main(String[] args) {
        new Withdrawl("");
    }
            
    
}
