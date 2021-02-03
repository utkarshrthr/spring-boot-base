package app.utk.boot.config;

import app.utk.boot.models.Address;
import app.utk.boot.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    /* If we create a class using @Component with same name as 'commandLineRunner1' the following bean will not get loaded,
       and application will not start i.e. @Component gets priority over @Bean */
    /* @Bean
    public CommandLineRunner commandLineRunner1(){
        return (args) -> {
            System.out.println("COMMAND LINE RUNNER 1");
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner2(){
        return (args) -> {
            System.out.println("COMMAND LINE RUNNER 2");
        };
    } */

    @Bean
    @Scope("singleton")
    public User user(){
        User newUser = new User();
        newUser.setAddress(new Address());
        return newUser;
    }

    @Bean
    @Scope("prototype")
    public Address address(){
        return new Address();
    }

    /*@Bean(initMethod = "startup")
    @Scope("singleton")
    public User user2(){
        return new User();
    }*/
}
