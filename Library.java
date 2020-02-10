public class Library{
    private Album[] library;

    public Library(){
      library = new Album[10];
    }

    public boolean add(Album album){
      for(int i = 0; i < library.length; i++){
        if(library[i] == null){
          library[i] = album;
          return true;
        }
      }
      return false;
    }

    public boolean remove(int index){
      if(library[index] != null){
        library[index] = null;
        return true;
      }
      return false;
    }

    public String toString(){
      String result = "";
        for(Album a : library){
          if(a != null){
            result += a.toString() + "\n";
          }
        }
        return result;
    }

    public int findTitle(String t){
      for(int i = 0; i < library.length; i++){
        if(library[i] != null && library[i].getTitle().compareTo(t) == 0){
          return i;
        }
      }
      return -1;
    }

    public int findArtist(String a){
      for(int i = 0; i < library.length; i++){
        if(library[i] != null && library[i].getArtist().compareTo(a) == 0){
          return i;
        }
      }
      return -1;
    }

    public Album getAlbum(int index){
      if(index >= 0 && index < library.length){
        return library[index];
      }else{
        System.out.println("index out of bounds");
        return null;
      }
    }

    public void selectionSort(){
      int min;
      int temp;

      for(int i = 0; i < library.length; i++){

      }
    }

}
