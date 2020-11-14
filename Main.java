import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  int[] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  String[] names = new String[15];
  
  Scanner scan = new Scanner(System.in);
  
  
  for(int i=0; i < 15; i++){
    System.out.println("Student's name is ");
    names [i]= scan.next();
  while(i>1){}
    System.out.println (names [i] +" sits in seat " + seatNumbers[i]);
  }
  }
}