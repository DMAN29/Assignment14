package com.anudip.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "update agent set name='Dranjan' where id=18";
		String SQL = "select * from agent";
		Agentdao a1 = (Agentdao) context.getBean("a2");
		int st = a1.saveAgent(new Agent(11, "Aryan", "27%"));
		int st1= a1.updateAgent(new Agent(11,"Rohan","57%"));
		int st2=a1.deleteAgent(new Agent(11,"Rohan","57%"));
		System.out.println(st);
    }
}