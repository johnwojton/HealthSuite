/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JohnW
 */
public class W_to_H_Ratio extends PanelParent
{
    GridBagConstraints gbc = new GridBagConstraints();
    JLabel     Waist;
    JLabel     Height;
    JTextField EnterWaist;
    JTextField EnterHeight;
    JButton    Calculate;
    XMLFileController XML;

    W_to_H_Ratio()
    {
        super();
        InitVar();
        
    }
    
    void InitVar()
    {
        this.setBackground(Color.red);
        Waist  = new JLabel("Enter Waist Measurement");
        Height = new JLabel("Enter Height Measurement");
        EnterWaist = new JTextField("Waist");
        EnterHeight = new JTextField("Height");
        Calculate = new JButton("Calculate");
    }
}
