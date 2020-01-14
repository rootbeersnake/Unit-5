public class Slogan{
  private static int count;
  private String phrase;



  public Slogan(String word){
    phrase = word;
    count++;
  }

  public String toString(){
    return "" + phrase + "";
  }

  public static int getCount(){
    return count;
  }



}
