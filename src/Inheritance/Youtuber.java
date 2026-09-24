package Inheritance;

public class Youtuber extends Influencer{
    int subscribers;
    Youtuber(String name, int followers, String Platform){
//        name=this.name;
        this.followers= followers;//Here this.followers refers to the followers in super class(influencer)
       this.platform=Platform;
        this.name = name;
    }
    public void CreateVideo(){
        System.out.println(subscribers+" subscribers are waiting Create a video to upload");
    }
}
