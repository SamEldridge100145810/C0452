/** 
 * @author Sam Eldridge
 * modified 09/11/2022 
*/
package CW1;
public class Track
{
  String TrackName;
  String artistName;
  int playCount;

  /**
    Constructor method to create a song object
    @return constructor method has no return value.
  */
  public Track(String TName, String aname, int pcount)
  {
    this.TrackName = TName;
    this.artistName = aname;
    this.playCount=pcount;
  }

  /**
    Get Method which gets the name of a song
    @return - A String representing the song name
  */
  public String getTrackName()
  {
    return TrackName;
  }

  /**
    Get Method which gets the artists name for a song
    @return - A String representing the artist name
  */
  public String getArtistName()
  {
    return artistName;
  }

  /**
    Get Method which gets the play count for a song
    @return - An integer representing the play count for a song
  */
  public int getPlayCount()
  {
    return playCount;
  }

  /**
    Set Method which updates the song name for a song
    @return - void so no return value
  */
  public void setSongName(String sName)
  {
    this.TrackName = sName;
  }

  /**
    Set Method which updates the artists name for a song
    @return - void so no return value
  */
  public void setArtistName(String aName)
  {
    this.artistName = aName;
  }

  /**
    Set Method which updates the play count for a song
    @return - void so no return value
  */
  public void setplayCount(int pCount)
  {
    this.playCount = pCount;
  }

  /**
    Method - Print details of a song
  */
  public void printSong()
  {
    System.out.println(TrackName + ","+ artistName + "," + playCount);    
  } 
}
