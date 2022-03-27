import lesson19.EventPublisher;
import lesson19.Starter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        number = new Random().nextInt(1000);

        System.out.println("Привет, я загадал число, попробуй его отгадать!");
        System.out.println("//////////////////" + number);

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Starter starter = context.getBean(Starter.class);
        starter.startGame(number);


    }
}
