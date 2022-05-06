package gr.aueb.cf.testbed.Week2;

import java.util.Scanner;

/**
 * Η άσκηση δεν είναι ολοκληρωμένη
 */

public class Project2 {

    static Scanner in = new Scanner(System.in);
    static String[][] telephoneBook = new String[500][3];

    public static void main(String[] args) {

        int choise;
        int n = 1;
        String number = new String();
        String contact = new String();
        String contactUpate = new String();
        String del = new String();
        boolean contains = false;

        do {
            menu();
            choise = in.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Δώστε 10ψηφίο αριθμό προς αναζήτηση και πατήστε Enter");
                    number = in.next();
                    search(number);
                    break;

                case 2:
                   save(contact);
                    break;

                case 3:
                    System.out.println("Δώστε τηλέφωνο για αναζήτηση και ενημέρωση επαφής");
                    number = in.nextLine();
                    search(number);
                    save(contactUpate);
                    break;

                case 4:
                    System.out.println("Δώστε 10ψηφίο αριθμό προς αναζήτηση και διαγραφή");
                    number = in.next();
                    search(number);
                    delete(del,number);
                    break;

                case 5:
                    System.out.println("Δώσατε έξοδο, ευχαριστούμε πολύ. Αντίο");
                    break;

                default:
                    System.out.println("Λάθος επιλογή, Δώστε απο το 1-4 αλλιώς 5 για έξοδο");
                    break;

            }
        } while (choise != 5);
    }

    public static void menu() {

        System.out.println("\n 1: Αναζήτηση Επαφής με Βάση το τηλέφωνο");
        System.out.println(" 2: Εισαγωγή Επαφής ");
        System.out.println(" 3: Ενημέρωση Επαφής ");
        System.out.println(" 4: Διαγραφή Επαφής ");
        System.out.println(" 5: Έξοδος απο το πρόγραμμα ");
        System.out.println(" Δώστε επιλογή: ");
    }

    public static void search(String number) {


        for (int i = 0; i < telephoneBook.length; i++) {
            for (int j = 0; j < telephoneBook[i].length; j++) {
                if (telephoneBook.equals(number)) {
                    System.out.println("Ο αριθμός" + number + "βρέθηκε");

                }

            }
        }
        System.out.println("Ο αριθμός δεν βρέθηκε");
    }

    public static void save(String contact) {

        System.out.println("Δώστε Επώνυμο, Όνομα και Τηλέφωνο με Enter");
        contact = in.nextLine();


    }

    public static void update(String contactUp, String contact) {

        System.out.println("Δώστε την επαφή που θέλετε να κάνετε ενημέρωση");
        contact = in.next();
        System.out.println("Δώστε νέο όνομα επαφής");
        contactUp = in.next();
        for (int i = 0; i < telephoneBook.length; i++) {
            for (int j = 0; j < telephoneBook[i].length; j++) {
                if (telephoneBook.equals(contact)) {
                    contact = contactUp;
                }
            }
        }


    }
    public static void delete(String del, String number) {

        for (int i = 0; i < telephoneBook.length; i++) {
            for (int j = 0; j < telephoneBook[i].length; j++) {
                if (telephoneBook.equals(number)) {
                    System.out.println("Ο αριθμός βρέθηκε");
                    number = number.replace(telephoneBook[i][j], "");
                }

            }
        }
        System.out.println("Ο αριθμός δεν βρέθηκε");
    }
}