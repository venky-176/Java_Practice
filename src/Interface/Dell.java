package Interface;
//A class must implements all the methods in the interface
public class Dell implements Laptop{
    @Override
    public void copy() {
        System.out.println("Dell copy");
    }
    @Override
    public void paste() {
        System.out.println("Dell paste");
    }
    @Override
    public void keyboard() { System.out.println("Dell keyboard");}
    public void Quality(){
        System.out.println("Dell quality");
    }
    public void security() {
        System.out.println("Dell's security");
    }
}

