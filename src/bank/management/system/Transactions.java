
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balancenquiry,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,850);
        add(image);
        
        JLabel text = new JLabel("Please select your Trasaction");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);
        
         deposit = new JButton("Deposit");
        deposit.setBounds(170,390,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl = new JButton("Cash Withdraw");
        withdrawl.setBounds(355,390,150,30);
         withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,425,150,30);
         fastcash.addActionListener(this);
        image.add(fastcash);
        
         ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355,425,150,30);
         ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange = new JButton("PIN Change");
        pinchange.setBounds(170,460,150,30);
         pinchange.addActionListener(this);
        image.add(pinchange); 
        
         balancenquiry = new JButton("Balance Enquiry");
        balancenquiry.setBounds(355,460,150,30);
         balancenquiry.addActionListener(this);
        image.add(balancenquiry);
        
         exit = new JButton("Exit");
        exit.setBounds(170,495,150,30);
         exit.addActionListener(this);
        image.add(exit);
        
          
        setSize(900,850);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrawl){
             setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource() == fastcash){
             setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource() == pinchange){
             setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource() == balancenquiry){
             setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource() == ministatement){
            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Transactions("");
    }
    
}
