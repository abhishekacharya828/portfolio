
public class abc {

    public static void Stars(int n) {
        int i, j, k;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {

                System.out.print("  ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {

            for (j = n - i; j >= 1; j--) {

                System.out.print("  ");
            }
            for (k = 2 * i - 1; k >= 1; k--) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        Stars(n);

    }
}