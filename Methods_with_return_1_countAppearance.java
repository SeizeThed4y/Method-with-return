class Main {
  
  public int  count_appearance(String[] arr,String t)
  {
    
    int counter = 0;
    for(int i = 0; i <arr.length; i++){
      if(arr[i].equals(t)){
        counter++;
      }
    }
    return counter;
   
  } //end  count_appearance
  

}