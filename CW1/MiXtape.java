/** 
 * @author Sam Eldridge
 * modified 09/11/2022
*/

package CW1;

import java.util.ArrayList;

public class MiXtape
{
  private ArrayList<Track> mixtape;

  /**
  This is a constructor to create the array list which will be used to make the playlist (or mixtape as I have called it)
  */
  public MiXtape()
  {
    mixtape = new ArrayList<>();
  }

  /**
  Gets the size of the playlist so it can be printed out
  */
  public int sizeOfMiXtape()
  {
    return mixtape.size();
  }
  
  /**
  This adds songs to the playlist
  */
  public void addSong(Track song)
  {
    mixtape.add(song);
  }

  /**
  This will delete a song from the playlist
  */
  public void deleteTrack(int id)
  {
    mixtape.remove(id);
  }

  /**
  This counts all of the objects (tracks) in the array list and prints them all out in chronological order
  With how array lists work in Java the first object will always be [0] and the second object will be [1] and so on
  I could change line 53 to say System.out.print("["+(index+1)+"]"); instead so that the first object shows as [1]
  However that is just a visual change, if a user wanted to delete track1, it would still delete track2 since it won't change how array lists work
  So keeping as is for the sake of user experience
  */
  public void printAllTracks()
  {
    for (int index = 0; index < mixtape.size(); index++)
    {
        Track s = mixtape.get(index);
        System.out.print("["+(index)+"]");
        s.printSong();
    }
  }

  /**
  This prints a header. This is just to make the output look a bit nicer. This also saves the Main class a couple of lines to make it look nicer
  */
  
  public void printHeader()
  {
    System.out.println("==================================");
    System.out.println("Track           Artist        Plays");
    System.out.println("==================================");
  }

  /**
  This will print songs based on a playcount specified by the user
  */
  public void printSelectTrack(int playCount)
  {
    for (int index = 0; index < mixtape.size(); index++)
      {        
        Track s = mixtape.get(index);
        if (s.getPlayCount() > playCount)
        {
            System.out.print("["+(index)+"]");
            s.printSong();
        } 
      }
  }
}
