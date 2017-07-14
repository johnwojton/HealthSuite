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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JohnW
 */
public class BMI_Panel extends PanelParent implements ActionListener
{
    
    GridBagConstraints gbc = new GridBagConstraints();
    JLabel WeightText, HeightText, BMITotal;
    JButton CalcBMI;
    JTextField WeightField, HeightField;
    int Weight, Height;
    String Total_str = "Your total is:";
   BMI_Panel(MainPanel Parent)
   {
       super();
       this.Parent = Parent;
       InitAddToPanel();
       
   }
   
   void InitVar()
   {
       WeightText = new JLabel("Weight: ");
       HeightText = new JLabel("Height: ");
       CalcBMI    = new JButton("Calculate Bmi");
       WeightField= new JTextField("Weight");
       HeightField= new JTextField("Height");
       BMITotal   = new JLabel(Total_str);
       
   }
   void InitAddToPanel()
   {
        this.setBackground(Color.yellow);
        this.setVisible(true);
         InitVar();
         setLayout(new GridBagLayout());
         gbc.gridx = 0;
         gbc.gridy = 0;
     //    gbc.anchor = GridBagConstraints.LINE_START;
     //     gbc.fill = GridBagConstraints.HORIZONTAL;
         this.add(WeightText, gbc);
         
         gbc.gridx = 1;
         gbc.gridy = 0;
         this.add(WeightField, gbc);
         
         gbc.gridx = 0;
         gbc.gridy = 1;
         this.add(HeightText, gbc);
         
         gbc.gridx = 1;
         gbc.gridy = 1;
         this.add(HeightField, gbc);
         
         gbc.gridx = 0;
         gbc.gridy = 2;
         this.add(CalcBMI, gbc);
         WeightField.addActionListener(this);
         HeightField.addActionListener(this);
         CalcBMI.addActionListener(this);
         gbc.gridx = 0;
         gbc.gridy = 3;
         this.add(BMITotal, gbc);
         
   }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       Object o = e.getSource();
       if(o == CalcBMI)
       {
           int total = 0;
           Weight = Integer.parseInt(WeightField.getText());
           Height = Integer.parseInt(HeightField.getText());
           total = Weight * Height;
           BMITotal.setText(Total_str + total);
           System.out.println("Hello Dawg");
       }
        System.out.println((WeightField.getText()));
    }
}
