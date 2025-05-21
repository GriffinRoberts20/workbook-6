package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        for(Person p:myFamily) System.out.println(p);

        Collections.sort(myFamily);

        System.out.println();
        for(Person p:myFamily) System.out.println(p);

    }
}
