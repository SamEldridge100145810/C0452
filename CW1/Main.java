package CW1;

class Main {
    public static void main(String[] args) 
    {
      createSongs();
    }
  
    /**
      Method to setup sample songs and test they are stored
      @return - Void so no return values.
    */
    public static void createSongs()
    {   
      // Create 2 songs
      Song song1 = new Song("The Wall","Pink Floyd",7);
      Song song2 = new Song("Yellow Submarine","Beatles",12);
          
      //User input to get details of a song
      String nameOfSong = InputReader.getString("Please enter Song Title: ");
      String theArtist = InputReader.getString("Please enter Artist: ");
      int plyCount = InputReader.getInt("Please enter Playcount: ");  
      Song song3 = new Song(nameOfSong,theArtist,plyCount);
        
      song1.printSong();
      song2.printSong();
      song3.printSong();
        
      //Create playlist and add 2 songs
      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(song1);
      myPlaylist.addSong(song2);
      myPlaylist.addSong(song3);
  
      //Display size of Playlist
      System.out.println(myPlaylist.sizeOfPlaylist());
  
      myPlaylist.printHeader();
      myPlaylist.printAllSongs();
      
      myPlaylist.deleteSong(1);
      myPlaylist.printAllSongs();
      System.out.println("=============================");
      myPlaylist.printSelectSongs(6);
    }
  }  