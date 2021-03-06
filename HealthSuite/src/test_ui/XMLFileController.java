/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
package test_ui;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;


public class XMLFileController 
{
    int x = 0;
   static Login_Info_Wrapper LIW;
   static List<Login_Info> CustomerArray;
  
    XMLFileController()
    {
        LIW = new Login_Info_Wrapper();
         CustomerArray = new ArrayList<Login_Info>();
         
        
    }
    public static void XMLWrite(UserInformation customer, String FileName)
    {
        try {

        File file = new File(FileName);
        JAXBContext jaxbContext = JAXBContext.newInstance(UserInformation.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(customer, file);
        jaxbMarshaller.marshal(customer, System.out);

          } catch (JAXBException e) {
          }

    }
    public static UserInformation XMLReader(String FileName) throws JAXBException
    {
            JAXBContext jc = JAXBContext.newInstance(UserInformation.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        UserInformation USERInfo;
        USERInfo = (UserInformation) unmarshaller.unmarshal(new File(FileName));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(USERInfo, System.out);
        System.out.println(USERInfo.Name);
        System.out.println(USERInfo.age);
       return USERInfo;
    }
     public static Login_Info XMLLoginReader(String FileName) throws JAXBException
    {
            JAXBContext jc = JAXBContext.newInstance(Login_Info.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Login_Info Login;
        Login = (Login_Info) unmarshaller.unmarshal(new File(FileName));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(Login, System.out);
       return Login;
    }
     
         public static void XMLLoginWrite(Login_Info customer, String FileName)
    {
        try {

        File file = new File(FileName);
        JAXBContext jaxbContext = JAXBContext.newInstance(Login_Info.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(customer, file);
        jaxbMarshaller.marshal(customer, System.out);

          } catch (JAXBException e) {
          }

    }
         
         
         
         
          public static void XMLLoginWrite_TEST(Login_Info_Wrapper customer, String FileName)
    {
        try {

        File file = new File(FileName);
        JAXBContext jaxbContext = JAXBContext.newInstance(Login_Info_Wrapper.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(customer, file);
        jaxbMarshaller.marshal(customer, System.out);

          } catch (JAXBException e) 
          
          {
              
             System.out.println(e.getLocalizedMessage());
          }

    }
         
         
         
          public static void XMLLoginArray(Login_Info customer)
    {
       int Length;
       Length = CustomerArray.size();
       LIW.Login_List.add(customer);
       CustomerArray.add(customer);
       
       

    }

          
}

