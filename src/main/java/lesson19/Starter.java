package lesson19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Starter {

    public static void startGame(int number){

        System.out.println("Делай попытку, можно вводить числа от 0 до 1000!");

        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        EventPublisher publisher = context.getBean(EventPublisher.class);
        publisher.publish(data, number);

    }
}
