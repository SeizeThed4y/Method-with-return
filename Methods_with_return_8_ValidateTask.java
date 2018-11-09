class Main {
  public boolean validateTask(boolean notEmpty,int taskId,int currentId)
  {
    if(notEmpty == true && currentId + 1 == taskId ){
      return true;
    }
    return false;
  }
}