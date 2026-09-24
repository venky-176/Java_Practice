package Inheritance;

public class Premsubscription extends Subscription{
    Premsubscription(String name, String TypeOf) {
        super(name, TypeOf);
    }

    void Download(){
        System.out.println("Premium subscribers can download content");
    }
}
