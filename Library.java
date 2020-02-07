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



}
