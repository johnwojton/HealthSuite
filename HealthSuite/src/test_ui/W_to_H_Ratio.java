/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JohnW
 */
public class W_to_H_Ratio extends PanelParent implements ActionListener
{
    GridBagConstraints gbc = new GridBagConstraints();
    JLabel     Waist;
    JLabel     Height;
    JTextField EnterWaist;
    JTextField EnterHeight;
    JButton    Calculate;
    XMLFileController XML;
    double WaistInt;
    double HeightInt;
    JLabel Total;
    String Total_str;
    

    W_to_H_Ratio()
    {
        super();
        InitVar();
        
    }
    
    void InitVar()
    {
        Total_str = "Your Waist to  Height Ratio is: ";
        WaistInt = 0;
        HeightInt = 0;
        Total = new JLabel("");
        this.setBackground(Color.red);
        Waist  = new JLabel("Waist in Inches");
        Height = new JLabel("Height in Inches");
        EnterWaist = new JTextField("Waist");
        EnterHeight = new JTextField("Height");
        Calculate = new JButton("Calculate");
        
         gbc.gridx = 0;
         gbc.gridy = 0;
         this.add(Waist, gbc);
         
         gbc.gridx = 1;
         gbc.gridy = 0;
         this.add(EnterWaist, gbc);
         
         gbc.gridx = 0;
         gbc.gridy = 1;
         this.add(Height, gbc);
        
         gbc.gridx = 1;
         gbc.gridy = 1;
         this.add(EnterHeight, gbc);
         
         gbc.gridx = 0;
         gbc.gridy = 2;
         Calculate.addActionListener(this);
         this.add(Calculate);
               
         gbc.gridx = 0;
         gbc.gridy = 5;
         this.add(Total);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
      Object o = e.getSource();
      if(o == Calculate)
      {
          System.out.println("W_To_H Clicked");
           double total = 0;
           WaistInt = (double) Integer.parseInt(EnterWaist.getText());
           HeightInt = (double) Integer.parseInt(EnterHeight.getText());
           System.out.println("Stuff " + WaistInt + HeightInt);
           total = (double) ((WaistInt / HeightInt));
           System.out.println("Total: " + total);
           Total.setText(Total_str + total);
      }
    }
}
