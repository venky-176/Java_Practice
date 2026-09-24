package Polymorphism;
import java.util.Scanner;
public class MusicPlayer {
    public void playSong(){
        System.out.println("Playing a song");
    }
    public void playSong(String SName){
        System.out.println("Playing: "+ SName);
    }
    public void playSong(String SName,String singer){
        System.out.println("Playing: "+ SName+"\n Artist: "+ singer);
    }
    public void playSong(int duration){
        System.out.println("Playing song for "+ duration+" seconds");
    }

    static void main(String[]args ) {
        Scanner sc= new Scanner(System.in);
        MusicPlayer mp= new MusicPlayer();
        mp.playSong();
        mp.playSong("gehra hua");
        mp.playSong("radhima","isai");
        mp.playSong(30);
        System.out.println("enter the song name:");
        String song1= sc.nextLine();
        mp.playSong(song1);
        sc.close();
    }
}
