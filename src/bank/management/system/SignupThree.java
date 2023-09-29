
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        JLabel type = new JLabel("Account Type: ");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
         r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
         r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
         r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
       groupaccount.add(r2);
       groupaccount.add(r3);
       groupaccount.add(r4);
       
       JLabel card = new JLabel("Card Number: ");
       card.setFont(new Font("Raleway", Font.BOLD, 22));
       card.setBounds(100,300,200,30);
       add(card);

       JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
       number.setFont(new Font("Raleway", Font.BOLD, 22));
       number.setBounds(330,300,300,30);
       add(number);
       
       JLabel carddetail = new JLabel("Your 16 Digits Card NUmber");
       carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
       carddetail.setBounds(100,330,300,30);
       add(carddetail);
       
       
       JLabel pin = new JLabel("PIN Number: ");
       pin.setFont(new Font("Raleway", Font.BOLD, 22));
       pin.setBounds(100,370,200,30);
       add(pin);
       
       JLabel pindetail = new JLabel("Your 4 Digits PIN");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
       pindetail.setBounds(100,400,300,30);
       add(pindetail);

       JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
       pnumber.setBounds(330,370,300,30);
       add(pnumber);
        
         JLabel services = new JLabel("Serivces Requried: ");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
       services.setBounds(100,450,200,30);
       add(services);
       
       c1 = new JCheckBox("ATM CARD");
       c1.setBackground(Color.WHITE);
       c1.setFont(new Font("Raleway",Font.BOLD,16));
       c1.setBounds(100,500,200,30);
       add(c1);
       
       c2 = new JCheckBox("Internet Banking");
       c2.setBackground(Color.WHITE);
       c2.setFont(new Font("Raleway",Font.BOLD,16));
       c2.setBounds(350,500,200,30);
       add(c2);
       
       c3 = new JCheckBox("Mobile Banking");
       c3.setBackground(Color.WHITE);
       c3.setFont(new Font("Raleway",Font.BOLD,16));
       c3.setBounds(100,550,200,30);
       add(c3);
       
       c4 = new JCheckBox("Email and SMS Alerts");
       c4.setBackground(Color.WHITE);
       c4.setFont(new Font("Raleway",Font.BOLD,16));
       c4.setBounds(300,550,200,30);
       add(c4);
       
       c5 = new JCheckBox("Check Book");
       c5.setBackground(Color.WHITE);
       c5.setFont(new Font("Raleway",Font.BOLD,16));
       c5.setBounds(100,600,200,30);
       add(c5);
       
       c6 = new JCheckBox("I Here by declare that the above provided detials are correct to the of my knowledge.");
       c6.setBackground(Color.WHITE);
       c6.setFont(new Font("Raleway",Font.BOLD,12));
       c6.setBounds(100,680,600,30);
       add(c6);
       
       submit = new JButton("Submit");
       submit.setBackground(Color.BLACK);
       submit.setBackground(Color.WHITE);
       submit.setFont(new Font("Raleway",Font.BOLD,14));
       submit.setBounds(250,720,100,30);
       submit.addActionListener(this);
       add(submit);
       
       cancel = new JButton("Cancel");
       cancel.setBackground(Color.BLACK);
       cancel.setBackground(Color.WHITE);
       cancel.setFont(new Font("Raleway",Font.BOLD,14));
       cancel.setBounds(420,720,100,30);
       cancel.addActionListener(this);
       add(cancel);
       
       
        getContentPane().setBackground(Color.white);
        setSize(850,820);
        setLocation(350,0);
        setForeground(Color.WHITE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
           
        
        if("Submit".equals(ae.getActionCommand())){
            

          String accountType = null;
          if(r1.isSelected()){
              accountType = "Saving Account";
          }else if(r2.isSelected()){
               accountType = "Fixed Deposit Account";
          }else if(r3.isSelected()){
              accountType = "Current Account";
          }else if(r4.isSelected()){
              accountType = "Recurring Deposit Account";
          }
          
          Random random = new Random();
          String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
          
           String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
           
           String facility = "";
           if(c1.isSelected()){
               facility = facility + " ATM Card";
           }else if(c2.isSelected()){
               facility = facility + " Internet Banking";
           }else if(c3.isSelected()){
               facility = facility + " Mobile Banking";
           }else if(c4.isSelected()){
               facility = facility + " EMAIL and SMS Alerts";
           }else if(c5.isSelected()){
               facility = facility + " Check Book";
           }
           
           try{
                
               if(accountType == null || accountType.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type is Requried");
                   
               }else {
                   
                   Conn conn = new Conn();
               String query1 = "INSERT INTO signupthree VALUES ('" + formno + "', '" + accountType + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility + "')";
                   conn.s.executeUpdate(query1);
                   
                   String query2 = "INSERT INTO login (formno, cardnumber, pinnumber) VALUES ('" + formno + "', '" + cardnumber + "', '" + pinnumber + "')";
                   conn.s.executeUpdate(query2);
                   
              
                  JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber+"\n PIN Number: "+ pinnumber);
                   
               }
               
               setVisible(false);
               new Deposit(pinnumber).setVisible(false);
               
           }catch(Exception e){
                
           System.out.println(e);
           }
        }else if(ae.getSource() == "Cancel"){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    public static void main(String args[]){
        new SignupThree("");
    }
}
