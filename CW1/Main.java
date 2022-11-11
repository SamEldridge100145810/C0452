/** 
 * @author Sam Eldridge
 * modified 09/11/2022
*/

package CW1;
class Main {
    public static void main(String[] args) 
    {
      createSongs();
    }
    /** 
    The two blocks below are responsible for creating ten "sample" songs. The following block of code after creates the playlist, MixTape, and adds these sample
    songs to the mixtape.
    */
    public static void createSongs()
    {   
      Track track1 = new Track("Solway Firth","Slipknot",80);
      Track track2 = new Track("Believer","ReoNa",20);
      Track track3 = new Track("Shelter","Porter Robinson",160);
      Track track4 = new Track("One","Metallica",90);
      Track track5 = new Track("Everlong","Foo Fighters",200);
      Track track6 = new Track("Kick Back","Kenshi Yonezu",37);
      Track track7 = new Track("Peace Sells","Megadeth",30);
      Track track8 = new Track("Stellar Stellar","Hoshimachi Suisei",12);
      Track track9 = new Track("I'm Your Treasure Box","Houshou Marine",14);
      Track track10 = new Track("The Rumbling","SiM",55);

      MiXtape MixTape = new MiXtape();
      MixTape.addSong(track1);
      MixTape.addSong(track2);
      MixTape.addSong(track3);
      MixTape.addSong(track4);
      MixTape.addSong(track5);
      MixTape.addSong(track6);
      MixTape.addSong(track7);
      MixTape.addSong(track8);
      MixTape.addSong(track9);
      MixTape.addSong(track10);

      /** 
       The first output the user will see as well as the first input.
        This utilises the InputReader class by Michael Kölling and David J. Barnes. InputReader is very useful as it stops users from putting in data that doesn't
        belong to the input. For example when asked to enter the play count and a user attempts to put letters in, InputReader will stop them and ask for the right input
        This also saves me from having to make multiple scanners in the Main class
      */
      System.out.println("Welcome to the Java music playlist browser" + 
      "\n============================= ");
      String nameOfSong = InputReader.getString("Please enter the track title: ");
      String theArtist = InputReader.getString("Please enter the track artist: ");
      int plyCount = InputReader.getInt("Please enter the play count of the track: ");  
      Track track11 = new Track(nameOfSong,theArtist,plyCount);
      MixTape.addSong(track11);
      System.out.println("you now have " +MixTape.sizeOfMiXtape() +" tracks in your playlist");
      MixTape.printHeader();
      MixTape.printAllTracks();

      /** 
       I wanted to give the user the option to delete a track rather than forcing the program to delete it without the users consent
       As Array lists always numbers the first object as 0, that means track11 will be listed as [10] in the list
      */
      int delete = InputReader.getInt("If you would like to delete a track please enter the track number to delete" +
      "\n Alternatively, input another number to skip this step: ");
      if(delete >= 0 && delete <= 10)
        MixTape.deleteTrack(delete);
        else
        System.out.println("Deletion skipped!");
      
      MixTape.printHeader();
      MixTape.printAllTracks();

      /**
       Again, I wanted to let the user know what the program was doing rather than just skipping the InputReader and forcing the printSelectTrack method from running
       and confusing the user as to why songs are reprinting again on their own
       */
      int count = InputReader.getInt("Enter a number of plays to reveal which songs have reached that number: ");
      MixTape.printHeader();
      MixTape.printSelectTrack(count);

      /**
       Program ends after this, printed a goodbye message to let the user know this
       */
      System.out.println("Thank you for using the Java music playlist browser, goodbye!");
    }
  }  