/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import javax.swing.JFrame;
import test_ui.LoginPanel;
import test_ui.MainPanel;
import test_ui.ThreadManager;

/**
 *
 * @author JohnW
 */
public class HealthSuite {

    /**
     * @param args the command line arguments
     */
    static ThreadManager TM[] = new ThreadManager[100];
    public static void main(String[] args) {
        // TODO code application logic here
        
           
        JFrame JF = new JFrame("BMI");
        MainPanel MainPanel;
        LoginPanel Login;
        
            Login = new LoginPanel();
            MainPanel = new MainPanel(JF, Login, "Log in");
            Login.setParent(MainPanel);
            TM[0] = new ThreadManager(JF,MainPanel);
            TM[0].start();
        
    }
    
}
