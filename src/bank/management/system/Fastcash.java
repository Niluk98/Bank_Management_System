/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{
      JButton deposit,withdrawl,fastcash,miniStatement,pinchange,Balance,exit;
      String pinnumber;
    public Fastcash(String pinnumber) {
        this.pinnumber=pinnumber;
        setSize(900,900);
        setLocation(300, 0);
        setLayout(null);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i1= image.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel i3=new JLabel(i2);
        i3.setBounds(0,0,900,900);
        add(i3);
        
        JLabel text=new JLabel("Select Withdrawl Amount");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        i3.add(text);
        setUndecorated(true);

         deposit=new JButton("Rs. 100");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        i3.add(deposit);
        
         withdrawl=new JButton("Rs. 500");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        i3.add(withdrawl);
        
         fastcash=new JButton("Rs. 1000");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        i3.add(fastcash);
        
         miniStatement=new JButton("Rs. 2000");
        miniStatement.setBounds(355,450,150,30);
        miniStatement.addActionListener(this);
        i3.add(miniStatement);
        
          pinchange=new JButton("Rs. 5000");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        i3.add(pinchange);
        setVisible(true);
        
         Balance=new JButton("10000");
        Balance.setBounds(355,485,150,30);
        Balance.addActionListener(this);
        i3.add(Balance);
        setVisible(true);
        
        exit=new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        i3.add(exit);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        int amount=0;
        Date date=new Date();
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            
            amount=100;
        }else if(ae.getSource()==withdrawl){
            amount=500;
        }else if(ae.getSource()==fastcash){
            amount=1000;
        }else if(ae.getSource()==miniStatement){
            amount=2000;
        }else if(ae.getSource()==pinchange){
            amount=5000;
        }else if(ae.getSource()==Balance){
            amount=10000;
        }
//     String query="insert into bank values ('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
      Conn con=new Conn();
//                String query="insert into bank values ('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
               try {
                    Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            if (balance<amount) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "Amount Wihtdrawl Successfull");
               String query1="insert into bank values ('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
               c.s.executeUpdate(query1);
               new Transactions(pinnumber);

            }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            
    }
    public static void main(String[] args) {
        new Fastcash("");
    }
    
}
