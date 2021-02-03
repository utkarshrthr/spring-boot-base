package app.utk.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootConceptsApplication implements CommandLineRunner, ApplicationRunner {

	/* CommandLineRunner, ApplicationRunner -> can execute any task just before spring boot finishes its startup */

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		// 'run' method returns instance of 'ConfigurableApplicationContext'
		applicationContext = SpringApplication.run(SpringBootConceptsApplication.class, args);

		for(String beanName: applicationContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
		//System.out.println(applicationContext.getBean("user"));
	}

	@Override
	public void run(ApplicationArguments args) throws Exception { // runs first
		// can be used to read the arguments in key-value pair
		System.out.println("INSIDE APPLICATION RUNNER");
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());
		for (String option: args.getOptionNames()){
			System.out.println(option + " -> " + args.getOptionValues(option));
		}

		// this code is executed before run method
		/*for(String beanName: applicationContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}*/
	}

	@Override
	public void run(String... args) throws Exception { // here we can access command line arguments
		System.out.println("INSIDE COMMAND LINE RUNNER");
		//System.out.println(Arrays.toString(args));
	}
}
