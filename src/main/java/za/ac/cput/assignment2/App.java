//*
//Name:Sicelo
//Surname:Zitha
//Student Number:216140943
//Date:16 May 2021
//*
package za.ac.cput.assignment2;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Collection<String> names = new ArrayList<>();

            names.add("Jason");
            names.add("George");
            names.add("Ally");
            names.add("Rick");
            names.add("Amber");

            names.removeIf(e -> e.startsWith("G"));

            System.out.println(names);

            if (names.contains("Jason")) {
                System.out.println("Found Jason");
            } else {
                System.out.println("Could not find Jason");
            }

        Map<Integer,String> map=new HashMap<Integer,String>();

            map.put(1,"Mega");
            map.put(2,"Jump");
            map.put(3,"Letter");
            map.put(4,"Jumbo");

            map.remove(3);

            System.out.println(map);

            String values = map.get(1);
            System.out.println(values);

        Set<String> sets = new HashSet<String>();

            sets.add("Run");
            sets.add("On");
            sets.add("The");
            sets.add("Way");
            sets.add("To");

            System.out.println(sets);

            sets.remove("On");
            System.out.println(sets);

            if (sets.contains("Run")) {
                System.out.println("Found Run");
            } else {
                System.out.println("Could not find Run");
            }

        List<String> list=new ArrayList<String>();

            list.add("Coffee");
            list.add("Tea");
            list.add("Juice");
            list.add("Soda");

            System.out.println(list);

            list.remove(1);

            System.out.println(list);
    }
}
