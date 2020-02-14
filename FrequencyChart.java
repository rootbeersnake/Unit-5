import java.util.Scanner;

public class FrequencyChart{
  public static void main(String[] args){
    //1-10
    String a = "";
    //11-20
    String b = "";
    //21-30
    String c = "";
    //31-40
    String d = "";
    //41-50
    String e = "";
    //51-60
    String f = "";
    //61-70
    String g = "";
    //71-80
    String h = "";
    //81-90
    String k = "";
    //91-100
    String j = "";

    Scanner scan = new Scanner(System.in);
    System.out.println("enter the amount of numbers you will enter");
    int length = scan.nextInt();
    int[] nums = new int[length];
    for(int i = 0; i < length; i++){
      System.out.println("enter a number to add to the list");
      nums[i] = scan.nextInt();
      if(nums[i] >= 1 && nums[i] <=10){
       a += "*";
      }else if(nums[i] >= 11 && nums[i] <=20){
       b += "*";
      }else if(nums[i] >= 21 && nums[i] <=30){
       c += "*";
      }else if(nums[i] >= 31 && nums[i] <=40){
       d += "*";
      }else if(nums[i] >= 41 && nums[i] <=50){
       e += "*";
      }else if(nums[i] >= 51 && nums[i] <=60){
       f += "*";
      }else if(nums[i] >= 61 && nums[i] <=70){
       g += "*";
      }else if(nums[i] >= 71 && nums[i] <=80){
       h += "*";
      }else if(nums[i] >= 81 && nums[i] <=90){
       k += "*";
      }else if(nums[i] >= 91 && nums[i] <=100){
       j += "*";
      }
    }

    System.out.println("1-10   | " + a);
    System.out.println("11-20  | " + b);
    System.out.println("21-30  | " + c);
    System.out.println("31-40  | " + d);
    System.out.println("41-50  | " + e);
    System.out.println("51-60  | " + f);
    System.out.println("61-70  | " + g);
    System.out.println("71-80  | " + h);
    System.out.println("81-90  | " + k);
    System.out.println("91-100 | " + j);







  }
}
