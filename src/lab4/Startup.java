package lab4;

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
    Song s5 = new Song("Stan", "Eminem", "Curtain Call","5/22/2008");
    
    
 
    Set<Song> set = new TreeSet<Song>();
    
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);
    set.add(s5);
    System.out.println("\nSongs sorted by Title\n");
    
    
    
    for(Song s : set) {
            System.out.println(s.toString());
        }
    
  }
}
