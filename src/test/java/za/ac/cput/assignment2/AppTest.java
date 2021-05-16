//*
//Name:Sicelo
//Surname:Zitha
//Student Number:216140943
//Date:16 May 2021
//*
package za.ac.cput.assignment2;

import javafx.beans.binding.ListExpression;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Collection<String> names = new ArrayList<>();
    Map<Integer,String> map=new HashMap<Integer,String>();
    Set<String> sets = new HashSet<String>();
    List<String> list=new ArrayList<String>();

    @Test
    void getAddCollection() {
        //Testing to add to a collection
        //This test will pass
        names.add("Jason");
        names.add("Luke");

        System.out.println(names);
    }

    @Test
    void getRemoveCollection() {
        //Testing to remove an element in the collection
        //This test will pass
        names.add("Jason");
        names.add("Luke");

        names.removeIf(e -> e.startsWith("L"));

        System.out.println(names);
    }

    @Test
    void getFindCollection() {
        //Testing to find an element in the collection
        //This test will pass
        names.add("Jason");
        names.add("Luke");

        if (names.contains("Jason")) {
            System.out.println("Found Jason");
        } else {
            System.out.println("Could not find Jason");
        }
    }

    @Test
    void getAddMap() {
        //Testing to add to a map
        //This test will pass
        map.put(1,"Mega");
        map.put(2,"Jump");
        map.put(3,"Letter");
        map.put(4,"Jumbo");

        System.out.println(map);
    }

    @Test
    void getRemoveMap() {
        //Testing to remove an element in the map
        //This test will pass
        map.put(1,"Mega");
        map.put(2,"Jump");

        map.remove(2);

        System.out.println(map);
    }

    @Test
    void getFindMap() {
        //Testing to find an element in the map
        //This test will pass
        map.put(1,"Mega");
        map.put(2,"Jump");

        String values = map.get(1);

        System.out.println(values);
    }

    @Test
    void getAddSet() {
        //Testing to add to a set
        //This test will pass
        sets.add("Run");
        sets.add("On");

        System.out.println(sets);
    }

    @Test
    void getRemoveSet() {
        //Testing to remove an element in the set
        //This test will pass
        sets.add("Run");
        sets.add("On");
        sets.add("The");

        sets.remove("On");

        System.out.println(sets);
    }

    @Test
    void getFindSet() {
        //Testing to find an element in the set
        //This test will pass
        sets.add("Run");
        sets.add("On");
        sets.add("The");

        if (sets.contains("Run")) {
            System.out.println("Found Run");
        } else {
            System.out.println("Could not find Run");
        }
    }

    @Test
    void getAddList() {
        //Testing to add to a list
        //This test will pass
        list.add("Coffee");
        list.add("Tea");
        list.add("Juice");
        list.add("Soda");

        System.out.println(list);
    }

    @Test
    void getRemoveList() {
        //Testing to remove an element in the list
        //This test will pass
        list.add("Coffee");
        list.add("Tea");

        list.remove(1);

        System.out.println(list);
    }

    @Test
    void getFindList() {
        //Testing to find an element in the list
        //This test will pass
        list.add("Coffee");
        list.add("Tea");

        if (list.contains("Coffee")) {
            System.out.println("Found Coffee");
        } else {
            System.out.println("Could not find Coffee");
        }
    }
}