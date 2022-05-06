package gr.aueb.cf.testbed.Week2;

import java.io.IOException;
import java.util.Scanner;

public class Project10 {


    static char column = 12;
    static int row = 30;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int choise;
        int[][] array = new int[row][column];
        int[][] seattaken = new int[row][column];

        do {
            menu();
            choise = in.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Κάντε κράτηση θέσης");

                    if (!seats(seattaken)) {
                        reservation(array);
                    } else {
                        System.out.println("Η θέση είναι κατειλημμένη");
                    }
                    menu();
                    choise = in.nextInt();
                    break;

                case 2:
                    System.out.println("Δώστε θέση για ακύρωση σειρά και στήλη");
                    row = in.nextInt();
                    column = (char) System.in.read();
                    break;

                case 3:
                    displayTheatre(array);

                case 4:
                    System.out.println("Ευχαριστούμε, Αντίο");
                    break;

                default:
                    System.out.println("Λάθος επιλογή, Δώστε απο το 1 εώς 3  αλλιώς 4 για έξοδο");
                    break;
            }

        } while (choise != 4);

    }


    public static void menu() {

        System.out.println("1: Κράτηση θέσης");
        System.out.println("2: Ακύρωση Θέσης");
        System.out.println("3: Δείτε τις διαθέσιμες θέσεις");
        System.out.println("4: Έξοδος");

    }

    public static void reservation(int[][] array) throws IOException {

        for (int row = 0; row < 30; row++) {
            for (int col = 0; col < 12; col++) {

                if (array[row][col] == 0) {
                    System.out.println("Δηλώστε σειρά απο 1 εώς 30");
                    array[row] [0]= in.nextInt();
                    System.out.println("Δηλώστε στήλη απο A εώς M");
                    array[col][1] = (char) System.in.read();

                    return;
                }
            }
        }
    }

    public static boolean seats (int[][] seattaken) {

       for (int row = 0; row < 30; row++){
          for (int col = 0; col < 12; col++){
              if (seattaken[row][col] == 0)
                  return false;
            }
        }
      return true;
    }

    public static void cancelSeat (int[][] cancelReservation) throws IOException {

        for (int row = 0; row < 30; row++) {
            for (int col = 0; col < 12; col++) {

                if (cancelReservation[row][col] == 1) {
                    System.out.println("Δηλώστε σειρά απο 1 εώς 30 όπου θέλετε να ακυρώσετε");
                    cancelReservation[row] [0]= in.nextInt();
                    System.out.println("Δηλώστε στήλη απο A εώς M όπου θέλετε να ακυρώσετε");
                    cancelReservation[col][1] = (char) System.in.read();

                     cancelReservation[row][column] = 0;


                }
            }
        }
    }

    public static void displayTheatre(int[][] displayarray){

        for (int row = 0; row < displayarray.length; row++) {
             for (int col = 0; col < displayarray[row].length; col++) {
               System.out.print(displayarray[row][col]);
         }
             System.out.println();
       }

    }

}
