package gr.aueb.cf.testbed.Week2;

public class Project5 {

    public static void main(String[] args) {

        int[] array = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 9};
        int key = 8;
        int lowPosition = -1;
        int highPosition = -1;

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                highPosition = i;
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (key == array[i]) {
                lowPosition = i;
            }

        }

        System.out.println("The Low position of key is " +lowPosition);
        System.out.println("The High position of key is " +highPosition);

    }
}
