/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

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
   
    }
    public void setParent(MainPanel Parent)
    {
        this.Parent = Parent;
    }
}
