/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author wojton
 */
public class RightMenuPanel extends PanelParent implements ActionListener
{
    GridBagConstraints gbc = new GridBagConstraints();
    JButton BMI;
    JButton WtHRatio;
    JButton BFP;
    JButton BMR;
    W_to_H_Ratio WTH; 
   
    RightMenuPanel(MainPanel Parent)
    {
              this.Parent = Parent;
          Parent.JF.setSize(700, 700);
          
        this.setBackground(Color.BLACK);
        this.setVisible(true);
       InitVar();
    }
    private void InitVar()
    {
         BMI = new JButton("BMI");
        WtHRatio = new JButton("Waist to Height Ratio");
        BFP = new JButton("Body Fat Percentage");
        BMR = new JButton("Basal Metabolic Rate");
      //  Parent.setSize(700, 700);
         setLayout(new GridBagLayout());
         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.anchor = GridBagConstraints.LINE_START;
          gbc.fill = GridBagConstraints.HORIZONTAL;
         this.add(BMI, gbc);
         gbc.gridx = 0;
         gbc.gridy = 1;
          gbc.anchor = GridBagConstraints.LINE_END;
           gbc.fill = GridBagConstraints.HORIZONTAL;
         this.add(WtHRatio, gbc);
         gbc.gridx = 0;
         gbc.gridy = 2;
         this.add(BFP, gbc);
         gbc.gridx = 0;
         gbc.gridy = 3;
         this.add(BMR, gbc);
         
         WtHRatio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
          {
              System.out.print("trying to push buttons");
              Object o = e.getSource();
              if(o == WtHRatio)
              {
               WTH = new W_to_H_Ratio();
               Parent.Change_A_Panel(WTH, "Center");  //somethings is wrong!
               System.out.println("PUSHed!");
              }
          }
  
   
}
