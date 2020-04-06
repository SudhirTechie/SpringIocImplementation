package com.sudhir.SpringIoc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Sudhir
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	
    	//Since Bean Factory is now deprectated so we will see how to implement the advance version 
    	//ApplicationContext now Comes into Picture
    	//I am commenting BeanFactory and same function we can see using ApplicationContext
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	State state = (State)context.getBean("state");
        state.name();
    }
}
