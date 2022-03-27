package lesson19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventListener implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
        boolean cont = true;
        if (event.getData() < event.getNumber()) {
            System.out.println("Мое число побольше твоего");
        } else if (event.getData() > event.getNumber()){
            System.out.println("Мое число меньше твоего");

        }else {
            System.out.println("Ты угадал, я загадал число " + event.getData());
            cont = false;
        }
        if (cont == true) {
            ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
            Starter starter = context.getBean(Starter.class);
            starter.startGame(event.getNumber());
        }
        //System.out.println(event.getData());
    }
}
