/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@XmlRootElement
public class Login_Info 
{
    // @XmlElement(name="UserName")
    String UserName;
    // @XmlElement(name="Password")
    String Password;
    
 
    Login_Info()
    {
        UserName = "";
        Password = "";
    }
    public void setUserName(String UserName)
    {
        this.UserName = UserName;
    }
    public void setPassword(String Password)
    {
        this.Password = Password;
    }

     public String getUserName()
    {
       return this.UserName;
    }
    public String getPassword()
    {
       return this.Password;
    }
    
}
