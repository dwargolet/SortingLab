package lab1;

import java.util.Comparator;

/**
 *
 * @author Daniel
 */
public class SongByTitle implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2){
        return o1.getSongTitle().compareTo(o2.getSongTitle());
    }
}
