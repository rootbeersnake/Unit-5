public class LibraryTester{
  public static void main(String[] args){
    Library myLibrary = new Library();

    Album a1 = new Album("a ", "guys", 6, 15.6);
    Album a2 = new Album("b ", "guy", 12, 40.2);
    Album a3 = new Album("c ", "people", 4, 12.4);
    Album a4 = new Album("d ", "c", 4, 12.4);
    Album a5 = new Album("e ", "everyone", 4, 12.4);
    Album a6 = new Album("f ", "you", 4, 12.4);
    Album a7 = new Album("g ", "me", 4, 12.4);
    Album a8 = new Album("h ", "b", 4, 12.4);
    Album a9 = new Album("x ", "d", 4, 12.4);
    Album a10 = new Album("y ", "f", 4, 12.4);
    Album a11 = new Album("z ", "h", 4, 12.4);

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

    //myLibrary.remove(5);
    //myLibrary.add(a11);

    System.out.println("");
    System.out.println(myLibrary.toString());

    int loc =  myLibrary.findTitle("song");
    System.out.println(myLibrary.getAlbum(loc));

    System.out.println("");

    loc = myLibrary.findArtist("guy");
    System.out.println(myLibrary.getAlbum(loc));
    System.out.println("");

    myLibrary.selectionSort();
    System.out.println("did selection sorting");
    System.out.println(myLibrary.toString());

    myLibrary.insertionSort();
    System.out.println("did insertion sorting");
    System.out.println(myLibrary.toString());

    System.out.println("did binary search artist");
    System.out.println(myLibrary.binarySearchArtist("guys"));

    System.out.println("did binary search title");
    System.out.println(myLibrary.binarySearchTitle("b"));


  }
}
