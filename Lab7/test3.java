package Lab7;

public class test3 {

  public static void main(String[] args) {
  int[] arr = new int[15];
  int rand_number;
  
  A1: for (int i = 0; i < arr.length - 1; i++){
  
    rand_number = 0 + (int)(Math.random() * arr.length);
    
    for (int j: arr){
      if (j == rand_number){
        i--;
        continue A1;
      }
    }
    
    arr[i] = rand_number;
  }
  
  for (int i: arr){
    System.out.println(i);
  }
 }

}