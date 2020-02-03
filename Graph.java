import java.util.Scanner;

public class Graph{
  public static void main (String[] args){
    System.out.println("Enter the amount of numbers you'll enter");
    Scanner scan = new Scanner(System.in);
    String s1 = "";
    String s2 = "";
    String s3 = "";
    String s4 = "";
    String s5 = "";
    String s6 = "";
    String s7 = "";
    String s8 = "";
    String s9 = "";
    String s10 = "";
    int currentNum;
    int numsIn = scan.nextInt();
    int[] nums = new int[numsIn];
    for(int i = 0; i < nums.length; i++){
      System.out.println("enter a number to add to the list");
      currentNum = scan.nextInt();
      nums[i] = currentNum;
    }
  //  for(int i = 0; i <nums.length; i++){
    //  System.out.println(nums[i]);
  //  }
    for(int n = 0; n < nums.length; n++){

      if(nums[n] > 0 && nums[n] <= 10){
        s1 = s1 + "*";
      }else if(nums[n] > 10 && nums[n] <= 20){
        s2 = s2 + "*";
      }else if(nums[n] > 20 && nums[n] <= 30){
        s3 = s3 + "*";
      }else if(nums[n] > 30 && nums[n] <= 40){
        s4 = s4 + "*";
      }else if(nums[n] > 40 && nums[n] <= 50){
        s5 = s5 + "*";
      }else if(nums[n] > 50 && nums[n] <= 60){
        s6 = s6 + "*";
      }else if(nums[n] > 60 && nums[n] <= 70){
        s7 = s7 + "*";
      }else if(nums[n] > 70 && nums[n] <= 80){
        s8 = s8 + "*";
      }else if(nums[n] > 80 && nums[n] <= 90){
        s9 = s9 + "*";
      }else if(nums[n] > 90 && nums[n] <= 100){
        s10 = s10 + "*";
      }
    }
System.out.println("1 - 10   | " + s1);
System.out.println("11 - 20  | " + s2);
System.out.println("21 - 30  | " + s3);
System.out.println("31 - 40  | " + s4);
System.out.println("41 - 50  | " + s5);
System.out.println("51 - 60  | " + s6);
System.out.println("61 - 70  | " + s7);
System.out.println("71 - 80  | " + s8);
System.out.println("81 - 90  | " + s9);
System.out.println("91 - 100 | " + s10);




  }
}
