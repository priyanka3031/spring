package com.spring.spring_di2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("configure.xml");
        
        JavaTrainer jt=(JavaTrainer)ctx.getBean("javat");
        System.out.println(jt);
        System.out.println(jt.getName());
           
        SqlTrainer st=(SqlTrainer)ctx.getBean("sqlt");
        System.out.println(st);
        System.out.println(st.getName());
        
        WebTrainer wt=(WebTrainer)ctx.getBean("webt");
        System.out.println(wt);
        System.out.println(wt.getName());
       
     }
}
 