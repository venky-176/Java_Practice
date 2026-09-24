package Abstraction;
//It's a class which contains only abstract methods.defined with abstract keyword
//unimplemented methods are known as abstract methods
// Abstraction is a process of hiding implementation and showing only functionality.
public abstract class AbstractClass implements MainPhase{
    abstract  public void Execute();
    //we can't initialize a method without implementation in abstract class, but if we want to we should make it into abstract method
    public void copy(){
        System.out.println("Copying");
    }
    //we can only put abstract methods inside a abstracta class.
    //we can't create an instance for a abstract class.
    abstract public void paste();
    public abstract void keyboard();
}
