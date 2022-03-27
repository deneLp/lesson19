package lesson19;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    private int data;
    private int number;

    public Event(Object source, int data, int number){
        super(source);
        this.data = data;
        this.number = number;
    }

    public int getData() {
        return data;
    }

    public int getNumber() {
        return number;
    }


}
