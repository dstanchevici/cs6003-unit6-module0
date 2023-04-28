import java.util.*;

class Person implements Comparable {

    String name;

    public Person (String name)
    {
        this.name = name;
    }

    public String toString ()
    {
        return name;
    }

    public int compareTo (Object obj)
    {
        return name.compareTo( ((Person)obj).name );
    }
} // End of Person

public class SortExample {

    public static void main (String[] argv)
    {
        ArrayList<Person> folks = new ArrayList<>();
        folks.add (new Person("Luke"));
        folks.add (new Person("Chewbacca"));
        folks.add (new Person("Han"));
        folks.add (new Person("Leia"));
        folks.add (new Person("Obiwan"));
        folks.add (new Person("Finn"));

        Collections.sort (folks);
        System.out.println(folks);
    }
}
