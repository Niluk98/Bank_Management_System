/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener{
      JButton deposit,withdrawl,fastcash,pinchange,Balance,exit;
      String pinnumber;
    public Transactions(String pinnumber) {
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
        
        JLabel text=new JLabel("Please select your Transactions");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        i3.add(text);
        setUndecorated(true);

         deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        i3.add(deposit);
        
         withdrawl=new JButton("Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        i3.add(withdrawl);
        
         fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        i3.add(fastcash);
        
//         miniStatement=new JButton("Mini Statement");
//        miniStatement.setBounds(355,450,150,30);
//        miniStatement.addActionListener(this);
//        i3.add(miniStatement);
        
          pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        i3.add(pinchange);
        setVisible(true);
        
         Balance=new JButton("Balance Enquiry");
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
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber);
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new Fastcash(pinnumber);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber);
        }else if(ae.getSource()==Balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber);
        }
            
    }
    public static void main(String[] args) {
        new Transactions("");
    }
    
}
