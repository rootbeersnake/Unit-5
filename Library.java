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


    public void doubleSize(Library[] library){
      int length = library.length;
      Album[] newLibrary = new Album[length * 2];
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
      Album temp;

      for(int i = 0; i < library.length - 1 ; i++){
        min = i;
        for(int scan = i + 1; scan < library.length; scan++){
          if(library[i] != null && library[scan] != null){
            if(library[scan].getTitle().compareTo(library[min].getTitle()) < 0){
              min = scan;
            }
          }

          temp = library[min];
          library[min] = library[i];
          library[i] = temp;
        }
      }
    }

    public void insertionSort(){
      for(int i = 1; i < library.length; i++){
        Album key = library[i];
        int position = i;
        if(library[position - 1] != null && key != null){
          while(position > 0 && library[position - 1].getArtist().compareTo(key.getArtist()) > 0){
            library[position] = library[position - 1];
            position--;
          }
          library[position] = key;
        }
      }
    }

    public Album binarySearchArtist(String artist){
      int low = 0;
      int high = library.length - 1;
      int middle = (low + high)/2;

      while(library[middle].getArtist().compareTo(artist) != 0){
        if(artist.compareTo(library[middle].getArtist()) < 0){
          high = middle -1;
        }else{
          low = middle -1;
        }
        middle = (low + high)/2;
      }
      if(library[middle].getArtist().compareTo(artist) == 0){
        return library[middle];
      }else{
        return null;
      }
    }

    public Album binarySearchTitle(String title){
      int low = 0;
      int high = library.length - 1;
      int middle = (low + high)/2;

      while(library[middle].getTitle().compareTo(title) != 0){
        if(title.compareTo(library[middle].getTitle()) < 0){
          high = middle -1;
        }else{
          low = middle -1;
        }
        middle = (low + high)/2;
      }
      if(library[middle].getTitle().compareTo(title) == 0){
        return library[middle];
      }else{
        return null;
      }
    }

}
