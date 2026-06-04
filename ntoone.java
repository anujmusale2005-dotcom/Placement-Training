public class ntoone {
    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Numbers from " + n + " to 1:");
        printNtoOne(n);
    }

    public static void printNtoOne(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printNtoOne(n - 1);
    }
}