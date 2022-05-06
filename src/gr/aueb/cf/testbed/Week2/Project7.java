package gr.aueb.cf.testbed.Week2;

public class Project7 {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                       {4, 5, 6}};
        int[][] arr2 = arr;

        int[][] arr3 = {{7, 8, 9},
                        {10, 11, 12}};
        int[][] arr4;


        System.out.println("Ο αρχικός μας πίνακας πριν το Swallow Copy");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Ο πίνακας μας μετά το Swallow Copy");

        arr2[0][0] = 50; //Αλλάζοντας τιμή στο arr2 με Swallow Copy
         /*
            Βλέπουμε οτι με το Swallow Copy αλλάζει η πρώτη τιμή του πίνακα μας, δηλαδή υπάρχει πρόβλημα
            ασφάλειας στα δεδομένα μας.
         */
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ο πίνακας μας πριν το Deep Copy");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        arr4 = deepcopy(arr3);  // Deep Copy το πίνακα 3 στον 4 και βλέπουμε οτι γίνεται αντιγραφή όλου του πίνακα
        System.out.println();
        System.out.println("Ο πίνακας μας μετά το Deep Copy");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }
        public static int[][] deepcopy ( int[][] arr3){
            int[][] returned = new int[2][3];
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3[i].length; j++)
                    returned[i][j] = arr3[i][j];
            }

            return returned;
        }
    }
