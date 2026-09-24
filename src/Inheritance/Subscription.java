package Inheritance;

public class Subscription {
    String name;
    String TypeOf;
    Subscription(String name,String TypeOf){
        this.name=name;
        this.TypeOf=TypeOf;
    }
    public void ShowSubscription(){
        System.out.println("name"+name);
        System.out.println("Type of subscription"+TypeOf);
    }
}
