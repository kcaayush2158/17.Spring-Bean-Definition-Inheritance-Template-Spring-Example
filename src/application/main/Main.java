package application.main;

import application.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       Employee employee = (Employee) context.getBean("employee");
       System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNo());
context.close();
    }
}
