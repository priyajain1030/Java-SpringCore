package com.mailsender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  
    	  ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
         
         Mailer m=(Mailer)context.getBean("mailMail");  
         String sender="priyajain.kumari1030@gmail.com";//write here sender gmail id  
         String receiver="saikumar@digital-lync.com";//write here receiver id  
         m.sendMail(sender,receiver,"hi","welcome");  
          
         
    }
    
}
