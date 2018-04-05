package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by uruckcharti on 5/4/2018 AD.
 */
public class ClassRoster
    {
    HashMap<String,String> roster = new HashMap<String,String>();

    public void addStudent(String id, String name)
    {
        roster.put(id,name);
    }
    public String searchByKey(int id)
    {
        if(roster.containsKey(id))
        {
            return roster.get(id);
        }
        else
        {
            return "Student Not Found";
        }
    }
    public void printClass(){
        Iterator<String> keySet = roster.keySet().iterator();
        while(keySet.hasNext())
        {
            String key = keySet.next();
            System.out.println("key: " + key + " value: " + roster.get(key));
        }
    }
    public void removeStudent(String id){
        roster.remove(id);
    }
    public void sortList(){
        TreeMap sortedList = new TreeMap(roster);
        Iterator<String> keySet = sortedList.keySet().iterator();
        while(keySet.hasNext())
        {
            String key = keySet.next();
            System.out.println("key: " + key + " value: " + sortedList.get(key));
        }
    }
}
