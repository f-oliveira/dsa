package datastructures.big_o;

public class BigO {

    /**
     * O(n)
     *
     * @param n
     */
    public static void printItems(int n) {
        for(int i = 0;i < n; i++) {
            System.out.println(i);
        }
    }

    /**
     * O(2n) -> n + n = 2n
     * We can simplify to O(n)
     *
     * @param n
     */
    public static void printItems2(int n) {
        for(int i = 0;i < n; i++) {
            System.out.println(i);
        }

        for(int j = 0;j < n; j++) {
            System.out.println(j);
        }
    }

    /**
     * O(n²) -> n * n = n²
     *
     * @param n
     */
    public static void printItems3(int n) {
        for(int i = 0;i < n; i++) {
            for(int j = 0;j < n;j++)
                System.out.println(i + " " + j);
        }
    }

    /**
     * Drop Non-Dominants
     * O(n² + n) and we just drop de n -> O(n²)
     *
     * @param n
     */
    public static void printItems4(int n) {
        for(int i = 0;i < n; i++) {
            for(int j = 0;j < n;j++)
                System.out.println(i + " " + j);
        }

        for(int j = 0;j < n; j++) {
            System.out.println(j);
        }
    }

    /**
     * O(1)
     *
     * @param n
     */
    public static int addItems(int n) {
        return n + n;
    }

    public static void main(String[] args) {
        printItems(10);
    }

    /**
     * O(a + b)
     *
     * @param a
     * @param b
     */
    public static void printItems5(int a, int b) {
        for(int i = 0;i < a; i++) {
            System.out.println(i);
        }

        for(int j = 0;j < b; j++) {
            System.out.println(j);
        }
    }
}
