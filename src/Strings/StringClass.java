package Strings;

public class StringClass {
    static void main(String[] args) {
        String s1= "Venkat";
        String mail="venkatgo345@gmail.com";
        System.out.println(s1+mail);
        String obj = new String("hello");// new object is created and stored in it
        String obj1="hello"; // It's stored in stringpool
        String obj2="hello";
        System.out.println(obj==obj1);
        //returns false cause it checks whether the 2 objects are same or not
        System.out.println(obj1==obj2); // returns true cause they both are stored in same string pool
        System.out.println(obj.equals(obj1));// checks whether the data is same or not
        /*boolean values
        * startsWith(" ")
        * endsWith(" ")
        * contains(" ")
        * equals(" ")
        * equalsIgnoreCase(" ")
        * outvalues
        * length()
        * trim() spaces on either the ends
        * toLower()
        * toUpper()
        * char[] ch= obj1.toCharArray()
        * finding
        * indexOf(" ") -1 if it can't find index
        * lastIndexOf(" ") gives the last index where character exists
        * substring(beg,last)
        * split()
        * replace("ch","ch") replaces all characters
        * */

    }
}
