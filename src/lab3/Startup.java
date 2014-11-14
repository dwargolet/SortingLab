package lab3;

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
    
    
    Map<String, Song> map = new TreeMap();
    
    
    map.put("11", s1);
    map.put("44", s2);
    map.put("22", s3);
    map.put("33", s4);

       
    
    List<Song> values = new ArrayList<>();
    
    Set<String> keys = new LinkedHashSet<>(map.keySet());
    
    for(String key : keys) {
        Song found = map.get(key);
        values.add(found);
    }
    
    Collections.sort(values);
    
    for(Song s : values){
        System.out.println(s);
    }
        
    
    System.out.println("\nSongs sorted by Release Date\n");
//        Collection<Song> values = map.values();
//        List<Song> sortedList = new ArrayList<Song>(values);
//        Collections.sort(sortedList, new Song());
//        
//        for(Song s : sortedList) {
//            System.out.println(s);
//        }
  }
}
