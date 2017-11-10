package vn.nguyen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.nguyen.config.AppConfig;
import vn.nguyen.model.User;
import vn.nguyen.services.UserService;

import java.util.List;

/**
 * Created by nals on 11/10/17.
 */
public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        // Add Persons
//        personService.add(new Person("Sunil", "Bora", "suni.bora@example.com"));
//        personService.add(new Person("David", "Miller", "david.miller@example.com"));
//        personService.add(new Person("Sameer", "Singh", "sameer.singh@example.com"));
//        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));

        // Get Persons
        List<User> users = userService.listUsers();
        System.out.println("*******************");
        for (User user : users) {
            System.out.println("username = "+user.getUsername());
            System.out.println("First Name = "+user.getFirstname());
            System.out.println("Last Name = "+user.getLastname());
            System.out.println("Email = "+user.getEmail());
            System.out.println();
        }

        context.close();
    }
}
