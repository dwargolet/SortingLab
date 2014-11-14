package lab2;

import java.util.*;

/**
 *
 * @author dworgolet
 */
public class Startup {
    
    public static void main(String[] args) {
        
    
    Song s1 = new Song("Stan", "Eminem", "Marshall Mathers LP","5/22/2000");
    Song s2 = new Song("Duality", "Slipknot", "Vol: 3","05/24/2004");
    Song s3 = new Song("Bad Stone", "Crystal Method", "Vegas","8/27/1997");
    Song s4 = new Song("Cookin Keys", "A.O.T.P", "The Unholy Terror","3/19/2010");
    
    
    
    Map<String, Song> map = new HashMap();
    
    
    map.put(s1.getSongTitle(), s1);
    map.put(s2.getSongTitle(), s2);
    map.put(s3.getSongTitle(), s3);
    map.put(s4.getSongTitle(), s4);
    
    //Prints out in no particular order
    System.out.println("\nSongs unsorted\n");
    Set keys = map.keySet();
        for(Object key : keys) {
            Song found = (Song)map.get(key);
            System.out.println(found.toString());
        }

    
    //have to use a treemap to get list in order    
    System.out.println("\nSongs sorted by Title\n");
        Map<String,Song> map2 = new TreeMap<>(map);
        Set<String> keys2 = map2.keySet();
        for(String key : keys2) {
            Song found = map.get(key);
            System.out.println(found.toString());
        }    
        
          
        
  }
}
