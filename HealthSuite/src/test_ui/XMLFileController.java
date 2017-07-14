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


public class XMLFileController 
{
    XMLFileController()
    {
        
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
          
    }

