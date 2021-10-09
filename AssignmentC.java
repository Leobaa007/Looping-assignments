package Assignments;

public class AssignmentC {

    public static void main(String[] args) {

        for ( int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++) {
                if ( j < 5 - (i + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for ( int k = 0; k < 4; k++) {
            for (int l = 4; l >= 0; l--) {
                if (l > 4 - (k + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
