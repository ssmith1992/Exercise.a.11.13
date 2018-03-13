package Chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if
no two keys map to the same value (and false if any two or more keys do map to the same value). For example, if
the map contains the following key/value pairs, your method would return true: {Marty=Stepp, Stuart=Reges,
Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would return false,
because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
Bruce=Reges, Hal=Perkins}.
 */
public class Exercise13 {
    //Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if
    //no two keys map to the same value (and false if any two or more keys do map to the same value). For example, if
    //the map contains the following key/value pairs, your method would return true: {Marty=Stepp, Stuart=Reges,
    //Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would return false,
    //because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
    //Bruce=Reges, Hal=Perkins}.

    public static void main(String[] args)
    {
        Map<String, String> list1 = new HashMap<>();
        list1.put("Marty", "Stepp");
        list1.put("Stuart", "Reges");
        list1.put("Jessica", "Miller");
        list1.put("Amanda", "Camp");
        list1.put("Hal", "Perkins");

        Map<String, String> list2 = new HashMap<>();
        list2.put("Kendrick", "Perkins");
        list2.put("Stuart", "Reges");
        list2.put("Jessica", "Miller");
        list2.put("Bruce", "Reges");
        list2.put("Hal", "Perkins");

        Exercise13 exercise13 = new Exercise13();
        System.out.println(exercise13.isUnique(list1));
        System.out.println(exercise13.isUnique(list2));
    }

    private boolean isUnique(Map<String, String> list)
    {
        if (list.size() <= 1) return false;
        else
        {
            Set<String> set = new HashSet<>(list.values());

            return set.size() >= list.size();
        }
    }
}
