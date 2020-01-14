public class CountTester{
  public static void main(String[] args){
    Slogan s1 = new Slogan("Hey");
    Slogan s2 = new Slogan("Yo");
    Slogan s3 = new Slogan("Hello");
    System.out.println(s1.toString());
    System.out.println(s2.toString());
    System.out.println(s3.toString());
    System.out.println("Slogans made " + Slogan.getCount());





  }
}
