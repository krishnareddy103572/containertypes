package com.ioccontainer.containertypes;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathResource classPathResource = new ClassPathResource("config.xml");
        XmlBeanFactory factory = new XmlBeanFactory(classPathResource);
        Employee emp = factory.getBean("employee",Employee.class);
        System.out.println(emp);
          
        
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Employee emp1 = context.getBean("employee",Employee.class);
       emp1.setId(12345);
       emp1.setName("Arjun");
       System.out.println(emp1);
    }
}
