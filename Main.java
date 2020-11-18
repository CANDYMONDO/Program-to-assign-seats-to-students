import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  int[] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  //Above there is an array of 15 int elements representing the # of seats in the class
  String[] names = new String[15];
  //Above there is a String array of 15 int elements representing the 15 students
  Scanner scan = new Scanner(System.in);
  //Above is the scanner to receive the student's name when imputed and assign said name to each element of the String array
  
  for(int i=0; i < 15; i++){
    System.out.println("Student's name is ");
    names [i]= scan.next();
  //

  while(i>1){}
    System.out.println (names [i] +" sits in seat " + seatNumbers[i]);
  }
  }
}