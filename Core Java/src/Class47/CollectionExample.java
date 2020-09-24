package Class47;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExample {

    public static void main(String[] args) {
        /*
        List allows duplicate values
         */
        List l = new LinkedList();
        l.add("List: angel");
        l.add("schildt");
        l.add("mathew");
        l.add("schildt");
        print(l);

        Set s = new HashSet();
        s.add("set:rose");
        s.add("schildt");
        s.add("mathew");
        s.add("schildt");
        print(s);
        
        SortedSet ss = new TreeSet();
        ss.add("set: jasmine");
        ss.add("schildt");
        ss.add("mathew");
        ss.add("schildt");
        print(ss);
        
        LinkedHashSet sss = new LinkedHashSet();
        sss.add("set: winslet");
        sss.add("schildt");
        sss.add("mathew");
        sss.add("schildt");
        print(sss);
        
        Map m1 = new HashMap();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2s");
        m1.put("mathew", "Hyden");
        m1.put("schildt", "Java2");
        print(m1.keySet());
        print(m1.values());
        
        SortedMap sm = new TreeMap();
        sm.put("map", "Treemap");
        sm.put("schildt", "java2s");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "java2");
        print(sm.keySet());
        print(sm.values());
        
        LinkedHashMap lm = new LinkedHashMap();
        lm.put("map", "LinkedHashMap");
        lm.put("schildt", "java2");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2s");
        print(lm.keySet());
        print(lm.values());
    }

    static void print(Collection coll) {
        Iterator iter = coll.iterator();
        while(iter.hasNext()){
            String elem = (String) iter.next();
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
