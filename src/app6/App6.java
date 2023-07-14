
/*
package app6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;


public class App6 {

    
    public static void main(String[] args) {
       // ArrayList a = new ArrayList();
       Set a=new HashSet();
        a.add(5);
        a.add(51);
        a.add(15);
        a.add(35);
        a.add(36);
        a.add(15);
        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
       
    }
    
}
//SET
package app6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class App6 {

    
    public static void main(String[] args) {
       // ArrayList a = new ArrayList();
       Set<Integer> a=new HashSet();
        a.add(5);
        a.add(51);
        a.add(15);
        a.add(35);
        a.add(36);
        a.add(15);
       a.removeIf(x ->(x<=15));
        System.out.println(a);
        
       
    }
    
}
//Dictionary
package app6;


import java.util.Dictionary;
import java.util.Hashtable;

public class App6 {

    
    public static void main(String[] args) {
       Dictionary<String,Integer> di=new Hashtable();
       di.put("Raja",87);
       di.put("Ishu",97);
       di.put("Reji",78);
        System.out.println(di);
        System.out.println(di.get("Ishu"));
        Dictionary<String,Object> s1=new Hashtable();
        s1.put("Name","Raja");
        s1.put("Age", 25);
        s1.put("City","Tenkasi");
        Dictionary<String,Object> s2=new Hashtable();
         s2.put("Name","Ishu");
        s2.put("Age", 20);
        s2.put("City","Tenkasi");
        Dictionary<String,Object> s3=new Hashtable();
        s3.put("Name","Priya");
        s3.put("Age", 24);
        s3.put("City","Chennai");
        Dictionary<String,Dictionary> std=new Hashtable();
        std.put("s1",s1);
        std.put("s2",s2);
        std.put("s3",s3);
        System.out.println(std);
    }
}*/
package app6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class App6 {

    
    public static void main(String[] args) {
       // ArrayList a = new ArrayList();
       Queue a=new LinkedList();
        a.add(5);
        a.add(51);
        a.add(15);
        a.add(35);
        a.add(36);
        a.add(15);
    
        System.out.println(a);
    }    
       
    }
    


