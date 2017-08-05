/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author wojton
 */
public class PanelParent extends JPanel
{
   public MainPanel Parent;
    PanelParent()
    {
        this.setVisible(true);
        this.setBackground(Color.red);
        this.setSize(100, 100);
    }
    public void setParent(MainPanel Parent)
    {
        this.Parent = Parent;
    }
}
