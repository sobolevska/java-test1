import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many people are there in the room?");
        Scanner fn= new Scanner(System.in);
        int fnumber= fn.nextInt();



        if  (fnumber == 100) {
            System.out.println("The room is full, we are sorry, but we cant take any more guests.");    }

 else  {

        System.out.println("How many people are in the q?");
    }

        Scanner sn= new Scanner(System.in);
      int snumber = sn.nextInt();

      int space= (fnumber+snumber);

              if (space <=100) {
                  System.out.println("Great, everione can fit in.");    }
              else {
                  System.out.println("Sorry, everyone can't get in?");
              }
}



}
