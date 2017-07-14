/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author wojton
 */
public class ThreadManager extends Thread
{
    JPanel ThreadPanel;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    JFrame JF;
    ThreadManager(JFrame JF, JPanel Panel)
    {
        ThreadPanel = Panel;
        this.JF = JF;
    }
    public void run()
    {
     // JFrame JF = new JFrame("BMI Calculator");
      //JF.setSize(300, 200);
      double startx = width*.37;
      int startx_int = (int)startx;
      double starty = height*.37;
      int starty_int = (int)starty;
     JF.setBounds(startx_int, starty_int, 300, 200);
     // JF.pack();
      JF.setResizable(false);
       
      JF.setDefaultCloseOperation(EXIT_ON_CLOSE);
      JF.add(ThreadPanel);
      JF.setVisible(true);
    }
}
