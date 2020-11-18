import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  int[] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  //Above there is an array of 15 int elements representing the # of seats in the class
  String[] names = new String[15];
  //Above there is a String array of 15 int elements representing the 15 students
  Scanner scan = new Scanner(System.in);
  //Above is the scanner to receive the student's name.
  
  for(int i=0; i < 15; i++){
    System.out.println("Student's name is ");
    names [i]= scan.next();
  //Above is the For Loop, where there is a print statement asking for the student's name. There is also the scanner to receive the name and assign it an element in the String array.

  while(i>1){}
    System.out.println (names [i] +" sits in seat " + seatNumbers[i]);
     //a While loop to print each element in the String array along with each element in the int array. It assigns the given student name an int value (aka a seat)
  }
  }
}