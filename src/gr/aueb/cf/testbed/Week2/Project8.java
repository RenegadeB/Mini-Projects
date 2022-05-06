package gr.aueb.cf.testbed.Week2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * με αρκετή βοήθεια απο το Internet
 */
public class Project8 {


    static String[] gameBoard;
    static String turnOrder;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        gameBoard = new String[9];
        turnOrder = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            gameBoard[a] = String.valueOf(a + 1);
        }

        printBoard();

        System.out.println("Παίζει ο πρώτος παίκτης όπου θα χρησιμοποιεί το γράμμα Χ");


        while (winner == null) {
            int numInput;
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Υπάρχει στην θέση γράμμα, δώστε άλλη θέση");
                   continue;
                }

            if (gameBoard[numInput - 1].equals(
                    String.valueOf(numInput))) {
                gameBoard[numInput - 1] = turnOrder;

                if (turnOrder.equals("X")) {
                    turnOrder = "O";
                } else {
                    turnOrder = "X";
                }

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Υπάρχει στην θέση γράμμα, δώστε άλλη θέση");

            }
        }

        if (winner.equalsIgnoreCase("Ισοπαλία")) {
            System.out.println("Ισοπαλία, να ξανά παίξετε εάν θέλετε");

        } else {
            System.out.println("Μπράβο νικήσε ο Παίκτης  " + winner );


        }
    }
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = gameBoard[0] + gameBoard[1] + gameBoard[2];
                    break;
                case 1:
                    line = gameBoard[3] + gameBoard[4] + gameBoard[5];
                    break;
                case 2:
                    line = gameBoard[6] + gameBoard[7] + gameBoard[8];
                    break;
                case 3:
                    line = gameBoard[0] + gameBoard[3] + gameBoard[6];
                    break;
                case 4:
                    line = gameBoard[1] + gameBoard[4] + gameBoard[7];
                    break;
                case 5:
                    line = gameBoard[2] + gameBoard[5] + gameBoard[8];
                    break;
                case 6:
                    line = gameBoard[0] + gameBoard[4] + gameBoard[8];
                    break;
                case 7:
                    line = gameBoard[2] + gameBoard[4] + gameBoard[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(gameBoard).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "Ισοπαλία";
            }
        }

        // To enter the X Or O at the exact place on board.
        System.out.println( " Παίζει ο παίχτης όπου χρησιμοποιεί το " + turnOrder);
        return null;
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + gameBoard[0] + " | "
                + gameBoard[1] + " | " + gameBoard[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + gameBoard[3] + " | "
                + gameBoard[4] + " | " + gameBoard[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + gameBoard[6] + " | "
                + gameBoard[7] + " | " + gameBoard[8]
                + " |");
        System.out.println("|---|---|---|");

    }
}