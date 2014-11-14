package lab6;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Song implements Comparable<Song>, Comparator<Song>{
    
    private String songTitle;
    private String artist;
    private String album;
    private String releaseDate; //could possibly be set as a date object

    
    public Song() {
    }
    
    public Song(String songTitle, String artist, String album, String releaseDate) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
        this.releaseDate = releaseDate;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Song" + " Title: " + songTitle + ". Artist: " + artist + ", on the " + album + " album, released " + releaseDate;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.songTitle);
        hash = 83 * hash + Objects.hashCode(this.artist);
        return hash;
    }
    
    //use the song title and artist to check for equality

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.songTitle, other.songTitle)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compare(Song s1, Song s2) {
        return s1.getReleaseDate().compareTo(s2.getReleaseDate());
    }
    
    
    @Override
    public int compareTo(Song other) {
        return new CompareToBuilder().append(this.songTitle, other.songTitle).toComparison();
    }

    
    
}
