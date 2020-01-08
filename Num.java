public class Num{
  int val;

  public Num(int number){
    val = number;
  }

  public int getVal(){
    return val;
  }

  public void valChange(int numc){
    val = numc;
  }

  public String toString(){
    return Integer.toString(val);
  }

  public boolean equals(int otherNum){
    if(this.val == otherNum){
      return true;
    }else{
      return false;
    }
  }


}
