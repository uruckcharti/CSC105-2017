package hashmap;

import java.io.File;
import java.util.Scanner;

/**
 * Created by uruckcharti on 5/4/2018 AD.
 */
public class Lab10 {
    public static void main(String[] args) throws Exception
    {
        ClassRoster cr = new ClassRoster();
        Scanner sc = new Scanner(new File("CSC105_namelist_for_Hashmap.txt"));
        String id;
        String name;
        while (sc.hasNext())
        {
            id = sc.next();
            name = sc.next();
            cr.addStudent(id,name);
        }
        Scanner menu = new Scanner(System.in);
        int cases = menu.nextInt();
        System.out.println("choose your program");
        System.out.println("Press 1 to add student");
        System.out.println("Press 2 to search");
        System.out.println("Press 3 to Printout");
        switch (cases){
            case 1:
                System.out.println("who you want to add");
                id = sc.next();
                name = sc.next();
                cr.addStudent(id, name);
        }

    }
}
