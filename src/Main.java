// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows = scanner.nextInt();


        int cols = scanner.nextInt();


        int treeNumber = scanner.nextInt();

        // Check if the given tree is a mango tree
        if (isMangoTree(rows, cols, treeNumber)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isMangoTree(int rows, int cols, int treeNumber) {
        if (treeNumber == 1) {
            return true;
        } else if (treeNumber <= cols || treeNumber % cols == 1 || treeNumber % cols == 0) {
            return true;
        }
        return false;
    }
}