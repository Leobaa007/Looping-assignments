package Assignments;

public class AssignmentD {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print("* ");
            }
            for (int l = j * 2; l <= 4; l++) {

                System.out.print("  ");
            }
            for (int m = 0; m < j + 1; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int n = 0; n < 2; n++) {
            for (int x = 2; x > n; x--) {
                System.out.print("* ");
            }
            for ( int y = n-2; y <= n*3; y++){
                System.out.print("  ");
            }
            for (int z = 2; z > n; z--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
