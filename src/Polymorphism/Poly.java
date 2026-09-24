package Polymorphism;

class Chatbot {
    public void respond(){
        System.out.println("hello! how can I assist you");
    }
}
class SassyBot extends Chatbot{
    @Override
    public void respond() {
        System.out.println("Hello I give funny responses");
    }
}
class MotivationBot extends Chatbot{
    @Override
    public void respond(){
        System.out.println("I give motivational response");
    }
}
public class Poly{
    static void main(String[] args) {
        MotivationBot mb = new MotivationBot();
        SassyBot sb= new SassyBot();
        mb.respond();
        sb.respond();
        Chatbot cb= new MotivationBot();
        cb.respond();
    }
}
