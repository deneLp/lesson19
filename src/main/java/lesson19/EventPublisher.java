package lesson19;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EventPublisher implements ApplicationContextAware {

    private ApplicationContext context;

    public void publish(int data, int number){
        context.publishEvent(new Event(context, data, number));

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
