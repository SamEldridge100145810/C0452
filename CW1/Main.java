package CW1;
import ;

class Main {
    public static void main(String[] args) 
    {
      createSongs();
    }
  
    /** 
    The block below creates ten sample songs. It pulls this from the Song.java class. The song name and the artist name are strings in quotation marks
    whilst the playcount is just an integer (Not a double since when the playcount prints later on in the code, it will show up as a decimal number which makes no sense!)
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

          
      /**
      This is the first output that is displayed to the user. As the user will need to input data, a scanner is opened.
      Scanner is called menu since this block is the menu. The input itself is set as 'int' rather than a string.
      */
    
      int menu = InputReader.getInt("Welcome to the Java music browser" + 
      "\n============================= " + 
      "\nPlease press the following numbers for the following options" +
      "\n[1] to add a to the playlist" +
      "\n[2] to remove a song from the playlist" +
      "\nPress any other key to exit the program" +
      "\n=============================");

        /**
        First if statement
        Rather than creating a new scanner, this utilises the InputReader class that was created by Michael Kölling and David J. Barnes
        Scanners can only accept one type of data at a time. For example if I was to try and enter a string into the menu scanner, it wouldn't work as its expecting a number
        I need both strings and integers to create a song object as specified by the Song class and having to create three scanners for just one object would make the code look messy
        InputReader will let users input all of these values without having to create multiple scanners in the Main class to do so.
         */
        if(menu == 1);
          String nameOfSong = InputReader.getString("Please enter Song Title: ");
          String theArtist = InputReader.getString("Please enter Artist: ");
          int plyCount = InputReader.getInt("Please enter Playcount: ");  
          Song song11 = new Song(nameOfSong,theArtist,plyCount);
          song1.printSong();
          song2.printSong();
          song3.printSong();
          song4.printSong();
          song5.printSong();
          song6.printSong();
          song7.printSong();
          song8.printSong();
          song9.printSong();
          song10.printSong();
          song11.printSong();
        
          //This creates the playlist and adds the ten sample songs specified in the beginning as well as the one the user has just entered.
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

        if (menu == 2);

    }
  }  