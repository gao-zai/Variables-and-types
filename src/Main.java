public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        
        // --- TODO

        MusicBox anotherMbox = new MusicBox("S78JK90",'N',"Sunshine","Bright","Happy Tunes","Pop","Sunny Productions","Jollly Records");

         
        System.out.println(Now playing another song");
        anotherMbox.playSong(anotherMbox.getSongID(),anotherMbox.getPremiumSong(),1);

    }
}




