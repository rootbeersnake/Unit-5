public class LibraryTester{
  public static void main(String[] args){
    Library myLibrary = new Library();

    Album a1 = new Album("song", "guys", 6, 15.6);
    Album a2 = new Album("song 2 electric boogaloo", "guys", 12, 40.2);
    Album a3 = new Album("song 3 ", "guys", 4, 12.4);
    Album a4 = new Album("song 4 ", "guys", 4, 12.4);
    Album a5 = new Album("song 5 ", "guys", 4, 12.4);
    Album a6 = new Album("song 6 ", "guys", 4, 12.4);
    Album a7 = new Album("song 7 ", "guys", 4, 12.4);
    Album a8 = new Album("song 8 ", "guys", 4, 12.4);
    Album a9 = new Album("song 9 ", "guys", 4, 12.4);
    Album a10 = new Album("song 10 ", "guys", 4, 12.4);
    Album a11 = new Album("song 11 ", "guys", 4, 12.4);

    myLibrary.add(a1);
    myLibrary.add(a2);
    myLibrary.add(a3);
    myLibrary.add(a4);
    myLibrary.add(a5);
    myLibrary.add(a6);
    myLibrary.add(a7);
    myLibrary.add(a8);
    myLibrary.add(a9);
    myLibrary.add(a10);
    myLibrary.add(a11);

    System.out.println(myLibrary.toString());
    System.out.println("************************");

    myLibrary.remove(5);
    myLibrary.add(a11);

    System.out.println("");
    System.out.println(myLibrary.toString());

    int loc =  myLibrary.findTitle("song");
    System.out.println(myLibrary.getAlbum(loc));

    System.out.println("");

    loc = myLibrary.findArtist("guy");
    System.out.println(myLibrary.getAlbum(loc));

  }
}
