package gr.aueb.cf.testbed.Week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) throws FileNotFoundException {

        File inFile = new File("C:/Users/user/Desktop/Java Files/numbers.txt");
        File outFile = new File("C:/Users/user/Desktop/Java Files/combinationsout.txt");
        Scanner in = new Scanner(inFile);
        PrintStream ps = new PrintStream(outFile);

        int n = 6;
        int[] row = new int[6];

        ArrayList<Integer> numbers = new ArrayList<>();


        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }

        for (int i = 0; i <= numbers.size() - n; i++) {
            for (int j = i + 1; j <= numbers.size() - n + 1; j++) {
                for (int k = j + 1; k <= numbers.size() - n + 2; k++) {
                    for (int l = k + 1; l <= numbers.size() - n + 3; l++) {
                        for (int m = l + 1; m <= numbers.size() - n + 4; m++) {
                            for (int o = m + 1; o < numbers.size() - n + 5; o++) {

                                row[0] = numbers.get(i);
                                row[1] = numbers.get(j);
                                row[2] = numbers.get(k);
                                row[3] = numbers.get(l);
                                row[4] = numbers.get(m);
                                row[5] = numbers.get(o);

                                if (!isEven(row) && (isOdd(row) && (!isContiguous(row) && (isSameEnding(row) && (isSameEnding(row)))))) {

                                   ps.printf("%d\t%d\t%d\t%d\t%d\t%d\n", numbers.get(i), numbers.get(j), numbers.get(k), numbers.get(l), numbers.get(m), numbers.get(o));

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean isEven(int[] row) {
        int count = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] % 2 == 0) count++;
        }
        return (count > 4);
    }

    public static boolean isOdd(int[] row) {
        int count = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] % 2 != 0) count++;
        }
        return (count > 4);
    }

    public static boolean isContiguous(int[] row) {
        int count = 0;

        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] + 1 == row[i + 1]) count++;
        }
        return (count < 1);
    }

   public static boolean isSameEnding (int[] row) {
        int count = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] == row[i] + 1 % 10) count++;
        }
        return (count < 3);
    }

 public static boolean isSameTen (int[] row) {
        int count = 0;

        for (int i = 1; i < row.length; i += 10) {
            if (row[i] != row[i] + 9 % i) count++;
        }

        return (count < 4);

    }
}
