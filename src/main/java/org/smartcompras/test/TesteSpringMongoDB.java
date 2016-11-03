package org.smartcompras.test;

import org.smartcompras.dao.MarcaRepositoryImpl;
import org.smartcompras.dao.Repository;
import org.smartcompras.models.Marca;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesteSpringMongoDB {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Repository repository = context.getBean(MarcaRepositoryImpl.class);

		// repository.dropCollection();

		repository.createCollection();
		repository.saveObject(new Marca("3", "Surf"));
		System.out.println(repository.getAllObjects());
	}

}
