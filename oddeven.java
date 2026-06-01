public class oddeven {
    public static void main(String[] args) {

        int x = 20;

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}