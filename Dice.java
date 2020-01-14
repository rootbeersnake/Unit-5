import java.util.Random;

public class Dice implements Lockable{
  private int key;
  private boolean isLocked;
  private int Face;
  Random rand = new Random();

  public Dice(){
      Face = rand.nextInt(6)+1;
  }

  public void setKey(int keyStart){
    key = keyStart;
  }

  public void lock(int lockKey){
    if(lockKey == key){
      isLocked = true;
    }else{

    }
  }

  public void unlock(int unlockKey){
    if(unlockKey == key){
      isLocked = false;
    }else{

    }
  }

  public boolean locked(){
    return isLocked;
  }

  public void roll(){
    if(isLocked != true){
      Random rand = new Random();
      Face = rand.nextInt(6)+1;
    }else{

    }
  }

  public int getFace() {
      return Face;
  }

  public String toString(){
      String result = "Face value = " + Face;
      return result;
  }


}
