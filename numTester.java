



public class numTester{

  public static void main(String[] args){
    Num number1 = new Num(5);
    Num number2 = new Num(10);
    System.out.println("the numbers value is: " + number1.getVal());
    number1.valChange(6);
    System.out.println("the numbers value is: " + number1.toString());
    System.out.println("is " + number1 + " equal to " + number2 + "? " + number1.equals(number2));
    System.out.println("is " + number1 + " equal to " + number1 + "? " + number1.equals(number1));



  }
}
