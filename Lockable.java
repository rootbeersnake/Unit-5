public interface Lockable{
  public void setKey(int keyStart);
  public void lock(int lockKey);
  public void unlock(int unlockKey);
  public boolean locked();

}
