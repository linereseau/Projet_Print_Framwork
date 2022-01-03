package com.ecoalis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ecoalis.model.DemandeConge;

public class TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Resource resource = new ClassPathResource("applicationContext.xml");
		     BeanFactory factory =  new XmlBeanFactory (resource);
			
			  //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			  DemandeConge demandeConge = (DemandeConge) factory.getBean("demandeConge");
			  System.out.println(demandeConge);
			  
			  DemandeConge demandeConge2 = (DemandeConge) factory.getBean("demandeConge");
			  System.out.println(demandeConge2);
		   }
	

}
