package Inheritance;
//import java.util.M
public class Main {
    static void main(String[] args) {
        Youtuber yt= new Youtuber("prasad",1000,"shorts");
        TikTok tk = new TikTok("Roshan",20000,"reels");

        yt.subscribers=15000;
        tk.ViralVideos="ganesha";
        yt.showDetails();
        yt.CreateVideo();
        tk.showDetails();
        tk.TrendyVideo();
    }
}
 /*yt.name="prasad";
        yt.followers=1000;
        yt.platform="Shorts";*/