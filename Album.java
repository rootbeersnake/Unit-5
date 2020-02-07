public class Album{
  private String artist;
  private String title;
  private int tracks;
  private double runtime;

  public Album(String T, String A, int t, double rt){
    artist = A;
    title = T;
    tracks = t;
    runtime = rt;
  }


  public String toString(){
    String result = "";
    result += title + " by " + artist + " | " + tracks + " tracks";
    result += ", Time: " + runtime + " min";
    return result;
  }





}
