public class Card implements Comparable{

  public static final String[] RANK = {"2", "3", "4",
  "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

  public static final String[] SUIT = {"♠", "♥", "♦", "♣"};

  private String rank;
  private String suit;

  public Card(String rank, String suit){
    this.rank = rank;
    this.suit = suit;
  }

  public String getRank(){
    return rank;
  }

  public String getSuit(){
    return suit;
  }

  public String toString(){
    return rank + suit;
  }

  public int compareTo(Object other){
    Card otherCard = (Card) other;
    return this.getRankValue() - other.getRankValue();
  }

  public int getRankValue(){
    for(int i = 0; i < RANK.length; i++){
      if(this.rank.equals(RANK[i])){
        return i+1;
      }
    }
    return -1;
  }

}
