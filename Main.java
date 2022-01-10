import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // ArrayList is a dynamic array indicating the types of things it will store

    ArrayList<Integer> nums = new ArrayList<Integer>();

    // Fill the arraylist with values
    for (int i = 0; i < 10; i++) {
      nums.add(i); // appends onto the end of the list
    }

    for (int x : nums) {
      System.out.print(x + " ");
    }
    System.out.println();
    // common methods
    nums.set(3, 9); // place a 9 at index #3
    nums.add(1, 8); //adds a 8 in slot 1 and moves everyone else down
    nums.add(1);
    nums.remove(4);// remove the value at that location and move everyone else down

    for (int x : nums) {
      System.out.print(x + " ");
    }
     
     //Print array with am indexed for-loop

    for(int i=0; i<nums.size(); i++){
      System.out.println(nums.get(i));
    }
     


  }
}