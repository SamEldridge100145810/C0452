package CW1;
class Main {
    public static void main(String[] args) 
    {
      createSongs();
    }
  
    /** 
    The block below creates ten sample songs. See line 21 of Song.java for the constructor itself. Strings for the song name and artist name and an integer for the number of plays
    */
    public static void createSongs()
    {   
      Song song1 = new Song("Solway Firth","Slipknot",80);
      Song song2 = new Song("Believer","ReoNa",20);
      Song song3 = new Song("Shelter","Porter Robinson",160);
      Song song4 = new Song("One","Metallica",90);
      Song song5 = new Song("Everlong","Foo Fighters",200);
      Song song6 = new Song("Kick Back","Kenshi Yonezu",37);
      Song song7 = new Song("Peace Sells","Megadeth",30);
      Song song8 = new Song("Stellar Stellar","Hoshimachi Suisei",12);
      Song song9 = new Song("I'm Your Treasure Box","Houshou Marine",14);
      Song song10 = new Song("The Rumbling","SiM",55);

      //This creates the playlist and adds the ten sample songs specified in the beginning as well as the one the user has just entered.
      //This is being added beforehand so I won't have to add it again for both options in the menu

      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(song1);
      myPlaylist.addSong(song2);
      myPlaylist.addSong(song3);
      myPlaylist.addSong(song4);
      myPlaylist.addSong(song5);
      myPlaylist.addSong(song6);
      myPlaylist.addSong(song7);
      myPlaylist.addSong(song8);
      myPlaylist.addSong(song9);
      myPlaylist.addSong(song10);

          
      /**
      First thing that will show up for the user. All inputs utilise the scanner in InputReader which was built by Michael Kölling and David J. Barnes
      */
    
  
      String menu = InputReader.getString("Welcome to the Java music browser" + 
      "\n============================= " + 
      "\nPlease press the following numbers for the following options" +
      "\n[1] to add a track to the playlist" +
      "\n[2] to remove a track from the playlist" +
      "\n[3] to view some of your most played tracks" +
      "\nPress any other key to exit the program" +
      "\n=============================");
       
        /**
        First if statement. Uses InputReader again.
        One of the advantages of InputReader is that it allows me to use both strings and integers within the same block.
        Whereas if I didn't have the InputReader class, I would have to make three different scanners to add one song to the playlist 
        This would've made the code a bit longer and messier!
        */
      if(menu.equals("1"));
        
        String nameOfSong = InputReader.getString("Please enter Song Title: ");
        String theArtist = InputReader.getString("Please enter Artist: ");
        int plyCount = InputReader.getInt("Please enter Playcount: ");  
        Song song11 = new Song(nameOfSong,theArtist,plyCount);
        myPlaylist.addSong(song11);
        System.out.println("you have" +myPlaylist.sizeOfPlaylist() +" tracks in your playlist");
        myPlaylist.printHeader();
        myPlaylist.printAllSongs();
        
    
        
      if(menu.equals("2"));
        
        myPlaylist.printHeader();
        myPlaylist.printAllSongs();
        int deletion = InputReader.getInt("Please select which track to remove from your list");
        myPlaylist.deleteSong(deletion);
        myPlaylist.printHeader();
        myPlaylist.printAllSongs();
        System.out.println("Song successfully deleted!");
        
        
        
      if (menu.equals("3"));
        
        int UpC = InputReader.getInt("Please enter a number and we can check what songs have been played by that amount or higher!");
        myPlaylist.printHeader();
        myPlaylist.printSelectSongs(UpC);
        
      if (menu.equals("4"));
        System.out.println("Exiting program, have a good day.");
      


        
    

    }
  }  