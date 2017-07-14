/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterPanel extends PanelParent implements ActionListener
{
    GridBagConstraints gbc = new GridBagConstraints();
    JLabel     UserNameLabel;
    JLabel     PasswordLabel;
    JTextField EnterUserName;
    JTextField EnterPassword;
    JButton    Back;
    JButton    Register;
    XMLFileController XML;

    RegisterPanel()
    {
       setLayout(new GridBagLayout());
        //this.setBackground(Color.yellow);
        this.setVisible(true);
        InitVar();
        
                
              
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.LINE_END;
                this.add(UserNameLabel, gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.anchor = GridBagConstraints.LINE_START;
                this.add(EnterUserName, gbc);
                     
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.ipadx = 0;
                gbc.anchor = GridBagConstraints.LINE_END;
                this.add(PasswordLabel, gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 50;
                gbc.anchor = GridBagConstraints.LINE_START;
                this.add(EnterPassword, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.LINE_END;
                gbc.gridwidth = 2;
                this.add(Back, gbc);
               
                gbc.gridx = 0;
                gbc.gridy = 3;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.LINE_END;
                gbc.gridwidth = 2;
                this.add(Register, gbc);
    }
     void InitVar()
     {
           UserNameLabel = new JLabel("User Name");
           PasswordLabel = new JLabel("Password");
           EnterUserName = new JTextField();
           EnterPassword = new JTextField();
           Back          = new JButton("Back");
           Register      = new JButton("Register Profile");
           XML           = new XMLFileController();
           
           Back.addActionListener(this);
           Register.addActionListener(this);
        
     }
   

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        Object O = ae.getSource();
        if(O == Back)
        {
            LoginPanel LP = new LoginPanel();
            LP.setParent(Parent);
            Parent.SetCurrentPanel(LP, "Log In", 0, 0, "Center" );
            LP.Parent.JF.setSize(300, 200);
 
        }
        else if(O == Register)
        {
            UserInformation NewCustomer = new UserInformation();
            NewCustomer.setUserName(this.EnterUserName.getText());
            NewCustomer.setPassword(this.EnterPassword.getText());
            System.out.println(NewCustomer.getUserName());
             System.out.println(NewCustomer.getPassword());
              String location = System.getProperty("user.dir") + "\\UserData\\";//RegisterPanel.class.getProtectionDomain().getCodeSource().getLocation();
              System.out.println(location);
              
        }
         
    }
}
