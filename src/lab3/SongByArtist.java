package lab3;
import java.util.Comparator;

/**
 *
 * @author dworgolet
 */
public class SongByArtist implements Comparator<Song>{
    
    @Override
    public int compare(Song o1, Song o2){
        return o1.getArtist().compareTo(o2.getArtist());
    }
    
}
