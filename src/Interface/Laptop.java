package Interface;
// interface is a blueprint of a class.
//till java7 interface can have only methods but not how it works
// after java8 we can implement methods in interface with default or static methods.
public interface Laptop {
public void copy();
    static void audio(){
        System.out.println("Audio should be in laptop");
    }// static is used to implement directly using the class and it can used by anybody not only the implemented classes

    void paste();

    void keyboard();

    default void security(){
        System.out.println("security is must");
    }// default is used to override a method is used by only the implemented classes
}
