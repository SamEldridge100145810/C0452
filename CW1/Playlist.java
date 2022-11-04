package CW1;

import java.util.ArrayList;
import java.io.*;

public class Playlist
{
  private ArrayList<Song> playList;

  /**
  Method Constructor - Create a playlist of songs
  */
  public Playlist()
  {
    playList = new ArrayList<>();
  }

  /**
  Method to get size of playlist
  @return void
  */
  public int sizeOfPlaylist()
  {
    return playList.size();
  }
  
  /**
  Method - Add Song to the playlist
  @return void
  */
  public void addSong(Song song)
  {
    playList.add(song);
  }

  /**
  Method to delete a song from the playlist
  @return void
  */
  public void deleteSong(int id)
  {
    playList.remove(id);
  }

  /**
  Method: Prints all the songs in the Playlist of songs 
  @return void
  */
  public void printAllSongs()
  {
    for (int index = 0; index < playList.size(); index++)
    {
        Song s = playList.get(index);
        System.out.print("["+(index+1)+"]");
        s.printSong();
    }
  }

  /**
  Method: Prints a header for table of songs - needs attention! 
  @return void
  */
  
  public void printHeader()
  {
    System.out.println("Song           Artist        Plays");
    System.out.println("==================================");
  }

  /**
  Method: Prints selected songs over a specified playcount
  @return void
  */
  public void printSelectSongs(int playCount)
  {
    for (int index = 0; index < playList.size(); index++)
      {        
        Song s = playList.get(index);
        if (s.getPlayCount() > playCount)
        {
            System.out.print("["+(index+1)+"]");
            s.printSong();
        } 
      }
  }
}
