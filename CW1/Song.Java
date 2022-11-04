package CW1;

/**
  Class Song defines data and methods for storing songName, artist and
  playcount for a song.

  @Author Andrew Stephenson
  @Version 1.0

  Modified by Andrew Stephenson 03/11/2022
*/
public class Song
{
  String songName;
  String artistName;
  int playCount;

  /**
    Constructor method to create a song object
    @return constructor method has no return value.
  */
  public Song(String sName, String aName, int pCount)
  {
    this.songName = sName;
    this.artistName = aName;
    this.playCount=pCount;
  }

  /**
    Get Method which gets the name of a song
    @return - A String representing the song name
  */
  public String getSongName()
  {
    return songName;
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
    this.songName = sName;
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
    System.out.println(songName + ","+ artistName + "," + playCount);    
  } 
}
