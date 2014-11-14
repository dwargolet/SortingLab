package lab6;

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
    Song s5 = new Song("Stan", "Eminem", "Curtain Call","10/13/2008");
    
    
    
    List<Song> songs = new ArrayList<>();
    
    songs.add(s1);
    songs.add(s2);
    songs.add(s3);
    songs.add(s4);
    songs.add(s5);
    
    SongByArtist songSort = new SongByArtist();
//    SongByAlbum songSort = new SongByAlbum();
//    SongByTitle songSort = new SongByTitle();
    
    Collections.sort(songs, songSort);
    
    for(Song s : songs) {
            System.out.println(s);
        }
    
  }
}