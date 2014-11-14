/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
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
