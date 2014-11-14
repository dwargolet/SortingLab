
package lab3;

import java.util.Comparator;

/**
 *
 * @author dworgolet
 */
public class SongByAlbum implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2){
        return o1.getAlbum().compareTo(o2.getAlbum());
    }
}
