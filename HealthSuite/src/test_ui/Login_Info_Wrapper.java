/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JohnW
 */
@XmlRootElement
public class Login_Info_Wrapper 
{
    // @XmlElement(name="List")
   public List<Login_Info> Login_List; 
    Login_Info_Wrapper()
    {
       Login_List =  new ArrayList<Login_Info>();
    }
    
    
    
}
