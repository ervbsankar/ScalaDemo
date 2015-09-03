package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSort {
    static public void main(String args[]){
        ObjectOrdering nameArray[] = {
                new ObjectOrdering("Sankar", "Edala"),
                new ObjectOrdering("Rama", "Edala")
        };

        List<ObjectOrdering> lists = new ArrayList<ObjectOrdering>();
        lists.add(new ObjectOrdering("Sankar","Edala"));
        lists.add(new ObjectOrdering("Bhimeswara", "Edala"));

        List<ObjectOrdering> names = Arrays.asList(nameArray);
        /*System.out.println(Arrays.asList(nameArray));*/
        /*Collections.sort(names);*/
        Collections.sort(lists);
        /*System.out.println(names);*/
        System.out.println(lists);
    }
}
