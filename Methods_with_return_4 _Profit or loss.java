class Main {
  public String c_profits (int buyPrice,int sellPrice)
  {
    if((sellPrice - buyPrice) < 0){
      return "loss";
    }else if ((sellPrice - buyPrice) > 0){
      return "profit";
    }else{
      return "no loss";
    }
   
   
   
  }
}