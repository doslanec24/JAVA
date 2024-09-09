package java_basics;

/*
 * Modify the method below to print out all even numbers above zero until the
 * function parameter limit. The numbers are separated by comma and printed
 * without new line.
 * 
 * Example output when limit is 9:
 * 2,4,6,8
 */

public class Quest4 {
  public void oddOut(Short limit) {
    Boolean last = true;
    Short b = 0;
    //if(limit==0){
      //System.out.println("No even numbers to print.");
    //}else{
    for(Integer i=1; i<=limit; i++){
      b++;
      if(i%2==0){
        if(b == limit || b == limit-1){
          last=false;
        }
        if(last==true){
          System.out.print(i+",");
        }else{
          System.out.print(i);
        }
      }
    }
  }
  //}
  public static void main(){
    
    Quest4 quest4 = new Quest4();
    quest4.oddOut((short)2);
  }
}
