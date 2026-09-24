package Inheritance;

public class TikTok extends Influencer{
    String ViralVideos;
    TikTok(String name, int followers, String Platform){
//        name=this.name;
        this.followers= followers;//Here this.followers refers to the followers in super class(influencer)
        this.platform=Platform;
        this.name = name;}
    void TrendyVideo(){
        System.out.println(ViralVideos+" make it into a trend");
    }
}
