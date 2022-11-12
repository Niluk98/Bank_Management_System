/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*; //x->extended
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
/**
 *
 * @author nilpa
 */
public class Login extends JFrame implements ActionListener{
     JButton login,clear,signUp;
     JTextField cardTextField;
             JPasswordField pinField;
    public Login() {
        setTitle("AUTOMATIC TELLER MACHINE");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10, 100,100);
        add(label);
        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward",Font.BOLD,30));
        add(text);
        
        JLabel cardno=new JLabel("Card No.");
        cardno.setBounds(120,150,150,40);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        add(cardno);
         cardTextField=new JTextField();
         cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        cardTextField.setBounds(300, 150,230 , 28);
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN");
        pin.setBounds(120,220,150,40);
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        add(pin);
         pinField=new JPasswordField();
         pinField.setFont(new Font("Arial",Font.BOLD,14));

        pinField.setBounds(300, 220,230 , 28);
        add(pinField);
        
        
         login=new JButton("Sign In");
        login.setBounds(300,300,100,30);
        add(login);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        
        
        clear=new JButton("Clear");
        clear.setBounds(430,300,100,30);
        add(clear);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        
         signUp=new JButton("Sign Up");
        signUp.setBounds(300,350,230,30);
        add(signUp);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==clear){
            cardTextField.setText("");
            pinField.setText("");
            
        }else if(e.getSource()==login){
            setVisible(false);
            Conn con=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinField.getText();
            String query="select * from login where card_no ='"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                 ResultSet rs=con.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     new Transactions(pinnumber);
                 }
            }catch(Exception ea){
                ea.printStackTrace();
            }
        }else if(e.getSource()==signUp){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        new Login();
        
    }
}
