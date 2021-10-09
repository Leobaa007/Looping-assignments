package Assignments;

public class AssignmentA {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int k = 0; k < 4; k++) {
            for (int l = 4; l > k; l--) {
                System.out.print("* ");
            }System.out.println();
        }

    }
}


