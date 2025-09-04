class MediaPlayer{
  public static void main(String [] args){
    Video v = new Video();
    Audio a = new Audio();
    v.play();
    a.play();
  }
}

interface Playable{
  public void play();
}

class Video implements Playable{
  public void play(){
    System.out.println("Video is playing");
  }
}
class Audio implements Playable{
  public void play(){
    System.out.println("Audio is playing");
  }
}
