//object - An object is an entity with state and behaviour.
/*class - A class is a collection of objects with similar attributes. It’s a blueprint or
template from which objects are made.
Class is a blueprint which contains methods and variables information.
-> Method is block of code to perform a certain task or operation and return a result.
-> We can't access non-static data from static method, we can access it only by crating a objects.
-> Void isn't a data type, it's a reserved keyword.
*/
/* Constructors: A constructor in Java is a block of code that is comparable to a
method. When a new instance of the class is created, the constructor is invoked. It is
only when the constructor is invoked that memory for the object is allocated.*/
import java.io.*;
class Person
{
    int unique_id;
    String name;
    int age;
    String city;
    String gender;
    Person()
    {
        unique_id = 0;
        name = "";
        age = 0;
        city = "";
        gender = "";
    }
    Person(int _id, String _name, int _age, String _city, String _gender)
    {
        unique_id = _id;
        name = _name;
        age = _age;
        city = _city;
        gender = _gender;
    }
}
class Test
{

    public static void main(String args[])throws IOException
    {
        Person obj1 = new Person(1, "Parsoon", 25, "Delhi", "male");
        Person obj2 = new Person(2, "Purva", 28, "Goa", "female");
        System.out.println(obj2);
    }
}
