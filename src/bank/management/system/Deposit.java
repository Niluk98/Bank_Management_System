
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber){
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
        
        JLabel text=new JLabel("Enter the Amount to Deposit");
        text.setBounds(170,300,400,20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
         deposit=new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        image.add(deposit);
        deposit.addActionListener(this);
        
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
        }else if(re.getSource()==deposit){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Amount");
                
            }else{
                Conn con=new Conn();
                String query="insert into bank values ('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                try {
                    con.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Amount "+number+" Deposited Successfully!!");
                    setVisible(false);
                    new Transactions(pinnumber);
                } catch (SQLException ex) {
//                    Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
                     ex.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
            
    
}
