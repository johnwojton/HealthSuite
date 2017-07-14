/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JohnW
 */
public class BMI_Panel extends PanelParent
{
    
    GridBagConstraints gbc = new GridBagConstraints();
    JLabel WeightText, HeightText, BMITest;
    JButton CalcBMI;
    JTextField WeightField, HeightField;
    int Weight, Height;
    
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
         
         gbc.gridx = 2;
         gbc.gridy = 2;
         this.add(CalcBMI, gbc);
         
   }
}
